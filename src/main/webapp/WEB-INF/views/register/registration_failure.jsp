<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Failed</title>
    <link rel="stylesheet" href="/resources/static/css/stylesRegistrationFailure.css">
</head>
<body>
<%@ include file="../dynamic/home_icon.jspf" %>
<div class="container">
    <h1>Registration Failed</h1>
    <p>Login already used. Please try again with a different login.</p>
    <a href="signup" class="try-again-btn">Try Again</a>
</div>
</body>
</html>
