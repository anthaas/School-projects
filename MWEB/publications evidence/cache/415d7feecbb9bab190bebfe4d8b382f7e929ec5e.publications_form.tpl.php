<?php
/* Smarty version 3.1.30, created on 2016-10-30 15:57:14
  from "/var/www/smarty/templates/publications_form.tpl" */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.30',
  'unifunc' => 'content_5816185aa9e045_67390479',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '14804c8af94543fb5faf65942fe3f8e4ba97e54f' => 
    array (
      0 => '/var/www/smarty/templates/publications_form.tpl',
      1 => 1477778434,
      2 => 'file',
    ),
  ),
  'cache_lifetime' => 3600,
),true)) {
function content_5816185aa9e045_67390479 (Smarty_Internal_Template $_smarty_tpl) {
?>


<form action="/smarty/index.php?action=submit" method="post">
  <table border="1">
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
  <tr>
        <td><input type="text" name="Author"
          value="" size="40"></td>
        <td><input type="text" name="Title"
          value="" size="40"></td>
        <td><input type="text" name="Edition"
          value="" size="40"></td>
        <td><input type="text" name="Year"
          value="" size="40"></td>
        <td><input type="text" name="Location"
          value="" size="40"></td>
        <td><input type="text" name="Publisher"
          value="" size="40"></td>
        <td><input type="text" name="Pagetotal"
          value="" size="40"></td>
        <td><input type="text" name="Type"
          value="" size="40"></td>
  </tr>
    <tr>
      <td colspan="2" align="center">
        <input type="submit" value="Submit">
      </td>
    </tr>
  </table>
</form>
<?php }
}
