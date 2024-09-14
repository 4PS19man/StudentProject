<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <title>Administrator Dashboard</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            text-align: center;
        }
        h1 {
            color: black;
            margin-top: 50px;
            font-size: 36px;
        }
        .container {
            margin: 0 auto;
            padding: 20px;
            max-width: 800px;
        }
        a {
            text-decoration: none;
        }
        button {
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            padding: 15px 30px;
            font-size: 18px;
            cursor: pointer;
            margin: 10px;
            transition: background-color 0.3s ease;
        }
        button:hover {
            background-color: #0056b3;
        }
        button:active {
            background-color: #004080;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Welcome to Administrator Dashboard</h1>
    <a href="addform.jsp">
        <button>Create</button>
    </a>
    <a href="updateform.jsp">
        <button>Update</button>
    </a>
    <a href="deleteform.jsp">
        <button>Delete</button>
    </a>
</div>

</body>
</html>