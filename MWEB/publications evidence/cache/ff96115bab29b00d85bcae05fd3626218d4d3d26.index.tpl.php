<?php
/* Smarty version 3.1.30, created on 2016-10-29 21:35:50
  from "/var/www/smarty/templates/index.tpl" */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.30',
  'unifunc' => 'content_58151636e73308_84547824',
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
  'cache_lifetime' => 3600,
),true)) {
function content_58151636e73308_84547824 (Smarty_Internal_Template $_smarty_tpl) {
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
      <tr bgcolor="#dedede">
	<td>me</td>
	<td>my awesome title</td>
	<td>first edition</td>
	<td>2016</td>
	<td>Olomouc</td>
	<td>self</td>
	<td>1024</td>
	<td>article</td>
        <tr bgcolor="#dedede">
	<td>me</td>
	<td>my awesome title vol. 2</td>
	<td>first edition</td>
	<td>2016</td>
	<td>Olomouc</td>
	<td>self</td>
	<td>960</td>
	<td>book</td>
    
</table>
<a href="/smarty/index.php?action=add">add entry</a><br>
<a href="/smarty/index.php?action=export">export BibTeX</a>
<?php }
}
