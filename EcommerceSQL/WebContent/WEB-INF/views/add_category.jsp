<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Category</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>

	<form action="AddCategory" method="post">
		<div class="form-group">
			<label for="name">Name:</label> <input type="text" name="name"
				class="form-control" id="name">
		</div>
		<div class="form-group">
			<label for="Designation">Designation:</label> <input type="text"
				name="designation" class="form-control" id="designation">
		</div>
		<div class="form-group">
			<label for="description">Description:</label> <input type="text"
				name="description" class="form-control" id="description">
		</div>
		<button type="submit" class="btn btn-primary">Add Category</button>
	</form>

</body>
</html>