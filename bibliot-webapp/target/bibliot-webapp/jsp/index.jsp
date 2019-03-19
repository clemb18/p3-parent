
<%--
  Created by IntelliJ IDEA.
  User: cbiottea
  Date: 13/12/2018
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<%@ include file="/jsp/header.jsp" %>

<!-- Affichage login -->

<div class="container">

    <form:form method="post" action="/authentificate" class="form-signin">
        <h2 class="form-signin-heading">Veuillez vous connecter svp</h2>
        <label for="user" class="sr-only">user</label>
        <input type="text" id="user" name="user" class="form-control" placeholder="user" required autofocus>
        <label for="password" class="sr-only">Password</label>
        <input type="password" id="password" name="password" class="form-control" placeholder="password" required>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> Remember me
            </label>
        </div>
        <button type="submit" class="btn btn-lg btn-primary btn-block" >connexion</button>
    </form:form>

</div> <!-- /container -->

</body>
</html>
