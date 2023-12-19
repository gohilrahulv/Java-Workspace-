<%@ page import="com.dao.Dao" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Change Password Process</title>
    <!-- Add your stylesheet link if needed -->
</head>
<body>

<%
    // Get the user email from the session
    HttpSession userSession = request.getSession(false);
    String userEmail = (String) userSession.getAttribute("userEmail");

    // Get the form parameters
    String oldPassword = request.getParameter("oldPass");
    String newPassword = request.getParameter("newPass");
    String confirmNewPassword = request.getParameter("confirmNewPass");
    
    // Check if new password matches confirm password
    if (newPassword != null && newPassword.equals(confirmNewPassword)) {
        // Call a method to verify the old password
        boolean isOldPasswordCorrect = Dao.verifyOldPassword(userEmail, oldPassword);

        if (isOldPasswordCorrect) {
            // Call a method to change the password in the database
            boolean passwordChanged = Dao.changePassword(userEmail, oldPassword, newPassword);

            if (passwordChanged) {
                out.println("<p>Password changed successfully!</p>");
                // Destroy session and go back to the login page
                userSession.invalidate();
                request.getRequestDispatcher("login.jsp").forward(request, response);
            } else {
                // Set the error message as an attribute
                request.setAttribute("changePasswordError", "Failed to change password. Please try again.");
            }
        } else {
            // Set the error message as an attribute
            request.setAttribute("changePasswordError", "Your old password is incorrect. Please try again.");
        }
    } else {
        // Set the error message as an attribute
        request.setAttribute("changePasswordError", "New password and confirm password do not match.");
    }

    // Forward to the changePassword.jsp page
    
%>

</body>
</html>
