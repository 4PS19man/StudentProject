<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <title>Student List</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 800px;
            margin: 50px auto;
            background-color: #ffffff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
            color: #007bff;
            margin-bottom: 20px;
            font-size: 28px;
        }
        .info {
            font-size: 18px;
            margin: 10px 0;
            padding: 10px;
            background-color: #f1f1f1;
            border-left: 4px solid #007bff;
            border-radius: 4px;
        }
        .info span {
            font-weight: bold;
            color: #333;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Student List</h1>
    <p class="info"><span>Student Name:</span> <%= request.getAttribute("studentName") %></p>
    <p class="info"><span>Phone Number:</span> <%= request.getAttribute("Phonenumber") %></p>
    <p class="info"><span>Address:</span> <%= request.getAttribute("address") %></p>
</div>

</body>
</html>