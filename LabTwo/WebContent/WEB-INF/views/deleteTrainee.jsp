<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Trainee</title>
<style>
table,td,th
{
border-width:thin;
border-style:solid;
}
</style>
</head>
<body>
<div align="center">
<b><font size="6">Delete Operation</font></b>
<br>
<br>
<table>
<form:form action="deleteTraineeDB" method="post" modelAttribute="trainee">
<tr>
<td>
Please enter trainee ID
</td>
<td>
<form:input path="traineeId" size="10"></form:input>
</td>
<td>
<input type="submit" name="Delete" value="submit">
</td>
</tr>
</form:form>
</table>
</div>
</body>
</html>