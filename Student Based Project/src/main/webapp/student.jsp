<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Dashboard</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .dashboard-header {
            text-align: center;
            margin-bottom: 30px;
        }
        .form-wrapper {
            display: flex;
            justify-content: center;
            gap: 20px; /* Space between the forms */
        }
        .dashboard-container {
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
            width: 300px;
            text-align: center;
        }
        h2 {
            margin-bottom: 20px;
        }
        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }
        button {
            padding: 10px 20px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            width: 100%;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

    <!-- Header: Welcome Message -->
    <div class="dashboard-header">
        <h1>Welcome to Student Dashboard</h1>
    </div>

    <!-- Form Wrapper: Two Forms Side by Side -->
    <div class="form-wrapper">
        <!-- First Form: View Profile -->
        <div class="dashboard-container">
            <h2>View Profile</h2>
            <form action="view-profile" method="GET">
                <label for="studentName">Enter Name</label>
                <input type="text" id="studentName" name="studentName" placeholder="Enter your name" required>
                <button type="submit">View Profile</button>
            </form>
        </div>

        <!-- Second Form: View Faculty -->
        <div class="dashboard-container">
            <h2>View Faculty</h2>
            <form action="view-faculty" method="GET">
                <label for="department">Enter Department</label>
                <input type="text" id="department" name="department" placeholder="Enter your department" required>
                <button type="submit">View Faculty</button>
            </form>
        </div>
    </div>

</body>
</html>