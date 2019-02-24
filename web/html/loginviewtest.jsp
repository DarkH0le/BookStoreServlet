<%--
  Created by IntelliJ IDEA.
  User: darkh0le
  Date: 2/24/19
  Time: 3:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>logintest</title>
</head>
<body>

    <%
    response.getWriter().print("<h1>Estatus usuario:" + request.getAttribute("valid") + "</h1>");
    %>
</body>
</html>
