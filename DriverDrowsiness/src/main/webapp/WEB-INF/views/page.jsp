<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<meta name="_csrf" content="${_csrf.token}">
<meta name="_csrf_header" content="${_csrf.headerName}">


<title>Kesi Investiment Company - ${title }</title>
<meta name='viewport' content='width=device-width, initial-scale=1.0'>
<script>
	window.menu = '${title}';
</script>

 <%--  <img src="${images }/location.PNG">   --%>

<%-- <link 
	href="${images }/wall.PNG"> --%>
<!-- Bootstrap core CSS -->
<link href="${css }/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css }/myapp.css" rel="stylesheet">

<link href="${css }/index.css" rel="stylesheet">

<link href="${css }/partial-mp-filter.css" rel="stylesheet">

<link href="${css }/global.css" rel="stylesheet">
</head>

<body>

	<div class="wrapper">

		<!-- Navigation bar-->
		<%@include file="./shared/navbar.jsp"%>

 
		<div class="content">
			<!-- Page Content -->
			<c:if test="${ userClickHome == true}">
				<%@include file="home.jsp"%>
			</c:if>

			<c:if test="${ userClickAbout == true}">
				<%@include file="about.jsp"%>
			</c:if>

			<c:if test="${ userClickService == true}">
				<%@include file="service.jsp"%>
			</c:if>

			<c:if test="${ userClickContact == true}">
				<%@include file="contact.jsp"%>
			</c:if>

			<c:if test="${ userClickHealth == true}">
				<%@include file="health.jsp"%>
			</c:if>
			
			<c:if test="${ userClickWareHouse == true}">
				<%@include file="warehouse.jsp"%>
			</c:if>
			<c:if test="${ userClickSurveyservice == true}">
				<%@include file="SurveyServices.jsp"%>
			</c:if>
			
			<c:if test="${ userClickInsurance == true}">
				<%@include file="insurance.jsp"%>
			</c:if>
			
			<%-- <c:if test="${ userClickBulk&BreakBulk == true}">
				<%@include file="Bulk&BreakBulk.jsp"%>
			</c:if> --%>
			
			<c:if test="${ userClicklclshipping == true}">
				<%@include file="LCLshipping.jsp"%>
			</c:if>
			
			<c:if test="${ userClickfclshipping == true}">
				<%@include file="FCLshipping.jsp"%>
			</c:if>
			
			<c:if test="${ userClickBulk == true}">
				<%@include file="bulk.jsp"%>
			</c:if>
			
			
			<!-- /.container -->

			<c:if test="${ userClickManageBooking == true}">
				<%@include file="ManageBooking.jsp"%>
			</c:if>

			 <%-- <c:if test="${ userClickAddTruck == true}">
				<%@include file="AddTruck.jsp"%>
			</c:if> --%> 

			<%--  <c:if test="${ userClickAddFreight == true}">
				<%@include file="freight.jsp"%>
			</c:if> --%>
			 
			
			

		</div>

		<!-- Footer -->
		<%@include file="./shared/footer.jsp"%>
		

		
		
		<!-- Bootstrap core JavaScript -->
		<script src="${js }/jquery.min.js"></script>
		<script src="${js }/bootstrap.bundle.min.js"></script>
		<script src="${js }/bootbox.min.js"></script>
		<script src="${js }/myapp.js"></script>
		
		<script src="${js }/main.min.js"></script>
		<script src="${js }/jquery-ui-custom.js"></script>
		<script src="${js }/bootstrap-datepicker.js"></script>
		<script src="${js }/select2.js"></script>
		<script src="${js }/swiper-bundle.js"></script>
		<script src="${js }/index4522.js"></script>

	</div>
</body>

</html>
