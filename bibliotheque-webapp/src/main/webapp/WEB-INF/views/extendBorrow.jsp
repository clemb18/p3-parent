<%@ include file="/WEB-INF/views/header.jsp" %>

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

<p>L'emprunt a ete prolonge avec succes :
</p>


<c:forEach items="${borrowExtend}" var="borrow">
    <ul>
        <li>Statut de l'emprunt: ${borrowExtend.status}</li>
        <li>Date de début de l'emprunt: ${borrowExtend.startBorrowDate}</li>
        <li>Date de fin de l'emprunt: ${borrowExtend.endBorrowDate}</li>
        <li>Prolongé ? : ${borrowExtend.extended}</li>
        <li>Titre du livre: ${borrowExtend.workTitle}</li>
        <li><a href="endBorrow/${borrow.id}">Clôturer l'emprunt</a></li>
    </ul>
</c:forEach>

</body>
</html>