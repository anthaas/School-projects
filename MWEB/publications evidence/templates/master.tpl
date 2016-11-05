{* Smarty*}
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>KMI/MWEB</title>
    	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="./publications/bootstrap/css/bootstrap.min.css">

	<!-- Optional theme -->
	<link rel="stylesheet" href="./publications/bootstrap/css/bootstrap-theme.min.css">

	<!-- Latest compiled and minified JavaScript -->
	<script src=".publications/bootstrap/js/bootstrap.min.js"></script>

	<link rel="stylesheet" href="./publications/awesomplete.css">
</head>
<body>
<div class="container-fluid">
 <header class="container-fluid">
  <h1>Publications evidence</h1>
 </header>
 <div class="col-sm-2 sidenav">
  <ul class="nav nav-pills nav-stacked">
   <li class="{$menu[0]}"><a href="{$SCRIPT_NAME}?action=view">List publications</a></li>
   <li class="{$menu[1]}"><a href="{$SCRIPT_NAME}?action=add">Add publication</a></li>
   <li class="{$menu[2]}"><a href="{$SCRIPT_NAME}?action=export">Export publication</a></li>
  </ul><br>
 </div>
 <div class="col-sm-10">
	{include file=$content}
 </div>
</div>
</body>
</html>
