<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tabledemultiplication</title>
</head>
<body>
 <table>
<% for(int i=0; i<=9;i++) { %>
<tr>
<td>
   <%= i %> x 7 =
</td>
<td>
  <%= i*(Integer)request.getAttribute("value") %>
</td>
</tr>
<%} %>
</table>
</body>
</html>