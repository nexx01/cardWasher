<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" url="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Custom login page</title>
</head>
<body>
<h1>Custom login page</h1>

<form action="Login" method="post">
    Username:<input type="text" va lue="username" />
    Password:<input type="password" va lue="password" />

    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    <input type="submit" va lue="go" />
    <font color ="red">
        <c:if test ="${not empty param.loginFailed}">
            <c:out value="Login failed, Username or Password not correct"></c:out>
        </c:if>
    </font>



</form>
</body>
</html>