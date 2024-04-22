<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign in</title>
    <link rel="stylesheet" href="/resources/static/css/stylesSignin.css">
</head>
<body>
<a href="index" class="home-icon">&#127968;</a>
<div class="container">
    <h1>Welcome back!</h1>
    <div class="form-container">
        <form action="/login" method="post">
            <input type="text" name="username" placeholder="Username" required><br>
            <input type="password" name="password" placeholder="Password" required><br>
            <input type="submit" value="Sign in">
        </form>
    </div>
</div>
</body>
</html>
