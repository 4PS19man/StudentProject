<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <title>Faculty Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 600px;
            margin: 50px auto;
            background-color: #ffffff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }
        h3 {
            text-align: center;
            color: #007bff;
            margin-bottom: 20px;
            font-size: 24px;
        }
        .info {
            font-size: 18px;
            margin: 10px 0;
            color: #333;
        }
        .info span {
            font-weight: bold;
            color: #007bff; /* Blue color for labels */
        }
        p {
            padding: 10px;
            background-color: #f9f9f9;
            border-left: 4px solid #007bff;
            border-radius: 5px;
        }
        .info span {
            display: inline-block;
            width: 150px; /* Label width for alignment */
        }
    </style>
</head>
<body>

<div class="container">
    <h3>Faculty Details</h3>
    <p class="info"><span>Department:</span> <%=request.getAttribute("department") %></p>
    <p class="info"><span>Name:</span> <%=request.getAttribute("name") %></p>
    <p class="info"><span>Email:</span> <%=request.getAttribute("email") %></p>
    <p class="info"><span>Phone:</span> <%=request.getAttribute("phone") %></p>
</div>

</body>
</html>