<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Register as Python Developer</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f0f0f0;
      text-align: center;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      position: relative;
    }

    .container {
      width: 50%;
    }

    h1 {
      color: #333;
      text-align: center;
      margin-bottom: 20px;
    }

    .form-container {
      width: 300px;
      margin: 0 auto;
      background-color: #fff;
      padding: 20px;
      border-radius: 5px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    input[type="text"],
    input[type="password"],
    select {
      width: 100%;
      padding: 10px;
      margin: 10px 0;
      border: 1px solid #ccc;
      border-radius: 5px;
      box-sizing: border-box;
    }

    input[type="submit"] {
      width: 100%;
      padding: 10px;
      background-color: #4CAF50;
      color: #fff;
      border: none;
      border-radius: 5px;
      cursor: pointer;
    }

    input[type="submit"]:hover {
      background-color: #45a049;
    }

    .home-icon {
      position: absolute;
      top: 10px;
      right: 10px;
      font-size: 40px;
      color: #333;
      text-decoration: none;
    }

    .home-icon:hover {
      color: #f00;
    }

  </style>
</head>
<body>
<a href="index" class="home-icon">&#127968;</a>
<div class="container">
  <h1>Registration Page for Python Developer</h1>
  <div class="form-container">
    <form action="register_java" method="post">
      <input type="text" name="name" placeholder="Name" required><br>
      <input type="text" name="surname" placeholder="Surname" required><br>
      <input type="text" name="login" placeholder="Login" required><br>
      <input type="password" name="password" placeholder="Password" required><br>
      <input type="password" name="confirm_password" placeholder="Confirm Password" required><br>
      <input type="text" name="toolname" placeholder="Tool Name" required><br>
      <select name="experience" required>
        <option value="" disabled selected>Select Experience</option>
        <option value="JUNIOR">Junior</option>
        <option value="MID">Mid</option>
        <option value="SENIOR">Senior</option>
      </select><br>
      <input type="submit" value="Sign in">
    </form>
  </div>
</div>
</body>
</html>
