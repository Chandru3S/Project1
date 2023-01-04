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
String frame = request.getParameter("with");

try
{
	Class.forName("com.mysql.jdbc.Driver"); 
	
	Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/chandru_s","root", "Chandru@3");
	PreparedStatement ps = con.prepareStatement("Insert into frame(Frame) values(?)");

	ps.setString(1, frame);
	
	
	ps.execute();
	//out.println("Please Check DB");
	out.println("Chandru !!!");
	
}
catch(Exception e)
{
	out.println(e);
}

%>

<%-- <h3>For Again Log-In</h3><br><br>
<button><a href="./index.html">Click Me</a></button>
<h3 class="see">To See DB table</h3><br><br> --%>
<button class="db"><a href="./address.html">Continue</a></button>
		

<style>
body 
{
	position:relative;
	/*background-color:grey;*/
	background-image: radial-gradient(blue,yellow,green,red,aqua,purple,rgb(16, 245, 16));
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
button
{
	border:none;
	background-color:blue;
	padding:5px;
	border-radius:5px;
	position: absolute;   
    left: 420px;
    top: 190px;
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