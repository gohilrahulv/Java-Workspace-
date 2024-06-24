<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Profile</title>
    <link rel="stylesheet" href="<c:url value='/static/css/styles.css'/>">
</head>
<body>
    <h1>Profile</h1>
    <p>Username: ${user.username}</p>
    <p>Email: ${user.email}</p>
    <p>Profile Picture: <img src="<c:url value='/uploads/${user.profilePicture}'/>" alt="Profile Picture"></p>
    <p><a href="change-password">Change Password</a></p>
    <p><a href="logout">Logout</a></p>
</body>
</html>
