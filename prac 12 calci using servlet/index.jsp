<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator</title>
</head>
<body>
	<h3>Enter two Nos:: </h3>
	<form action="CalculatorServlet" method="post" >
		Enter First Number <input type="text" name="t1"><br/> 
		Enter Second Number <input type="text" name="t2"><br/> 
		Select an Operation 
		<select name = "op">
			<option value = "+"> + </option> 
			<option value = "-"> - </option> 
			<option value = "/"> / </option> 
			<option value = "*"> * </option> 
		</select><br/>
		
		<input type="submit" value="Calculate">
	</form>

</body>
</html>