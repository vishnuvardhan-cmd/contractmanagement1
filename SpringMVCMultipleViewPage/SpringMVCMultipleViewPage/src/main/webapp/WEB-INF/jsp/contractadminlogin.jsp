<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Contract Management</title>
		
	</head>
	<style>
body
{
margin: 0;
padding: 0;
  background-color:#0044cc;
  background-image :linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)), url(https://image.shutterstock.com/image-photo/grunge-blue-painted-on-cement-260nw-572697082.jpg);



background-size: cover;
font-family: sans-serif;
}
.title
{
text-align:center;
padding:50px 0 20px;
}
.title h1
{
margin: 0;
padding: 0;
  color: #262626;
text-transform: uppercase;
font-size: 36px;
}
.container
{
border-radius: 25px;
width: 50%;
height: 400px;
background: #fff;
margin: 0 auto;
border: 2px solid #fff;
box-shadow: 0 15px 40px rgba(0,0,0,.5);
}
.container .left
{
border-radius: 25px;
float: left;
width: 50%;
height: 400px;
background-image: url(https://www.nextlevelpurchasing.com/wp-content/uploads/2019/03/contract-management.jpg);

background-size: cover;
box-sizing: border-box;
}
.container .right
{
border-radius: 25px;
float: right;
width: 50%;
height: 400px;
box-sizing: border-box;
}
.formBox
{
border-radius: 25px;
width: 100%;
padding: 80px 40px;
box-sizing:border-box;
height:400px;
background: #fff;

}
.formBox p
{
margin:0;
padding: 0;
font-weight: bold;
color: #191970;

border-radius: 25px;
}
.formBox input
{
margin-bottom: 4px;
}
.formBox input[type="text"],
.formBox input[type="password"]
{
text-align: center;
border-bottom: 2px solid black;
border-radius: 15px;
outline: none;
height: 30px;
}
.formBox input[type="text"]:focus,
.formBox input[type="password"]:focus
{
border-bottom: 2px solid #262626;
}
.formBox input[type="submit"]
{
text-align: center;
border: 2px solid;
border-radius: 25px;
outline: none;
height: 30px;
width: 140px;
color: #fff;
background: limegreen;
cursor: pointer;
}
.formBox input[type="submit"]:hover
{
background: #a6af13;
}
.formBox a
{
color: #262626;
font-size: 12px;
font-weight: bold;
}


</style>
	<body>
	<center>
	<div class="title"><h1><font color="azure">Contract Management</font></h1></div>
	<div class="container">
		<div class="left"></div>
		<div class="right">
		<div class="formBox">
		<form action="contractdata" method="post">
			<center><p><font size="4">UserId</p></font></center>
			<center><input type="text" name="id" placeholder="Enter your userid"></center><br>
			<center><p><font size="4">Password</p></font></center>
			<center><input type="password" id="password" name="password" placeholder="Enter your password"></center><br>
  			<center><input type="submit" name="submit" value="Sign In"><br></center>
			<center><font size="3px"><a href="#">Forget Password?</a></font><br></center>
			<br><center><P> Not Registered?</P></center>
			<center><font size="3px"><a href="contract">Register</a></font><br></center>

		</form>
	</div>
	</div>
</div>
</center>
</body>
</html>