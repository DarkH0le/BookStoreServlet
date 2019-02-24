<%@ page import="com.bookstore.bean.Book" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>
<%@ page import="java.io.IOException" %><%--
  Created by IntelliJ IDEA.
  User: darkh0le
  Date: 2/24/19
  Time: 1:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Results</title>
</head>
<body>

    <%

        try {
            System.out.println("entradod a resultados");
            List<Book> products = (ArrayList) request.getAttribute("bookList");
            for (Book product : products) {
                response.getWriter().print("<div class=\"book\">\n" +
                        "  <img src=\"" + product.getImage() + "\" alt=\"\" >\n" +
                        "  <h1>" + product.getName() + "</h1>\n" +
                        "  <p class=\"bookSynopsis\">" + product.getSynopsis() + "</p>\n" +
                        "  <p>" + product.getDescription() + "</p>\n" +
                        "  <p><button>ADD TO CAR</button></p>\n" +
                        "</div>");
            }
        } catch (IOException e) {
            response.getWriter().print("Error while getting the books");
            e.printStackTrace();
        }
    %>
</body>
</html>
