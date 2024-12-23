<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>


.table{
margin:20%;}
table{

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
<div id="table">
<div>
<form action="showmycart.com">
	<input type="submit" value="Show my cart"/>
	</form>
	</div>
<%
int count=1;
Object obj = session.getAttribute("BL");
if (obj!=null){
	List <String> bl=(List<String>)obj;
	
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
	Discount:10%
	</td>
	<td>
	offer only for gents
	</td>
	<td>
	<form action="addcart.com">
	<input type="hidden" name="bname" value="<%=b %>">
	<input type="submit" value="Add to cart"/>
	</form>
	</td>
	</tr>
	
	<%
	}%>
	</table>
	<%
	}%>
	
</div>
</body>
</html>