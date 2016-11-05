<?php
/* Smarty version 3.1.30, created on 2016-11-05 10:51:25
  from "/var/www/smarty/templates/master.tpl" */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.30',
  'unifunc' => 'content_581db9ade1a437_11214090',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '98e3e8efc1448af55f7bc5f54ca08bd027354b7a' => 
    array (
      0 => '/var/www/smarty/templates/master.tpl',
      1 => 1478343082,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
  ),
),false)) {
function content_581db9ade1a437_11214090 (Smarty_Internal_Template $_smarty_tpl) {
?>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>KMI/MWEB</title>
    	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="./publications/bootstrap/css/bootstrap.min.css">

	<!-- Optional theme -->
	<link rel="stylesheet" href="./publications/bootstrap/css/bootstrap-theme.min.css">

	<!-- Latest compiled and minified JavaScript -->
	<?php echo '<script'; ?>
 src=".publications/bootstrap/js/bootstrap.min.js"><?php echo '</script'; ?>
>

	<link rel="stylesheet" href="./publications/awesomplete.css">
</head>
<body>
<div class="container-fluid">
 <header class="container-fluid">
  <h1>Publications evidence</h1>
 </header>
 <div class="col-sm-2 sidenav">
  <ul class="nav nav-pills nav-stacked">
   <li class="<?php echo $_smarty_tpl->tpl_vars['menu']->value[0];?>
"><a href="<?php echo $_smarty_tpl->tpl_vars['SCRIPT_NAME']->value;?>
?action=view">List publications</a></li>
   <li class="<?php echo $_smarty_tpl->tpl_vars['menu']->value[1];?>
"><a href="<?php echo $_smarty_tpl->tpl_vars['SCRIPT_NAME']->value;?>
?action=add">Add publication</a></li>
   <li class="<?php echo $_smarty_tpl->tpl_vars['menu']->value[2];?>
"><a href="<?php echo $_smarty_tpl->tpl_vars['SCRIPT_NAME']->value;?>
?action=export">Export publication</a></li>
  </ul><br>
 </div>
 <div class="col-sm-10">
	<?php $_smarty_tpl->_subTemplateRender($_smarty_tpl->tpl_vars['content']->value, $_smarty_tpl->cache_id, $_smarty_tpl->compile_id, 0, $_smarty_tpl->cache_lifetime, array(), 0, true);
?>

 </div>
</div>
</body>
</html>
<?php }
}
