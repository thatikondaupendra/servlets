<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>search</title>
<style>

body{
background-color:rgb(4, 31, 89);
font-weight:800;
font-size:20px;
}
table{
width:50%;
text-align:center;
border:5px solid red;
margin-left:25%;
}
select{
align:center;
width:50%;
text-align:center;
color:rgb(248, 104, 8);
font-size:30px;
background-color:rgba(140, 172, 221, 0.369);
font-family:Timesnewroman;

}
input{
width:20%;
background-color:lightpink;
color:lightred;
}
input:hover{
background-color:ligthblack;
color:red;
width:23%;
height:25px;
font-size:90%;
text-shadow:20px 10px 50px blue;
}
font{
margin-left:20%;}

</style>
</head>
<body>
<h1>Welcome to Nani Book Store</h1>
<h2>${MESG}</h2>
<h1>Select Category of Books</h1>
<form action="index.in" method="post">
<font size='10' color='red'>${MSG}</font>
<table>
<tr>
<td>
<select name="cats">
<option value="">---selectCategory---</option>
<option value="java">java Programming</option>
<option value="python">Python Programming</option>
<option value="web">Web Development</option>
</select>
</td>
</tr>
<tr>
<td>
<input type="submit" value="show">
</td>
</tr>
</table>
</form>
</body>
</html>