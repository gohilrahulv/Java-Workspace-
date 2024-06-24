<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
    <title>Login</title>
    <script src="<c:url value='/static/js/validation.js'/>"></script>
    <link rel="stylesheet" href="<c:url value='/static/css/styles.css'/>">
</head>
<body>
    <form action="login" method="post" onsubmit="return validateLogin()">
        <div>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
        </div>
        <div>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
        </div>
        <div>
            <button type="submit">Login</button>
        </div>
    </form>
</body>
</html>
