<%@ page contentType="text/html;charset=UTF-8" %>
<%
  String user = (String) session.getAttribute("user");
%>
<html>
<head><title>Dashboard</title></head>
<body>
  <h2>Welcome, <%= user %></h2>
  <a href="logout">Logout</a>
</body>
</html>