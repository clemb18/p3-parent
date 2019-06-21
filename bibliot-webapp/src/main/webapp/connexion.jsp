<%--
  Created by IntelliJ IDEA.
  User: cbiottea
  Date: 19/12/2018
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/header.jsp" %>




<div class="container">

    <form class="form-signin">
        <h2 class="form-signin-heading">Veuillez vous connecter svp</h2>
        <label for="user" class="sr-only">Pseudo</label>
        <input type="text" id="user" class="form-control" placeholder="user" required autofocus>
        <label for="password" class="sr-only">Password</label>
        <input type="password" id="password" class="form-control" placeholder="password" required>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> Remember me
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Connexion</button>
    </form>

</div> <!-- /container -->

</body>
</html>
