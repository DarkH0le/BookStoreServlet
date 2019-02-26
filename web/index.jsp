<%--
  Created by IntelliJ IDEA.
  User: darkh0le
  Date: 2/23/19
  Time: 4:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<div class="Login">
    <h2>Login</h2>
    <form action="login" method="post">

        <div class="container">
            <label for="uname"><b>Email</b></label>
            <input type="text" placeholder="Enter email" name="email" required id="uname">

            <label for="psw"><b>Contrasena</b></label>
            <input type="password" placeholder="Enter Password" name="password" id="psw" required>

            <button type="submit">Login</button>
            <label>
                <input type="checkbox" checked="checked" name="remember"> Remember me
            </label>
        </div>
        <%--Add ServletSearch box    --%>
    </form>
</div>

<div class="search">
    <h2> Catalogo</h2>
    <form action="search" method="get">

        <label for="site-search">Search the site:</label>
        <input type="search" id="site-search" name="search"
               aria-label="Search through site content" placeholder="">

        <button>Search</button>
    </form>
</div>

<div class="register">
    <h2>Registrar</h2>
    <form action="register" method="post">

        <div class="container">
            <label for="uname"><b>Email</b></label>
            <input type="text" placeholder="Enter email" name="email" required id="registerEmail">

            <label for="psw"><b>Contraseña</b></label>
            <input type="password" placeholder="Enter Password" name="password" id="registerPassword" required>

            <button type="submit">Registrar</button>
        </div>
        <%--Add ServletSearch box    --%>
    </form>
</div>


</body>
</html>
