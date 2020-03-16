<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ include file="/WEB-INF/views/header.jsp" %>

<body>

        <div class="container">
            <p>${message}</p>
            <h1><strong>S'identifier</strong></h1>
            <form:form method="post" action="login" modelAttribute="login">

                <form:input path="mailAdress" name="mailAdress" id="mailAdress" type="text" class="form-control form-control-sm mb-3" placeholder="Mail"
                            autofocus="true" required="true"/>

                <form:input path="password" name="password" id="password" type="password" class="form-control form-control-sm mb-3" placeholder="Password" required="true"/>


                <input type="submit" class="btn btn-success" value="Valider"/>
                <input type="reset" class="btn btn-danger" value="Reset"/>


            </form:form>
        </div>


</body>
</html>