<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%= "login" %></title>
</head>
<body>
<%-- create login page--%>
<%@ include file="index.jsp" %>
<hr/>

<h3>Login Form</h3>

<br/>

<form action="loginprocess.jsp" method="post">
    UserName:<input type="text" name="username"/><br/><br/>
    Password:<input type="password" name="password"/><br/><br/>
    <input type="submit" value="login"/>
</form>
<%
    String username = "";
    Object password = "";
    if(username != "username" && password != "password")
    {
        response.sendRedirect("profile.jsp");
    }

%>
</body>
</html>
