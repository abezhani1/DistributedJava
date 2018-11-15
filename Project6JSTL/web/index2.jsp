<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="bezhani.Masquerade" %>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Milton's Masquerade</title>
    <link rel="stylesheet" href="css/ardentarmsstyle.css">
  </head>
  <body>
  <h1 align="center">Welcome to Milton's Masquerade</h1>
  <p align="center"><img align="center" src="img/masqueradelogo.jpg" alt="Oz" width="350" height="350"></p>
  <h2 align="center">A yearly evening of way too much fun!</h2>
    <p align="center">Event includes Best Mask Contest and bi-yearly Fencing Tournaments!</p>
    <p align="center">Dance the night away with music from hallowed antiquity!</p>
    <p align="center">Listen to the special guest speaker give the opening and closing speeches!</p>

  <form action="cartplace.go">
    <table>
      <%
        List recs = (List) request.getAttribute("catalog");
        Iterator it = recs.iterator();
        while (it.hasNext()) {
          Masquerade slot = (Masquerade) it.next();
          out.print("<tr><td>" + slot.getEventNumber() + "</td><td>$" + slot.getEventName() + "</td><td>$" + slot.getEventTime() + "</td></tr>");
        }
      %>

    </table>

  </form>

  <p align="center"><a href="index.jsp">Home</a>  <a href="cat.go">Event Schedule</a>  <a href="cart.go">Admin</a></p>
  <br><footer>Copyright &copy; 2018 Milton's Masquerade<div><a href="mailto:abezhani@my.wctc.edu">Andi Bezhani</a></div></footer></br>
  </body>
</html>
