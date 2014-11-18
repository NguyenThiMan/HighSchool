<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Đăng nhập</title>
<style type="text/css">
body {
	background-color: white;
	font-family: Arial, Helvetica, sans-serif;
	padding: 0;
	margin: 0;
	font-size: 12px;
	color: #000;
}

.loginform {
	padding: 20px;
	background: #F0FFFF;
	width: 380px;
	height: 120px;
	margin-left: auto;
	margin-right: auto;
	margin-top: 100px;
}

.loginform_row {
	width: 380px;
	float: left;
	clear: both;
	margin: 0 0 10px 0;
}

.loginform_row label {
	width: 100px;
	float: left;
	padding: 5px 0 0px 0;
	font-size: 12px;
	color: #535E66;
	font-weight: bold;
	text-shadow: 1px 1px #fff;
	text-align: left;
}

.loginform_input {
	width: 250px;
	height: 34px;
	float: left;
	padding: 0px 0px 0 4px;
	background-color: #F4F6F7;
	border: 1px #90A9B7 solid;
	color: #000;
	-moz-border-radius: 4px;
	-webkit-border-radius: 4px;
	border-radius: 4px;
}

input.loginform_submit {
	float: right;
	clear: both;
	margin-right: 25px;
	color: #fff;
	background: #7dc44e;
	-moz-border-radius: 4px;
	-webkit-border-radius: 4px;
	border-radius: 4px;
	font-family: arial;
	font-size: 12px;
	font-weight: bold;
	padding: 8px 15px;
	text-align: center;
	cursor: pointer;
	border: none;
	text-shadow: 1px 1px #4c9021;
}
</style>
</head>
<body>
	<div class="loginform">

		<div class="loginform_row">
			<label>Tên đăng nhập:</label> <input type="text"
				class="loginform_input" name="" />
		</div>
		<div class="loginform_row">
			<label>Mật khẩu:</label> <input type="text" class="loginform_input"
				name="" />
		</div>
		<div class="loginform_row">
			<input type="submit" class="loginform_submit" value="Đăng nhập" />
		</div>
		<div class="clear"></div>

	</div>
</body>
</html>