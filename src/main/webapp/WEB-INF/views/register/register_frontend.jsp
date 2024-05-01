<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register as Front-end Developer</title>
    <link rel="stylesheet" href="/resources/static/css/stylesSignupSpecificDev.css">
</head>
<body>
<%@ include file="../dynamic/home_icon.jspf" %>
<div class="container">
    <h1>Registration Page for Front-end Developer</h1>
    <div class="form-container">
        <form action="/register_frontend" method="post" onsubmit="return validatePassword()">
            <%@ include file="../dynamic/register_form_content.jspf" %>
        </form>
    </div>
</div>
<script src="/resources/static/js/registerSpecificDev.js"></script>
</body>
</html>
