<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<header class="main_header">
		<nav class="navbar">
			<div class="container-lg">
			<a class="rootLink" href="${contextRoot }/home">Kesi
							Investiment Ltd</a>
				<ul class="navRoot">
					
						
						
					<li class="navSection primary"> 
						<a class="rootLink"  href="${contextRoot }/about">About
					</a>
					
					<%-- <li class="navSection primary" ><a class="rootLink"
					href="${contextRoot }/manage/bookings">Booking</a></li>
					
					<li class="navSection primary" ><a class="rootLink"
					href="${contextRoot }/manage/addroute">route</a></li>
					
					<security:authorize access="hasAuthority('ADMIN')">
				<li class="navSection primary" ><a class="rootLink"
					href="${contextRoot }/manage/addtrucks">truck</a></li>
					</security:authorize> --%>
					
					
					
				
					 
					<a
						class="rootLink hasDropdown" data-dropdown="services">
							Services </a>  
							 <a class="rootLink" href="${contextRoot }/contact">Contact
					</a>
					<a class="rootLink" href="${contextRoot }/health">Health
					</a>
				</li>
				
				<li class="navSection primary" ><a class="rootLink"
					href="${contextRoot }/driver">driver</a></li>
					
					<li class="navSection secondary"><a class="rootLink outline"
						href="${contextRoot}/register">Sign Up</a></li>
						<li class="navSection secondary"><a class="rootLink outline"
							href="${contextRoot}/login">Login</a></li>
							
							 <a class="collapsible" href="${userModel.fullName}"></a>
									<div class="collapse">
										<ul class="linkGroup linkList developersGroup">
											<li><a class="linkContainer"
												href="${contextRoot}/perform-logout">
													<h3 class="linkTitle">
														 Logout
													</h3>
											</a></li>
										</ul>
										
									</div>
					<li class="navSection mobile"><a
						class="rootLink item-mobileMenu"><h2>
								<i class="far fa-bars"></i>
							</h2></a>
						<div class="popup">
							<div class="popupContainer">
								<a class="popupCloseButton">Close</a>
								<div class="mobileProducts">
									<a class="mobileSignIn" href="${contextRoot }/about">About
										<i class="fa fa-chevron-right"></i>
									</a>
									<a class="collapsible" href="#">SERVICES</a>
									<div class="collapse">
										<div class="mobileProductsList">
											<ul>
												<li> <a class="linkContainer" href="#">
														<i class="fad fa-box-usd"></i> Request a Quote
												</a></li>
											</ul>
											
										</div>
										<div class="mobileSecondaryNav">
											<ul>
												<li><a
													href="#">FCL Shipping</a></li>
												<li><a
													href="#">LCL Shipping</a></li>
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
									</a>
									<a class="mobileSignIn" href="${contextRoot }/health">Health
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
										<li><a
											href="#">FCL Shipping</a></li>
										<li><a
											href="#">LCL Shipping</a></li>
										<li><a href="#">Bulk & Break
												Bulk</a></li>
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

<script >

window.userRole = '$userModel.role';

</script>
