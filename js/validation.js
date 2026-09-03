function validateForm() {
    const email = document.getElementById('email').value;
    const phone = document.getElementById('phone').value;
    if (!email.includes('@')) {
        alert("Invalid email");
        return false;
    }
    if (phone.length < 10) {
        alert("Phone must be 10 digits");
        return false;
    }
    return true;
}

function validateLogin() {
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;
    if (username === "admin" && password === "admin123") {
        alert("Admin Login Successful");
        window.location.href = "dashboard.html";
        return false;
    } else {
        alert("Use admin / admin123");
        return false;
    }
}