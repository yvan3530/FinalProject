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



<title>Kesi Investiment Company - ${title }</title>
<meta name='viewport' content='width=device-width, initial-scale=1.0'>
<script>
	window.menu = '${title}';
</script>
   
<link href="${css }/stylelogin.css" rel="stylesheet">

</head>

<body>

	<c:if test="${ not empty message}">
			
				<div class="row">

					<div class="col-md-offset-3 col-md-6">
					
					<div class="alert alert-danger">${message}</div>
					
					</div>
					
				</div>
			
			
			</c:if>

			<c:if test="${ not empty logout}">
			
				<div class="row">

					<div class="col-md-offset-3 col-md-6">
					
					<div class="alert alert-danger">${logout}</div>
					
					</div>
					
				</div>
			
			
			</c:if>

<form class="box" action="/DriverDrowsiness/login" method="POST" id="loginForm">

<img src="${images }/log.jpeg" width="90px" height="90px" alt="images" >

<h1>login</h1>



<input type="text" name="username" id="username" placeholder="UserName">
<input type="password" name="password" id="password" placeholder="PassWord">
<input type="submit"  value="Login"/>
<input type="hidden" name="${_csrf.parameterName}"
												value="${_csrf.token}" />
</form>
<div class="panel-footer">
								<div class="text-right">
									New User - <a href="${contextRoot}/register">Register Here</a>
								</div>
							</div>
</body>

</html>
