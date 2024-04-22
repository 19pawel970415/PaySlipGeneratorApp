function choosePosition() {
    var positionSelect = document.getElementById("position");
    var selectedValue = positionSelect.value;
    var redirectUrl;

    switch(selectedValue) {
        case "java_developer":
            redirectUrl = "register_java";
            break;
        case "python_developer":
            redirectUrl = "register_python";
            break;
        case "csharp_developer":
            redirectUrl = "register_csharp";
            break;
        case "cpp_developer":
            redirectUrl = "register_cpp";
            break;
        case "frontend_developer":
            redirectUrl = "register_frontend";
            break;
        case "database_analyst":
            redirectUrl = "register_database";
            break;
        default:
            break;
    }

    if (redirectUrl) {
        window.location.href = redirectUrl;
    }
}