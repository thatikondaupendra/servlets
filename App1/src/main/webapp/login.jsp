<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
</head>
<body>
<h1>Login Form</h1>
<font color="red" size="3">
<%
Object obj=request.getAttribute("MSG");
if(obj!=null){
	String msg=obj.toString();
	out.print(msg);
}
%>
</font>
<form action="login.in" method="post">
<table>
<tr>
<td>
UserName:
</td>
<td>
<input type="text" name="un">
</td>
</tr>
<tr>
<td>
Password:
</td>
<td>
<input type="Password" name="pw">
</td>
</tr>
<tr>
<td>
submit here:
</td>
<td>
<input type="submit" value="submit">
</td>
</tr>
</table>
</form>
</body>
</html>