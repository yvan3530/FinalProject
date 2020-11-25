<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<%@include file="../shared/flows-header.jsp"%>
<div class="container">

	<div class="row">

		<div class="col-md-6 col-md-offset-3">

			<div class="panel panel-primary">

				<div class="panel-heading">
					<h4>Sign Up - driver</h4>
				</div>

				<div class="panel-body">

					<sf:form method="POST" class="form-horizontal" id="registerForm"
						modelAttribute="staff">


						<div class="form-group">
							<label class="control-label col-md-4"> first Name</label>
							<div class="col-md-8">
								<sf:input type="text" path="firstName" class="form-control"
									placeholder="first Name " />

								<sf:errors path="firstName" cssClass="help-block" element="em" />

							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4"> last Name</label>
							<div class="col-md-8">
								<sf:input type="text" path="lastName" class="form-control"
									placeholder="last Name" />

								<sf:errors path="lastName" cssClass="help-block" element="em" />

							</div>
						</div>


						<div class="form-group">
							<label class="control-label col-md-4">address</label>
							<div class="col-md-8">
								<sf:input type="text" path="address" class="form-control"
									placeholder="address" />

								<sf:errors path="address" cssClass="help-block" element="em" />

							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Contact Number</label>
							<div class="col-md-8">
								<sf:input type="text" path="telePhone" class="form-control"
									placeholder="XXXXXXXXXX" maxlength="10" />

								<sf:errors path="telePhone" cssClass="help-block" element="em" />


							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">nationalID</label>
							<div class="col-md-8">
								<sf:input type="text" path="nationalID" class="form-control"
									placeholder="XXXXXXXXXX" maxlength="16" />

								<sf:errors path="nationalID" cssClass="help-block"
									element="em" />


							</div>
						</div>
						

						<div class="form-group">
							<label class="control-label col-md-4">Email</label>
							<div class="col-md-8">
								<sf:input type="text" path="email" class="form-control"
									placeholder="abc@zyx.com" />

								<sf:errors path="email" cssClass="help-block" element="em" />

							</div>
						</div>





						<div class="form-group">
							<label class="control-label col-md-4">password</label>
							<div class="col-md-8">
								<sf:input type="password" path="password" class="form-control"
									placeholder="enter the password" />

								<sf:errors path="password" cssClass="help-block" element="em" />

							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Confirm Password</label>
							<div class="col-md-8">
								<sf:input type="password" path="confirmPassword"
									class="form-control" placeholder="enter the Re-enter password" />

								<sf:errors path="confirmPassword" cssClass="help-block"
									element="em" />

							</div>
						</div>


						<sf:hidden path="role" value="ADMIN" />


						<div class="form-group">
							<div class="col-md-offset-4 col-md-8">
								<button type="submit" class="btn btn-primary"
									name="_eventId_confirm">

									Next - Success <span class="glyphicon glyphicon-chevron-left"></span>

								</button>

							</div>
						</div>

					</sf:form>
				</div>
			</div>
		</div>
	</div>


</div>

<%@include file="../shared/flows-footer.jsp"%>