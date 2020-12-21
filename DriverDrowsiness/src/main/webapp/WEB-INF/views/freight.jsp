<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8" />
<title>Orders | Hyper - Responsive Bootstrap 4 Admin Dashboard</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta
	content="A fully featured admin theme which can be used to build CRM, CMS, etc."
	name="description" />
<meta content="Coderthemes" name="author" />
<!-- App favicon -->
<link rel="shortcut icon" href="assets/images/favicon.ico">

<!-- App css -->
<script src="https://kit.fontawesome.com/1ea22623b8.js"
	crossorigin="anonymous"></script>

<link href="${css }/app.min.css" rel="stylesheet" type="text/css" />
<link href="${css }/app-dark.min.css" rel="stylesheet" type="text/css" />
<link href="${css }/icons.min.css" rel="stylesheet" />
<link href="${css }/bundle.css" rel="stylesheet">
</head>

<body class="loading"
	data-layout-config='{"leftSideBarTheme":"dark","layoutBoxed":false, "leftSidebarCondensed":false, "leftSidebarScrollable":false,"darkMode":false, "showRightSidebarOnStart": true}'>
	<!-- Begin page -->
	<div class="wrapper">
		<!-- ========== Left Sidebar Start ========== -->
		<div class="left-side-menu">

			<!-- LOGO -->
			<a href="index-2.html" class="logo text-center logo-light"> <span
				class="logo-lg"> <img src="assets/images/logo.png" alt=""
					height="16">
			</span> <span class="logo-sm"> <img src="assets/images/logo_sm.png"
					alt="" height="16">
			</span>
			</a>

			<!-- LOGO -->
			<a href="index-2.html" class="logo text-center logo-dark"> <span
				class="logo-lg"> <img src="assets/images/logo-dark.png"
					alt="" height="16">
			</span> <span class="logo-sm"> <img
					src="assets/images/logo_sm_dark.png" alt="" height="16">
			</span>
			</a>

			<div class="h-100" id="left-side-menu-container" data-simplebar>

				<!--- Sidemenu -->
				<ul class="metismenu side-nav">

					<li class="side-nav-title side-nav-item"></li>

					<li class="side-nav-item"><a href="javascript: void(0);"
						class="side-nav-link"> <i class="fas fa-home"></i> <span
							class="badge badge-success float-right"></span> <span>
								Dashboards </span>
					</a></li>

					<li class="side-nav-title side-nav-item">Services</li>

					<li class="side-nav-item"><a href="javascript: void(0);"
						class="side-nav-link"> <i class="fas fa-user-crown"></i> <span>
								Staff </span> <span class="fas fa-arrow-right"></span>
					</a>
						<ul class="side-nav-second-level" aria-expanded="false">

							<li><a href="${contextRoot }/staff">Orders</a></li>
							<li><a href="${contextRoot }/manage/list-of-staff">Checkout</a>
							</li>

						</ul></li>
					<li class="side-nav-item"><a href="javascript: void(0);"
						class="side-nav-link"> <i class="fas fa-user"></i> <span>
								Driver </span> <span class="fas fa-arrow-right"></span>
					</a>
						<ul class="side-nav-second-level" aria-expanded="false">

							<li><a href="${contextRoot }/driver">addDriver</a></li>
							<li><a href="${contextRoot }/manage/list-of-driver">Checkout</a>
							</li>

						</ul></li>
					<li class="side-nav-item"><a href="javascript: void(0);"
						class="side-nav-link"> <i class="fas fa-users"></i> <span>
								Client </span> <span class="fas fa-arrow-right"></span>
					</a>
						<ul class="side-nav-second-level" aria-expanded="false">

							<li><a href="${contextRoot}/register">Orders</a></li>
							<li><a href="${contextRoot }/manage/list-of-client">Checkout</a>
							</li>

						</ul></li>
					<li class="side-nav-item"><a href="javascript: void(0);"
						class="side-nav-link"> <i class="fas fa-truck"></i> <span>
								Truck </span> <span class="fas fa-arrow-right"></span>
					</a>
						<ul class="side-nav-second-level" aria-expanded="false">

							<li><a href="${contextRoot }/manage/addtrucks">Add Truck</a>
							</li>
							<li><a href="${contextRoot }/manage/list-of-truck">Checkout</a>
							</li>

						</ul></li>
					<li class="side-nav-item"><a href="javascript: void(0);"
						class="side-nav-link"> <i class=" fas fa-map-marked-alt"></i>
							<span> Route </span> <span class="fas fa-arrow-right"></span>
					</a>
						<ul class="side-nav-second-level" aria-expanded="false">

							<li><a href="${contextRoot }/manage/addroute">Add Route</a>
							</li>
							<li><a href="${contextRoot }/manage/list-of-route">Checkout</a>
							</li>

						</ul></li>
					<li class="side-nav-item"><a href="javascript: void(0);"
						class="side-nav-link"> <i class="uil-hdd"></i> <span>
								Freight </span> <span class="menu-arrow"></span>
					</a>
						<ul class="side-nav-second-level" aria-expanded="false">

							<li><a href="${contextRoot }/addfreight">Orders</a></li>
							<li><a href="${contextRoot }/manage/list-of-freight">Checkout</a>
							</li>

						</ul></li>

					<li class="side-nav-item"><a href="javascript: void(0);"
						class="side-nav-link"> <i class="fas fa-alarm-clock"></i> <span>
								Alert </span> <span class="fas fa-arrow-right"></span>
					</a>
						<ul class="side-nav-second-level" aria-expanded="false">


							<li><a href="${contextRoot }/manage/list-of-Alert">Checkout</a>
							</li>

						</ul></li>

				</ul>


				<!-- End Sidebar -->

				<div class="clearfix"></div>

			</div>
			<!-- Sidebar -left -->

		</div>
		<!-- Left Sidebar End -->

		<div class="content-page">
			<div class="content">
				<!-- Topbar Start -->
				<div class="navbar-custom">
					<ul class="list-unstyled topbar-right-menu float-right mb-0">
						<li class="dropdown notification-list d-lg-none"><a
							class="nav-link dropdown-toggle arrow-none"
							data-toggle="dropdown" href="#" role="button"
							aria-haspopup="false" aria-expanded="false"> <i
								class="dripicons-search noti-icon"></i>
						</a>
							<div class="dropdown-menu dropdown-menu-animated dropdown-lg p-0">
								<form class="p-3">
									<input type="text" class="form-control"
										placeholder="Search ..." aria-label="Recipient's username">
								</form>
							</div></li>


						<li class="dropdown notification-list"><a
							class="nav-link dropdown-toggle nav-user arrow-none mr-0"
							data-toggle="dropdown" href="#" role="button"
							aria-haspopup="false" aria-expanded="false">

								${userModel.fullName} <span class="caret"></span>

						</a>
							<div
								class="dropdown-menu dropdown-menu-right dropdown-menu-animated topbar-dropdown-menu profile-dropdown">
								<!-- item-->
								<div class=" dropdown-header noti-title">
									<h6 class="text-overflow m-0">Welcome !</h6>
								</div>
								<!-- item-->
								<a href="${contextRoot}/perform-logout"
									class="dropdown-item notify-item"> <i
									class="mdi mdi-logout mr-1"></i> <span>Logout</span>
								</a>

							</div></li>

					</ul>

				</div>
				<!-- end Topbar -->

				<!-- Start Content-->
				<div class="container-fluid">

					<!-- start page title -->
					<div class="row">
						<div class="col-12">
							<div class="page-title-box">
								<div class="page-title-right">
									<ol class="breadcrumb m-0">
										<li class="breadcrumb-item"><a
											href="${contextRoot }/dashboard">Client</a></li>
										<li class="fas fa-arrow-right">Checkout</li>
									</ol>
								</div>
								<h4 class="page-title">Checkout</h4>
							</div>
						</div>
					</div>
					<!-- end page title -->
					<div class="row">
						<div class="col-12">
							<div class="card">
								<div class="card-body">

									<!-- Checkout Steps -->
									<ul class="nav nav-pills bg-nav-pills nav-justified mb-3">
										<li class="nav-item"><a href="#billing-information"
											data-toggle="tab" aria-expanded="false"
											class="nav-link rounded-0 active"> <i
												class="mdi mdi-account-circle font-18"></i> <span
												class="d-none d-lg-block">Billing Info</span>
										</a></li>

									</ul>

									<!-- Steps Information -->
									<div class="tab-content">

										<!-- Billing Content-->
										<div class="tab-pane show active" id="billing-information">
											<div class="row">
												<div class="col-lg-8">
													<h4 class="mt-2">Billing information</h4>

													<p class="text-muted mb-4">Fill the form below in order
														to send you the order's invoice.</p>

													<form:form class="form-horizontal" modelAttribute="freight"
														action="/DriverDrowsiness/addfreights" method="GET">
														<div class="row">
															<div class="col-md-6">
																<div class="form-group">
																	<label for="billing-first-name">departLocation</label>
																	<form:input class="ant-input ant-cascader-input "
																		type="text" path="departLocation"
																		placeholder="Enter your first name"
																		id="billing-first-name" />
																	<form:errors path="departLocation"
																		cssClass="help-block" element="em" />
																</div>
															</div>
															<div class="col-md-6">
																<div class="form-group">
																	<label for="billing-last-name">arrivalLocation</label>
																	<form:input class="ant-input ant-cascader-input "
																		type="text" path="arrivalLocation"
																		placeholder="Enter your last name"
																		id="billing-last-name" />
																	<form:errors path="arrivalLocation"
																		cssClass="help-block" element="em" />
																</div>
															</div>
															<div class="col-md-6">
																<div class="form-group">
																	<label for="billing-first-name">departTime</label>
																	<form:input class="ant-input ant-cascader-input "
																		type="date" path="departTime"
																		placeholder="Enter your first name"
																		id="billing-first-name" />
																	<form:errors path="departTime" cssClass="help-block"
																		element="em" />
																</div>
															</div>
														</div>




														<h2>Shipment details</h2>
														<div class="shipment-form">
															<form:hidden path="freightId" />

															<div class="row">

																<div class="col-md-6">
																	<div class="form-group">
																		<label for="billing-first-name">category</label>
																		<form:select path="category"
																			class="ant-input ant-cascader-input ">
																			<form:option value="---Select your cargo categoty--"
																				label="---Select your cargo categoty--" />
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
																			<form:option
																				value="Machinery, Industrial Parts  Tools"
																				label="Machinery, Industrial Parts  Tools" />
																			<form:option value="Home, Light & Contruction"
																				label="Home, Light & Contruction" />

																		</form:select>

																		<form:errors path="category" cssClass="help-block"
																			element="em" />
																	</div>
																</div>
																<div class="col-md-6">
																	<div class="form-group">
																		<label for="billing-first-name">packageDescription</label>
																		<form:input class="ant-input ant-cascader-input "
																			type="text" path="packageDescription"
																			placeholder="Enter your first name"
																			id="billing-first-name" />
																		<form:errors path="packageDescription"
																			cssClass="help-block" element="em" />
																	</div>
																</div>




															</div>
														</div>
												</div>

												<div class="row">
													<div class="col-md-6">
														<div class="form-group">
															<label for="billing-first-name">packageWeight</label>
															<form:input class="ant-input ant-cascader-put "
																type="number" path="packageWeight"
																placeholder="Enter your first name"
																id="billing-first-name" />
															<form:errors path="packageWeight" cssClass="help-block"
																element="em" />
														</div>
													</div>

													<div class="col-md-6">
														<div class="form-group">
															<label for="billing-first-name">packageLenght</label>
															<form:input class="ant-input ant-cascader-put"
																type="number" path="packageLenght"
																placeholder="Enter your first name"
																id="billing-first-name" />
															<form:errors path="packageLenght" cssClass="help-block"
																element="em" />
														</div>
													</div>
													<div class="col-md-6">
														<div class="form-group">
															<label for="billing-first-name">packagewidth</label>
															<form:input class="ant-input ant-cascader-put "
																type="number" path="packagewidth"
																placeholder="Enter your first name"
																id="billing-first-name" />
															<form:errors path="packagewidth" cssClass="help-block"
																element="em" />
														</div>
													</div>

													<div class="col-md-6">
														<div class="form-group">
															<label for="billing-first-name">quantity</label>
															<form:input class="ant-input ant-cascader-put "
																type="number" path="quantity"
																placeholder="Enter your first name"
																id="billing-first-name" />
															<form:errors path="quantity" cssClass="help-block"
																element="em" />
														</div>
													</div>
													<div class="col-md-6">
														<div class="form-group">
															<label for="billing-first-name">typeOfPackage</label>
															<form:select path="typeOfPackage"
																class="ant-input ant-cascader-input ">
																<form:option value="Dangerous cargo"
																	label="Dangerous cargo" />
																<form:option value="fragile" label="fragile" />
																<form:option value="framable" label="framable" />
																<form:option value="other" label="other" />
															</form:select>
															<form:errors path="typeOfPackage" cssClass="help-block"
																element="em" />
														</div>
													</div>
												</div>



												<div class="col-md-6">
													<div class="form-group">
														<label for="billing-first-name">Primary Transport
															Mode</label>
														<div class="_2daCnfZkNcDBxpoTaUTeRj">
															<label class="aRHP1WHChJOtaaJiGH7os"><form:radiobutton
																	value="SEA" path="transportation" name="shipment-type"
																	checked="" /><span></span><span>SEA</span></label><label
																class="aRHP1WHChJOtaaJiGH7os"><form:radiobutton
																	value="LAND" path="transportation" name="shipment-type" /><span></span><span>LAND</span></label><label
																class="aRHP1WHChJOtaaJiGH7os"><form:radiobutton
																	value="AIR" path="transportation" name="shipment-type" /><span></span><span>AIR</span></label>
														</div>
														<form:errors path="departLocation" cssClass="help-block"
															element="em" />
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
											<div class="form- group">

															<div class="col-md-offset-4 col-md-8">

																<input type="submit" name="submit" id="submit"
																	value="submit" class="btn btn-primary" />





															</div>

														</div>
											</form:form>
										</div>

									</div>
									<!-- end row-->
								</div>


							</div>
							<!-- end tab content-->

						</div>
						<!-- end card-body-->
					</div>
					<!-- end card-->
				</div>
				<!-- end col -->
			</div>


			<!-- end row -->

		</div>
		<!-- container -->

	</div>
	<!-- content -->

	<!-- Footer Start -->
	<footer class="footer">
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-6">
					<script>
						document.write(new Date().getFullYear())
					</script>
					© Hyper - Coderthemes.com
				</div>
				<div class="col-md-6">
					<div class="text-md-right footer-links d-none d-md-block">
						<a href="javascript: void(0);">About</a> <a
							href="javascript: void(0);">Support</a> <a
							href="javascript: void(0);">Contact Us</a>
					</div>
				</div>
			</div>
		</div>
	</footer>
	<!-- end Footer -->






	<!-- END wrapper -->





	<!-- bundle -->

	<script src="${js }/vendor.min.js"></script>
	<script src="${js }/app.min.js"></script>

</body>

</html>
