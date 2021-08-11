
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0"
	crossorigin="anonymous"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">

<style>
.menu-bot #user-order {
	background-color: orange;
}

.townAndLocal {
	margin: 10px;
}

#orderform {
	padding: 30px;
	/*  text-align: center;*/
}

h1 {
	text-align: center;
}

td {
	padding: 15px;
	font-size: 15px;
}

tr {
	padding: 15px;
	font-size: 15px;
	border-bottom: 2px solid #8ebf42;
	text-align: center;
}

.modal-hover-opacity:hover {
	opacity: 0.60;
	filter: alpha(opacity = 60);
	-webkit-backface-visibility: hidden
}

/* The Modal (background) */
.modal {
	display: none; /* Hidden by default */
	position: absolute; /* Stay in place */
	z-index: 1; /* Sit on top */
	padding-top: 100px; /* Location of the box */
	left: 50%;
	top: 55%;
	transform: translate(-50%, -50%);
	width: 70%; /* Full width */
	height: 70%; /* Full height */
	overflow: auto; /* Enable scroll if needed */
	background-color: rgb(0, 0, 0); /* Fallback color */
	background-color: rgba(0, 0, 0, 0.7); /* Black w/ opacity */
}

/* Modal Content (image) */
.modal-content {
	margin: auto;
	display: block;
	width: 80%;
	position: absolute;
	left: 50%;
	top: 50%;
	transform: translate(-50%, -50%);
	max-width: 1000px;
}

/* Add Animation */
.modal-content, #caption {
	-webkit-animation-name: zoom;
	-webkit-animation-duration: 0.6s;
	animation-name: zoom;
	animation-duration: 0.6s;
}

@
-webkit-keyframes zoom {
	from {-webkit-transform: scale(0)
}

to {
	-webkit-transform: scale(1)
}

}
@
keyframes zoom {
	from {transform: scale(0)
}

to {
	transform: scale(1)
}

}

/* The Close Button */
.close {
	position: absolute;
	top: 15px;
	right: 35px;
	color: #f1f1f1;
	font-size: 40px;
	font-weight: bold;
	transition: 0.3s;
}
</style>

<form:form action="${contextURL}/order/testresult"
	modelAttribute="webadvert">

	<div class="container">
		<div id="orderform" class="col-md-10">
			<%--  --><div class="form login-form"> --%>

			<%-- original start
			<div class="form">
				
			<div class="login-header">My Orders</div>
			  
			<div>
			 original ends--%>


			<%-- Chathura's code start--%>

			<div class="col-md-12" id="user-order-header">
				<%-- <h1>${userdetails} </h1> --%>
				<h1 style="text-align:center">Advertising Rates </h1>
		</div>
			<table id="rates" style="width: 100%" hieght="100%">
				<tr>
					<th>Web Advert Size</th>
					<th>Size</th>
					<th>Privew</th>
					<th>Price</th>
					<!-- <th>Select</th> -->
				</tr>
				<tr>
					<td>WD3</td>
					<td>Full-size</td>
					<td><img id="myImg1" onclick="onClick(this)"
						src="${contextURL}/Resources/img/advt-test/WD3.png" width="60%"
						height="60%"></td>
					<td>$150.00</td>
					<td align="center"><form:radiobutton path="producttype"
							value="150" /></td>
				</tr>
				<tr>
					<td>WD2</td>
					<td>2/3 size</td>
					<td><img id="myImg2" onclick="onClick(this)"
						src="${contextURL}/Resources/img/advt-test/WD2.png" width="50%"
						height="50%"></td>
					<td>$115.00</td>
					<td align="center"><form:radiobutton path="producttype"
							value="115" />
				</tr>
				<tr>
					<td>WD1</td>
					<td>1/3 size</td>
					<td><image id="myImg3" onclick="onClick(this)"
							src="${contextURL}/Resources/img/advt-test/WD2.png" width="40%"
							height="50%"> </image></td>
					<td>$70.00</td>
					<td align="center"><form:radiobutton path="producttype"
							value="70" />
				</tr>
				<tr>
					<td>WTP</td>
					<td>without profile banner</td>
					<td><image id="myImg4" onclick="onClick(this)"
							src="${contextURL}/Resources/img/advt-test/WD1.png" width="20%"
							height="50%"></td>
					<td>$40.00</td>
					<td align="center"><form:radiobutton path="producttype"
							value="40" />
				</tr>
			</table>

			<br> <br>
			<button align="center" type="submit	"
				class="btn btn-primary btn-lg pull-right">Continue</button>


			<%-- Chathura's code ends--%>

			<div></div>

		</div>
	</div>

	<div id="modal01" class="modal" onclick="this.style.display='none'">
		<span class="close">&times;&nbsp;&nbsp;&nbsp;&nbsp;</span>
		<div class="modal-content">
			<img id="img01" style="max-width: 100%">
		</div>
</form:form>


<script>
	function onClick(element) {
		  document.getElementById("img01").src = element.src;
		  document.getElementById("modal01").style.display = "block";
		}
</script>




