
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
 <!DOCTYPE html>
 <html>
 <head>
    <title></title>
 </head>
 <style>
    body{
    background-image :linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)), url(https://image.shutterstock.com/image-photo/grunge-blue-painted-on-cement-260nw-572697082.jpg);
    height:100vh;
    background-size: cover;
    background-position: center;
}
h1{
   margin-left:90px;

}
 </style>
 
 <body>
 
 
 <center><tr><td><h1><font color="azure">Requirement List</font></h1></td></tr><center><br><br>
<table align="center" border="2" width="70%" cellpadding="2">  
<tr><th><font color="azure">Requirement Id</font></th><th><font color="azure">Requirement Type</font></th><th><font color="azure">Requirement Description</font></th><th><font color="azure">Delivery Date</font></th></tr>  
   <c:forEach var="emp" items="${list}">  
   <tr>  
   <td align="center"><font color="azure">${emp.requirementid}</font></td>  
   <td align="center"><font color="azure">${emp.requirementtype}</font></td>  
   <td align="center"><font color="azure">${emp.requirementdescription}</font></td>  
   <td align="center"><font color="azure">${emp.date}</font></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
  </body>
 </html>
   