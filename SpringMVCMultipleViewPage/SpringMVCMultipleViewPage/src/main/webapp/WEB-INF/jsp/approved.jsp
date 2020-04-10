<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<style>
    body{
    background-image :linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)), url(https://image.shutterstock.com/image-photo/grunge-blue-painted-on-cement-260nw-572697082.jpg);
    height:100vh;
    background-size: cover;
    background-position: center;
   
}
h1{

}
</style>
<body>
<center><h1><font color="azure">Approval Page</font></h1></center>
<center><form action="approveddata" method="post">
<label> <font color="azure">Requirement Id: </font></label><input type="text" name="requirementid" required/><br><br>
<input type="submit"/>
</center>
</form>
<center><h1><font color="azure">${msg}</font></h1></center>
</body>
</html>
