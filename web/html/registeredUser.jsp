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
    <title>Register Succeed</title>
</head>
<body>
    <h1>Nuevo Usuario Agregado: </h1>
    <h2>Estatus usuario:<% out.print(request.getAttribute("register").toString()); %> </h2>
</body>
</html>
