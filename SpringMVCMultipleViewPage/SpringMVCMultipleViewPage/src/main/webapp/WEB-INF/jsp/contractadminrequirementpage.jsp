
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {
    background-image :linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)), url(https://image.shutterstock.com/image-photo/grunge-blue-painted-on-cement-260nw-572697082.jpg);
    height:100vh;
    background-size: cover;
    background-position: center;
}
#Requirementid{
  border-radius: 10px;
  width: 190px;
  height: 30px;  
 
}
#Requirementtype{
  border-radius: 10px;
  width: 190px;
  height: 30px;
 
}

#Requirementdescription {
 
  border-radius: 10px;
  width: 190px;
  height: 90px;  
}
#Deliverydate {
  border-radius: 10px;
  width: 190px;
  height: 30px;  
}

.block {
  border-radius: 5px;
  width: 100px;
  height: 30px;  
  margin-left:50px;
  background-color: green;
  margin-left: 160px;
}
h1{
  margin-left:90px;
}
</style>
</head>
<body>
<center>


 <form action="requirementdata" method="post">  
    <table border='0' width='480px' cellpadding='0' cellspacing='0' align='center'>
    <center><tr><td><h1><font color="azure">  Requirement Form</font></h1></td></tr><center>
    <table border='0' width='480px' cellpadding='0' cellspacing='0' align='center'>
    <tr>
        <td align='center'><font color="azure"><label><B>Requirement ID:</B></label></font></td>
        <td><input type="text" name="Requirementid" id="Requirementid" size="50" required/></td>
    </tr>
    <tr> <td>&nbsp;</td> </tr>
    <tr>
        <td align='center'><font color="azure"><label><B>Requirement Type:</B></label></font></td>
        <td><input type="text" name="Requirementtype" id="Requirementtype" size="50" required/></td>
    </tr>
    <tr> <td>&nbsp;</td> </tr>
    <tr>
        <td align='center'><font color="azure"><label><B>Requirement Discription:</B></label></font></td>
        <td><textarea name="Requirementdescription" id="Requirementdescription" rows="5" cols="100" required></textarea></td>
    </tr>
    <tr> <td>&nbsp;</td> </tr>
    <tr>
        <td align='center'><font color="azure"><label><B>Expected Delivery:</B></label></font></td>
        <td><input type="text" name="Deliverydate" id="Deliverydate" size="50" required></td>
    </tr>
    <tr> <td>&nbsp;</td> </tr>
    <tr>
      <td align="center"><input type="submit" value="Submit"class="block"></td>
  </tr>
</table>
</form>
</center>

</font>
<center><font color="azure"><h1>${msg}</h1></font></center>
</body>
</html> 

