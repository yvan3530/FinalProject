<div class="main-content">
	<div id="scroll-container" class='main-page-box'>
	<section class="intro">
		<div class="content">
			<p class="pre_title">Shipping to and from anywhere in the world</p>
			<h1 class="title">
				Find the<span class="accent">best freight</span>quote
			</h1>
			<div class="main-filter-wrapper">
				<div class="wrapper-main-filter">
					<div class="wrapper-application-switch">
						<div class="application-switch">
							<ul>
								<li class="switch-freight active">Freight Quotes</li>
							</ul>
						</div>
						<a href='shipping/request/index.html'
							class="application-link link"> Request a Quote </a>
					</div>
					<div class="wrapper-filter-block">
						<div class="filter-block">
							<div class="wrapper-form">
								<form class="filter-shipping active" method="GET"
									action="https://www.searates.com/freight/" autocomplete="off">
									<input type="hidden" name="weight" value="100"
										id="weight_cargo">
									<div class="wrapper-box-shadow">
										<div class="route-item">
											<span class="top-title">TRANSPORTATION BY</span>
											<nav class="route-list">


												<li><a data-mode="sea" class="btn-route route-active"
													title="Transit type: SEA"> <svg width="41" height="41"
															viewBox="0 0 41 41" fill="none"
															xmlns="http://www.w3.org/2000/svg"> <path
																d="M35.9614 19.0816C35.9614 19.0816 33.8001 22.7393 28.3552 22.7393C22.9104 22.7393 20.749 19.0816 20.749 19.0816"
																stroke="#0088FF" stroke-width="2" stroke-linecap="round"
																stroke-linejoin="round" /> 
    																			<path
																d="M20.749 19.0816C20.749 19.0816 18.5877 22.7393 13.1428 22.7393C7.69795 22.7393 5.53663 19.0816 5.53663 19.0816"
																stroke="#0088FF" stroke-width="2" stroke-linecap="round"
																stroke-linejoin="round" /> </svg>
														<div class="button-slider"></div>
												</a></li> <i class="divider"></i>

												<li><a data-mode="road" class="btn-route"
													title="Transit type: LAND"> <svg width="41" height="41"
															viewBox="0 0 41 41" fill="none"
															xmlns="http://www.w3.org/2000/svg"> <path
																d="M5.69092 20.9111H36.282" stroke="#00C98C"
																stroke-width="2" stroke-linecap="round" /> </svg>
												</a></li> <i class="divider"></i>
												<li><a data-mode="air" class="btn-route"
													title="Transit type: AIR"> <svg width="41" height="41"
															viewBox="0 0 41 41" fill="none"
															xmlns="http://www.w3.org/2000/svg"> <path
																d="M5.74658 22.7397C5.74658 22.7397 7.90791 19.082 13.3528 19.082C18.7977 19.082 20.959 22.7397 20.959 22.7397"
																stroke="#FF164E" stroke-width="2" stroke-linecap="round"
																stroke-linejoin="round" /> <path
																d="M20.959 22.7397C20.959 22.7397 23.1203 19.082 28.5652 19.082C34.0101 19.082 36.1714 22.7397 36.1714 22.7397"
																stroke="#FF164E" stroke-width="2" stroke-linecap="round"
																stroke-linejoin="round" /> </svg>
												</a></li> <i class="divider"></i>
											</nav>
										</div>
										<div class="shipping-directions">
											<div class="input-icon">
												<span class="top-title">ORIGIN OF SHIPMENT</span> <i
													class="ico">A</i> <input required type="text"
													placeholder="Country, City, Port" value="" id="addr_from"
													autocomplete="off"> <input type="hidden"
													name="from" value="" id="pol-input"> <input
													type="hidden" class="place-id" id="addr_from_id" value="">
												<input type="hidden" class="place-lat" id="lat_from"
													value=""> <input type="hidden" class="place-lng"
													id="lng_from" value="">
											</div>
											<div class="swap-places">
												<i class="fad fa-exchange"></i>
											</div>
											<div class="input-icon">
												<span class="top-title">DESTINATION OF SHIPMENT</span> <i
													class="ico">B</i> <input required type="text"
													placeholder="Country, City, Port" value="" id="addr_to"
													autocomplete="off"> <input type="hidden" name="to"
													value="" id="pod-input"> <input type="hidden"
													class="place-id" id="addr_to_id" value=""> <input
													type="hidden" class="place-lat" id="lat_to" value="">
												<input type="hidden" class="place-lng" id="lng_to" value="">
											</div>
										</div>
										<div class="date-field">
											<div class="date-block">
												<span class="top-title">Ready to load</span> <input
													class="date-day" name="date" type="text"
													data-date-format="d M, yyyy" autocomplete="off" readonly>
											</div>
										</div>
										<div class="dropdown-shipment" id="dropdown-shipment">
											<span class="top-title">Type of shipment</span> <a
												class="dropdown-toggle" data-toggle="dropdown"
												href="javascript:;"> <i class="fad fa-container-storage"></i>
												FCL <i class="fal fa-angle-down"></i>
											</a>
											<ul class="dropdown-menu">
												<li><a data-mode="sea" data-type="fcl"
													href="javascript:;"><i class="fad fa-container-storage"></i><span>FCL</span></a>
													<span class="transcript">FULL CONTAINER LOAD</span></li>
												<li><a data-mode="sea" data-type="lcl"
													href="javascript:;"><i class="fad fa-boxes"></i><span>LCL</span></a>
													<span class="transcript">LESS CONTAINER LOAD</span></li>
												<li><a data-mode="sea" data-type="bulk"
													href="javascript:;"><i class="fad fa-mountains"></i><span>BULK</span></a>
													<span class="transcript">BULK & BREAK BULK</span></li>
												<li><a data-mode="road" data-type="road-fcl"
													href="javascript:;"><i class="fad fa-truck-container"></i><span>FCL</span></a>
													<span class="transcript">FULL CONTAINER LOAD</span></li>
												<li><a data-mode="road" data-type="ftl"
													href="javascript:;"><i class="fad fa-truck"></i><span>FTL</span></a>
													<span class="transcript">TRUCK LOAD</span></li>
												<li><a data-mode="road" data-type="rail"
													href="javascript:;"><i class="fad fa-train"></i><span>FWL</span></a>
													<span class="transcript">WAGON LOAD</span></li>
												<li><a data-mode="air" data-type="air"
													href="javascript:;"><i class="fad fa-plane"></i><span>AIR</span></a>
													<span class="transcript">AIR DELIVERY</span></li>
											</ul>
										</div>
										<input type="hidden" name="type" value="fcl">
									</div>
									<div class="route-btn">
										<button type="submit" id="btn-search-shipping">
											<span class="route-btn-icon"></span>Search
										</button>
									</div>
								</form>
							</div>

						</div>
					</div>
				</div>
				<script>
					
				</script>
			</div>
		</div>
	</section>
	<section class='requests'>
		<div class='content'>
			<div class='title'>
				<div class='title-wrapper'>
					<p>East African ports</p>
					<h2>East African ports</h2>
				</div>
				<a href='shipping/list/indexedd3.html?type=REQ_2,REQ_1,REQ_3'
					class='link leads-btn'> View all shipping leads </a> <a
					href='shipping/request/index.html' class="btn-link"> Request a
					Quote </a>
			</div>
			<div class="rollers">
				<div class="roller">
					<h4>
						<i class="icon lcl"></i> Uganda ports
					</h4>
					<div class="leads-container swiper-container">
						<div class="leads-wrapper swiper-wrapper">
							<div class="leads-item swiper-slide">

								<div class="leads-item__content">

									<div class="leads-item__main">
										<div class="first-block-cont">
											<i class="flag-icon flag-icon-ae"></i><span
												class="direction-text">Mbarara</span>
										</div>
										<span class="icon__arrow"></span>
										<div class="second-block-cont">
											<i class="flag-icon flag-icon-nl"></i><span
												class="direction-text">Kampala</span>
										</div>
									</div>
								</div>

							</div>
							<div class="leads-item swiper-slide">

								<div class="leads-item__content">

									<div class="leads-item__main">
										<div class="first-block-cont">
											<i class="flag-icon flag-icon-it"></i><span
												class="direction-text">Mbale</span>
										</div>
										<span class="icon__arrow"></span>
										<div class="second-block-cont">
											<i class="flag-icon flag-icon-us"></i><span
												class="direction-text">Masindi</span>
										</div>
									</div>
								</div>

							</div>
							<div class="leads-item swiper-slide">

								<div class="leads-item__content">

									<div class="leads-item__main">
										<div class="first-block-cont">
											<i class="flag-icon flag-icon-cn"></i><span
												class="direction-text">Arua</span>
										</div>
										<span class="icon__arrow"></span>
										<div class="second-block-cont">
											<i class="flag-icon flag-icon-us"></i><span
												class="direction-text">Lira</span>
										</div>
									</div>
								</div>

							</div>
							<div class="leads-item swiper-slide">
								<div class="leads-item__content">

									<div class="leads-item__main">
										<div class="first-block-cont">
											<i class="flag-icon flag-icon-ae"></i><span
												class="direction-text">Entebbe</span>
										</div>
										<span class="icon__arrow"></span>
										<div class="second-block-cont">
											<i class="flag-icon flag-icon-cd"></i><span
												class="direction-text">Jinja</span>
										</div>
									</div>
								</div>

							</div>
							<div class="leads-item swiper-slide">
								<div class="leads-item__content">

									<div class="leads-item__main">

										<span class="icon__arrow"></span>
										<div class="second-block-cont">
											<i class="flag-icon flag-icon-ph"></i><span
												class="direction-text">Tororo</span>
										</div>
									</div>
								</div>


							</div>


							<div class="leads-item swiper-slide"></div>

						</div>
					</div>
				</div>

				<div class="roller">
					<h4>
						<i class="icon fcl"></i> Tanzania ports
					</h4>
					<div class="leads-container swiper-container">
						<div class="leads-wrapper swiper-wrapper">
							<div class="leads-item swiper-slide">
								<div class="leads-item__content">

									<div class="leads-item__main">
										<div class="first-block-cont">
											<i class="flag-icon flag-icon-au"></i><span
												class="direction-text">Bukoba</span>
										</div>
										<span class="icon__arrow"></span>
										<div class="second-block-cont">
											<i class="flag-icon flag-icon-mh"></i><span
												class="direction-text">Musoma</span>
										</div>
									</div>
								</div>

							</div>
							<div class="leads-item swiper-slide">
								<div class="leads-item__content">

									<div class="leads-item__main">
										<div class="first-block-cont">
											<i class="flag-icon flag-icon-cn"></i><span
												class="direction-text">Mwaza</span>
										</div>
										<span class="icon__arrow"></span>
										<div class="second-block-cont">
											<i class="flag-icon flag-icon-nl"></i><span
												class="direction-text">Kigoma</span>
										</div>
									</div>
								</div>

							</div>
							<div class="leads-item swiper-slide">
								<div class="leads-item__content">

									<div class="leads-item__main">
										<div class="first-block-cont">
											<i class="flag-icon flag-icon-cn"></i><span
												class="direction-text"> Kasanga</span>
										</div>
										<span class="icon__arrow"></span>
										<div class="second-block-cont">
											<i class="flag-icon flag-icon-nl"></i><span
												class="direction-text">Kyela</span>
										</div>
									</div>
								</div>

							</div>
							<div class="leads-item swiper-slide">
								<div class="leads-item__content">

									<div class="leads-item__main">
										<div class="first-block-cont">
											<i class="flag-icon flag-icon-my"></i><span
												class="direction-text">Tanga </span>
										</div>
										<span class="icon__arrow"></span>
										<div class="second-block-cont">
											<i class="flag-icon flag-icon-us"></i><span
												class="direction-text">Kilwa</span>
										</div>
									</div>
								</div>

							</div>
							<div class="leads-item swiper-slide">
								<div class="leads-item__content">

									<div class="leads-item__main">
										<div class="first-block-cont">
											<i class="flag-icon flag-icon-mx"></i><span
												class="direction-text">Dar-es-salaam</span>
										</div>
										<span class="icon__arrow"></span>
										<div class="second-block-cont">
											<i class="flag-icon flag-icon-co"></i><span
												class="direction-text">Mafia</span>
										</div>
									</div>
								</div>
							</div>

							<div class="leads-item swiper-slide">
								<div class="leads-item__content">

									<div class="leads-item__main">
										<div class="first-block-cont">
											<i class="flag-icon flag-icon-mx"></i><span
												class="direction-text">Pangani</span>
										</div>
										<span class="icon__arrow"></span>
										<div class="second-block-cont">
											<i class="flag-icon flag-icon-ae"></i><span
												class="direction-text">Bagamoyo</span>
										</div>
									</div>
								</div>

							</div>
							<div class="leads-item swiper-slide">
								<div class="leads-item__content">

									<div class="leads-item__main">
										<div class="first-block-cont">
											<i class="flag-icon flag-icon-cn"></i><span
												class="direction-text">Mtwara</span>
										</div>
										<span class="icon__arrow"></span>

									</div>
								</div>

							</div>
						</div>
					</div>
				</div>
				<div class="roller">
					<h4>
						<i class="icon bulk"></i> Kenya ports
					</h4>
					<div class="leads-container swiper-container">
						<div class="leads-wrapper swiper-wrapper">
							<div class="leads-item swiper-slide">
								<div class="leads-item__content">

									<div class="leads-item__main">
										<div class="first-block-cont">
											<i class="flag-icon flag-icon-gr"></i><span
												class="direction-text">Takaungu</span>
										</div>
										<span class="icon__arrow"></span>
										<div class="second-block-cont">
											<i class="flag-icon flag-icon-be"></i><span
												class="direction-text">Ngomeni</span>
										</div>
									</div>
								</div>

							</div>
							<div class="leads-item swiper-slide">
								<div class="leads-item__content">

									<div class="leads-item__main">
										<div class="first-block-cont">
											<i class="flag-icon flag-icon-eg"></i><span
												class="direction-text">Mombasa</span>
										</div>
										<span class="icon__arrow"></span>
										<div class="second-block-cont">
											<i class="flag-icon flag-icon-tz"></i><span
												class="direction-text">Funzi</span>
										</div>
									</div>
								</div>

							</div>
							<div class="leads-item swiper-slide">
								<div class="leads-item__content">
									<div class="leads-item__main">
										<div class="first-block-cont">
											<i class="flag-icon flag-icon-za"></i><span
												class="direction-text">Shimoni</span>
										</div>
										<span class="icon__arrow"></span>
										<div class="second-block-cont">
											<i class="flag-icon flag-icon-us"></i><span
												class="direction-text">Vanga</span>
										</div>
									</div>
								</div>
							</div>
							<div class="leads-item swiper-slide">
								<div class="leads-item__content">
									<div class="leads-item__main">
										<div class="first-block-cont">
											<i class="flag-icon flag-icon-ae"></i><span
												class="direction-text">Mtwapa</span>
										</div>
										<span class="icon__arrow"></span>
										<div class="second-block-cont">
											<i class="flag-icon flag-icon-sn"></i><span
												class="direction-text">Kilifi</span>

										</div>
									</div>
								</div>
							</div>
							<div class="leads-item swiper-slide">
								<div class="leads-item__content">
									<div class="leads-item__main">
										<div class="first-block-cont">
											<i class="flag-icon flag-icon-ru"></i><span
												class="direction-text">Malindi</span>
										</div>
										<span class="icon__arrow"></span>
										<div class="second-block-cont">
											<i class="flag-icon flag-icon-is"></i><span
												class="direction-text">Lamu</span>
										</div>
									</div>
								</div>
							</div>
							<div class="leads-item swiper-slide">
								<div class="leads-item__content">

									<div class="leads-item__main">
										<div class="first-block-cont">
											<i class="flag-icon flag-icon-ru"></i><span
												class="direction-text">Kiunga</span>
										</div>
										<span class="icon__arrow"></span>
										<div class="second-block-cont">
											<i class="flag-icon flag-icon-no"></i><span
												class="direction-text">Stavanger</span>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class='today'>
		<div class='content'>
			<div class='title'>
				<div class='title-wrapper'>
					<h2>Kesi Investiment Ltd</h2>
				</div>
			</div>
			<div class='text-part'>
				<article>
					<p>
						<span class="notice grey"> KESI Investment Rwanda ltd. </span> </br> is
						an integrated transport and logistics services provider with the
						Head Office in Kigali, </br> was established in 2016 with a fleet of
						100 trucks that moved our client’s goods within the region. <span
							class="notice"> cargo delivery options at your request </span>
						and arrange their transportation and insurance.
					</p>
					<p>
						We provide Efficiency, Quality and Professionalism, </br> <span
							class="notice"> We have made a strong repute for
							impeccable </span> transport and logistics services </br> <span
							class="notice"> in East African Countries </span> .
					</p>
				</article>
				<div class='digits'>
					<div class='item'>
						<div class='item-content'>
							<span class='num'>500 K+</span> <span>Shipments per year</span>
						</div>
					</div>
					<div class='item'>
						<div class='item-content'>
							<span class='num'>4</span> <span>Country</span>
						</div>
					</div>
					<div class='item'>
						<div class='item-content'>
							<span class='num'>184 +</span> <span>Trucks</span>
						</div>
					</div>

					<div class='item'>
						<div class='item-content'>
							<span class='num'>1 M+</span> <span>Customers</span>
						</div>
					</div>
					<div class='item'>
						<div class='item-content'>
							<span class='num'>5 star</span> <span>Rates</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class='blog'>
		<div class='content'>
			<div class='title'>
				<div class='title-wrapper'>
					<p>Latest news</p>
				</div>
				<a href='blog/index.html' class='link'>View all articles</a>
			</div>
			<div class='grid-wrap'>
				<article class='post-item'>
					<a target="_blank"
						href="blog/post/searates-updates-week-41-2020.html">
						<div class='img-part'>
							<img src='design/images/import/blog/0.45577400%201602579150.png'
								alt='post-pic'>
						</div>
						<div class='text-part'>
							<span class='date'>Oct 13, 2020</span>
							<h4>SeaRates Updates - Week 41, 2020</h4>
						</div>
					</a>
				</article>
				<article class='post-item'>
					<a target="_blank"
						href="blog/post/peak-shipping-season-2020-what-to-expect.html">
						<div class='img-part'>
							<img src='design/images/import/blog/0.05945300%201602486415.jpg'
								alt='post-pic'>
						</div>
						<div class='text-part'>
							<span class='date'>Oct 12, 2020</span>
							<h4>PEAK SHIPPING SEASON 2020 - WHAT TO EXPECT</h4>
						</div>
					</a>
				</article>
				<article class='post-item'>
					<a target="_blank"
						href="blog/post/searates-updates-week-40-2020.html">
						<div class='img-part'>
							<img src='design/images/import/blog/0.08166200%201601887655.png'
								alt='post-pic'>
						</div>
						<div class='text-part'>
							<span class='date'>Oct 05, 2020</span>
							<h4>SeaRates Updates - Week 40, 2020</h4>
						</div>
					</a>
				</article>
			</div>
		</div>
	</section>
	<section class='market-place'>
		<div class='content'>
			<div class='title'>
				<div class='title-wrapper'>
					<h2>Online Freight Marketplace</h2>
					<p>We integrate B2B shippers to all-inclusive rates</p>
				</div>
			</div>
			<div class='main-part'>
				<div class='img-part'>
					<img
						src='design/images/services/test-main-page/marketplace-pic.png'
						alt='market-place'>
				</div>
				<div class='text-part'>
					<ul class='advantage'>
						<li>
							<h3>Search and book</h3>
							<p>Instantly find the best sea, air and inland freight rates
								from 500+ providers with excellent delivery time.</p>
						</li>
						<li>
							<h3>Ship and track</h3>
							<p>Powerful logistics management with real-time tracking,
								live notifications, and transparency on all your shipments.</p>
						</li>
						<li>
							<h3>Get professional support</h3>
							<p>Our team is one message away to assist with every step of
								the delivery process, from paperwork to cargo release.</p>
						</li>
					</ul>
					<a class='btn-link' href='shipping/for-shippers/index.html'>
						Search a tariff </a>
				</div>
			</div>
		</div>
	</section>
	<section class='apps'>
		<div class="cursor"></div>
		<div class='content'>
			<div class='title'>
				<div class='title-wrapper'>
					<p>Always improving</p>
					<h2>Kesi Investiment Ltd tools</h2>
				</div>
			</div>
			<div class='product-container'>
				<div class='swiper-wrapper'>
					<article class='swiper-slide mark-place'>
						<header class='product-title'>
							<span class='icon'></span>
							<h3>Countries</h3>
						</header>
						<p>We provide our services in east african country, Kenya,
							Tanzania,Uganda, Rwanda and we have branches in those countries .</p>

					</article>
					<article class='swiper-slide load-cacl'>
						<header class='product-title'>
							<span class='icon'></span>
							<h3>Mission</h3>
						</header>
						<p>To be the best regional cargo -mover and clearing and cargo
							handling services provider and to build an impeccable repute in
							the haulage and logistics service industry throughout the
							Eastern, central and West-African Countries.</p>
					</article>
					<article class='swiper-slide dist-time'>
						<header class='product-title'>
							<span class='icon'></span>
							<h3>Vision</h3>
						</header>
						<p>To be a customer oriented and Endeavor’s always to create
							Cost-effective solutions, tailored towards customers’ needs and
							to build an impeccable repute in the haulage and logistics
							service industry throughout the Eastern, central and West-African
							Countries.</p>
					</article>
					<article class='swiper-slide cont-track'>
						<header class='product-title'>
							<span class='icon'></span>
							<h3>Efficiency</h3>
						</header>
						<p>100% guaranteed safe and fast delivery with highly
							modernized delivery vehicles both local and international!</p>
					</article>
					<article class='swiper-slide cargo-wizrd'>
						<header class='product-title'>
							<span class='icon'></span>
							<h3>Professionalism</h3>
						</header>
						<p>From the heart of Africa, we offer Global transportation
							services via sea, land and air. We will protect you from risk and
							liability!</p>

					</article>
					<article class='swiper-slide ship-schdl'>
						<header class='product-title'>
							<span class='icon'></span>
							<h3>Effective</h3>
						</header>
						<p>Cargo Handling Services provides specialized
							temperature-controlled trucking, warehousing, and aircraft ground
							handling.</p>
					</article>
				</div>
			</div>
		</div>
	</section>
	<section class='combine'>
		<div class='content'>
			<div class='inner'>
				<div class='wrap'>
					<div class='desktop-part'>
						<header>
							<h3>Combine everything</h3>
							<span>in one place</span>👌
						</header>
						<p>Search from more than 500,000 ocean freight quotes and get
							the latest international shipping rates from any carrier in
							seconds. With us you get a launching pad for your supply chain,
							and with it the effectiveness, control and transparency of your
							business.</p>
						<a target="_blank" href='freight/index.html'
							class='btn-link semitransparent'>Get started</a>
					</div>
					<div class='mobile-part'>
						<p>
							24 hours a day, 7 days a week, 365 days a year!<br> We
							understand how important it is to <span><br>support
								our customers</span>👌&nbsp;while organizing their cargo movement,
							delivery and customs clearance.
						</p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class='why'>
		<div class='content'>
			<div class='grid-wrap'>
				<div class='title-part'>
					<h4>Why SeaRates</h4>
				</div>
				<div class='whySearates-container'>
					<div class='swiper-wrapper'>
						<article class='swiper-slide'>
							<header class='purple'>
								<h4>Get access to the world’s largest shipping service
									platform</h4>
							</header>
							<p>Would you like to ship cargo by ship? FCL or LCL? Bulk or
								Break Bulk? There is everything you need for shipping on
								SeaRates.com. We have gathered the shipping services and put
								them all in one place to facilitate your search. Instantly
								compare ocean and trucking freight quotes from the most popular
								logistics providers. Book everything on one site!</p>
						</article>
						<article class='swiper-slide'>
							<header class='green'>
								<h4>Take advantage of the market’s lowest rates</h4>
							</header>
							<p>Affordable pricing of shipping services is what we
								constantly strive for. At SeaRates.com you will find cheap rates
								to any country, from world's top Freight Forwarders, allowing
								you to save your time and money. Why do you need to spend a lot
								of resources and energy on negotiations to get the best shipping
								rate? Find and book them online! It is much more convenient and
								advantageous.</p>
						</article>
						<article class='swiper-slide'>
							<header class='red'>
								<h4>Enjoy discounts for frequent customers</h4>
							</header>
							<p>We value our customers, so they have an opportunity to get
								shipping rates with discounts. Promos depend on your orders
								&amp; routes. We provide special promotions in the form of
								promotional codes.When you proceed to payment, you will be able
								to use a promo code. If you do that, the price will lower. To
								get a promo code, fill out the quotation request form and get in
								touch with us.</p>
						</article>
						<article class='swiper-slide'>
							<header class='green'>
								<h4>Benefit from end-to-end client support</h4>
							</header>
							<p>24 hours a day, 7 days a week, 365 days a year! We
								understand how important it is to support our customers while
								organizing their cargo movement, delivery and customs clearance.
								Our Customer Care Service is always ready to support you day and
								night on all issues relating to freight, weight, routing, rates,
								inland haulage and documentation.</p>
						</article>
					</div>
					<div class='swiper-button'>
						<span class='swiper-button-prev'></span> <span
							class='swiper-button-next'></span>
					</div>
				</div>
			</div>
	</section>
</div>
</div>

