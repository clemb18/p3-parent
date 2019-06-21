<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page isELIgnored="false"%>
<%@ include file="/header.jsp" %>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>header menu</title>
    <!-- Bootstrap core CSS -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="../css/starter-template.css" rel="stylesheet">
    <script src="../js/bootstrap.min.js"></script>
</head>
<body>


<c:out value="${msg}"/>

<c:forEach items="${memberborrowList}" var="borrow">
    <ul>
        <li>${borrow.id}</li>
        <li>${borrow.status}</li>
        <li>${borrow.workName}</li>
        <li>${borrow.startBorrowDate}</li>
        <li>${borrow.endBorrowDate}</li>
        <li> <a href="${pageContext.request.contextPath}/extendBorrow/<c:out value="${borrow.id}"/> ">Rallonger la durée d'emprunt d'un mois</a></li>
        <li> <a href="${pageContext.request.contextPath}/endBorrow/<c:out value="${borrow.id}"/> ">Rendre le livre et clôturer l'emprunt</a></li>
    </ul>
    <hr>
</c:forEach>


</body>
</html>