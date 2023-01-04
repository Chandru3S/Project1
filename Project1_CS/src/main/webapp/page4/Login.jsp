<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%


String pn = request.getParameter("mobile");
String pass = request.getParameter("password");


    Class.forName("com.mysql.jdbc.Driver"); 
	Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/chandru","root", "Chandru@3");
    Statement statement = connection.createStatement() ;
    ResultSet rsObj = statement.executeQuery("select * from table_name") ;
      

		while(rsObj.next())
		{
			

			String phone = rsObj.getString("Phone");
			String password = rsObj.getString("Password");
			

			System.out.println("Phone No: "+phone+"\nPassword: "+password);
			
			if(phone.equals(pn) && password.equals(pass))
			{
				System.out.println("\nWel Come Back ");
				response.sendRedirect("web.html");			
				
			}
			else
			{
				System.out.println("Phone No is Invalid / Not Matched Enter again");
				response.sendRedirect("p1.html");
				
			}

			
		}
		

%>
</body>
</html>