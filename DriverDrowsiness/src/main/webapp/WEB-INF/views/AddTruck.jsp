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
		  <form:errors path="file" cssClass="help-block" element="em"/> --
		
		</div>
		
		</div>
	
		<div class="form- group">
		
		<div class="col-md-offset-4 col-md-8">
		
		<input type="submit" name="submit" id="submit" value="book" class="btn btn-primary"/>
		
		<form:hidden path="TruckId"/>
		<form:hidden path="StaffId"/>
		<form:hidden path="active"/>
		</div>
		
		</div>
		
		</form:form>
		
		</div>
		
		</div>
		</div>
	
	</div>


<div class="row">

	<div class="col-xs-12">
		<h3>Available Trucks</h3>

		<hr />
	</div>

	<div class="col-xs-12">

		<div style="overflow: auto">

			<table id="adminTruckTable"
				class="table table-striped table-bordered">


				<thead>
					<tr>
						<th>Id</th>
						<th>&#160;</th>
						<th>Plate</th>
						<th>Brand</th>
						<th>Kind</th>
						<th>Active</th>
						<th>Edit</th>
					</tr>
				</thead>

				<tbody>

					<tr>
						<td>9</td>
						<td><img class="adminDataTableImg"
							src="${contextRoot }/resources/images/RAA083W.jpg" alt="fiat" />

						</td>
						<td>RAA083W</td>
						<td>fiat</td>
						<td>single</td>
						<td><label class="switch"> <input type="checkbox"
								checked="checked" value="9" />
								<div class="slider"></div>

						</label></td>
						<td><a href="${contextRoot }/manage/9/truck"
							class="btn btn-warning"> <span
								class="glyphcon glyphicon-pencil"></span>


						</a></td>
					</tr>


					<tr>
						<td>9</td>
						<td><img class="adminDataTableImg"
							src="${contextRoot }/resources/images/RAA083W.jpg" alt="fiat" />

						</td>
						<td>RAA083W</td>
						<td>fiat</td>
						<td>single</td>
						<td><label class="switch"> <input type="checkbox"
								value="9" />
								<div class="slider"></div>

						</label></td>
						<td><a href="${contextRoot }/manage/9/truck"
							class="btn btn-warning"> <span
								class="glyphcon glyphicon-pencil"></span>


						</a></td>
					</tr>

				</tbody>

				<tfoot>
					<tr>
						<th>Id</th>
						<th>&#160;</th>
						<th>Plate</th>
						<th>Brand</th>
						<th>Kind</th>
						<th>Active</th>
						<th>Edit</th>
					</tr>
				</tfoot>

			</table>

		</div>

	</div>
</div>





</div>