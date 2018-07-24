<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table,td,th
{
border-width:thin;
border-style:solid;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Details of Associate</title>
</head>
<body>
<h1>Details of all Associates are:</h1>
<table>
<tr>
<th>Trainee ID</th>
<th>Trainee Name</th>
<th>Trainee Domain</th>
<th>Trainee Location</th>

</tr>
<c:forEach items="${trainee}" var="trainee1">
<tr>
<td>${trainee1.traineeId}</td>
<td>${trainee1.traineeName}</td>
<td>${trainee1.traineeDomain}</td>
<td>${trainee1.traineeLocation}</td>
</tr>
</c:forEach>
</table>
</body>
</html>