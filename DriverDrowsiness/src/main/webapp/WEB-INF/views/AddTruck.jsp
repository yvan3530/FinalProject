<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div class="container">


	<div class="row">
	
	<c:if test="${not empty message }">
	
	
	
	<div class="col-xs-12">
	
	<div class="alert alert-success alert-dismissible">
	<button type ="button" class="close" data-dismiss="alert">&times;</button>
	
	
	${message}
	</div>
	
	</div>
	</c:if>
		<div class="com-md-offset-2 col-md-8">
		
		<div class="panel panel-primary">
		
		<div class="panel-heading">
		
		<h4>Booking Management</h4>
		
		</div>
		<div class="panel-body">
		<form:form class="form-horizontal" modelAttribute="truck" 
		action="${contextRoot }/manage/addtrucks"
		method="POST" enctype="multipart/form-data">
		
		<div class="form- group">
		<label class="control-label col-md-4" for="kind">kind</label>
		<div class="col-md-8">
		
		 <form:input type="text" path="kind" id="kind" placeholder="enter kind of truck" class="form-control"/> 
		 <form:errors path="kind" cssClass="help-block" element="em"/>
		
		</div>
		
		</div>
		<div class="form- group">
		<label class="control-label col-md-4" for="plate">plate</label>
		<div class="col-md-8">
		
		<form:input type="text" path="plate" id="plate" placeholder="enter the plate" class="form-control"/>
		  <form:errors path="plate" cssClass="help-block" element="em"/> --
		
		</div>
		
		</div>
		
			<div class="form- group">
		<label class="control-label col-md-4" for="brand">brand</label>
		<div class="col-md-8">
		
		<form:input type="text" path="brand" id="brand" placeholder="enter the truck brand" class="form-control"/>
		  <form:errors path="brand" cssClass="help-block" element="em"/> --
		
		</div>
		
		</div>
		
		<!-- File element for image upload -->
		<div class="form- group">
		<label class="control-label col-md-4" for="file">Select an Image</label>
		<div class="col-md-8">
		
		<form:input type="file" path="file" id="file" class="form-control"/>
		  <form:errors path="plate" cssClass="help-block" element="em"/> --
		
		</div>
		
		</div>
	
		<div class="form- group">
		
		<div class="col-md-offset-4 col-md-8">
		
		<input type="submit" name="submit" id="submit" value="book" class="btn btn-primary"/>
		
		<form:hidden path="TruckId"/>
		<form:hidden path="driverId"/>
		<form:hidden path="active"/>
		</div>
		
		</div>
		
		</form:form>
		
		</div>
		
		</div>
		</div>
	
	</div>






</div>