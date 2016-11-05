<?php
/* Smarty version 3.1.30, created on 2016-11-05 10:26:48
  from "/var/www/smarty/templates/add_publication.tpl" */

/* @var Smarty_Internal_Template $_smarty_tpl */
if ($_smarty_tpl->_decodeProperties($_smarty_tpl, array (
  'version' => '3.1.30',
  'unifunc' => 'content_581db3e87685c2_45373567',
  'has_nocache_code' => false,
  'file_dependency' => 
  array (
    'ba3333f36c8d852d926ac3be568ccf15606ef33e' => 
    array (
      0 => '/var/www/smarty/templates/add_publication.tpl',
      1 => 1478341605,
      2 => 'file',
    ),
  ),
  'includes' => 
  array (
  ),
),false)) {
function content_581db3e87685c2_45373567 (Smarty_Internal_Template $_smarty_tpl) {
?>

  <form class="form-horizontal" action="<?php echo $_smarty_tpl->tpl_vars['SCRIPT_NAME']->value;?>
?action=submit" method="post">
    <div class="form-group">
      <label class="control-label col-sm-1" for="Author">Author:</label>
      <div class="col-sm-11">
        <input type="text" class="form-control awesomplete" data-list="<?php echo $_smarty_tpl->tpl_vars['authors']->value;?>
" id="Author" name="Author" value="<?php echo htmlspecialchars($_smarty_tpl->tpl_vars['post']->value['Author'], ENT_QUOTES, 'UTF-8', true);?>
" required>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-1" for="Title">Title:</label>
      <div class="col-sm-11">
        <input type="text" class="form-control awesomplete" data-list="<?php echo $_smarty_tpl->tpl_vars['titles']->value;?>
" id="Title" name="Title" value="<?php echo htmlspecialchars($_smarty_tpl->tpl_vars['post']->value['Title'], ENT_QUOTES, 'UTF-8', true);?>
" required>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-1" for="Edition">Edition:</label>
      <div class="col-sm-11">
        <input type="text" class="form-control awesomplete" data-list="<?php echo $_smarty_tpl->tpl_vars['editions']->value;?>
" id="Edition" name="Edition" value="<?php echo htmlspecialchars($_smarty_tpl->tpl_vars['post']->value['Edition'], ENT_QUOTES, 'UTF-8', true);?>
" required>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-1" for="Year">Year:</label>
      <div class="col-sm-11">
        <input type="number" class="form-control awesomplete" data-list="<?php echo $_smarty_tpl->tpl_vars['years']->value;?>
" id="Year" name="Year" value="<?php echo htmlspecialchars($_smarty_tpl->tpl_vars['post']->value['Year'], ENT_QUOTES, 'UTF-8', true);?>
" required>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-1" for="Location">Location:</label>
      <div class="col-sm-11">
        <input type="text" class="form-control awesomplete" data-list="<?php echo $_smarty_tpl->tpl_vars['locations']->value;?>
" id="Location" name="Location" value="<?php echo htmlspecialchars($_smarty_tpl->tpl_vars['post']->value['Location'], ENT_QUOTES, 'UTF-8', true);?>
" required>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-1" for="Publisher">Publisher:</label>
      <div class="col-sm-11">
        <input type="text" class="form-control awesomplete" data-list="<?php echo $_smarty_tpl->tpl_vars['publishers']->value;?>
" id="Publisher" name="Publisher" value="<?php echo htmlspecialchars($_smarty_tpl->tpl_vars['post']->value['Publisher'], ENT_QUOTES, 'UTF-8', true);?>
" required>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-1" for="Pagetotal">Pagetotal:</label>
      <div class="col-sm-11">
        <input type="number" class="form-control awesomplete" data-list="<?php echo $_smarty_tpl->tpl_vars['pagetotals']->value;?>
" id="Pagetotal" name="Pagetotal" value="<?php echo htmlspecialchars($_smarty_tpl->tpl_vars['post']->value['Pagetotal'], ENT_QUOTES, 'UTF-8', true);?>
" required>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-1" for="Type">Type:</label>
      <div class="col-sm-11">
            <select class="form-control" name="Type" id="Type" value="<?php echo htmlspecialchars($_smarty_tpl->tpl_vars['post']->value['Type'], ENT_QUOTES, 'UTF-8', true);?>
">
                <option value="book" selected>book</option>
                <option value="article">article</option>
            </select>
      </div>
    </div>
    <div class="form-group">
      <div class="col-sm-offset-1 col-sm-11">
        <input type="submit" class="btn btn-primary" value="Add">
      </div>
    </div>
  </form>
<?php echo '<script'; ?>
 src="./publications/awesomplete.js"><?php echo '</script'; ?>
>
<?php }
}
