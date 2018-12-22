
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>add customer</title>
</head>
<body>
	<h1>add customer</h1>
	<form:form modelAttribute="customer" method="post" action="customer">
		<table width="50%">
			<form:hidden path="customerId" />
			<tr>
				<td>First Name:</td>
				<td><form:input path="customerFirstName" /></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><form:input path="customerLastName" /></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><form:input path="customerAge" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="customerEmail" /></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><form:input path="customerAddress" /></td>

			</tr>
			<tr>
			</tr>
		</table>
		<div style="padding-left: 20%;">
			<form:button type="submit">submit</form:button>

		</div>


	</form:form>

	<div style="width:50%;margin-left:40%;"><a href="/sprinvjavamvc/addcustomer">add new</a></div>
	<h1>Customer List</h1>
	<table width="100%" border="1">
		<tr>
			<th>ID</th>
			<th>First name</th>
			<th>Last name</th>
			<th>Age</th>
			<th>Email</th>
			<th>Address</th>

			<th colspan="2">Action</th>
		</tr>

		<c:forEach var="cust" items="${listOfCustomers}">
			<tr>

				<td><c:out value="${cust.customerId}" /></td>
				<td><c:out value="${cust.customerFirstName}" /></td>
				<td><c:out value="${cust.customerLastName}" /></td>
				<td><c:out value="${cust.customerAge}" /></td>
				<td><c:out value="${cust.customerEmail}" /></td>
				<td><c:out value="${cust.customerAddress}" /></td>
				<td><a href="<c:url value='/customer/${cust.customerId}' />">Edit</a></td>
				<td><a href="<c:url value='/customerdel/${cust.customerId}' />">Remove</a></td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>