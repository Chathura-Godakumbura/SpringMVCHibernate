<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Books Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Book DETAILS
</h1>

<c:url var="addAction" value="/book/add" ></c:url> 

// book JSP branch

<form:form action="${addAction}" commandName="books">
<table>
	<c:if test="${!empty books.bookname}">
	<tr>
		<td>
			<form:label path="bookid">
				<spring:message text="BookID"/>
			</form:label>
		</td>
		<td>
			<form:input path="bookid" readonly="true" size="8"  disabled="true" />
			<form:hidden path="bookid" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="bookname">
				<spring:message text="Bookname"/>
			</form:label>
		</td>
		<td>
			<form:input path="bookname" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="Auther">
				<spring:message text="auther"/>
			</form:label>
		</td>
		<td>
			<form:input path="Auther" />
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<c:if test="${!empty books.bookname}">
				<input type="submit"
					value="<spring:message text="Edit Book"/>" />
			</c:if>
			<c:if test="${empty books.bookname}">
				<input type="submit"
					value="<spring:message text="Add Book"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>
<h3>Books List</h3>
<c:if test="${!empty listBooks}">
	<table class="tg">
	<tr>
		<th width="80">Book ID</th>
		<th width="120">Book Name</th>
		<th width="120">Auther</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listBooks}" var="books">    <!--  all the values fetsch from books  -->
		<tr>
			<td>${books.bookid}</td>
			<td>${books.bookname}</td>
			<td>${books.auther}</td>
			<td><a href="<c:url value='/edit/${books.bookid}' />" >Edit</a></td>
			<td><a href="<c:url value='/remove/${books.bookid}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
