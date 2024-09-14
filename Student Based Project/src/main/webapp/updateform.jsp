<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <title>Student Information Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        h1 {
            text-align: center;
            color: #007bff;
        }
        form {
            background-color: #fff;
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h2 {
            color: #007bff;
            border-bottom: 2px solid #007bff;
            padding-bottom: 10px;
        }
        label {
            display: block;
            margin: 15px 0 5px;
            font-weight: bold;
        }
        input, select, textarea {
            width: 100%;
            padding: 10px;
            margin: 5px 0 20px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        button {
            background-color: #007bff;
            color: white;
            border: none;
            padding: 15px 20px;
            font-size: 16px;
            cursor: pointer;
            border-radius: 5px;
            width: 100%;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<h1>Student Information Form</h1>

<form action="updateaction" method="POST">
    <!-- Personal Information Section -->
    <h2>Personal Information</h2>

    <label for="name">Full Name</label>
    <input type="text" id="name" name="name" required>

    <label for="Phonenumber">Phone Number</label>
    <input type="tel" id="Phonenumber" name="Phonenumber" required>

    <label for="address">Address</label>
    <textarea id="address" name="address" rows="4" required></textarea>
     <h2>Academic Information</h2>

    <label for="Department">Department</label>
     <input type="text" id="department" name="department" required>


    <label for="courses">Courses Enrolled</label>
    <input type="text" id="courses" name="courses" required>

    <label for="grades">Grades (A-F)</label>
    <input type="text" id="grades" name="grades" maxlength="2" required>

    <label for="attendance">Attendance (%)</label>
    <input type="number" id="attendance" name="attendance" min="0" max="100" step="0.01" required>

    <button type="submit">Submit</button>
</form>

</body>
</html>