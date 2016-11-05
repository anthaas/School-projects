<?php
require('setup.php');

$publications = new Publications;

// set the current action
$_action = isset($_REQUEST['action']) ? $_REQUEST['action'] : 'view';

$publications->displayTemplate($_action, $_POST);

?>
