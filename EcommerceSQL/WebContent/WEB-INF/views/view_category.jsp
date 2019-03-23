<%@ page import="java.util.List,javax.servlet.http.HttpServletResponse,com.ecommerce.models.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Categories</title>
</head>
<body>
	<%
		List<Category> cList = (List<Category>) response.getAttribute("CategoryList");
	%>

</body>
</html>