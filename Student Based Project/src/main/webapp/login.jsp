<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .login-container {
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
            width: 300px;
        }
        h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
        input[type="text"],
        input[type="password"],
        select {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }
        .login-btn {
            width: 100%;
            padding: 10px;
            background-color: #28a745;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }
        .login-btn:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>

<div class="login-container">
    <h2>Login</h2>
    <form id="loginForm" action="/submit-login" method="POST" onsubmit="handleLogin(event)">
        <label for="username">Username</label>
        <input type="text" id="username" name="username" placeholder="Enter your username" required>

        <label for="password">Password</label>
        <input type="password" id="password" name="password" placeholder="Enter your password" required>

        <label for="role">Select Role</label>
        <select id="role" name="role" required>
            <option value="">-- Select Role --</option>
            <option value="student.jsp">Student</option>
            <option value="faculty.jsp">Faculty Member</option>
            <option value="administrator.jsp">Administrator</option>
        </select>

        <button type="submit" class="login-btn">Login</button>
    </form>
</div>

<script>
    function handleLogin(event) {
        event.preventDefault(); // Prevent the default form submission

        // Get the selected role
        var selectedRole = document.getElementById("role").value;

        if (!selectedRole) {
            alert("Please select a role before submitting.");
            return;
        }

       
        window.location.href = selectedRole;
    }
</script>

</body>
</html>
