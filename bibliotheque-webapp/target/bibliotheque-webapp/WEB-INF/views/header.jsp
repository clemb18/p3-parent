<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false"%>


<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bibliothèque Municipale</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>

<div class="jumbotron text-center" style="margin-bottom:0">
    <h1>Bibliothèque Municipale</h1>
</div>

<nav class="navbar navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="home">Home</a></li>

                <% if (session.getAttribute("memberCoId") != null) { %>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="menuDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Rechercher une oeuvre
                    </a>
                    <div class="dropdown-menu" aria-labelledby="menuDropdown">
                        <a class="dropdown-item" href="searchWork">Par auteur</a>
                        <br>
                        <a class="dropdown-item" href="searchWorkByDate">Par ann&eacute;e de publication</a>
                        <a class="dropdown-item" href="searchWorkByTitle">Par titre</a>
                    </div>
                </li>
                <li><a href="searchMemberBorrow">Mes emprunts</a></li>
                <li><a href="login">Se d&eacute;connecter</a></li>
                <% } else {%>
                <li><a href="login">Se connecter</a></li>
                <% } %>







            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>

<br>
<br>