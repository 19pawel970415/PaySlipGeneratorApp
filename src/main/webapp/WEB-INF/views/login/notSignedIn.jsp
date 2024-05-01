<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Failed</title>
    <link rel="stylesheet" href="/resources/static/css/stylesNotSignin.css">
</head>
<body>
<%@ include file="../dynamic/home_icon.jspf" %>
<div class="container">
    <h1>Login Failed</h1>
    <p>Incorrect username or password. Please try again.</p>
    <a href="signin" class="try-again-btn">Try Again</a>
</div>
</body>
</html>
