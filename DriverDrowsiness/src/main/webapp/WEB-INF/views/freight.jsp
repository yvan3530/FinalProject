
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
<link href="${css }/bundle.css" rel="stylesheet">
<link href="${css }/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css }/myapp.css" rel="stylesheet">

<link href="${css }/index.css" rel="stylesheet">

<link href="${css }/partial-mp-filter.css" rel="stylesheet">

<link href="${css }/global.css" rel="stylesheet">
</head>

<body>


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



	<div class="white-block">
		<c:if test="${not empty message }">



			<div class="col-xs-12">

				<div class="alert alert-success alert-dismissible">
					<button type="button" class="close" data-dismiss="alert">&times;</button>


					${message}
				</div>

			</div>
		</c:if>
		<div class="main-content">
			<div id="request_a_quote">
				<div class="app-wrapper container">
					<div class="shipping-form">
						<form:form class="form-horizontal" modelAttribute="freight"
							action="/DriverDrowsiness/addFreight" method="POST">



							<div class="white-block">
								<h2>Shipment details</h2>
								<div class="shipment-form">
									<form:hidden path="freightId" />
									<div class="form-row">
										<div class="request-put inlarge blue">
											<p class="name">departLocation</p>
											<div class="input-wrap  
                ">
												<form:input type="text" path="departLocation"
													title="departLocation" name="departLocation"
													placeholder="departLocation" step="any" autocomplete="off"
													value="" />
												<form:errors path="departLocation" cssClass="help-block"
													element="em" />
											</div>
										</div>
										<div class="request-put inlarge blue">
											<p class="name">arrivalLocation</p>
											<div class="input-wrap  
                ">
												<form:input type="text" path="arrivalLocation"
													title="arrivalLocation" name="arrivalLocation"
													placeholder="arrivalLocation" step="any" autocomplete="off"
													value="" />
												<form:errors path="arrivalLocation" cssClass="help-block"
													element="em" />
											</div>
										</div>
										<div class="request-put inlarge blue">
											<p class="name">departTime</p>
											<div class="input-wrap  
                ">
												<form:input type="date" path="departTime" title="departTime"
													name="departTime" placeholder="departTime" step="any"
													autocomplete="off" value="" />
												<form:errors path="departTime" cssClass="help-block"
													element="em" />
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="white-block">
								<h2>Shipment details</h2>
								<div class="shipment-form">
									<div class="form-row">
										<div class="request-put inlarge blue">
											<p class="name">category</p>

											<div class="ant-row ant-form-item">
												<div class="ant-col ant-form-item-control">
													<div class="ant-form-item-control-input">
														<div class="ant-form-item-control-input-content">
															<span class="ant-cascader-picker" tabindex="0"> <form:select
																	path="category" class="ant-input ant-cascader-input ">
																	<form:option value="Agriculture & Food"
																		label="Agriculture & Food" />
																	<form:option value="Apparel, Textiles & Accessories"
																		label="Apparel, Textiles & Accessories" />
																	<form:option value="Auto & Transportation"
																		label="Auto & Transportation" />
																	<form:option value="Bags, Shoes & Accessories"
																		label="Bags, Shoes & Accessories" />
																	<form:option value="Eletronics" label="Eletronics" />
																	<form:option
																		value="Eletrical Equipment, Components& Telecoms"
																		label="Eletrical Equipment, Components& Telecoms" />
																	<form:option value="Gifts, Sport & Toys"
																		label="Gifts, Sport & Toys" />
																	<form:option value="Health & Beauty"
																		label="Health & Beauty" />
																	<form:option value="Machinery, Industrial Parts  Tools"
																		label="Machinery, Industrial Parts  Tools" />
																	<form:option value="Home, Light & Contruction"
																		label="Home, Light & Contruction" />
																	<form:errors path="category" cssClass="help-block"
																		element="em" />
																</form:select>
															</span>
														</div>
													</div>
												</div>
											</div>
										</div>




										<div class="request-put inlarge blue">
											<p class="name">packageDescription</p>
											<div class="input-wrap  
                ">
												<form:input type="text" path="packageDescription"
													title="packageDescription" name="packageDescription"
													placeholder="packageDescription" />
												<form:errors path="packageDescription" cssClass="help-block"
													element="em" />
											</div>
										</div>



									</div>


								</div>
							</div>
							<div class="white-block">
								<h2>Shipment details</h2>

								<div class="item active blue"
									style="background: rgb(0, 136, 255) none repeat scroll 0% 0%;">
									<div class="icon">
										<i class="fad fa-boxes"></i>
									</div>
									<p>lcl</p>
								</div>
								<div class="shipment-form">
									<div class="form-row">
										<div class="request-input large blue">
											<p class="name">packageWeight</p>
											<div class="input-wrap  
                ">
												<form:input type="number" path="packageWeight"
													title="packageWeight" name="packageWeight"
													placeholder="packageWeight" step="any" autocomplete="off"
													value="" />
												<form:errors path="packageWeight" cssClass="help-block"
													element="em" />
											</div>
										</div>
										<div class="request-input large blue">
											<p class="name">packageLenght</p>
											<div class="input-wrap  
                ">
												<form:input type="number" path="packageLenght"
													title="packageLenght" name="packageLenght"
													placeholder="packageLenght" step="any" autocomplete="off"
													value="" />
												<form:errors path="packageLenght" cssClass="help-block"
													element="em" />
											</div>
										</div>
										<div class="request-input large blue">
											<p class="name">packagewidth</p>
											<div class="input-wrap  
                ">
												<form:input type="number" path="packagewidth"
													title="packagewidth" name="packagewidth"
													placeholder="packagewidth" step="any" autocomplete="off"
													value="" />
												<form:errors path="packagewidth" cssClass="help-block"
													element="em" />
											</div>
										</div>
										<div class="request-input large blue">
											<p class="name">quantity</p>
											<div class="input-wrap  
                ">
												<form:input type="number" path="quantity" title="quantity"
													name="quantity" placeholder="quantity" step="any"
													autocomplete="off" value="" />
												<form:errors path="quantity" cssClass="help-block"
													element="em" />
											</div>
										</div>
										<div class="request-input large blue">
											<p class="name">quantity</p>

											<div class="ant-row ant-form-item">
												<div class="ant-col ant-form-item-control">
													<div class="ant-form-item-control-input">
														<div class="ant-form-item-control-input-content">
															<span class="ant-cascader-picker" tabindex="0"> <form:select
																	path="typeOfPackage"
																	class="ant-input ant-cascader-input ">
																	<form:option value="Dangerous cargo"
																		label="Dangerous cargo" />
																	<form:option value="fragile" label="fragile" />
																	<form:option value="framable" label="framable" />
																	<form:option value="other" label="other" />
																</form:select>
															</span>
														</div>
													</div>
												</div>
											</div>
										</div>



										<%-- <div class="request-input large blue">
											<p class="name">Product name</p>
											<div class="input-wrap  
                ">
												<form:input type="number" path="kind" title="Product name" autocomplete="off"
													name="main_name" placeholder="Red Chair" step="any"
													autocomplete="off" value=""/>
													<form:errors path="kind" cssClass="help-block" element="em"/>
											</div>
										</div> --%>
										<%-- 	<div class="request-input large blue">
											<p class="name">Product name</p>
											<div class="input-wrap  
                ">
												<form:input type="number"  path="kind" title="Product name" autocomplete="off"
													name="main_name" placeholder="Red Chair" step="any"
													autocomplete="off" value=""/>
													<form:errors path="kind" cssClass="help-block" element="em"/>
											</div>
										</div> --%>
									</div>
									<div class="_2daCnfZkNcDBxpoTaUTeRj">
										<span>Primary Transport Mode</span><label
											class="aRHP1WHChJOtaaJiGH7os"><form:radiobutton
												value="SEA" path="transportation" name="shipment-type"
												checked="" /><span></span><span>SEA</span></label><label
											class="aRHP1WHChJOtaaJiGH7os"><form:radiobutton
												value="LAND" path="transportation" name="shipment-type" /><span></span><span>LAND</span></label><label
											class="aRHP1WHChJOtaaJiGH7os"><form:radiobutton
												value="AIR" path="transportation" name="shipment-type" /><span></span><span>AIR</span></label>
									</div>
								</div>
							</div>
							<div class="white-block">
								<div class="_2fwAz9xpn2VsFPNX-v_BSB">
									<h2>Additional services</h2>
									<div class="_1sfbBflXbDVSnFUfOdXHCs">
										<ul>
											<li><div class="_36ZQzdoDlVjSXxuXB5TMbT">
													<label class="_3GfUR9yR_rFiJl_vP_jNry"><form:checkbox
															path="addictional" value="pick" /><span></span><span>Cargo
															pick up</span></label>
												</div></li>
											<li><div class="_36ZQzdoDlVjSXxuXB5TMbT">
													<label class="_3GfUR9yR_rFiJl_vP_jNry"><form:checkbox
															path="addictional" value="delivery" /><span></span><span>Cargo
															Delivery</span></label>
												</div></li>
											<li><div class="_36ZQzdoDlVjSXxuXB5TMbT">
													<label class="_3GfUR9yR_rFiJl_vP_jNry"><form:checkbox
															path="addictional" value="port_fees" /><span></span><span>Port
															fees &amp; forwarding fees</span></label>
												</div></li>
											<li><div class="_36ZQzdoDlVjSXxuXB5TMbT">
													<label class="_3GfUR9yR_rFiJl_vP_jNry"><form:checkbox
															path="addictional" value="customs_clearance" /><span></span><span>Customs
															clearance</span></label>
												</div></li>
											<li><div class="_36ZQzdoDlVjSXxuXB5TMbT">
													<label class="_3GfUR9yR_rFiJl_vP_jNry"><form:checkbox
															path="addictional" value="cargo_insurance_check" /><span></span><span>Сargo
															Insurance</span></label>
												</div></li>
										</ul>
										<img
											src="https://www.searates.com/design/images/apps/shipping/request/services-img.svg"
											alt="">
									</div>
								</div>
							</div>
							<div class="request-footer">
								<div class="progressbar">
									<p>
										Readiness: <span style="color: rgb(0, 136, 255);">0%</span>
									</p>
									<div class="line-wrapper">
										<div class="line"
											style="width: 0%; background: rgb(0, 136, 255);"></div>
									</div>
								</div>
								<div class="btns">
									<p class="auth-tip">
										<a href="/auth/sign-in">Sign in</a> to send request
									</p>
									<button type="submit" class="request-btn prev disabled blue"
										disabled="" style="background: rgb(0, 136, 255);">
										<i class="fal fa-angle-left"></i>
									</button>
									<button type="submit" class="request-btn next "
										style="background: rgb(0, 136, 255);">
										<span>Next</span> <i class="fal fa-angle-right"></i>
									</button>
								</div>
							</div>
					</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
	</div>
	<footer class="footer">
		<div class="content">
			<ul class="main__nav">
				<li class="main__nav-list">
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
