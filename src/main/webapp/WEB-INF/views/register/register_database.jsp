<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Register as Database Analyst</title>
  <link rel="stylesheet" href="/resources/static/css/stylesSignupSpecificDev.css">
</head>
<body>
<a href="index" class="home-icon">&#127968;</a>
<div class="container">
  <h1>Registration Page for Database Analyst</h1>
  <div class="form-container">
    <form action="/register_database" method="post" onsubmit="return validatePassword()">
      <input type="text" name="name" placeholder="Name" required><br>
      <input type="text" name="surname" placeholder="Surname" required><br>
      <input type="text" name="login" placeholder="Login" required><br>
      <input type="password" name="password" id="password" placeholder="Password" required><br>
      <input type="password" name="confirm_password" id="confirm_password" placeholder="Confirm Password" required onkeyup="validatePassword()"><br>
      <input type="text" name="toolname" placeholder="Tool Name" required><br>
      <select name="experience" required>
        <option value="" disabled selected>Select Experience</option>
        <option value="JUNIOR">Junior</option>
        <option value="MID">Mid</option>
        <option value="SENIOR">Senior</option>
      </select><br>
      <input type="submit" value="Sign up">
    </form>
  </div>
</div>
<script src="/resources/static/js/registerSpecificDev.js"></script>
</body>
</html>
