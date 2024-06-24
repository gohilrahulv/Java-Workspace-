<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
    <title>Signup</title>
    <script src="<c:url value='/static/js/validation.js'/>"></script>
    <link rel="stylesheet" href="<c:url value='/static/css/styles.css'/>">
</head>
<body>
    <form action="signup" method="post" enctype="multipart/form-data" onsubmit="return validateSignup()">
        <div>
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
        </div>
        <div>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
        </div>
        <div>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
        </div>
        <div>
            <label for="profilePicture">Profile Picture:</label>
            <input type="file" id="profilePicture" name="profilePicture">
        </div>
        <div>
            <button type="submit">Signup</button>
        </div>
    </form>
</body>
</html>
