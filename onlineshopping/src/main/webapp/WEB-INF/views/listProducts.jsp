<div class="container-fluid">
	<!-- Would be to display sidebar -->
	<div class="row">
		<%@include file="./shared/sidebar.jsp"%>
	
		<!-- Added breadcrumb component -->
		<div class="row">

			<div class="col-lg-6">

				<c:if test="${userClickAllProducts == true}">

					<script>
						window.categoryId = '';
					</script>

					<ol class="breadcrumb">


						<li><a href="${contextRoot}/home">Home</a></li>
						<li class="active">All Products</li>


					</ol>
				</c:if>


				<c:if test="${userClickCategoryProducts == true}">
					<script>
						window.categoryId = '${category.id}';
					</script>

					<ol class="breadcrumb">


						<li><a href="${contextRoot}/home">Home</a></li>
						<li class="active">Category</li>
						<li class="active">${category.name}</li>


					</ol>
				</c:if>


			</div>



		<div class="container-fluid">

			<div>


				<table id="productListTable"
					class="table table-striped table-borderd">


					<thead>

						<tr>
							<th></th>
							<th>Name</th>
							<th>Brand</th>
							<th>Price</th>
							<th>Qty. Available</th>
							<th>description</th>
							<th></th>
						</tr>

					</thead>


					<tfoot>

						<tr>
							<th></th>
							<th>Name</th>
							<th>Brand</th>
							<th>Price</th>
							<th>Qty. Available</th>
							<th>description</th>

						</tr>

					</tfoot>
				</table>

			</div>

		</div>


	</div>
</div>