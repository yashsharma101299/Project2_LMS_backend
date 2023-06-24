<%@page import="com.entities.Teachers"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="com.helper.HibernateConfigHelperClass"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%// printing the master list of students
Session s=HibernateConfigHelperClass.getfactory().openSession();
Query q=s.createQuery("from Teachers");
List<Teachers> teachers= q.list();
out.println("<h3>First_name--Last_name--id</h3>");
for(Teachers tech:teachers)
{

out.println(tech.getTfname()+"-------"+tech.getTlname()+"-------"+tech.getTid()+"  "+"<br>");
}

s.close();

%>


</body>
</html>