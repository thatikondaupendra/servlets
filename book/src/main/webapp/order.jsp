<%@ page import = "java.util.List "%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" http-equiv="refresh" content="3,http://localhost:8077/book/booklist.jsp">
<title>Ordered</title>
</head>
<body>
<h1>Your order is successfull IN</h1>
<%
HttpSession hs=request.getSession();
List <String> li=(List <String>)hs.getAttribute("Mycart");
li.clear();
int count=3;
for (int i=3;i>=0;i--){
	count--;
	out.print(count);
}
%>
</body>
</html>