<%--
  Created by IntelliJ IDEA.
  User: abezhani
  Date: 11/14/18
  Time: 8:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Working Title</title>
</head>
<body>
<form action="ServletAdd" method="post">
    <input type="text" name="eventnumber" placeholder="Enter New Number"/>
    <input type="text" name="eventname" placeholder="Enter New Event"/>
    <input type="text" name="eventtime" placeholder="Enter New Time"/>
    <input type = submit value="Insert Event">
</form>
</body>
</html>
