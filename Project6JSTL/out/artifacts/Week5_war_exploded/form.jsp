<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Ardent Arms: Selection</title>
    <link rel="stylesheet" href="css/ardentarmsstyle.css">
</head>
<body>
<h1 align="center">Ardent Arms</h1>
<h2 align="center">Weapon Selection</h2>
<form id="form1" name="form1" method="POST" action="InventoryList.do">
    <p align="center">Please Select Weapon Category<p>
    <p align="center">

        <select id="weapon" name="weapon" size ="1">
            <option value="Swords">Swords</option>
            <option value="Axes">Axes</option>
            <option value="Spears">Spears</option>
        </select>
    </p>
    <center>
        <input id="beerSubmit" name="beerSubmit" type="submit" value="Get Product List">
    </center>
</form>
<p align="center"><a href="index.jsp">Home</a> <a href="cart.jsp">View Cart</a> <a href="bill.jsp">View Bill</a></p>
<br><footer>Copyright &copy; 2018 Ardent Arms<div><a href="abezhani@my.wctc.edu">Andi Bezhani</a></div></footer></br>
</body>
</html>