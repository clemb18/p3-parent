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

<p>L'emprunt a ete cloture avec succes :
</p>


        <ul>
            <li>Statut de l'emprunt: ${borrowEnd.status}</li>
            <li>Date de début de l'emprunt: ${borrowEnd.startBorrowDate}</li>
            <li>Date de fin de l'emprunt: ${borrowEnd.endBorrowDate}</li>
            <li>Prolongé ? : ${borrowEnd.extended}</li>
            <li>Titre du livre: ${borrowEnd.workTitle}</li>
            </ul>


</body>
</html>