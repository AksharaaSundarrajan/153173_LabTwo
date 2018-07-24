<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Trainee</title>
</head>
<body>
<div align="center">
<b><font size="6">Enter trainee details</font></b>
<br>
<br>
<table>
<form:form action="addTraineeDB" method="post" modelAttribute="trainee">
<tbody>
<tr>
<td>
Trainee Id
</td>
<td>
<form:input path="traineeId" size="10"></form:input>
</td>
</tr>
<tr>
<td>
Trainee Name
</td>
<td>
<form:input path="traineeName" size="30"></form:input>
</td>
</tr>
<tr>
<td>
Trainee Location
</td>
<td>
<form:input path ="traineeLocation"  size = "15"/>
<%-- <form:input type ="radio" id="loc1" path ="traineeLocation" value="Bangalore"/>Bangalore
<form:input type ="radio" id="loc2" path ="traineeLocation" value="Pune"/>Pune
<form:input type ="radio" id="loc3" path ="traineeLocation" value="Mumbai"/>Mumbai --%>
</td>
</tr>
<tr>
<td>
Trainee Domain
</td>
<td>
<form:input path ="traineeDomain"  size = "15"/>
<%-- <form:input path="traineeDomain" id="domain">
<select name="domains">
<option value="JavaFullStack">Java Full Stack</option>
<option value="Systems">Systems </option>
<option value="Automation">Automation</option>
</select>
</form:input> --%>
</td>
</tr>
<tr>
<td colspan="1">
<input type ="submit" name ="Add Trainee" value="submit" >
</td>
</tr>
</tbody>
</form:form>
</table>
</div>

</body>
</html>