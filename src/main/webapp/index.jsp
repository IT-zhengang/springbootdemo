<%@page pageEncoding="UTF-8" contentType="text/html; utf-8"  isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<body>
<h2>Hello World!</h2>
    <c:forEach items="${requestScope.users}" var="user">
        ${user.id}----${user.name}----${user.age}----<fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd"></fmt:formatDate>
        <br/>
    </c:forEach>
</body>
</html>
