<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Patient</title>
</head>
<body>

	<h2>View Patient</h2>

	<form action="/patient">
		Patient ID *<input type="text" name="id" value=""><br>
		<input type="submit" style="color:green"><br><br>
	</form>
	
	Patient Name		<input type="text" name="id" value="${patient.getPatientName() }"><br>
	Age					<input type="text" name="id" value="${patient.getAge() }"><br>
	Date Of Addmission	<input type="text" name="id" value="${patient.getDoa() }"><br>
	Type Of Bed			<input type="text" name="id" value="${patient.getTypeOfBed() }"><br>
	Address				<input type="text" name="id" value="${patient.getAddress() }"><br>
	City				<input type="text" name="id" value="${patient.getCity() }"><br>
	State				<input type="text" name="id" value="${patient.getState() }"><br>
	Status				<input type="text" name="id" value="${patient.getStatus() }"><br>
</body>
</html>