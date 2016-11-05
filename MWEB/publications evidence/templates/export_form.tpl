{* Smarty *}
<script type="text/javascript">
function toggle(source) {
  checkboxes = document.getElementsByName('export[]');
  for(var i=0, n=checkboxes.length;i<n;i++) {
    checkboxes[i].checked = source.checked;
  }
}
</script>
<div class="table-responsive">
<form action="{$SCRIPT_NAME}?action=exported" method="post">
<table class="table">
<thead>
  <tr>
    <th style="text-align: center;"><input type="checkbox" onclick="toggle(this)" />{"<br />"}Export</th>
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
  {foreach $data as $entry}
    <tr>
	<td style="text-align: center;"><input type="checkbox" name="export[]" value="{$entry.id|escape}"></td>
        <td>{$entry.Author|escape}</td>
        <td>{$entry.Title|escape}</td>
        <td>{$entry.Edition|escape}</td>
        <td>{$entry.Year|escape}</td>
        <td>{$entry.Location|escape}</td>
        <td>{$entry.Publisher|escape}</td>
        <td>{$entry.Pagetotal|escape}</td>
        <td>{$entry.Type|escape}</td>
    {foreachelse}
      <tr>
        <td colspan="2">No records</td>
      </tr>
  {/foreach}
</tbody>
</table>
<input type="submit" class="btn btn-primary" value="Export">
</form>
</div>
