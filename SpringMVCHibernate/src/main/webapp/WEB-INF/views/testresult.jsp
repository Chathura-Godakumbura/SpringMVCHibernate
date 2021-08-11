<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="MaxLength.min.js"></script>
<script type="text/javascript"></script>


<style>
.content {
	width: 500px;
	height: 250px;
	border-left: 10px solid #000;
	border-right: 10px solid #FFF;
	padding: 10px 0;
	margin: 50px auto;
}
</style>

<style>
#contenttextarea {
	width: 46em;
	padding-top: 5em;
	padding-bottom: 5em;
}
</style>


<%-- <form:form id="content" modelAttribute="webadvert">
	<div align="center">
		<h1>Enter you advertisement details</h1>
		<br>
		<br> <label>Content</label><br>
		<br>

		<textarea id="textarea" maxlength="${webadvert.wordcount}"  rows="5" style="width: 40%" placeholder="Write Here"autofocus></textarea>  
		<div id="count">
            <span id="current_count">0</span>
            <span id="maximum_count">/ ${webadvert.wordcount}</span>
        </div>
		<br> <label> Upload your images (upload ${webadvert.imagecount} images)</label> <input type="file"
			name="photo" size="50" />					
	</div>
</form:form>

<script>
$('textarea').keyup(function() {    
    var characterCount = $(this).val().length,
        current_count = $('#current_count'),
        maximum_count = $('#maximum_count'),
        count = $('#count');    
        current_count.text(characterCount);        
});
</script>  --%>
<pre></pre>

<form:form id="content" modelAttribute="listAdvert" role="form" >
<h1> </h1>
<h1> Web Advertisement Details </h1>
<table style="width:100%">
<tr>
<th>Product Type</th>
<th>Unit Price</th>
<th>Word Count</th>
<th>Image Count</th>
</tr>


<c:forEach items="${listadvert}" var="wa" varStatus="tagStatus">


<tr>
<td>${wa.advertid}</td>
<td>${wa.AdvertType}</td>
<td>${wa.AdvertSize}</td>
<td>${wa.AdvertPrice}</td>
</tr>

</c:forEach> 

</table>

<%-- <tr>
<td>${webadvertmodel.producttype}</td>
<td>${webadvertmodel.unitprice}</td>
<td>${webadvertmodel.wordcount}</td>
<td>${webadvertmodel.imagecount}</td>
</tr>

<h4>${webadvertmodel.producttype} </h4> --%>

</form:form>
 

 
 
 
 
