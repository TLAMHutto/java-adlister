<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title><%= "login" %></title>
</head>
<body>
<hr/>

<h3>Login Form</h3>

<br/>

<form action="profile.jsp" method="post">
    UserName:<input type="text" name="username"/><br/><br/>
    Password:<input type="password" name="password"/><br/><br/>
    <input type="submit" value="login"/>
</form>

<%
    if(request.getParameter("username") != null && request.getParameter("password") != null) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(username.equals("admin") && password.equals("admin")) {
            response.sendRedirect("admin.jsp");
        } else {
            out.println("<h3>Invalid UserName or Password</h3>");
        }
    }
%>
</body>
</html>
