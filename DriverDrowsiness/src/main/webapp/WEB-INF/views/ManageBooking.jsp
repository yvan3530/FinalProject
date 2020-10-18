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
		<form:form class="form-horizontal" modelAttribute="booking" 
		action="${contextRoot }/manage/bookings"
		method="POST">
		
		<div class="form- group">
		<label class="control-label col-md-4" for="origin">A</label>
		<div class="col-md-8">
		
		 <form:input type="text" path="origin" id="origin" placeholder="coutry,city, port" class="form-control"/> 
		 <form:errors path="origin" cssClass="help-block" element="em"/>
		
		</div>
		
		</div>
		<div class="form- group">
		<label class="control-label col-md-4" for="from">loadDate</label>
		<div class="col-md-8">
		
		<form:input type="text" path="loadDate" id="loadDate" placeholder="load Date" class="form-control"/>
		 <%-- <form:errors path="loadDate" cssClass="help-block" element="em"/> --%>
		
		</div>
		
		</div>
		<div class="form-group">
		<label class="control-label col-md-4 " for="typeOfShipment">type of shipment</label>
		<div class="col-md-8">
		<form:select class="form-control" id="typeOfShipment" path="typeOfShipment">
<%-- 		 <form:errors path="typeOfShipment" cssClass="help-block" element="em"/>
 --%>	<form:option value="1">FULL CONTAINER LOAD</form:option>
		<form:option value="2">LESS CONTAINER LOAD</form:option>
		<form:option value="3">>BULK & BREAK BULK</form:option>
		
		</form:select>
		
		</div>
		</div>
		<div class="form- group">
		
		<div class="col-md-offset-4 col-md-8">
		
		<input type="submit" name="submit" id="submit" value="book" class="btn btn-primary"/>
		
		<form:hidden path="Id"/>
		<form:hidden path="code"/>
		<form:hidden path="clientId"/>
		</div>
		
		</div>
		
		</form:form>
		
		</div>
		
		</div>
		</div>
	
	</div>






</div>