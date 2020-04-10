
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
#contracttype{
margin-left: 30px;
}
#contractid{
margin-left: 50px;
}
#contractduriation{
margin-left: 40px;
}



</style>
<body>
<center><h1><font color="azure">Create Contract</font></h1></center>
<center>
<form action="contractdata1" method="post">
<label><font color="azure">ContractId:</font></label><input type="text" name="contractid" id="contractid" required/><br><br>
<label><font color="azure">ContractType:</font></label><input type="text" name="contracttype" id="contracttype" required/><br><br>
<label><font color="azure">ContractDuration:</font></label><input type="text" name="contractduration" id="contractduration" required/><br><br>
<input type="submit"/></form>
</center>

<center><h1><font color="azure">${msg}</font></h1></center>

</body>
</html>

</html>
