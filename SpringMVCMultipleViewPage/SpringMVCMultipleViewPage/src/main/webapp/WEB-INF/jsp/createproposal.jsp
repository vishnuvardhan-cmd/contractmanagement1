
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
#proposalid{
  border-radius: 10px;
  width: 190px;
  height: 30px;  
 
}
#requirementid{
  border-radius: 10px;
  width: 190px;
  height: 30px;
 
}

#proposaldate {
 
  border-radius: 10px;
  width: 190px;
  height: 30px;  
}
#quotation {
  border-radius: 10px;
  width: 190px;
  height: 30px;  
}
h1{
  margin-top: 30px;
  margin-left:120px;
}

.block {
  border-radius: 5px;
  width: 100px;
  height: 30px;  
  margin-left:50px;
  background-color: green;
  margin-left: 160px;
}
</style>
</head>
<body>
<center>
 <form action="proposaldata" method="post">
 <table border='0' width='480px' cellpadding='0' cellspacing='0' align='center'>
    <center><tr><td><h1><font color="azure">  Create Proposal</font></h1></td></tr><center>
    <table border='0' width='480px' cellpadding='0' cellspacing='0' align='center'>
    <tr>
        <td align='center'><font color="azure"><label><B>Proposal ID:</B></label></font></td>
                 
          <td><input type="text" name="proposalid" id="proposalid"size="50" required/>  </td>  
    </tr>
    <tr> <td>&nbsp;</td> </tr>
    <tr>
        <td align='center'><font color="azure"><label><B>Requirement ID:</B></label></font></td>
             
          <td><input type="text" name="requirementid" id="requirementid" size="50" required/></td>
          </tr>
          <tr> <td>&nbsp;</td> </tr>

    <tr>
        <td align='center'><font color="azure"><label><B>Proposal Date:</B></label></font></td>
             
          <td><input type="text" name="proposaldate" id="proposaldate" rows="5" cols="100" required/>
      </td>
    </tr>
    <tr> <td>&nbsp;</td> </tr>
    <tr>
        <td align='center'><font color="azure"><label><B>Quotation:</B></label></font></td>    
          <td><input type="text" name="quotation" id="quotation" size="50" required>  
      </td>
    </tr>
    <tr> <td>&nbsp;</td> </tr>
    <tr>
      <td>
        <input type="submit" value="Submit"class="block">
      </td>
    </tr>
  </table>
</form>
</center>

</font>
<center><font color="azure"><h1>${msg}</h1></font></center>
</body>
</html>

