<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><%@include file="Header.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h3 align="center">Product Page</h3>

<form action="InsertCategory" method="post">
	<table align="center">
		<tr>
			<td>Product Name</td>
			<td><input type="text" id="catname" name="catname" /></td>
		</tr>
		<tr>
		<td>Product Description</td>
		<td><input type="text" id="catdesc" name="catdesc" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="SUBMIT" /> <input
				type="reset" value="RESET" /></td>
		</tr>
	</table>
</form>

<table align="center">
	<tr>
		<td>Product ID</td>
		<td>Product Name</td>
		<td>Product Description</td>
		<td>Operation</td>
	</tr>
	<c:forEach items="${listCategories}" var="category">
		<tr>
			<td>${product.productId}</td>
			<td>${product.productName}</td>
			<td>${product.productDesc}</td>
			<td><a
				href="<c:url value="/updateProduct/${product.productId}"/>">Update</a>/
				<a href="<c:url value="/deleteProduct/${product.productId}"/>">Delete</a>
			</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>