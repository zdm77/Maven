<%@ page import="app.entities.DBConnect" %>
<%@ page import="app.entities.SqlBase" %>
<%@ page import="java.util.List" %>
<%@ page import="app.entities.AirLines" %>
<%@ page import="app.model.Model" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<div class="w3-container w3-padding">

    <%
        List<String> names = (List<String>) request.getAttribute("airLines");
        if (names != null && !names.isEmpty()) {
            out.println("<ul class=\"w3-ul\">");
            for (String s : names) {
                out.println("<li class=\"w3-hover-sand\">" + s + "</li>");
            }
            out.println("</ul>");
        }
    %>
</div>
</body>
</html>
