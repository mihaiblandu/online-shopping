<div class="container">


	<div class="row">

		<div class="col-md-offset-2 col-md-8">

			<div class="panel panel-primary">

				<div class="panel-heading">

					<h4>Product Management</h4>

				</div>
			<div class="panel-body">
			<form class="form-horizontal" modelAttribute="product" >
						<div class="form-group">
							<label class="control-label col-md-4">Name</label>
							<div class="col-md-8">
								<input type="text" path="name" class="form-control"
									placeholder="Product Name" /> 
							</div>
						</div>
						
						<div class="form-group">
							<label class="control-label col-md-4">Brand</label>
							<div class="col-md-8">
								<input type="text" path="brand" class="form-control"
									placeholder="Brand Name" /> 
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Description</label>
							<div class="col-md-8">
								<textarea path="description" class="form-control"
									placeholder="Enter your description here!" >
									</textarea> 
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Unit Price</label>
							<div class="col-md-8">
								<input type="number" path="unitPrice" class="form-control"
									placeholder="Enter Unit Price" /> 
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4">Quantity</label>
							<div class="col-md-8">
								<input type="number" path="quantity" class="form-control"
									placeholder="Enter Quantity" /> 
							</div>
						</div>
			
			
			
			
			
			</div>
			</div>
		</div>
	</div>


</div>