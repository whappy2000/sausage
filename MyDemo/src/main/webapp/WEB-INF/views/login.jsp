<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Sign in</h2>
<s:url var="authUrl" value="/j_spring_security_check" />
<form method="post" class="signin" action="${authUrl}">
<fieldset>
<table cellspacing="0">
<tr>
<th><label for="username_or_email">User name</label></th>
<td><input id="username_or_email" name="j_username" type="text" /></td>
</tr>
<tr>
<th><label for="password">Password</label></th>
<td><input id="password" name="j_password" type="password" /></td>
</tr>
<tr><td colspan="2"><input name="submit" type="submit" value="Login" /></td></tr>
</table>
</fieldset>
</form>
</body>
</html>