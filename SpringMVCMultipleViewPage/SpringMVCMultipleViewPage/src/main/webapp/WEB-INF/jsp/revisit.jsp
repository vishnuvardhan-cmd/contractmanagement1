
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
    body{
    background-image :linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)), url(https://image.shutterstock.com/image-photo/grunge-blue-painted-on-cement-260nw-572697082.jpg);
    height:100vh;
    background-size: cover;
    background-position: center;
   
}
#status{
margin-left: 50px;
}
</style>
<body>
<center><h1><font color="azure">Revisit Page</font></h1></center>
<center>

<form action="revisitdata" method="post">
<label> <font color="azure">Requirement Id : </font></label><input type="text" name="requirementid" required/><br><br>
<label><font color="azure">Status : </font></label><input type="text" name="status" id="status" required/><br><br>
<input type="submit"/>
</form>
</center>
<center><h1><font color="azure">${msg}</font></h1></center>

</body>
</html>
