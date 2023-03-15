<%--
  Created by IntelliJ IDEA.
  User: nikit
  Date: 15.03.2023
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<c:if test="${not empty requestScope.tickets}">
  <h1>Купленные билеты:</h1>
  <ul>
    <c:forEach var="ticket" items="${requestScope.tickets}">
      <li>${fn:toLowerCase(ticket.setNo)}</li>
    </c:forEach>
  </ul>
</c:if>
</body>
</html>