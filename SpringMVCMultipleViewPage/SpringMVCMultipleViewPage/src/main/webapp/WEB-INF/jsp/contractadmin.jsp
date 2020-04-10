<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
   
</head>
<style>
body{
    background-image :linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)), url(https://image.shutterstock.com/image-photo/grunge-blue-painted-on-cement-260nw-572697082.jpg);
    height:100vh;
    background-size: cover;
    background-position: center;
}
#supplogin {
  border-radius: 9px;
  width: 160px;
  height: 30px;  
}
#fname {
  border-radius: 9px;
  width: 160px;
  height: 30px;  
}
#lname {
  border-radius: 9px;
  width: 160px;
  height: 30px;  
}

#age {
  border-radius: 10px;
  width: 160px;
  height: 30px;  
}
#gender {
  border-radius: 10px;
  width: 160px;
  height: 30px;  
}

#contactnumber {
  border-radius: 10px;
  width: 160px;
  height: 30px;  
}
#supplierid {
  border-radius: 10px;
  width: 160px;
  height: 30px;  
}
#password {
  border-radius: 10px;
  width: 160px;
  height: 30px;  
}
#REGISTER {
  border-radius: 5px;
  width: 100px;
  height: 30px;  
  margin-left:50px;
}


</style>

    <body>
    <form action="contractform" method="post"/>
       <table border='0' width='480px' cellpadding='0' cellspacing='0' align='center'>
            <center><tr><td><h1><font color="azure">Contractor Registraion Form</font></h1></td></tr><center>
 
        <table border='0' width='480px' cellpadding='0' cellspacing='0' align='center'>
                <tr>
                    <td align='center'><font color="azure"><B>First Name:</B></font></td>
                    <td><input style= type="text" name="fname" id="fname" placeholder="Enter your firstname" required></td>
                </tr>
            <tr> <td>&nbsp;</td> </tr>
            <tr>
                <td align='center'><font color="azure"><b>Last Name:</b></font></td>
                <td><input type="text" name="lname" id="lname" placeholder="Enter your lastname" required></td>
            </tr>
            <tr> <td>&nbsp;</td> </tr>
            <tr>
                <td align='center'><font color="azure"><b>Age:</b></font></td>
                <td><input type='number' name='age' id="age" placeholder="Enter your age" required></td>
            </tr>
            <tr> <td>&nbsp;</td> </tr>
            <tr>
                <td align='center'><font color="azure"><b>Gender:</b></font></td>
                <td><input type='text' name='gender' id="gender" placeholder="Gender" required></td>
            </tr>
            <tr> <td>&nbsp;</td> </tr>
            <tr>
                <td align='center'><font color="azure"><b>Mobile Number:</b></font></td>
                <td><input type="text" name="contactnumber" id="contactnumber" placeholder="Enter your Mobile Number" pattern="[987]{1}[0-9]{9}" required></td>
            </tr>
            <tr> <td>&nbsp;</td> </tr>
            <tr>  
                <td align='center'><font color="azure"><b>Supplier Id:</b></font></td>
                <td><input type="text" name="supplierid" id="supplierid" placeholder="Enter supplier id" required></td>
            </tr>
            <tr> <td>&nbsp;</td> </tr>
            <tr>
                <td align='center'><font color="azure"><b>password:</b></font></td>
                <td><input type="password" id="password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must
                contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" placeholder="Enter your password" required></td>
            </tr>

            <tr> <td>&nbsp;</td> </tr>
                    <table border='0' cellpadding='0' cellspacing='0' width='480px' align='center'>
                <tr>
                    <td align='center'><input type='submit' name='REGISTER' id="REGISTER" value="Register"></td><br>
                </tr>
                <td>&nbsp;</td>
                <tr>
                    <td align='center'><a href="contractlogin"><font color="azure">sign in</font></a></td>
                </tr>
        </table>
</form>  
       
<center><font color="azure"><h1>${msg}</h1></font></center>
</body>
</html>
