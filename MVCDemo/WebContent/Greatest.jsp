<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>result</title>
</head>
<body>
<%
	Integer num[] = (Integer[]) request.getAttribute("answer");%>
<h1 style="color:green;"> Greater:  <% out.println(num[0]); %></h1>
<h1 style="color:red;"> Smaller:  <% out.println(num[1]); %></h1>
</body>
</html>