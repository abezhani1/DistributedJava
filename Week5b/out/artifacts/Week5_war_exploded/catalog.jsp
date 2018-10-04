<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="bezhani.Weapon" %>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Ardent Arms: Catalog</title>
    <link rel="stylesheet" href="css/ardentarmsstyle.css">
</head>
<body>
<h1 align="center">Ardent Arms Catalog</h1>

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
    <input type="submit" value="Purchase">
</form>

<p align="center"><a href="index.jsp">Home</a> <a href="cat.go">Products</a>  <a href="cart.go">Shopping Cart</a></p>
<br><footer>Copyright &copy; 2018 Ardent Arms<div><a href="mailto:abezhani@my.wctc.edu">Andi Bezhani</a></div></footer></br>
</body>
</html>