<%@page import="BO.NewUserHandler"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!--<%@ page import="BO.NewUserHandler" %>-->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>create a new user</title>
</head>
<body>
<FORM METHOD=POST ACTION="startPage.jsp">
Enter Username <INPUT TYPE=TEXT NAME=newusername SIZE=20><BR>
Enter Password <INPUT TYPE="password" NAME=newpassword SIZE=20><BR>

<P><INPUT TYPE=SUBMIT>
</FORM>
  <% 
 NewUserHandler NUH = new NewUserHandler();
   System.out.println(session.getAttribute( "newusername" ));
   NUH.create();
   %>
</body>
</html>

