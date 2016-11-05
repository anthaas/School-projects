<?php

class Publications {

  // database object
  var $pdo = null;
  // smarty template object
  var $tpl = null;
  // error messages
  var $error = null;

  /* set database settings here! */
  // PDO database type
  var $dbtype = 'mysql';
  // PDO database name
  var $dbname = 'dbname';
  // PDO database host
  var $dbhost = 'localhost';
  // PDO database username
  var $dbuser = 'dbuser';
  // PDO database password
  var $dbpass = 'dbpass';

 /**
  * class constructor
  */
  function __construct() {

    // instantiate the pdo object
    try {
      $dsn = "{$this->dbtype}:host={$this->dbhost};dbname={$this->dbname}";
      $this->pdo =  new PDO($dsn,$this->dbuser,$this->dbpass);
    } catch (PDOException $e) {
      print "Error!: " . $e->getMessage();
      die();
    }

    // instantiate the template object
    $this->tpl = new Smarty_BookDB;

  }

  /**
  * get entries
  */
  function getEntries() {
    try {
      foreach($this->pdo->query(
        "select * from PUBLICATIONS") as $row)
      $rows[] = $row;
    } catch (PDOException $e) {
      print "Error!: " . $e->getMessage();
      return false;
    }
    return $rows;
  }

 /**
  * add a new guestbook entry
  *
  * @param array $formvars the form variables
  */
   function addEntry($formvars) {
    try {
      $this->mungeFormData($formvars);
      $rh = $this->pdo->prepare("insert into PUBLICATIONS values(NULL,?,?,?,?,?,?,?,?)");
      $rh->execute(array($formvars['Author'],$formvars['Title'],$formvars['Edition'],$formvars['Year'],$formvars['Location'],$formvars['Publisher'],$formvars['Pagetotal'],$formvars['Type']));
    } catch (PDOException $e) {
      print "Error!: " . $e->getMessage();
      return false;
    }
    return true;
  }

  function mungeFormData(&$formvars) {

    // trim off excess whitespace
    $formvars['Author'] = trim($formvars['Author']);
    $formvars['Title'] = trim($formvars['Title']);
    $formvars['Edition'] = trim($formvars['Edition']);
    $formvars['Location'] = trim($formvars['Location']);
    $formvars['Publisher'] = trim($formvars['Publisher']);
    $formvars['Type'] = trim($formvars['Type']);
  }

  function displayTemplate($template, $form_data = NULL) {
    switch($template) {
      case "export":
	$data = $this->getEntries();
        $menu = array("", "", "active");
        $this->tpl->assign('data', $data);
        $this->tpl->assign('menu', $menu);
        $this->tpl->assign('content', 'export_form.tpl');
        $this->tpl->display('master.tpl');
	break;
      case "exported":
        $data = $this->getEntries();
	$selected_data = array();
	foreach($data as $item) {
	  if (in_array($item['id'], $form_data['export'])) {
            $selected_data[] = $item;
          }
	}
        $menu = array("", "", "active");
        $this->tpl->assign('data', $selected_data);
        $this->tpl->assign('menu', $menu);
        $this->tpl->assign('content', 'exported.tpl');
        $this->tpl->display('master.tpl');
	break;
      case "add":
	$data = $this->getEntries();
	$menu = array("", "active", "");
	//select all possible entry from database
	foreach($data as $entry) {
	  $authors[] = $entry['Author'];
	  $titles[] = $entry['Title'];
	  $editions[] = $entry['Edition'];
	  $years[] = $entry['Year'];
	  $locations[] = $entry['Location'];
	  $publishers[] = $entry['Publisher'];
	  $pagetotals[] = $entry['Pagetotal'];
	}
	//pass options to javascript whisper
	$this->tpl->assign('authors', implode(', ',  array_unique($authors)));
        $this->tpl->assign('titles', implode(', ',  array_unique($titles)));
        $this->tpl->assign('editions', implode(', ',  array_unique($editions)));
        $this->tpl->assign('years', implode(', ',  array_unique($years)));
        $this->tpl->assign('locations', implode(', ',  array_unique($locations)));
        $this->tpl->assign('publishers', implode(', ',  array_unique($publishers)));
        $this->tpl->assign('pagetotals', implode(', ',  array_unique($pagetotals)));
        $this->tpl->assign('menu', $menu);
        $this->tpl->assign('content', 'add_publication.tpl');
        $this->tpl->display('master.tpl');
	break;
      case "submit":
        $this->addEntry($form_data);
      case "list":
      default:
        $data = $this->getEntries();
        $menu = array("active", "", "");
        $this->tpl->assign('data', $data);
        $this->tpl->assign('menu', $menu);
        $this->tpl->assign('content', 'publications.tpl');
        $this->tpl->display('master.tpl');
        break;

    }
  }
}
?>
