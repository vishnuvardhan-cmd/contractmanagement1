<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contract Management</title>
</head>
<style>
*{
margin: 0;
padding: 0;
font-family: century gothic;
}
body {
    background-image :linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)), url(https://image.shutterstock.com/image-photo/grunge-blue-painted-on-cement-260nw-572697082.jpg);
    height:100vh;
    background-size: cover;
    background-position: center;
}

header{
background-image :linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)), url(https://image.shutterstock.com/image-photo/grunge-blue-painted-on-cement-260nw-572697082.jpg);

height:100vh;
background-size: cover;
background-position: center;
}
ul{
float:left;
list-style-type: none;
margin-top: 30px;
margin-left: 20px;
}
ul li{
display:inline-grid;
}

ul li a{
border-radius: 25px;
text-decoration: none;
color:#fff;
padding: 10px 20px;
border: 1px solid #fff;
transition: 0.06s ease;

}
 ul h1{
text-decoration: none;
color:azure;
margin-left: 450px;

}
ul h1:hover{
  background-color: #fff;
  color: azure;

 }

.title{
  position: absolute;
  top:50%;
  left:50%;
 
  transform: translate(-50%,-50%);
 }
 #submit{
 border-radius: 10px;
 height:30px;
 width:80px;
 }
 </style>
<body>
<center>
<li>
<h1><font color="azure"><b>Give report </b></font></h1><br><br>
<li>
<li><label><font color="azure"><b>Report For Contracts</b></font></label><li>
<li><a href="list"><font color="azure">contracts</font></a></li><br>
<textarea name="contract feedback" rows="7" cols="80"></textarea><br>
<br><li><input type=submit name=submit id="submit"><li><br><br>
<li><label><font color="azure"><b>Report For Proposals</b></font></label><li>
<li><a href="viewproposals"><font color="azure">Proposals</font></a></li><br>
<textarea name="proposal feedback" rows="7" cols="80"></textarea></center></center><br>
<center><li><input type=submit name=submit id="submit"><li></center>
</center>
</body>
</html>