<?php
/* Smarty version 3.1.30, created on 2016-11-04 15:39:25
  from "/var/www/smarty/templates/publications.tpl" */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.30',
  'unifunc' => 'content_581cabad543439_28658417',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '870cb52ab377cf7751ea2e2aaf9436c17049b588' => 
    array (
      0 => '/var/www/smarty/templates/publications.tpl',
      1 => 1478273958,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
  ),
),false)) {
function content_581cabad543439_28658417 (Smarty_Internal_Template $_smarty_tpl) {
?>

<div class="table-responsive">
<table class="table">
<thead>
  <tr>
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
</div>
<?php }
}
