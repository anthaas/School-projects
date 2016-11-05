<?php

// load Smarty library
require('./smarty/libs/Smarty.class.php');
require('./publications/publications.php');

class Smarty_BookDB extends Smarty {

   function __construct()
   {

        // Class Constructor.
        // These automatically get set with each new instance.

	parent::__construct();

        $this->setTemplateDir('./templates/');
        $this->setCompileDir('./templates_c/');
        $this->setConfigDir('./configs/');
        $this->setCacheDir('./cache/');


        $this->caching = 0;
        $this->assign('app_name', 'Publications Database');
   }

}
?>
