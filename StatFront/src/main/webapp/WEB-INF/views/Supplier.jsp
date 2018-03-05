<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h3 align="center">Supplier Page</h3>

<table align="center">
	<tr bgcolor="pink">
		<td colspan="3">supplier Detail</td>	
	</tr>
	<tr>
<c:forEach items="${listSupplier}" var="supplier">
	
		<td>
			<img src="<c:url value="/resources/images/${supplier.supplierId}.jpg"/>" width="100" height="100"/>
			<br/>
			<a href="<c:url value="/productDesc/${supplier.supplierId}"/>">${supplier.supplierName}</a>
			<br/>INR. ${supplier.price} /-
		</td>
	
</c:forEach>
	</tr>
</table>
</body>
</html>