<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <title>Student Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 800px;
            margin: 50px auto;
            background-color: #ffffff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.1);
        }
        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
        }
        .section {
            margin-bottom: 30px;
        }
        .section h3 {
            color: #007bff;
            margin-bottom: 10px;
            border-bottom: 2px solid #007bff;
            padding-bottom: 5px;
        }
        .info {
            font-size: 18px;
            margin: 10px 0;
        }
        .info span {
            font-weight: bold;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Student Details</h2>

    <div class="section">
        <h3>Personal Information</h3>
        <p class="info"><span>Student Name:</span> <%=request.getAttribute("studentName") %></p>
        <p class="info"><span>Phone Number:</span> <%=request.getAttribute("Phonenumber") %></p>
        <p class="info"><span>Address:</span> <%=request.getAttribute("address") %></p>
    </div>

    <div class="section">
        <h3>Academic Information</h3>
        <p class="info"><span>Department:</span> <%=request.getAttribute("Department") %></p>
        <p class="info"><span>Courses:</span> <%=request.getAttribute("courses") %></p>
        <p class="info"><span>Grades:</span> <%=request.getAttribute("grades") %></p>
        <p class="info"><span>Attendance:</span> <%=request.getAttribute("attendance") %></p>
    </div>
</div>

</body>
</html>