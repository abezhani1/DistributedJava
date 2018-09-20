<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="Weapon" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ardent Arms: Weapon Listing</title>
    <link rel="stylesheet" href="css/ardentarmsstyle.css">
</head>

<body>
<h1 align="center">Ardent Arms</h1>
<h2 align="center">Recommended Product(s)</h2>
<p align="center">

        <%
        List recs = (List)request.getAttribute("recommendations");
        Iterator it = recs.iterator();
        while(it.hasNext()) {
        Weapon w = (Weapon) it.next();
            out.print("<br><br>" + w.getWeaponName());
        }
        %>
</p></br>
<p align="center"><a href="form.html">Back</a> <a href="index.jsp">Home</a></p>
    <br><footer>Copyright &copy; 2018 Ardent Arms<div><a href="abezhani@my.wctc.edu">Andi Bezhani</a></div></footer></br>
</body>
</html>
