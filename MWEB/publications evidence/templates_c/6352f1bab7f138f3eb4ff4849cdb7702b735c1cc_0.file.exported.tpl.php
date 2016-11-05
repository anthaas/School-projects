<?php
/* Smarty version 3.1.30, created on 2016-11-04 18:01:33
  from "/var/www/smarty/templates/exported.tpl" */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.30',
  'unifunc' => 'content_581cccfd765f05_53179954',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '6352f1bab7f138f3eb4ff4849cdb7702b735c1cc' => 
    array (
      0 => '/var/www/smarty/templates/exported.tpl',
      1 => 1478282452,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
  ),
),false)) {
function content_581cccfd765f05_53179954 (Smarty_Internal_Template $_smarty_tpl) {
?>

<?php
$_from = $_smarty_tpl->smarty->ext->_foreach->init($_smarty_tpl, $_smarty_tpl->tpl_vars['data']->value, 'entry');
if ($_from !== null) {
foreach ($_from as $_smarty_tpl->tpl_vars['entry']->value) {
?>
@<?php echo mb_strtoupper($_smarty_tpl->tpl_vars['entry']->value['Type'], 'UTF-8');?>
{ <?php echo "<br />";?>

  t<?php echo $_smarty_tpl->tpl_vars['entry']->value['id'];?>
, <?php echo "<br />";?>

  author = { <?php echo $_smarty_tpl->tpl_vars['entry']->value['Author'];?>
 },<?php echo "<br />";?>

  year = { <?php echo $_smarty_tpl->tpl_vars['entry']->value['Year'];?>
 },<?php echo "<br />";?>

  title = { <?php echo $_smarty_tpl->tpl_vars['entry']->value['Title'];?>
 },<?php echo "<br />";?>

  location = { <?php echo $_smarty_tpl->tpl_vars['entry']->value['Location'];?>
 },<?php echo "<br />";?>

  publisher = { <?php echo $_smarty_tpl->tpl_vars['entry']->value['Publisher'];?>
 },<?php echo "<br />";?>

  pagetotal = { <?php echo $_smarty_tpl->tpl_vars['entry']->value['Pagetotal'];?>
 },<?php echo "<br />";?>

}<?php echo "<br />";?>

<?php
}
} else {
?>

    No records
<?php
}
$_smarty_tpl->smarty->ext->_foreach->restore($_smarty_tpl);
?>

<?php }
}
