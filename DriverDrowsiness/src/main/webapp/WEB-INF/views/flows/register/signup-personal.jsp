<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
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

<%-- <link 
	href="${images }/wall.PNG"> --%>
<!-- Bootstrap core CSS -->
<link href="${css }/bundle.css" rel="stylesheet">
<link href="${css }/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css }/myapp.css" rel="stylesheet">

<link href="${css }/index.css" rel="stylesheet">

<link href="${css }/partial-mp-filter.css" rel="stylesheet">

<link href="${css }/global.css" rel="stylesheet">

</head>

<body>

	<%@taglib prefix="security"
		uri="http://www.springframework.org/security/tags"%>

	<header class="main_header">
		<nav class="navbar">
			<div class="container-lg">
				<a class="rootLink" href="${contextRoot }/home">Kesi Investiment
					Ltd</a>
				<ul class="navRoot">



					<li class="navSection primary"><a class="rootLink"
						href="${contextRoot }/about">About </a> <%-- <li class="navSection primary" ><a class="rootLink"
					href="${contextRoot }/manage/bookings">Booking</a></li>
					
					<li class="navSection primary" ><a class="rootLink"
					href="${contextRoot }/manage/addroute">route</a></li>
					
					<security:authorize access="hasAuthority('ADMIN')">
				<li class="navSection primary" ><a class="rootLink"
					href="${contextRoot }/manage/addtrucks">truck</a></li>
					</security:authorize> --%> <a class="rootLink hasDropdown"
						data-dropdown="services"> Services </a> <a class="rootLink"
						href="${contextRoot }/contact">Contact </a> <a class="rootLink"
						href="${contextRoot }/health">Health </a></li>

					<%-- <li class="navSection primary" ><a class="rootLink"
					href="${contextRoot }/driver">driver</a></li> --%>
					<%-- <li class="navSection primary" ><a class="rootLink"
					href="${contextRoot }/staff">staff</a></li> --%>

					<security:authorize access="hasAuthority('ADMIN')">
						<li class="navSection primary"><a class="rootLink"
							href="${contextRoot }/dashboard">dashboard</a></li>
					</security:authorize>

					<li class="navSection primary"><a class="rootLink"
						href="${contextRoot }/addfreight">freight</a></li>


					<li class="navSection secondary"><a class="rootLink outline"
						href="${contextRoot}/register">Sign Up</a></li>
					<li class="navSection secondary"><a class="rootLink outline"
						href="${contextRoot}/login">Login</a></li>

					<a class="collapsible" href="${userModel.fullName}"></a>
					<div class="collapse">
						<ul class="linkGroup linkList developersGroup">
							<li><a class="linkContainer"
								href="${contextRoot}/perform-logout">
									<h3 class="linkTitle">Logout</h3>
							</a></li>
						</ul>

					</div>
					<li class="navSection mobile"><a
						class="rootLink item-mobileMenu"> <i class="fas fa-bars"></i>
					</a>
						<div class="popup">
							<div class="popupContainer">
								<a class="popupCloseButton">Close</a>
								<div class="mobileProducts">
									<a class="mobileSignIn" href="${contextRoot }/about">About
										<i class="fa fa-chevron-right"></i>
									</a> <a class="collapsible" href="#">SERVICES</a>
									<div class="collapse">
										<div class="mobileProductsList">
											<ul>
												<li><a class="linkContainer" href="#"> <i
														class="fad fa-box-usd"></i> Request a Quote
												</a></li>
											</ul>

										</div>
										<div class="mobileSecondaryNav">
											<ul>
												<li><a href="#">FCL Shipping</a></li>
												<li><a href="#">LCL Shipping</a></li>
												<li><a href="#">Bulk & Break Bulk</a></li>

												<li><a href="#">Insurance</a></li>
											</ul>
											<ul>

												<li><a href="#">Survey Services</a></li>

												<li><a href="#">Warehousing</a></li>
											</ul>
										</div>
									</div>

									<a class="mobileSignIn" href="${contextRoot }/contact">Contact
										<i class="fa fa-chevron-right"></i>
									</a> <a class="mobileSignIn" href="${contextRoot }/health">Health
										<i class="fa fa-chevron-right"></i>
									</a>

								</div>

							</div>
						</div></li>
				</ul>
			</div>
			<div class="dropdownRoot">
				<div class="dropdownBackground"
					style="transform: translateX(452px) scaleX(0.707692) scaleY(1.1075);">
					<div class="alternateBackground"
						style="transform: translateY(255.53px);"></div>
				</div>
				<div class="dropdownArrow"
					style="transform: translateX(636px) rotate(45deg);"></div>
				<div class="dropdownContainer"
					style="transform: translateX(452px); width: 368px; height: 443px;">
					<div class="dropdownSection left" data-dropdown="products">
						<div class="dropdownContent">
							<div class="linkGroup">
								<ul class="productsGroup">

								</ul>
							</div>

						</div>
					</div>
					<div class="dropdownSection" data-dropdown="services">
						<div class="dropdownContent">
							<div class="linkGroup linkList developersGroup">
								<a class="linkContainer" href="#">
									<h3 class="linkTitle">
										<i class="fad fa-box-usd"></i> Request a Quote
									</h3>
								</a>
							</div>
							<div class="linkGroup documentationGroup">
								<div class="documentationArticles withoutIcon">
									<ul>
										<li><h4>Services</h4></li>
										<li><a href="#">FCL Shipping</a></li>
										<li><a href="#">LCL Shipping</a></li>
										<li><a href="#">Bulk & Break Bulk</a></li>
										<li><a href="#">Insurance</a></li>
									</ul>
									<ul>
										<li><a href="#">Survey Services</a></li>

										<li><a href="#">Warehousing</a></li>
									</ul>
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>
		</nav>
		<div id="message_container"></div>
	</header>

	<script>
		window.userRole = '$userModel.role';
	</script>

	<div class="main-content">
		<div id="request_a_quote">
			<div class="app-wrapper container">
				<div class="shipping-form">

					<sf:form method="POST" class="form-horizontal" id="registerForm"
						modelAttribute="client">

						<div class="white-block">
							<h2>Names</h2>
							<div class="shipment-form">

								<div class="form-row">
									<div class="request-put inlarge blue">
										<p class="name">First Name</p>
										<div class="input-wrap  
                ">
											<sf:input type="text" path="firstName" title="firstName"
												name="firstName" placeholder="departLocation" step="any"
												autocomplete="off" value="" />
											<sf:errors path="firstName" cssClass="help-block"
												element="em" />
										</div>
									</div>
									<div class="request-put inlarge blue">
										<p class="name">Last Name</p>
										<div class="input-wrap  
                ">
											<sf:input type="text" path="lastName" title="lastName"
												name="lastName" placeholder="arrivalLocation" step="any"
												autocomplete="off" value="" />
											<sf:errors path="lastName" cssClass="help-block" element="em" />
										</div>
									</div>

								</div>
								<div class="request-put inlarge blue"></div>
							</div>
						</div>

						<div class="white-block">
							<h2>Address</h2>
							<div class="shipment-form">

								<div class="form-row">

									<div class="request-put inlarge blue">
										<p class="name">Address</p>
										<div class="input-wrap  
                ">
											<sf:input type="text" path="address" title="address"
												name="address" placeholder="departLocation" step="any"
												autocomplete="off" value="" />
											<sf:errors path="address" cssClass="help-block" element="em" />
										</div>
									</div>
									<div class="request-put inlarge blue">
										<p class="name">Contact Number</p>
										<div class="input-wrap  
                ">
											<sf:input type="text" path="telePhone" title="telePhone"
												name="telePhone" placeholder="XXXXXXXXXX" step="any"
												autocomplete="off" value="" />
											<sf:errors path="telePhone" cssClass="help-block"
												element="em" />
										</div>
									</div>
								</div>
							</div>
						</div>

						<div class="white-block">
							<h2>Crendictial</h2>
							<div class="shipment-form">

								<div class="form-row">

									<div class="request-put inlarge blue">
										<p class="name">Email</p>
										<div class="input-wrap  
                ">
											<sf:input type="email" path="email" title="email" name="email"
												placeholder="Email" step="any" autocomplete="off"
												value="" />
											<sf:errors path="email" cssClass="help-block" element="em" />
										</div>
									</div>
									<div class="request-put inlarge blue">
										<p class="name">Password</p>
										<div class="input-wrap  
                ">
											<sf:input type="password" path="password" title="password"
												name="password" placeholder="password" step="any"
												autocomplete="off" value="" />
											<sf:errors path="password" cssClass="help-block" element="em" />
										</div>
									</div>

									<div class="request-put inlarge blue">
										<p class="name">Confirm Password</p>
										<div class="input-wrap  
                ">
											<sf:input type="password" path="confirmPassword" title="password"
												name="confirmPassword" placeholder="confirm Password"
												step="any" autocomplete="off" value="" />
											<sf:errors path="confirmPassword" cssClass="help-block"
												element="em" />
										</div>
									</div>
								</div>
							</div>
						</div>





						<sf:hidden path="role" value="USER" />


						<div class="form-group">
							<div class="col-md-offset-4 col-md-8">
								<button type="submit" class="btn btn-primary"
									name="_eventId_billing">

									Next - Address <span class="glyphicon glyphicon-chevron-left"></span>

								</button>

							</div>
						</div>


					</sf:form>
				</div>
			</div>
		</div>
	</div>

	<footer class="footer">
		<div class="content">
			<ul class="main__nav">
				<li class="intro main__nav-list">
					<p data-toggle="modal" data-target="#langModal" class="lang-change">
						<span class="planet_icon"></span>English
					</p>
					<ul class="social-net">
						<li class="social-net__item twitter"><a
							href="https://twitter.com/kesiinvestmentrwanda"></a></li>
						<li class="social-net__item facebook"><a
							href="https://www.facebook.com/kESI Investment Rwanda Ltd/"></a></li>
						<li class="social-net__item youtube"><a
							href="https://www.youtube.com/kESI Investment Rwanda Ltd"></a></li>
						<li class="social-net__item instagram"><a
							href="https://www.instagram.com/Kesi_rwanda/"></a></li>
					</ul>
				</li>
				<li class="support main__nav-list"><b>Tools</b>
					<ul>
						<li><a href="services/logistics-explorer/index.html">Logistics
								explorer</a></li>
						<li><a href="services/learn-more/index.html">Container
								tracking</a></li>
						<li><a href="reference/load-calc-about/index.html">Load
								calculator</a></li>
						<li><a href="services/schedules/index.html">Ship
								schedules</a></li>
						<li><a href="services/distances-time/index.html">Distances
								and time</a></li>
					</ul></li>
				<li class="opportunities main__nav-list"><b>Opportunities</b>
					<ul>
						<li><a href="services/plans/index.html">Plans & Pricing</a></li>
						<li><a href="shipping/for-shippers/index.html">For
								Shippers</a></li>
						<li><a href="shipping/for-carriers/index.html">For
								Carriers</a></li>
						<li><a href="reference/api/index.html">API Integrations</a></li>
					</ul></li>
				<li class="company main__nav-list"><b>Company</b>
					<ul>
						<li><a href="contact/index.html">Contact us</a></li>
						<li><a href="tel:+250788304588">+250 788 304 588</a></li>
						<li><a href="email">kesiinvestmentrwanda@gmail.com</a></li>
					</ul></li>


			</ul>
			<p class="company-description">KESI Investment Rwanda ltd is an
				integrated transport and logistics services provider with the Head
				Office in Kigali, Rwanda KESI Investment Rwanda ltd was established
				in 2016 with a fleet of 100 trucks that moved our client’s goods
				within the region. Now we have more than 320 employees and more than
				184 trucks. We have made a strong repute for impeccable transport
				and logistics services in East African Countries, which is
				characterized by Efficiency, Quality and Professionalism. We provide
				our services in Rwanda, Kenya, Uganda, Tanzania and we have blanches
				in those countries .</p>
			<ul class="policy__nav">
				<li><a>2020 © Kesi Investment. All rights reserved.</a></li>
			</ul>
		</div>
	</footer>
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