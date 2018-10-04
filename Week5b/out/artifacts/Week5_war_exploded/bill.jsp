<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="bezhani.Weapon" %>


<%@ page import="bezhani.Weapon" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Ardent Arms: Bill</title>
    <link rel="stylesheet" href="css/ardentarmsstyle.css"></head>
<body><h1>Bill</h1>
<div id="rcorners">
    <h3>Final Bill</h3>
    <form action="bill.go">
        <table>
            <%
                List recs = (List) request.getAttribute("catalog");
                Iterator it = recs.iterator();
                double total = 0;
                while (it.hasNext()) {
                    Weapon item = (Weapon) it.next();
                    out.print("<tr class='purch'><td> " + item.getWeaponName() + " </td><td>" +
                            String.format("$%3.2f",item.getPrice()) + "</td></tr>");
                    total+=item.getPrice();
                }
                out.print("<tr class='total' ><td>Total:</td><td>" +
                        String.format("$%3.2f",total) + "</td></tr>");
            %>
        </table>
        <input type="submit" value="Complete Order">
    </form>
</div>
<p align="center"><a href="index.jsp">Home</a>  <a href="catalog.go">Products</a>  <a href="cart.go">Shopping Cart</a></p>
<br><footer>Copyright &copy; 2018 Ardent Arms<div><a href="mailto:abezhani@my.wctc.edu">Andi Bezhani</a></div></footer></br>
</body>
</html>
