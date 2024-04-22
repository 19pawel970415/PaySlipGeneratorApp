<%@ page import="com.example.payslipgenerator.service.PaySlipGeneratorService" %>
<%@ page import="com.example.payslipgenerator.model.Employee" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome back</title>
    <link rel="stylesheet" href="/resources/static/css/stylesLoggedin.css">
</head>
<body>
<a href="index" class="logout-icon">&#128274;</a>
<h1></h1>
<%
    String username = request.getParameter("username");

    Employee employee = PaySlipGeneratorService.generatePaySlipForEmployee(username);

    if (employee != null) {
        String[] paySlipData = employee.generatePaySlip();
%>
<h1>Welcome back <%= username %></h1>
<article>
    <div class="box">
        <h2>Here is your payslip!</h2>
        <table>
            <tr>
                <th>Name</th>
                <td><%= paySlipData[0] %> <%= paySlipData[1] %></td>
            </tr>
            <tr>
                <th>Position</th>
                <td><%= paySlipData[2] %></td>
            </tr>
            <tr>
                <th>Experience</th>
                <td><%= paySlipData[3] %></td>
            </tr>
            <tr>
                <th>Salary</th>
                <td><%= paySlipData[4] %></td>
            </tr>
        </table>
    </div>
</article>
<%
} else {
%>
<div class="error-message">
    <p>No such user.</p>
</div>
<%
    }
%>
</body>
</html>
