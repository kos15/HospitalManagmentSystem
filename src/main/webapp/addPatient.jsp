<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Patient</title>
</head>
<body>
<h2>Add Patient</h2>
<form action="/patient" method="post" modelAttribute="Patient">
	Patient Id<input type="text" name="patientId" value="" required><br>
	Patient Name<input type="text" name="patientName" value="" required><br>
	Age<input type="text" name="age" value="" required><br>
	Date Of Admission<input type="text" name="doa" value="" required><br>
	Type Of Bed<input type="text" name="typeOfBed" value="" required><br>
	Address<input type="text" name="address" value="" required><br>
	City<input type="text" name="city" value="" required><br>
	State<input type="text" name="state" value="" required><br>
	Status<input type="text" name="status" value="" required><br>
	<input type="submit" name="submit" value="submit">
</form>
</body>
</html>