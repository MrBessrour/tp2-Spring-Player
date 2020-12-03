<%@ page language="java" contentType="text/html; charset=windows-1256" pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Create new PLayer</title>
</head>
<body>
<form action="savePlayer" method="post">
<pre>
Name : <input type="text" name="nomPLayer">
Score : <input type="text" name="scorePlayer">
Date : <input type="date" name="date">
<input type="submit" value="ajouter">
</pre>
</form>
${msg}
<br/>
<br/>
<a href="ListPlayers">List PLayers</a>
</body>
</html>