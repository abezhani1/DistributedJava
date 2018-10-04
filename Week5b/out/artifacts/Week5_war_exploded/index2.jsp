<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="bezhani.Weapon" %>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Ardent Arms</title>
    <link rel="stylesheet" href="css/ardentarmsstyle.css">
  </head>
  <body>
  <h1 align="center">Welcome to Ardent Arms</h1>
  <p align="center"><img align="center" src="img/ardentlogo.jpg" alt="Oz" width="350" height="350"></p>
  <h2 align="center">Where Steel Meets Excellence</h2>
    <p align="center">Sharp swords of hallowed antiquity!</p>
    <p align="center">Piercing spears from times immemorial!</p>
    <p align="center">Vorpal axes made of the strongest steel!</p>
    <p align="center">All at reasonable prices!</p>

  <form action="cartplace.go">
    <table>
      <%
        List recs = (List) request.getAttribute("catalog");
        Iterator it = recs.iterator();
        while (it.hasNext()) {
          Weapon item = (Weapon) it.next();
          out.print("<tr><td>" + item.getWeaponName() + "</td><td>$" + item.getPrice() + "</td><td>Add to Cart<input type='checkbox' name='cartItem' value=" + item.getWeaponNumber() + "></td></tr>");
        }
      %>

    </table>

<%--
<p align="center"><input type="submit" value="Purchase"></p>
--%>
  </form>

  <p align="center"><a href="index.jsp">Home</a>  <a href="cat.go">Products</a>  <a href="cart.go">Shopping Cart</a></p>
  <br><footer>Copyright &copy; 2018 Ardent Arms<div><a href="mailto:abezhani@my.wctc.edu">Andi Bezhani</a></div></footer></br>
  </body>
</html>
