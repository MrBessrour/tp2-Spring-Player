<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Modifier un Player</title>
</head>
<body>
<form action="updatePlayer" method="post">
<pre>
id : <input type="text" name="idPlayer" value="${Player.idPlayer}">
nom :<input type="text" name="nomPLayer" value="${Player.nomPLayer}">
Score :<input type="text" name="scorePLayer" value="${Player.scorePLayer}">
Date création :
 <fmt:formatDate pattern="yyyy-MM-dd" value="${Player.dateCreation}"
var="formatDate" />
 <input type="date" name="date" value="${formatDate}"></input>
<input type="submit" value="Modifier">
</pre>
</form>
<br/>
<br/>
<a href="ListePlayers">Liste Players</a>
</body>
</html>
