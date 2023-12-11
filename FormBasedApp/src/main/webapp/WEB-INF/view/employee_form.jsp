

<%@ taglib prefix= "form" uri="http://www.springframework.org/tags/form" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Registration form</title>
</head>
<body>
	<form:form action="process form" modelAttribute="EmployeeModel">

		First Name :
		<form:input path="first_name" />
		<br>Last Name :
		<form :input path="Last_name" />
		<br> Department : HR
		<form :radiobuttom path="department" value="HR" />
		Admin
		<form: radiobutton path="department" value="Admin" />
		IT
		<form: radiobutton path="department" value="IT" />

		<br> Technologies: Excel
		<form : checkbox path="technologies" value=Excel />
		java
		<form : checkbox path="technologies" value=java />
		RDBMS
		<form : checkbox path="technologies" value=RDBMS />
		<br> <input type="submit" value="submit" />
		</form:form>
</body>
</html>