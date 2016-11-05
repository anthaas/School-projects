<?php
/* Smarty version 3.1.30, created on 2016-10-30 16:57:02
  from "/var/www/smarty/templates/publications.tpl" */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.30',
  'unifunc' => 'content_5816265e1e98c0_03877029',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '870cb52ab377cf7751ea2e2aaf9436c17049b588' => 
    array (
      0 => '/var/www/smarty/templates/publications.tpl',
      1 => 1477776947,
      2 => 'file',
    ),
  ),
  'cache_lifetime' => 3600,
),true)) {
function content_5816265e1e98c0_03877029 (Smarty_Internal_Template $_smarty_tpl) {
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
        <tr bgcolor="#dedede">
	<td>me again</td>
	<td>Sweet book</td>
	<td>second</td>
	<td>3000</td>
	<td>Mars</td>
	<td>Futuristic publications</td>
	<td>230</td>
	<td>book</td>
        <tr bgcolor="#dedede">
	<td>me again</td>
	<td>Sweet book vol2.</td>
	<td>second</td>
	<td>3001</td>
	<td>Mars II</td>
	<td>Oxford</td>
	<td>230</td>
	<td>book</td>
        <tr bgcolor="#dedede">
	<td>aasdf</td>
	<td>qwop</td>
	<td>fifth</td>
	<td>1483</td>
	<td>weopowe</td>
	<td>qweqwe</td>
	<td>42</td>
	<td>article</td>
    
</table>
<a href="/smarty/index.php?action=add">add entry</a><br>
<a href="/smarty/index.php?action=export">export BibTeX</a>
<?php }
}
