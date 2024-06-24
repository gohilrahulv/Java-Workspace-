function validateEmail(email) {
    const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return re.test(email);
}

function validatePassword(password) {
    // Password must contain at least 8 characters, one uppercase letter, one lowercase letter, one number and one special character
    const re = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;
    return re.test(password);
}

function checkEmailAvailability(email) {
    let available = false;
    $.ajax({
        url: 'check-email',
        type: 'POST',
        async: false,
        data: { email: email },
        success: function(response) {
            available = response.available;
        }
    });
    return available;
}

function validateSignup() {
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;

    if (!validateEmail(email)) {
        alert('Invalid email format');
        return false;
    }

    if (!validatePassword(password)) {
        alert('Password must contain at least 8 characters, one uppercase letter, one lowercase letter, one number, and one special character');
        return false;
    }

    if (!checkEmailAvailability(email)) {
        alert('Email is already in use');
        return false;
    }

    return true;
}

function validateLogin() {
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;

    if (!validateEmail(email)) {
        alert('Invalid email format');
        return false;
    }

    if (password.length < 8) {
        alert('Password must be at least 8 characters long');
        return false;
    }

    return true;
}

function validateForgotPassword() {
    const email = document.getElementById('email').value;

    if (!validateEmail(email)) {
        alert('Invalid email format');
        return false;
    }

    // Check if the email is registered
    let registered = false;
    $.ajax({
        url: 'check-email',
        type: 'POST',
        async: false,
        data: { email: email },
        success: function(response) {
            registered = response.registered;
        }
    });

    if (!registered) {
        alert('Email is not registered');
        return false;
    }

    return true;
}
