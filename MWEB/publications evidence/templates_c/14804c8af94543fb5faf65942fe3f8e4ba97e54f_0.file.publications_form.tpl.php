<?php
/* Smarty version 3.1.30, created on 2016-10-30 20:38:23
  from "/var/www/smarty/templates/publications_form.tpl" */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.30',
  'unifunc' => 'content_58165a3f18e6f2_39023237',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    '14804c8af94543fb5faf65942fe3f8e4ba97e54f' => 
    array (
      0 => '/var/www/smarty/templates/publications_form.tpl',
      1 => 1477859900,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
  ),
),false)) {
function content_58165a3f18e6f2_39023237 (Smarty_Internal_Template $_smarty_tpl) {
?>


<form action="<?php echo $_smarty_tpl->tpl_vars['SCRIPT_NAME']->value;?>
?action=submit" method="post">
  <table border="1">
  <tr>
	<td>Author:</td>
        <td><input type="text" name="Author"
          value="<?php echo htmlspecialchars($_smarty_tpl->tpl_vars['post']->value['Author'], ENT_QUOTES, 'UTF-8', true);?>
" size="40"></td>
  </tr>
  <tr>
	<td>Title:</td>
        <td><input type="text" name="Title"
          value="<?php echo htmlspecialchars($_smarty_tpl->tpl_vars['post']->value['Title'], ENT_QUOTES, 'UTF-8', true);?>
" size="40"></td>
  </tr>
  <tr>
	<td>Edition:</td>
        <td><input type="text" name="Edition"
          value="<?php echo htmlspecialchars($_smarty_tpl->tpl_vars['post']->value['Edition'], ENT_QUOTES, 'UTF-8', true);?>
" size="40"></td>
  </tr>
  <tr>
	<td>Year:</td>
        <td><input type="text" name="Year"
          value="<?php echo htmlspecialchars($_smarty_tpl->tpl_vars['post']->value['Year'], ENT_QUOTES, 'UTF-8', true);?>
" size="40"></td>
  <tr>
  </tr>
	<td>Location:</td>
        <td><input type="text" name="Location"
          value="<?php echo htmlspecialchars($_smarty_tpl->tpl_vars['post']->value['Location'], ENT_QUOTES, 'UTF-8', true);?>
" size="40"></td>
  </tr>
  <tr>
	<td>Publisher:</td>
        <td><input type="text" name="Publisher"
          value="<?php echo htmlspecialchars($_smarty_tpl->tpl_vars['post']->value['Publisher'], ENT_QUOTES, 'UTF-8', true);?>
" size="40"></td>
  </tr>
  <tr>
	<td>Pagetotal:</td>
        <td><input type="text" name="Pagetotal"
          value="<?php echo htmlspecialchars($_smarty_tpl->tpl_vars['post']->value['Pagetotal'], ENT_QUOTES, 'UTF-8', true);?>
" size="40"></td>
  </tr>
  <tr>
	<td>Type</td>
        <td><input type="text" name="Type"
          value="<?php echo htmlspecialchars($_smarty_tpl->tpl_vars['post']->value['Type'], ENT_QUOTES, 'UTF-8', true);?>
" size="40"></td>
  </tr>
    <tr>
      <td colspan="2" align="left">
        <input type="submit" value="Submit">
      </td>
    </tr>
  </table>
</form>
<?php }
}
