<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ include file="/WEB-INF/views/header.jsp" %>



<div class="container" style="margin-top:30px">

    <c:if test = "${findResult == true}">
        <p>${message}</p>
    </c:if>

    <div class="col-sm-8">
        <h5><strong>Bienvenue sur le site de la bibliothèque municipale !</strong></h5>

        <p><strong>Grace à ce site vous pouvez :</strong></p>
        <ul>
            <li>Rechercher une oeuvre à emprunter</li>
            <li>Consulter vos emprunts en cours et passés</li>
            <li>Prolonger ou clôturer vos emprunts</li>
        </ul>


    </div>
</div>