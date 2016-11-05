{* Smarty *}
{foreach $data as $entry}
@{$entry.Type|upper}{ {"<br />"}
  t{$entry.id}, {"<br />"}
  author = { {$entry.Author} },{"<br />"}
  year = { {$entry.Year} },{"<br />"}
  title = { {$entry.Title} },{"<br />"}
  location = { {$entry.Location} },{"<br />"}
  publisher = { {$entry.Publisher} },{"<br />"}
  pagetotal = { {$entry.Pagetotal} },{"<br />"}
}{"<br />"}
{foreachelse}
    No records
{/foreach}
