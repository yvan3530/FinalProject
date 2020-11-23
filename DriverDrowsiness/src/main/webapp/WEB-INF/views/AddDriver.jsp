<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>


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

		<div class="col-md-6 col-md-offset-3">

			<div class="panel panel-primary">

				<div class="panel-heading">
					<h4>Sign Up - driver</h4>
				</div>

				<div class="panel-body">

					<sf:form class="form-horizontal" modelAttribute="driver"
						action="${contextRoot }/manage/drivers" method="POST">


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
							<label class="control-label col-md-4">PassPort Number</label>
							<div class="col-md-8">
								<sf:input type="text" path="passPortNumber" class="form-control"
									placeholder="XXXXXXXXXX" maxlength="10" />

								<sf:errors path="passPortNumber" cssClass="help-block" element="em" />


							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-4">driving License</label>
							<div class="col-md-8">
								<sf:input type="text" path="drivingLicense" class="form-control"
									placeholder="XXXXXXXXXX" maxlength="10" />

								<sf:errors path="drivingLicense" cssClass="help-block" element="em" />


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


						<sf:hidden path="role" value="DRIVER" />


						<div class="form- group">

							<div class="col-md-offset-4 col-md-8">

								<input type="submit" name="submit" id="submit" value="addDriver"
									class="btn btn-primary" />

								<sf:hidden path="UserId" />



							</div>

						</div>

					</sf:form>
				</div>
			</div>
		</div>
	</div>


</div>