<?php
/* Smarty version 3.1.30, created on 2016-11-04 17:28:17
  from "/var/www/smarty/templates/export_form.tpl" */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.30',
  'unifunc' => 'content_581cc531c7e525_04650388',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '966bd3bfec1be1ca7540dcb5342ba9c33c7cfc99' => 
    array (
      0 => '/var/www/smarty/templates/export_form.tpl',
      1 => 1478280491,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
  ),
),false)) {
function content_581cc531c7e525_04650388 (Smarty_Internal_Template $_smarty_tpl) {
?>

<?php echo '<script'; ?>
 type="text/javascript">
function toggle(source) {
  checkboxes = document.getElementsByName('export[]');
  for(var i=0, n=checkboxes.length;i<n;i++) {
    checkboxes[i].checked = source.checked;
  }
}
<?php echo '</script'; ?>
>
<div class="table-responsive">
<form action="<?php echo $_smarty_tpl->tpl_vars['SCRIPT_NAME']->value;?>
?action=exported" method="post">
<table class="table">
<thead>
  <tr>
    <th style="text-align: center;"><input type="checkbox" onclick="toggle(this)" /><?php echo "<br />";?>
Export</th>
    <th>Author</th>
    <th>Title</th>
    <th>Edition</th>
    <th>Year</th>
    <th>Location</th>
    <th>Publisher</th>
    <th>Pagetotal</th>
    <th>Type</th>
  </tr>
</thead>
<tbody>
  <?php
$_from = $_smarty_tpl->smarty->ext->_foreach->init($_smarty_tpl, $_smarty_tpl->tpl_vars['data']->value, 'entry');
if ($_from !== null) {
foreach ($_from as $_smarty_tpl->tpl_vars['entry']->value) {
?>
    <tr>
	<td style="text-align: center;"><input type="checkbox" name="export[]" value="<?php echo htmlspecialchars($_smarty_tpl->tpl_vars['entry']->value['id'], ENT_QUOTES, 'UTF-8', true);?>
"></td>
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

</tbody>
</table>
<input type="submit" class="btn btn-primary" value="Export">
</form>
</div>
<?php }
}
