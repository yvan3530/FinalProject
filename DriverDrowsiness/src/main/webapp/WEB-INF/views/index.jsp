<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html  lang="en">

<meta http-equiv="content-type" content="text/html;charset=UTF-8" />

<head>
<meta name="referrer" content="always">
<meta charset="utf-8">


<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="manifest" href="other/sitee4da.webmanifest?5">
<link rel="mask-icon"
	href="other/safari-pinned-tabe4da.svg?5"
	color="#0139ff">

 <link href="${css }/myapp.css" rel="stylesheet"> 
 <script type="text/javascript"src="assets/js/myapp.js"></script>

 <%-- <link href="${css }/mycss.css" rel="stylesheet"> --%> 
<!-- <link rel="apple-touch-icon" sizes="180x180"
	href="design/images/favicon/apple-touch-icone4da.png?5">
	
<link rel="icon" type="image/png" sizes="32x32"
	href="design/images/favicon/favicon-32x32e4da.png?5">
	
<link rel="icon" type="image/png" sizes="16x16"
	href="design/images/favicon/favicon-16x16e4da.png?5"> -->
<%-- 
<link href="${css}/index.css" rel="stylesheet">
<link href="${css}/partial-mp-filter.css" rel="stylesheet">
<link href="${css}/global.css" rel="stylesheet">
 --%>
<!-- <link href="design/css/index/index.css9073.css?590290" media="screen"
	rel="stylesheet" type="text/css" />
<link href="design/css/index/partial-mp-filter.cssedb7.css?576333"
	media="screen" rel="stylesheet" type="text/css" />
<link href="design/css/global/global.csscfaa.css?513165" media="screen"
	rel="stylesheet" type="text/css" /> -->


<title>Kesi Investement Company - ${title}</title>
<script>
	window.menu = '${title}';
	window.contextRoot = $('contextRoot')
</script>

</head>
<body>
	

	<!--here header  -->
	<%@include file="./shared/navbar.jsp"%>

	<!-- end header -->

	
		<!-- home -->
		<c:if test="${userClickHome == true }">
			<%@include file="home.jsp"%>
		</c:if>

		<!-- end home -->

		 <script>/*<![CDATA[*/function ChangeActiveSwiper(target){new Swiper(target,{direction:'vertical',spaceBetween:4,allowTouchMove:false,loop:true,slidesPerView:5,speed:2000,autoplay:{},});}
document.addEventListener('DOMContentLoaded',())=>{var swiperContainer=document.querySelectorAll('.swiper-container');var rollers=document.querySelectorAll('.rollers .swiper-container');ChangeActiveSwiper(rollers[0]);ChangeActiveSwiper(rollers[1]);ChangeActiveSwiper(rollers[2]);new Swiper('.whySearates-container',{spaceBetween:15,slidesPerView:2,speed:1500,autoplay:{delay:5000,disableOnInteraction:false,},navigation:{nextEl:'.swiper-button-next',prevEl:'.swiper-button-prev',},});var productSwiper;function activeSlider(width){if(width.matches){if(productSwiper!==undefined)productSwiper.destroy(true,true);}else{productSwiper=new Swiper('.product-container',{spaceBetween:17,freeMode:true,speed:1500,parallax:true,slidesPerView:'auto',autoplay:{delay:5000,disableOnInteraction:false,},});}}
var windowWidth=window.matchMedia('(max-width: 520px)');activeSlider(windowWidth);windowWidth.addListener(activeSlider);});/*]]>*/</script>
 
	
	
	

	<!-- here footer -->

	<%@include file="./shared/footer.jsp"%>

	<!-- end footer -->

		
  
<%--<script src="${js}/jquery.js"></script>
<script src="${js}/bootstrap-datepicker.js"></script>
<script src="${js}/select2.js"></script>
<script src="${js}/swiper-bundle.js"></script>
<script  src="${js}/main-min.js"></script> --%>



</body>

</html>