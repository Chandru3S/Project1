<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import= "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Chandru</title>
</head>
<body>

<%

//String Id = request.getParameter("Id");
String prdct = request.getParameter("product");
String name = request.getParameter("name");
String phone = request.getParameter("phone");
String address = request.getParameter("address")+" "+request.getParameter("city")+" "+request.getParameter("state")+" "+request.getParameter("zip");

try
{
	Class.forName("com.mysql.jdbc.Driver"); 
	
	Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/chandru_s","root", "Chandru@3");
	PreparedStatement ps = con.prepareStatement("Insert into Address(Product,Name,Phone, Address) values(?,?,?,?)");

	ps.setString(1, prdct);
	ps.setString(2, name);
	ps.setString(3, phone);
	ps.setString(4, address);
	
	
	ps.execute();
	//out.println("Please Check DB");
	out.println("Your Product is ordered Successfully !!!");
	
	
}
catch(Exception e)
{
	out.println(e);
}

%>

<button class="cancel"><a href="">Cancel</a></button>
<button class="shop"><a href="./web.html">Continue to Shop</a></button>
		

<style>
body 
{
	position:relative;
	background-color:grey;
<%--	background-image: radial-gradient(blue,yellow,green,red,aqua,purple,rgb(16, 245, 16)); --%>
    background-repeat: no-repeat;
    height: 400px;

	
}
h3
{
	color:red;
	position: absolute;   
    left: 380px;
    top: 130px;
}
.cancel a
{
	border:none;
	background-color:white;
	color:red;
	padding:10px;
	border-radius:5px;
	position: absolute;   
    left: 420px;
    top: 190px;
}
.shop a
{
	border:none;
	background-color:white;
	color:blue;
	padding:10px;
	border-radius:5px;
	position: absolute;   
    left: 520px;
    top: 190px;
}
.shop a:hover
{
	
	background-color:blue;
	color:white;
}
.cancel a:hover
{
	background-color:red;
	color:white;
}
button a
{
	text-decoration:none;
	color:white;

}
.see
{
	
	color:aqua;
	position: absolute;   
    left: 380px;
    top: 10px;
}
.db
{
	border:none;
	background-color:green;
	padding:5px;
	border-radius:5px;
	position: absolute;   
    left: 420px;
    top: 60px;
}
.db a
{
	text-decoration:none;
	color:white;
}

</style>

</body>
</html>