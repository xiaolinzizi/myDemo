<%--
  Created by IntelliJ IDEA.
  User: xiaolin.zhang
  Date: 2017/3/5
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    message:${message};
    title: ${title};
    sessionId:${sessionId};
    <c:url value="/mvndemo/j_spring_security_logout" var="logoutUrl"/>

    <form action="${logoutUrl}" method="post" id="logoutForm">
        <input type="hidden"
               name="${_csrf.parameterName}"
               value="${_csrf.token}" />
    </form>

    <c:if test="${pageContext.request.userPrincipal.name!=null}">
        show:${pageContext.request.userPrincipal.name}
        <a href="<c:url value="/mvndemo/loginpagetodo?out=out"/>">login out</a>
    </c:if>
    <c:if test="${ not empty logout}">
        logoutmessage:${logout}
    </c:if>
    <script>
        function formSubmit() {
            document.getElementById("logoutForm").submit();
        }
    </script>

</body>
</html>
