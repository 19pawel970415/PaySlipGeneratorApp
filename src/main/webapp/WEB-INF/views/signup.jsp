<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
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

        input[type="submit"],
        button {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover,
        button:hover {
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
    <h1>Welcome to Pay Slip Generator!</h1>
    <h1>Choose your position</h1>
    <div class="form-container">
        <form id="registrationForm">
            <select id="position" onchange="redirect()">
                <option value="" disabled selected>Select Position</option>
                <option value="java_developer">Java Developer</option>
                <option value="python_developer">Python Developer</option>
                <option value="csharp_developer">C# Developer</option>
                <option value="cpp_developer">C++ Developer</option>
                <option value="frontend_developer">Front-end Developer</option>
                <option value="database_analyst">Database Analyst</option>
            </select>
            <button type="button" onclick="choosePosition()">OK</button>
        </form>
    </div>
</div>

<script>
    function choosePosition() {
        var positionSelect = document.getElementById("position");
        var selectedValue = positionSelect.value;
        var redirectUrl;

        switch(selectedValue) {
            case "java_developer":
                redirectUrl = "register_java";
                break;
            case "python_developer":
                redirectUrl = "register_python";
                break;
            case "csharp_developer":
                redirectUrl = "register_csharp";
                break;
            case "cpp_developer":
                redirectUrl = "register_cpp";
                break;
            case "frontend_developer":
                redirectUrl = "register_frontend";
                break;
            case "database_analyst":
                redirectUrl = "register_database";
                break;
            default:
                break;
        }

        if (redirectUrl) {
            window.location.href = redirectUrl;
        }
    }
</script>

</body>
</html>
