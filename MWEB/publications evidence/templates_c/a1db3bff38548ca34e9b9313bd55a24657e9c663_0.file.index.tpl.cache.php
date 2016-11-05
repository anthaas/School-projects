<?php
/* Smarty version 3.1.30, created on 2016-10-29 21:35:50
  from "/var/www/smarty/templates/index.tpl" */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.30',
  'unifunc' => 'content_58151636e47334_20930657',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    'a1db3bff38548ca34e9b9313bd55a24657e9c663' => 
    array (
      0 => '/var/www/smarty/templates/index.tpl',
      1 => 1477776947,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
  ),
),false)) {
function content_58151636e47334_20930657 (Smarty_Internal_Template $_smarty_tpl) {
if (!is_callable('smarty_function_cycle')) require_once '/var/www/smarty/smarty/libs/plugins/function.cycle.php';
$_smarty_tpl->compiled->nocache_hash = '18390949158151636cc2006_41880953';
?>

<h1>Publications evidence</h1>
<table border="0">
  <tr bgcolor="#d1d1d1">
    <th>Author</th>
    <th>Title</th>
    <th>Edition</th>
    <th>Year</th>
    <th>Location</th>
    <th>Publisher</th>
    <th>Pagetotal</th>
    <th>Type</th>
  </tr>
  <?php
$_from = $_smarty_tpl->smarty->ext->_foreach->init($_smarty_tpl, $_smarty_tpl->tpl_vars['data']->value, 'entry');
if ($_from !== null) {
foreach ($_from as $_smarty_tpl->tpl_vars['entry']->value) {
?>
    <tr bgcolor="<?php echo smarty_function_cycle(array('values'=>"#dedede,#eeeeee",'advance'=>false),$_smarty_tpl);?>
">
	<td><?php echo htmlspecialchars($_smarty_tpl->tpl_vars['entry']->value['Author'], ENT_QUOTES, 'UTF-8', true);?>
</td>
	<td><?php echo htmlspecialchars($_smarty_tpl->tpl_vars['entry']->value['Title'], ENT_QUOTES, 'UTF-8', true);?>
</td>
	<td><?php echo htmlspecialchars($_smarty_tpl->tpl_vars['entry']->value['Edition'], ENT_QUOTES, 'UTF-8', true);?>
</td>
	<td><?php echo htmlspecialchars($_smarty_tpl->tpl_vars['entry']->value['Year'], ENT_QUOTES, 'UTF-8', true);?>
</td>
	<td><?php echo htmlspecialchars($_smarty_tpl->tpl_vars['entry']->value['Location'], ENT_QUOTES, 'UTF-8', true);?>
</td>
	<td><?php echo htmlspecialchars($_smarty_tpl->tpl_vars['entry']->value['Publisher'], ENT_QUOTES, 'UTF-8', true);?>
</td>
	<td><?php echo htmlspecialchars($_smarty_tpl->tpl_vars['entry']->value['Pagetotal'], ENT_QUOTES, 'UTF-8', true);?>
</td>
	<td><?php echo htmlspecialchars($_smarty_tpl->tpl_vars['entry']->value['Type'], ENT_QUOTES, 'UTF-8', true);?>
</td>
    <?php
}
} else {
?>

      <tr>
        <td colspan="2">No records</td>
      </tr>
  <?php
}
$_smarty_tpl->smarty->ext->_foreach->restore($_smarty_tpl);
?>

</table>
<a href="<?php echo $_smarty_tpl->tpl_vars['SCRIPT_NAME']->value;?>
?action=add">add entry</a><br>
<a href="<?php echo $_smarty_tpl->tpl_vars['SCRIPT_NAME']->value;?>
?action=export">export BibTeX</a>
<?php }
}
