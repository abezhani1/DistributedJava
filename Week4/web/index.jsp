<html>
<body>
<h1>Simple Student Search</h1>
<a href="simple?message=This is a message">Simple Student Search</a>


<form action = "index2.jsp" method = "GET">

  Search: <input type = "text" name = "searchtext" />
  <input type = "submit" value = "Submit" />
  <fieldset>
    <legend>Please select the parameter you would like to search by:</legend>
    <input type = "radio" name = "parameter" value="Account Number"/>Account Number<br>
    <input type = "radio" name = "parameter"  value="Last Name"/>Last Name<br>
    <input type = "radio" name = "parameter" value="First Name"/>First Name<br>
    <input type = "radio" name = "parameter" value="E-Mail"/>E-Mail<br>
    <input type = "radio" name = "parameter" value="iPadDr"/>iPadDr<br>
  </fieldset>

  <input type = "submit" value = "Submit Answers" />
</form>

</body>


</html>