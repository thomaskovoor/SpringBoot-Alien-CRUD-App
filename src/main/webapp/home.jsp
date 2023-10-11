<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alien</title>
</head>
<body>
Insert Alien
<form action="addAlien" method="post" th:object="${alien}">

<label for="fname">Alien Name:</label><br>
  <input type="text" id="fname" name="alienName" ><br>
  <label for="lname">Planet:</label><br>
  <input type="text" id="lname" name="alienPlanet" ><br><br>
  <input type="submit" value="Submit">
</form>

<br>
<br>
Get Alien Details
<form action="getAlien" method="get">
<label for="fname">Search by Id:</label><br>
  <input type="text"  name="alienId" ><br>
<input type="submit" value="Submit">
</form>

Delete Alien
<form action="removeAlien" method="get">
<label for="fname">Delete by Id:</label><br>
  <input type="text" id="fname" name="alienId" ><br>
<input type="submit" value="Submit">
</form>

Update Alien
<form action="updateAlien" method="post" th:object="${alien}">
 <label for="lname">Id:</label><br>
<input type="text"  name="alienId" ><br>
  <label for="lname">Name:</label><br>
<input type="text"  name="alienName" ><br>
  <label for="lname">Planet:</label><br>
  <input type="text"  name="alienPlanet" ><br><br>
  <input type="submit" value="Submit">
</form>
</body>
</html>