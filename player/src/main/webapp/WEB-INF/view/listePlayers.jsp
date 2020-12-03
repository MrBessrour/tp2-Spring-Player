<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Liste Players</title>
</head>
<body>
 <h1 >
 Liste des Players
 </h1>
 <table >
 <tr>
 <th>ID</th><th>Nom Player</th><th>Score</th><th>Date
Cr�ation</th><th>Suppression<th>Edition</th>
 </tr>
 <c:forEach items="${Players}" var="p">
 <tr>
 <td>${p.idPlayer }</td>
 <td>${p.nomPLayer }</td>
 <td>${p.scorePLayer }</td>
 <td><fmt:formatDate pattern="dd/MM/yyyy"
value="${p.dateCreation}" /></td>
 <td><a onclick="return confirm('Etes-vous s�r ?')"
href="supprimerPlayer?id=${p.idPlayer }">Supprimer</a></td>
 <td><a href="modifierPlayer?id=${p.idPlayer }">Edit</a></td>
 </tr>
 </c:forEach>
 </table>
</body>
</html>