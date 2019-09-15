<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="form.css">
<title>Insert title here</title>
<div>
<c:if test="${!empty custlist}"> 
  <table>
  <tr>
  	<th width="20"></th>
   <th width="180" align="center">ProductList</th>
   <th width="180"  align="center">	Brand</th>
   <th width="180" align="center">Category</th>
   <th width="180" align="center">Rating</th>
   <th width="140" align="center"></th>
   <th width="90" align="center"></th>
   <th width="90" align="center"></th>
   </tr>
   <c:forEach items="${custlist }" var="product">
    <tr>
    <td><input type="radio" name="product"> </td>

    <td align="center">${product.bus_fee}</td>
    <td align="center">${product.food_fee}</td>
    <td align="center">${product.stay_fee}</td>
    </tr>
 	</c:forEach>
  </table>
  </c:if>
  </div>
  
<div id="column3">
</div>
</body>
</html>
