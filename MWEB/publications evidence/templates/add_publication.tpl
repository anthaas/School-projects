{* Smarty *}
  <form class="form-horizontal" action="{$SCRIPT_NAME}?action=submit" method="post">
    <div class="form-group">
      <label class="control-label col-sm-1" for="Author">Author:</label>
      <div class="col-sm-11">
        <input type="text" class="form-control awesomplete" data-list="{$authors}" id="Author" name="Author" value="{$post.Author|escape}" required>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-1" for="Title">Title:</label>
      <div class="col-sm-11">
        <input type="text" class="form-control awesomplete" data-list="{$titles}" id="Title" name="Title" value="{$post.Title|escape}" required>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-1" for="Edition">Edition:</label>
      <div class="col-sm-11">
        <input type="text" class="form-control awesomplete" data-list="{$editions}" id="Edition" name="Edition" value="{$post.Edition|escape}" required>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-1" for="Year">Year:</label>
      <div class="col-sm-11">
        <input type="number" class="form-control awesomplete" data-list="{$years}" id="Year" name="Year" value="{$post.Year|escape}" required>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-1" for="Location">Location:</label>
      <div class="col-sm-11">
        <input type="text" class="form-control awesomplete" data-list="{$locations}" id="Location" name="Location" value="{$post.Location|escape}" required>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-1" for="Publisher">Publisher:</label>
      <div class="col-sm-11">
        <input type="text" class="form-control awesomplete" data-list="{$publishers}" id="Publisher" name="Publisher" value="{$post.Publisher|escape}" required>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-1" for="Pagetotal">Pagetotal:</label>
      <div class="col-sm-11">
        <input type="number" class="form-control awesomplete" data-list="{$pagetotals}" id="Pagetotal" name="Pagetotal" value="{$post.Pagetotal|escape}" required>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-1" for="Type">Type:</label>
      <div class="col-sm-11">
            <select class="form-control" name="Type" id="Type" value="{$post.Type|escape}">
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
<script src="./publications/awesomplete.js"></script>
