<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
<form action="/create">
Create Employee:<input type="submit" value="CREATE"/>
</form>
<form action="/display" method="get">
Display Employee:<input type="submit" value="DISPLAY"/>
</form>
<form action="/update">
Update Employee:<input type="submit" value="UPDATE"/>
</form>
<form action="/delete">
Delete Employee:<input type="submit" value="DELETE"/>
</form>
</body>
</html>