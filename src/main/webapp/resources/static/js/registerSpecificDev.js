function validatePassword() {
    var password = document.getElementById("password");
    var confirm_password = document.getElementById("confirm_password");

    if (password.value !== confirm_password.value) {
        confirm_password.classList.add("password-error");
        return false;
    } else {
        confirm_password.classList.remove("password-error");
        return true;
    }
}