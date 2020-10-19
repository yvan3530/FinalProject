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
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Kesi Investiment Company - ${title }</title>

<script>
	window.menu = '${title}';
</script>
<!-- Bootstrap core CSS -->
<link href="${css }/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css }/myapp.css" rel="stylesheet">

</head>

<body>

	<div class="wrapper">

		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<div class="container">

				<div class="navbar-header">

					<a class="navbar-brand" href="${ flowExecutionUrl}&_eventId_home">Home</a>
				</div>
			</div>

		</nav>

		<div class="content">
			<div class="container">
				<h3>this will be trigger by flow</h3>


				<!-- /.container -->
			</div>
		</div>

		<!-- Footer -->
		<%@include file="../../shared/footer.jsp"%>


		<!-- Bootstrap core JavaScript -->
		<script src="${js }/jquery.min.js"></script>
		<script src="${js }/bootstrap.bundle.min.js"></script>
		<script src="${js }/bootbox.min.js"></script>
		<script src="${js }/myapp.js"></script>


	</div>
</body>

</html>
