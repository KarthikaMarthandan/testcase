<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="Header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body{
background-image:url('E:\NIIT\project\StatFront\src\main\images');
}

h3{
text-align:center;}
h4{
color:white;
}
</style>

</head>
<body>
<c:url value="/all/savecustomer" var="url"></c:url>
<form:form action="${url }" modelAttribute="customer">
<div class="row">
<div class="col-md-4">
<h3>Customer details</h3>
<br>
<h4>Enter First Name</h4>
<form:input  class="form-control" path="firstname" pattern="[A-Za-z]{3,}" title="Should be valid name"/>
<form:errors path="firstname" style="color:white"></form:errors>

<h4>Enter Last Name</h4>
<form:input  class="form-control" path="lastname" pattern="[A-Za-z]{3,}" title="Should be valid name "/>
<form:errors path="lastname" style="color:white"></form:errors>

<h4>Enter Mobile Number</h4>
<form:input  class="form-control" path="phone" pattern="[789][0-9]{9}" title="should be 7|8|9-xxxxxxxxx "/>
<form:errors path="phone" style="color:white"></form:errors>


<h4>Enter Email</h4>
<form:input  class="form-control" path="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" />
<form:errors path="email" style="color:white"></form:errors>
<p style="color:white">${duplicateEmail }</p>

<h4>Enter Username</h4>
<form:input class="form-control" path="user.username" pattern="[A-Za-z\s]{3,}" title="Should be valid"/>
<form:errors path="user.username" style="color:white"></form:errors>
<p style="color:white">${duplicateUsername }</p>

<h4>Enter Password</h4>
<form:input class="form-control" path="user.password" type="password" pattern=".{6,}"/>
<form:errors path="user.password" style="color:white"></form:errors>

</div>
<div class="col-md-4">
<h3>Billing address</h3>
<br>

<h4>Enter Street name</h4>
<form:input class="form-control" path="billingAddress.streetname" pattern="[A-Za-z\s]{3,}" title="Should be valid"/>
<form:errors path="billingAddress.streetname" style="color:white"></form:errors>


<h4>Enter Apartment number</h4>
<form:input class="form-control" path="billingAddress.apartmentnumber" pattern="[A-Za-z0-9./-\s]{2,}" title="Should be valid"/>
<form:errors path="billingAddress.apartmentnumber" style="color:white"></form:errors>


<h4>Enter City</h4>
<form:input class="form-control" path="billingAddress.city" pattern="[A-Za-z]{3,}" title="Should be valid "/>
<form:errors path="billingAddress.city" style="color:white"></form:errors>


<h4>Enter State</h4>
<form:input class="form-control" path="billingAddress.state" pattern="[A-Za-z\s]{3,}" title="Should be valid "/>
<form:errors path="billingAddress.state" style="color:white"></form:errors>


<h4>Enter Country</h4>
<form:input class="form-control" path="billingAddress.country" pattern="[A-Za-z]{3,}" title="Should be valid "/>
<form:errors path="billingAddress.country" style="color:white"></form:errors>


<h4>Enter Zipcode</h4>
<form:input class="form-control" path="billingAddress.zipcode" pattern="[0-9]{6}" title="Six digit zip code"/>
<form:errors path="billingAddress.zipcode" style="color:white"></form:errors>

</div>
<div class="col-md-4">
<h3>Shipping address</h3>
<br>
<h4>Enter Street name</h4>
<form:input class="form-control" path="shippingAddress.streetname" pattern="[A-Za-z\s]{3,}" title="Should be valid"/>
<form:errors path="shippingAddress.streetname" style="color:white"></form:errors>


<h4>Enter Apartment number</h4>
<form:input class="form-control" path="shippingAddress.apartmentnumber" pattern="[A-Za-z0-9./-\s]{2,}" title="Should be valid"/>
<form:errors path="shippingAddress.apartmentnumber" style="color:white"></form:errors>


<h4>Enter City</h4>
<form:input class="form-control" path="shippingAddress.city" pattern="[A-Za-z]{3,}" title="Should be valid "/>
<form:errors path="shippingAddress.city" style="color:white"></form:errors>


<h4>Enter State</h4>
<form:input class="form-control" path="shippingAddress.state" pattern="[A-Za-z\s]{3,}" title="Should be valid"/>
<form:errors path="shippingAddress.state" style="color:white"></form:errors>



<h4>Enter Country</h4>

<form:input class="form-control" path="shippingAddress.country" pattern="[A-Za-z]{3,}" title="Should be valid"/>
<form:errors path="shippingAddress.country" style="color:white"></form:errors>


<h4>Enter Zipcode</h4>

<form:input class="form-control" path="shippingAddress.zipcode" pattern="[0-9]{6}" title="Six digit zip code"/>
<form:errors path="shippingAddress.zipcode" style="color:white"></form:errors>

</div>
<br><br><br><br><br>
</div>
<h3><input type="submit" value="Register"></input></h3>
</form:form>
</body>
</html>