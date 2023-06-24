<%@page import="com.entities.Subjects"%>
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
<%
Session s=HibernateConfigHelperClass.getfactory().openSession();
out.println("<h4>SubjectId----SubjectName</h4>");
Query q=s.createQuery("from Subjects");
List<Subjects> subjects=q.list();
for(Subjects subj:subjects)
{out.println(subj.getSubid()+"------"+subj.getSubname()+"<br>");}

s.close();
%>
</body>
</html>