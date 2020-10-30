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

						<h4> ${registerModel.client.lastName}-${registerModel.client.firstName}</h4>

						<h5>Email: ${registerModel.client.email}</h5>

						<h5>Contact Number: ${registerModel.client.telePhone}</h5>

						<h5>Role: ${registerModel.client.address}</h5>
						<h5>Role: ${registerModel.client.role}</h5>
						<h5>Role: ${registerModel.client.password}</h5>

					</div>


				</div>
				<div class="panel-footer">
					<a href="${flowExecutionUrl}&_eventId_personal"
						class="btn btn-primary">Edit</a>

				</div>
			</div>

		</div>

		<!-- column to display the address  -->
		<div class="col-sm-6">

			<div class="panel panel-primary">
				<div class="panel-heading">
					<h4>Billing Address</h4>
				</div>
				<div class="panel-body">
					<div class="text-center">
			
						<h4>city: ${registerModel.billing.city}</h4>
						<h4>postCode: ${registerModel.billing.postCode}</h4>
						<h4>country: ${registerModel.billing.country}</h4>
					</div>
				</div>
				<div class="panel-footer">
					<!-- anchor to move to the edit of address -->
					<a href="${flowExecutionUrl}&_eventId_billing"
						class="btn btn-primary">Edit</a>
				</div>
			</div>

		</div>

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