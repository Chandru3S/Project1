<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import= "java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DataBase</title>
</head>
<body>

<%
    Class.forName("com.mysql.jdbc.Driver"); 
	Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/chandru_s","root", "Chandru@3");
    Statement statement = connection.createStatement() ;
    ResultSet rst = statement.executeQuery("select * from Address") ;
      
%>

<h3>Login Table</h3>

<TABLE BORDER="1" class="tbl">
	<TR>
      <TH id="th">Id</TH>
      <TH id="th1">Product</TH>
      <TH id="th1">Name</TH>
      <TH id="th2">Phone</TH>
      <TH id="th3">Address</TH>
 <%-- <TH id="edit">Edit</TH> --%>    
 
	</TR>
	<% while(rst.next())
	{ %>
      <TR>
        <TD id="th"> <%= rst.getInt(1) %></TD>
		<TD id="th4"> <%= rst.getString(2) %></TD>
		<TD id="th4"> <%= rst.getString(3) %></TD>
        <TD id="th5"> <%= rst.getString(4) %></TD>
        <TD id="th6"><a href="https://www.google.com/search?map=<%= rst.getString(5) %>"> <%= rst.getString(5) %></a></TD>
       <%-- <TH id="edit"><a href="update.jsp?Id=<%=rst.getString("Id") %>">Edit</a></TH> --%>
      </TR>
	<% } %>
</TABLE>
<style>

body 
{
	position:relative;
	background-color: lightslategray;
	
} 
h3
{
	color:lawngreen;
	position: absolute;
	left:410px;
	top:5px;

}
.tbl
{
	  position: absolute;
	  left:340px;
	  top:50px;
	  border-top: none;
      border-right: none;
      border-bottom: none;
      border-left: none;
      border-collapse: collapse; 
      box-shadow: 5px 2px 5px 3px ;
}
.tbl TD
{
  	border-top: none;
    border-right: none;
    
}
.tbl #th,#th
{
	background-color:wood;
	padding:3px 10px 3px 10px;

}

.tbl #th1,#th4
{
	background-color:bisque;
	padding:3px 80px 3px 10px;

}
.tbl #th2,#th5
{
	background-color:aqua;
	color: brown;
	padding:3px 80px 3px 5px;

}
.tbl #th3,#th6
{
	background-color:khaki;
	color:black;
	padding:3px 220px 3px 5px;
	

}

</style>



</body>
</html>