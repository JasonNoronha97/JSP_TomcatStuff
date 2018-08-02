<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="test" class="com.Deloitte.Student">
	</jsp:useBean>

	<jsp:setProperty property="*" name="test" />

	<h1>Display all prop</h1>
	<jsp:getProperty property="fName" name="test" />
	<jsp:getProperty property="lName" name="test" />
	<jsp:getProperty property="rollNo" name="test" />
	<jsp:getProperty property="address" name="test" />

</body>
</html>