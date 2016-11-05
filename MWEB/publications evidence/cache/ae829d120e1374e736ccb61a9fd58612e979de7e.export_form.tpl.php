<?php
/* Smarty version 3.1.30, created on 2016-10-30 16:59:44
  from "/var/www/smarty/templates/export_form.tpl" */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.30',
  'unifunc' => 'content_581627002928d5_70546237',
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
  'cache_lifetime' => 3600,
),true)) {
function content_581627002928d5_70546237 (Smarty_Internal_Template $_smarty_tpl) {
?>

<a href="index.php"><h1>Publications evidence</h1></a>
<form action="/smarty/index.php?action=viewexport" method="post">
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
      <tr bgcolor="#dedede">
	<td>me</td>
	<td>my awesome title</td>
	<td>first edition</td>
	<td>2016</td>
	<td>Olomouc</td>
	<td>self</td>
	<td>1024</td>
	<td>article</td>
	<td><input type="checkbox" name="export[]" value="1"></td>
        <tr bgcolor="#dedede">
	<td>me</td>
	<td>my awesome title vol. 2</td>
	<td>first edition</td>
	<td>2016</td>
	<td>Olomouc</td>
	<td>self</td>
	<td>960</td>
	<td>book</td>
	<td><input type="checkbox" name="export[]" value="2"></td>
        <tr bgcolor="#dedede">
	<td>me again</td>
	<td>Sweet book</td>
	<td>second</td>
	<td>3000</td>
	<td>Mars</td>
	<td>Futuristic publications</td>
	<td>230</td>
	<td>book</td>
	<td><input type="checkbox" name="export[]" value="5"></td>
        <tr bgcolor="#dedede">
	<td>me again</td>
	<td>Sweet book vol2.</td>
	<td>second</td>
	<td>3001</td>
	<td>Mars II</td>
	<td>Oxford</td>
	<td>230</td>
	<td>book</td>
	<td><input type="checkbox" name="export[]" value="6"></td>
        <tr bgcolor="#dedede">
	<td>aasdf</td>
	<td>qwop</td>
	<td>fifth</td>
	<td>1483</td>
	<td>weopowe</td>
	<td>qweqwe</td>
	<td>42</td>
	<td>article</td>
	<td><input type="checkbox" name="export[]" value="7"></td>
    
</table>
<input type="submit" value="Export">
</form>
<?php }
}
