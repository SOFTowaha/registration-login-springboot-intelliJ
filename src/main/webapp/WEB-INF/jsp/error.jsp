<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
  "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Error Reported</title>
<link rel="stylesheet" href="resources/css/style.css" type="text/css" />
</head>

<body>
	<div class="container">
		<br /> <br /> <br />
		<div class="span6 offset3 center">
			<span class="alert alert-error"> An internal server error occurred.Please try again later.
			 </span> <br /> <br /> 
				<a href="${pageContext.request.contextPath}/login.jsp">Homepage</a>
		</div>
	</div>
</body>
</html>