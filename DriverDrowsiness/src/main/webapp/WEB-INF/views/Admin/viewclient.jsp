<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        <meta charset="utf-8" />
        <title>Orders | Hyper - Responsive Bootstrap 4 Admin Dashboard</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta content="A fully featured admin theme which can be used to build CRM, CMS, etc." name="description" />
        <meta content="Coderthemes" name="author" />
        <!-- App favicon -->
        <link rel="shortcut icon" href="assets/images/favicon.ico">

        <!-- App css -->
        <link href="${css }/icons.min.css" rel="stylesheet" type="text/css" />
        <link href="${css }/app.min.css" rel="stylesheet" type="text/css"  />
        <link href="${css }/app-dark.min.css" rel="stylesheet" type="text/css"  />

    </head>

    <body class="loading" data-layout-config='{"leftSideBarTheme":"dark","layoutBoxed":false, "leftSidebarCondensed":false, "leftSidebarScrollable":false,"darkMode":false, "showRightSidebarOnStart": true}'>
        <!-- Begin page -->
        <div class="wrapper">
            <!-- ========== Left Sidebar Start ========== -->
            <div class="left-side-menu">
    
                <!-- LOGO -->
                <a href="index-2.html" class="logo text-center logo-light">
                    <span class="logo-lg">
                        <img src="assets/images/logo.png" alt="" height="16">
                    </span>
                    <span class="logo-sm">
                        <img src="assets/images/logo_sm.png" alt="" height="16">
                    </span>
                </a>

                <!-- LOGO -->
                <a href="index-2.html" class="logo text-center logo-dark">
                    <span class="logo-lg">
                        <img src="assets/images/logo-dark.png" alt="" height="16">
                    </span>
                    <span class="logo-sm">
                        <img src="assets/images/logo_sm_dark.png" alt="" height="16">
                    </span>
                </a>
    
                <div class="h-100" id="left-side-menu-container" data-simplebar>

                    <!--- Sidemenu -->
                    <ul class="metismenu side-nav">

                        <li class="side-nav-title side-nav-item"></li>

                        <li class="side-nav-item">
                            <a href="javascript: void(0);" class="side-nav-link">
                                <i class="uil-home-alt"></i>
                                <span class="badge badge-success float-right"></span>
                                <span> Dashboards </span>
                            </a>
                            
                        </li>

                        <li class="side-nav-title side-nav-item">Services</li>

                         <li class="side-nav-item">
                            <a href="javascript: void(0);" class="side-nav-link">
                                <i class="uil-user-square"></i>
                                <span> Staff </span>
                                <span class="menu-arrow"></span>
                            </a>
                            <ul class="side-nav-second-level" aria-expanded="false">
                               
                                <li>
                                    <a href="${contextRoot }/staff">Orders</a>
                                </li>
                                <li>
                                    <a href="${contextRoot }/manage/list-of-staff">Checkout</a>
                                </li>
                                
                            </ul>
                        </li>
                        <li class="side-nav-item">
                            <a href="javascript: void(0);" class="side-nav-link">
                                <i class=" uil-book-reader"></i>
                                <span> Driver </span>
                                <span class="menu-arrow"></span>
                            </a>
                            <ul class="side-nav-second-level" aria-expanded="false">
                               
                                <li>
                                    <a href="${contextRoot }/driver">addDriver</a>
                                </li>
                                <li>
                                    <a href="${contextRoot }/manage/list-of-driver">Checkout</a>
                                </li>
                                
                            </ul>
                        </li>
                        <li class="side-nav-item">
                            <a href="javascript: void(0);" class="side-nav-link">
                                <i class=" uil-users-alt"></i>
                                <span> Client </span>
                                <span class="menu-arrow"></span>
                            </a>
                            <ul class="side-nav-second-level" aria-expanded="false">
                               
                                <li>
                                    <a href="${contextRoot}/register">Orders</a>
                                </li>
                                <li>
                                    <a href="${contextRoot }/manage/list-of-client">Checkout</a>
                                </li>
                                
                            </ul>
                        </li>                       
                        <li class="side-nav-item">
                            <a href="javascript: void(0);" class="side-nav-link">
                                <i class="uil-truck"></i>
                                <span> Truck </span>
                                <span class="menu-arrow"></span>
                            </a>
                            <ul class="side-nav-second-level" aria-expanded="false">
                               
                                <li>
                                    <a href="${contextRoot }/manage/addtrucks">Add Truck</a>
                                </li>
                                <li>
                                    <a href="${contextRoot }/manage/list-of-truck">Checkout</a>
                                </li>
                                
                            </ul>
                        </li>                   
                        <li class="side-nav-item">
                            <a href="javascript: void(0);" class="side-nav-link">
                                <i class=" dripicons-location"></i>
                                <span> Route </span>
                                <span class="menu-arrow"></span>
                            </a>
                            <ul class="side-nav-second-level" aria-expanded="false">
                               
                                <li>
                                    <a href="${contextRoot }/manage/addroute">Add Route</a>
                                </li>
                                <li>
                                    <a href="${contextRoot }/manage/list-of-route">Checkout</a>
                                </li>
                                
                            </ul>
                        </li>
                        <li class="side-nav-item">
                            <a href="javascript: void(0);" class="side-nav-link">
                                <i class="uil-hdd"></i>
                                <span> Freight </span>
                                <span class="menu-arrow"></span>
                            </a>
                            <ul class="side-nav-second-level" aria-expanded="false">
                               
                                <li>
                                    <a href="apps-ecommerce-orders.html">Orders</a>
                                </li>
                                <li>
                                    <a href="apps-ecommerce-checkout.html">Checkout</a>
                                </li>
                                
                            </ul>
                        </li>

                       
            
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
                            <li class="dropdown notification-list d-lg-none">
                                <a class="nav-link dropdown-toggle arrow-none" data-toggle="dropdown" href="#" role="button" aria-haspopup="false" aria-expanded="false">
                                    <i class="dripicons-search noti-icon"></i>
                                </a>
                                <div class="dropdown-menu dropdown-menu-animated dropdown-lg p-0">
                                    <form class="p-3">
                                        <input type="text" class="form-control" placeholder="Search ..." aria-label="Recipient's username">
                                    </form>
                                </div>
                            </li>
                           

                            <li class="dropdown notification-list">
                                <a class="nav-link dropdown-toggle nav-user arrow-none mr-0" data-toggle="dropdown" href="#" role="button" aria-haspopup="false"
                                    aria-expanded="false">
                                    <span class="account-user-avatar"> 
                                        <img src="assets/images/users/avatar-1.jpg" alt="user-image" class="rounded-circle">
                                    </span>
                                    <span>
                                        <span class="account-user-name">Dominic Keller</span>
                                        <span class="account-position">Founder</span>
                                    </span>
                                </a>
                                <div class="dropdown-menu dropdown-menu-right dropdown-menu-animated topbar-dropdown-menu profile-dropdown">
                                    <!-- item-->
                                    <div class=" dropdown-header noti-title">
                                        <h6 class="text-overflow m-0">Welcome !</h6>
                                    </div>
                                    <!-- item-->
                                    <a href="javascript:void(0);" class="dropdown-item notify-item">
                                        <i class="mdi mdi-logout mr-1"></i>
                                        <span>Logout</span>
                                    </a>

                                </div>
                            </li>

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
                                            <li class="breadcrumb-item"><a href="javascript: void(0);">Hyper</a></li>
                                            <li class="breadcrumb-item"><a href="javascript: void(0);">eCommerce</a></li>
                                            <li class="breadcrumb-item active">Orders</li>
                                        </ol>
                                    </div>
                                    <h4 class="page-title">Orders</h4>
                                </div>
                            </div>
                        </div>     
                        <!-- end page title --> 

                        <div class="row">
                            <div class="col-12">
                                <div class="card">
                                    <div class="card-body">
                                        <div class="row mb-2">
                                            <div class="col-lg-8">
                                                <form class="form-inline">
                                                    <div class="form-group mb-2">
                                                        <label for="inputPassword2" class="sr-only">Search</label>
                                                        <input type="search" class="form-control" id="inputPassword2" placeholder="Search...">
                                                    </div>
                                                  
                                                </form>                            
                                            </div>
                                            <div class="col-lg-4">
                                                <div class="text-lg-right">
                                                     <button type="button" class="btn btn-light mb-2">Export</button>
                                                </div>
                                            </div><!-- end col-->
                                        </div>
                
                                        <div class="table-responsive">
                                            <table class="table table-centered mb-0">
                                                 <thead class="thead-light"> 
                                                    <tr>
                                                        <!-- <th style="width: 20px;">
                                                            <div class="custom-control custom-checkbox">
                                                                <input type="checkbox" class="custom-control-input" id="customCheck1">
                                                                <label class="custom-control-label" for="customCheck1">&nbsp;</label>
                                                            </div>
                                                        </th> -->
                                                        
                                             			<th>first Name</th>
                                                        <th>last Name </th>
                                                         <th>email </th>
                                                         <th>telePhone</th>
                                                        <th>address </th>
                                                        <th>role </th>  
                                                        <th style="width: 125px;">Action</th>
                                                    </tr>
                                                </thead>
                                                <c:forEach var="client" items="${clients }">
                                                
                                                 <c:url var="updateLink" value="/manage/clientFormUpdate">
                                                <c:param name="clientId" value="${client.userId }"></c:param>
                                                </c:url>
                                                <c:url var="deleteLink" value="/manage/Clientdelete">
                                                <c:param name="clientId" value="${client.userId }"></c:param>
                                                </c:url>
                                                <tr>
                                                
                                                 
                                                <td>${client.firstName }</td>
                                                <td>${client.lastName }</td>
                                                 <td>${client.email }</td>
                                                <td>${client.telePhone }</td>
                                                <td>${client.address }</td> 
                                                <td>${client.role }</td> 
                                                
                                                 <td>
                                                <a href="${updateLink}">update</a>
                                                |
                                                 <a href="${deleteLink}"
                                                 onclick="if (!(confirm('Are you sure you want to delete this client ?')))return false">delete</a>
                                                </td> 
                                                </tr>
                                                
                                                </c:forEach>
                                                
                                            </table>
                                        </div>
                                    </div> <!-- end card-body-->
                                </div> <!-- end card-->
                            </div> <!-- end col -->
                        </div>
                        <!-- end row --> 
                        
                    </div> <!-- container -->

                </div> <!-- content -->

                <!-- Footer Start -->
                <footer class="footer">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-6">
                                <script>document.write(new Date().getFullYear())</script> © Hyper - Coderthemes.com
                            </div>
                            <div class="col-md-6">
                                <div class="text-md-right footer-links d-none d-md-block">
                                    <a href="javascript: void(0);">About</a>
                                    <a href="javascript: void(0);">Support</a>
                                    <a href="javascript: void(0);">Contact Us</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </footer>
                <!-- end Footer -->

            </div>

          


        </div>
        <!-- END wrapper -->


        


        <!-- bundle -->
        <script src="${js }/vendor.min.js"></script>
        <script src="${js }/app.min.js"></script>
        
    </body>

</html>
