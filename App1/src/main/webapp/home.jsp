<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Jlc</title>
</head>
<body>
<h1>welcome
<%
String un=request.getAttribute("UN").toString();
out.print(un);
%></h1>

<h3>this is home page</h3>
<h3>this is home page</h3>
<h3>this is home page</h3>
<h3>this is home page</h3>
<h3>this is home page</h3>
</body>
</html>