<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
<h1>Car Name is ${name}</h1>

<form action="Logout" method="post">
    <input type="submit" value="Logout" />

    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form>

<form action="upload" method="post" enctype="multipart/form-data">
        Choose file <input type="file" name="file" />
    <input type="submit" value="upload" />

</form>

<font color="green">
    <cif test="${not empty file}">
        <a href="download/${file.originalFilename}">Click for download ${file.originalFilename}</a>
    </cif>
</font>
</body>
</html>