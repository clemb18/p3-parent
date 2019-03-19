
<%--
  Created by IntelliJ IDEA.
  User: cbiottea
  Date: 20/12/2018
  Time: 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page isELIgnored="false"%>

<%@ include file="/jsp/header.jsp" %>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>recherche</title>
    <!-- Bootstrap core CSS -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="../css/starter-template.css" rel="stylesheet">
    <script src="../js/bootstrap.min.js"></script>
</head>
<body>

<c:out value="${msg}"/>

<p>Rechercher une oeuvre par auteur:</p>



        <form:form method="POST" action="/searchByAuthor">
            <input type="text" name="author"/>
            <input type="submit" value="recherche"/>
        </form:form>

<p>Résultats de votre recherche:</p>


<c:forEach items="${listWorks}" var="work">
    <ul>
        <li>${work.title}</li>
        <li>${work.publicationDate}</li>
        <li>${work.bookDescription}</li>
        <li><a href="/borrow/${work.id}">Emprunter ce livre</a></li>

    </ul>
</c:forEach>


</body>
</html>
