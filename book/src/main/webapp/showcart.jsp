<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table{
margin-left:25%;
width:50%;
border:2px solid red;
border-collapse:collapse;
}
td{
width:20%;
border:1px solid red;
}
tr{
height:30%;
}
div{
text-align:right;
width:50%;
margin-left:25%;
height:10;
}


input{
width:100%;
background-color:lightpink;
color:lightred;
}
input:hover{
background-color:ligthblack;
color:red;
width:101%;
height:25px;
font-size:90%;
text-shadow:20px 10px 50px blue;
}
font{
margin-left:20%;}
</style>
</head>
<body>
<div>
<form action="showmycart.com">
	<input type="submit" value="Show my cart"/>
	</form>
	</div>
<%
int count=1;
Object obj = session.getAttribute("Mycart");
if (obj!=null){
	out.println(obj);
	List <String> bl=(List<String>)obj;
	if(bl.isEmpty()){
	%>
	<font size="4" color="blue">Your cart is empty, shop Now<%=obj %></font>
	<%
	}
	for (String b:bl){%>
	<table>

	<tr>
	<td><%=count++ %></td>
	<td><%
	out.println(b);
	%>
	</td>
	<td>
	Price:500
	</td>
	<td>
	<form action="remove.com">
	<input type="hidden" name="bname" value="<%=b %>">
	<input type="submit" value="remove from cart"/>
	</from>
	</td>
	</tr>
	<tr>
	<td>
	</table>
	

	<%
	}%>
		<a href="booklist.jsp" style="text-align:left;">Previous</a>
	<a href="index.jsp" style="text-align:center;">BookStore</a>
	<a href="order.jsp" style="text-align:right;">PlaceOrder Now</a>
	<%
	}%>
	

</body>
</html>