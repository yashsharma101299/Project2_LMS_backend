<%@page import="com.entities.Students"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="com.helper.HibernateConfigHelperClass"%>
<%@page import="org.hibernate.Session"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
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
Query q=s.createQuery("from Students where classid=1");
List<Students> students= q.list();
out.println("<h4>Student_ID-----Student_firstname-----Student_lastname	</h4>");
for(Students stud:students)
{

out.println(stud.getStudid()+"-----"+stud.getStudfname()+"-----"+stud.getStudlname()+"  "+"<br>");
}

s.close();

%>
</body>
</html>