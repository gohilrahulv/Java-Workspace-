<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Change Password</title>
    <script src="<c:url value='/static/js/validation.js'/>"></script>
    <link rel="stylesheet" href="<c:url value='/static/css/styles.css'/>">
</head>
<body>
    <form action="change-password" method="post" onsubmit="return validateChangePassword()">
        <div>
            <label for="currentPassword">Current Password:</label>
            <input type="password" id="currentPassword" name="currentPassword" required>
        </div>
        <div>
            <label for="newPassword">New Password:</label>
            <input type="password" id="newPassword" name="newPassword" required>
        </div>
        <div>
            <button type="submit">Change Password</button>
        </div>
    </form>
</body>
</html>
