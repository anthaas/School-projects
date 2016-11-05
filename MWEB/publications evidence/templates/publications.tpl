{* Smarty *}
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
  {foreach $data as $entry}
    <tr>
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
</div>
