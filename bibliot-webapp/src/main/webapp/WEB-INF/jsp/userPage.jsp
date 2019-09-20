<%--@elvariable id="memberConnected" type="org.occ.p3.model.Member"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/jsp/header.jsp" %>

            <p>Bienvenue sur votre page personnelle !</p>




                <ul>
                    <li>${memberConnected.firstName}</li>
                    <li>${memberConnected.nickName}</li>
                    <li>${memberConnected.city}</li>
                    <li>${memberConnected.postCode}</li>
                    <li>${memberConnected.mail}</li>

                </ul>
                <hr>

</body>
</html>
