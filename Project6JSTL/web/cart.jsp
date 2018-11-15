<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="bezhani.Masquerade" %>
<%@ page import="bezhani.EventListExpert" %>
<%@ page import="bezhani.EventListWrapper" %>
<%@page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%--THIS IS THE ADMIN VIEW--%>

<!DOCTYPE html>
<html>
<head>
    <title>Milton's Masquerade: Event List -- Admin View</title>
    <link rel="stylesheet" href="css/ardentarmsstyle.css">
</head>
<body>
<h1 align="center">Milton's Masquerade</h1>

<% List list= new EventListExpert().getToDo(); %>
<c:set var="eventListWrapper" value="<%= new EventListWrapper(list) %>" />
<h3>Event List</h3>
<ul>
    <c:forEach var='item' items='${eventListWrapper.list}'>
        <li><form action = "delete.do"><input type = submit value = Delete> <input type = hidden name = eventname value = '<c:out value='${item.eventName}'/>'> <c:out value='${item.eventName}'/> - <c:out value='${item.eventTime}'/></form></li>
    </c:forEach>
</ul>

<form action = "addevent.jsp"><input type = submit value= Add></form><%--input type = hidden name = eventname value = '<c:out value='${item.eventName}'/>'--%>
<%--form action="cartplace.go">
    <table>
        <%
            List recs = (List) request.getAttribute("catalog");
            Iterator it = recs.iterator();
            while (it.hasNext()) {
                Masquerade event = (Masquerade) it.next();
                out.print("<tr><td>" + event.getEventNumber() + "</td><td>" +  event.getEventName() + "</td><td>" +     event.getEventTime() + "</td></tr>");
            }
        %>

    </table>
</form--%>

<p align="center"><a href="index.jsp">Home</a> <a href="cat.go">Event Schedule</a>  <a href="cart.go">Admin</a></p>
<br><footer>Copyright &copy; 2018 Milton's Masquerade<div><a href="mailto:abezhani@my.wctc.edu">Andi Bezhani</a></div></footer></br>
</body>
</html>