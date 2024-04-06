<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pay Slip Generator</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background-color: #f0f0f0; /* tło strony */
        }

        .container {
            text-align: center;
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
        }

        .title {
            font-size: 2.5rem;
            margin-bottom: 20px;
            color: #333;
        }

        .btn {
            display: inline-block;
            padding: 10px 20px;
            background-color: #4CAF50; /* kolor tła przycisków */
            color: white;
            text-decoration: none;
            font-size: 1.2rem;
            margin: 0 10px;
            border-radius: 5px;
            transition: background-color 0.3s;
            border: none; /* usuwa obramowanie przycisków */
            cursor: pointer; /* zmienia kształt kursora na podstawie stanu przycisku */
            outline: none; /* usuwa domyślny kontur po kliknięciu przycisku */
        }

        .btn:hover {
            background-color: #45a049; /* zmiana koloru tła przycisków po najechaniu myszką */
        }
    </style>
</head>
<body>

<div class="container">
    <h1 class="title">Pay Slip Generator</h1>
    <button class="btn" onclick="location.href='signin'">Sign in</button>
    <button class="btn" onclick="location.href='signup'">Sign up</button>
</div>

</body>
</html>
