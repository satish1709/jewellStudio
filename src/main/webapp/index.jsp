<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Jwell Techno</title>
</head>
<body>

	<div class="container-fluid col-8">
		<h1>Welcome to Jwell Techno</h1>
		<h2>Add Customer</h2>
	</div>


	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->


	<div class="container-fluid col-8">
		<form class="row g-3" action="api/customer" method="post">
			<div class="row g-3">

				<div class="col">
					<label for="fname" class="form-label">First Name</label> <input
						type="text" class="form-control" placeholder="First name"
						aria-label="First name" id="fname" name="first_name">
				</div>

				<div class="col">
					<label for="lname" class="form-label">Last Name</label> <input
						type="text" class="form-control" placeholder="Last name"
						aria-label="Last name" id="lname" name="last_name">
				</div>
			</div>

			<div class="col-md-6">
				<label for="phonen-number" class="form-label">Phone Number</label> <input
					type="text" class="form-control" id="phonen-number" name="phone_number">
			</div>

			<div class="col-12">
				<label for="inputAddress" class="form-label">Address</label> <input
					type="text" class="form-control" id="inputAddress"
					placeholder="Apt name Street Area"  name="area">
			</div>

			<div class="col-md-6">
				<label for="inputCity" class="form-label">City</label> <input
					type="text" class="form-control" id="inputCity"  name="city">
			</div>
			<div class="col-md-4">
				<label for="inputState" class="form-label">State</label> <select
					id="inputState" class="form-select"  name="state">
					<option selected>Choose...</option>
					<option>Maharashtra</option>
				</select>
			</div>
			<div class="col-md-2">
				<label for="inputZip" class="form-label">Zip Code</label> <input
					type="text" class="form-control" id="inputZip"  name="zip_code">
			</div>

			<div class="col-md-6">
				<label for="emailadd" class="form-label">Email</label> <input
					type="email" class="form-control" id="emailadd"   name="email">
			</div>
<!-- 
			<fieldset class="row mb-3 mt-3">
				<legend class="col-form-label col-sm-2 pt-0">Gender</legend>
				<div class="col-sm-10">
					<div class="form-check">
						<input class="form-check-input" type="radio" name="gridRadios"
							id="gridRadios1" value="option1" checked> <label
							class="form-check-label" for="gridRadios1"> Male </label>

					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="gridRadios"
							id="gridRadios2" value="option2"> <label
							class="form-check-label" for="gridRadios2"> Female </label>
					</div>
				</div>
			</fieldset>
 -->
			<div class="col-md-6">
				<label for="pan-card" class="form-label">Pan Card Number</label> <input
					type="text" class="form-control" id="pan-card"   name="pan_number">
			</div>

			<div class="row g-3">

				<div class="col">
					<label for="pan-card" class="form-label">Aadhar Card Number</label>
					<input type="text" class="form-control" id="pan-card"  name="aadhar_number">
				</div>

				<div class="col">
					<label class="form-label" for="inputGroupFile01">Upload
						Aadhar Card Photo</label> <input type="file" class="form-control"
						id="inputGroupFile01" name="aadhar_photo">
				</div>
			</div>

			<div class="col-12">
				<button type="submit" class="btn btn-primary">Add Customer</button>
			</div>
		</form>
	</div>
</body>
</html>