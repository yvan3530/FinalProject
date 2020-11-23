<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>


<%@include file="../shared/flows-header.jsp"%>



<div class="row">

		<!-- column to display the personal details -->
		<div class="col-sm-6">

			<div class="panel panel-primary">
				<div class="panel-heading">
					<h4>Personal Details</h4>
				</div>
				<div class="panel-body">
							
					 <div class="text-center">

						<h4> ${driverModel.driver.lastName}-${driverModel.driver.firstName}</h4>

						<h5>Email: ${driverModel.driver.email}</h5>

						<h5>Contact Number: ${driverModel.driver.telePhone}</h5>

						<h5>Role: ${driverModel.driver.address}</h5>
						<h5>Role: ${driverModel.driver.passPortNumber}</h5>
						<h5>Role: ${driverModel.driver.drivingLicense}</h5>
						<h5>Role: ${driverModel.driver.role}</h5>
						<h5>Role: ${driverModel.driver.password}</h5>

					</div> 



				</div>
				<div class="panel-footer">
					<a href="${flowExecutionUrl}&_eventId_personal"
						class="btn btn-primary">Edit</a>

				</div>
			</div>

		</div>

		<!-- column to display the address  -->
		

	</div>

	<!-- to provide the confirm button after displaying the details -->
	<div class="row">
		<div class="col-sm-4 col-sm-offset-4">

			<div class="text-center">

				<a href="${flowExecutionUrl}&_eventId_submit"
					class="btn btn-primary">Confirm</a>

			</div>

		</div>
	</div>


<%@include file="../shared/flows-footer.jsp"%>
