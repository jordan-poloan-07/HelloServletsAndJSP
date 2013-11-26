<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Here are jordan's 12 datatypes</title>
</head>
<body>
	<p>Datatype selection advice:</p>
	<%
		List<String> styles = (List<String>) request.getAttribute("datatypes");
		Iterator<String> it = styles.iterator();
		while (it.hasNext()) {
			out.print("Le datatype: " + it.next() + "</br>");
		}
	%>
</body>
</html>