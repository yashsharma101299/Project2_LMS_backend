<%@page import="com.entities.Classrooms"%>
<%@page import="com.entities.Students"%>
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
<title>Students</title>
</head>
<body>
<%// printing the master list of students
Session s=HibernateConfigHelperClass.getfactory().openSession();
Query q=s.createQuery("from Classrooms");
List<Classrooms> cls= q.list();
out.println("<h3>ClassID::ClassName</h3>");
for(Classrooms stud:cls){
out.println(stud.getClassid()+"----------"+stud.getClassname()+"<br>");
}

s.close();

%>
</body>
</html>