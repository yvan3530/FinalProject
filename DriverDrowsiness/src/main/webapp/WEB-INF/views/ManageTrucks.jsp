<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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