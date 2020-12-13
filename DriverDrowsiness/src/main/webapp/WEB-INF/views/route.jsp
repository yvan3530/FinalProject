<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="container">


	<div class="row">

		<c:if test="${not empty message }">



			<div class="col-xs-12">

				<div class="alert alert-success alert-dismissible">
					<button type="button" class="close" data-dismiss="alert">&times;</button>


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
					<form:form class="form-horizontal" modelAttribute="route"
						action="/DriverDrowsiness/manage/addroute" method="POST">
						
						<form:hidden path="id" />

						<div class="form- group">
							<label class="control-label col-md-4" for="origin">departTime</label>
							<div class="col-md-8">
								<form:input type="date" path="departTime" id="origin"
									placeholder="departTime" class="form-control" />
								<form:errors path="departTime" cssClass="help-block"
									element="em" />

							</div>

						</div>
						<div class="form- group">
							<label class="control-label col-md-4" for="from">arrivalTime</label>
							<div class="col-md-8">


								<form:input type="date" path="arrivalTime" id="arrivalTime"
									placeholder="load Date" class="form-control" />
								

							</div>

						</div>

						<div class="form- group">
							<label class="control-label col-md-4" for="from">departLocation</label>
							<div class="col-md-8">

								<form:input type="text" path="departLocation"
									id="departLocation" placeholder="load Date"
									class="form-control" />
								<form:errors path="departLocation" cssClass="help-block"
									element="em" />

							</div>

						</div>
						
						<div class="form- group">
							<label class="control-label col-md-4" for="from">status</label>
							<div class="col-md-8">

								<form:input type="text" path="status"
									id="status" placeholder="status"
									class="form-control" />
								<form:errors path="status" cssClass="help-block"
									element="em" />

							</div>

						</div>

						<div class="form- group">
							<label class="control-label col-md-4" for="from">arrivalLocation</label>
							<div class="col-md-8">

								<form:input type="text" path="arrivalLocation"
									id="arrivalLocation" placeholder="load Date"
									class="form-control" />
								<form:errors path="arrivalLocation" cssClass="help-block"
									element="em" />

							</div>

						</div>

						<div class="form-group">
							<label class="control-label col-md-4" for="truck">Select
								truck: </label>
							<div class="col-md-8">
								<form:select class="form-control" id="truck"
									path="truck.truckId" items="${truckes}" itemLabel="plate"
									itemValue="truckId" />


							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4" for=driver>Select
								driver: </label>
							<div class="col-md-8">
								<form:select class="form-control" id="driver"
									path="driver.userId" items="${drivers}" itemLabel="firstName"
									itemValue="userId" />


							</div>
						</div>
						<div class="form- group">

							<div class="col-md-offset-4 col-md-8">

								<input type="submit" name="submit" id="submit" value="addroute"
									class="btn btn-primary" />

								



							</div>

						</div>

					</form:form>

				</div>

			</div>
		</div>

	</div>






</div>