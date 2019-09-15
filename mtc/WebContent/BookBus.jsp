<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form action="/mtc/BookingController" method="post">
<img src="login.jpg"  width="500" class="form"/>
<h1 class="form">Happy Holidays</h1>
<hr width="400">

<input type="text" name="fromPlace"id="text" placeholder="fromPlace"><br/><br/>
<input type="text" name="toPlace" id="text" placeholder="toPlace"><br/><br/>
<input type="text" name="noOfPersons" id="text" placeholder="noOfPersons"><br/><br/>

<input type="submit" id="btn" value="checkFare">


 </form>
 </div>

</body>
</html>