
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
<title>Kesi Investiment Company - ${title }</title>
<meta name='viewport' content='width=device-width, initial-scale=1.0'>
<script>
	window.menu = '${title}';
</script>
<!-- Bootstrap core CSS -->
<link href="${css }/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css }/myapp.css" rel="stylesheet">

<link href="${css }/index.css" rel="stylesheet">

<link href="${css }/partial-mp-filter.css" rel="stylesheet">

<link href="${css }/global.css" rel="stylesheet">
</head>

<body>

	

		<!-- Navigation bar-->
		<%@include file="./shared/navbar.jsp"%>


<form:form class="form-horizontal" modelAttribute="freight"
						action="/DriverDrowsiness/addFreight" method="POST">
	<div class="white-block">
			<c:if test="${not empty message }">



			<div class="col-xs-12">

				<div class="alert alert-success alert-dismissible">
					<button type="button" class="close" data-dismiss="alert">&times;</button>


					${message}
				</div>

			</div>
		</c:if>
		<h2>Shipment details</h2>
		<div class="shipment-form">
			<div class="form-row">
				<div class="request-cascader blue ">
					<p class="label">Category</p>
					<div class="ant-row ant-form-item">
						<div class="ant-col ant-form-item-control">
							<div class="ant-form-item-control-input">
								<div class="ant-form-item-control-input-content">
									<div class="request-input large" tabindex="0">
										<div class="input-wrap cascader-input">
											<input type="text" placeholder="Please select" required=""
												value="">
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="request-input large blue">
					<p class="name">Product name</p>
					<div class="input-wrap  
                ">
						<input type="text" title="Product name" name="main_name"
							placeholder="Red Chair" step="any" autocomplete="off" value="">
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="white-block">
		<h2>Which type of delivery do you need?</h2>
		<div class="shipment-type-tip">
			<div class="image-block">
				<img alt=""
					src="https://www.searates.com/design/images/apps/shipping/request/fwl-tip.svg">
			</div>
			
		</div>
		<div class="shipment-tabs">
			
			<div class="shipment-tab active"
				style="border-color: rgb(0, 136, 255);">
				<p>land</p>
			</div>
			
		</div>
		<div class="shipment-type">
			<div class="item  blue" style="">
				<div class="icon">
					<i class="fad fa-truck-container"></i>
				</div>
				<p>fcl</p>
			</div>
			<div class="item  blue" style="">
				<div class="icon">
					<i class="fad fa-truck-moving"></i>
				</div>
				<p>ftl</p>
			</div>
			<div class="item active blue" style="background: rgb(0, 136, 255);">
				<div class="icon">
					<i class="fad fa-train"></i>
				</div>
				<p>fwl</p>
			</div>
		</div>
		<div class="shipment-form">
			<div class="type-form">
				<div class="form-row">
					<div class="request-select large">
						<p class="label">Wagon Type</p>
						<div class="select-wrap  blue">
							<form:select name="container_type"  path="">
							<form:option value="54">Hopper Wagon</form:option>
								<form:option value="55">Closed Wagon</form:option>
								<form:option value="56">Side Dump Wagon</form:option>
								<form:option value="57">High Side Wagon</form:option>
								<form:option value="58">Freight Wagon</form:option>
								<form:option value="53">Tank Wagon</form:option>
								<form:option value="51">Flat Wagon</form:option>
								<form:option value="52">Container Platform</form:option>
								</form:select>
						</div>
					</div>
					<div class="request-input small blue">
						<p class="name">Gross Weight</p>
						<div class="input-wrap  
                ">
							<input type="number" title="Gross Weight" name="cargo_weight"
								placeholder="0" step="any" autocomplete="off" required=""
								value="">
							<p class="label">Mt</p>
						</div>
					</div>
					<div class="request-input small blue">
						<p class="name">Qty</p>
						<div class="input-wrap  
                ">
							<input type="number" title="Qty" name="amount" placeholder="0"
								step="any" autocomplete="off" required="" value="">
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<div class="request-footer">
		<div class="progressbar">
			<p>
				Readiness: <span style="color: rgb(0, 136, 255);">0%</span>
			</p>
			<div class="line-wrapper">
				<div class="line" style="width: 0%; background: rgb(0, 136, 255);"></div>
			</div>
		</div>
		<div class="btns">
			<p class="auth-tip">
				<a href="/auth/sign-in">Sign in</a> to send request
			</p>
			<form:button type="submit" class="request-btn prev disabled blue"
				disabled="" style="background: rgb(0, 136, 255);">
				<i class="fal fa-angle-left"></i>
			</form:button>
			<form:button type="submit" class="request-btn next  blue"
				style="background: rgb(0, 136, 255);">
				<span>Next</span> <i class="fal fa-angle-right"></i>
			</form:button>
		</div>
	</div>
</form:form>
		
		

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

	
</body>

</html>
		