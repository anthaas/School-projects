<?php
/* Smarty version 3.1.30, created on 2016-10-30 16:59:44
  from "/var/www/smarty/templates/export_form.tpl" */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.30',
  'unifunc' => 'content_58162700264237_83041855',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '966bd3bfec1be1ca7540dcb5342ba9c33c7cfc99' => 
    array (
      0 => '/var/www/smarty/templates/export_form.tpl',
      1 => 1477846779,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
  ),
),false)) {
function content_58162700264237_83041855 (Smarty_Internal_Template $_smarty_tpl) {
if (!is_callable('smarty_function_cycle')) require_once '/var/www/smarty/smarty/libs/plugins/function.cycle.php';
$_smarty_tpl->compiled->nocache_hash = '1418186691581627000e38f2_48367921';
?>

<a href="index.php"><h1>Publications evidence</h1></a>
<form action="<?php echo $_smarty_tpl->tpl_vars['SCRIPT_NAME']->value;?>
?action=viewexport" method="post">
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
    <th>Export</th>
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
	<td><input type="checkbox" name="export[]" value="<?php echo htmlspecialchars($_smarty_tpl->tpl_vars['entry']->value['id'], ENT_QUOTES, 'UTF-8', true);?>
"></td>
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
<input type="submit" value="Export">
</form>
<?php }
}
