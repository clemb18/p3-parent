<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ include file="/WEB-INF/views/header.jsp" %>






<c:if test = "${findResult == true}">
    <c:forEach items="${borrowList}" var="borrow">
        <div class="card" style="width: 50rem;">
            <div class="card-body">
                <h5 class="card-title"><strong>Titre du livre: ${borrow.workTitle}</strong></h5>
                <p class="card-text">Statut: ${borrow.status}</p>
                <p class="card-text">Emprunt&eacute; le: ${borrow.startBorrowDate}</p>
                <p class="card-text">Date de fin: ${borrow.endBorrowDate}</p>
                <a href="extendBorrow/${borrow.id}" class="btn btn-primary">Prolonger</a> <a href="endBorrow/${borrow.id}" class="btn btn-primary">Cloturer</a>


            </div>
        </div>
    </c:forEach>
</c:if>
</body>
</html>


