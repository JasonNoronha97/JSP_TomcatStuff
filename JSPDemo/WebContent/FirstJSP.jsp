<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>JSPBoiii</title>
</head>
<body>
<h1>My First JSP</h1>
	<%
		for(int i=0;i<10;i++)
		{
			out.print(i+"<br>");
		}
	%>
</body>
</html>