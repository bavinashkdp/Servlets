var errMessage = "";

function checkForm() {
    validateName();
    validateSurname();
    carSelect();
    validateDOB();

    if (errMessage == "") {
    } else {
        alert(errMessage);
    }
}



function validateDOB()
{
    var dob = document.forms["ProcessInfo"]["txtDOB"].value;
    var pattern = /^([0-9]{2})-([0-9]{2})-([0-9]{4})$/;
    if (dob == null || dob == "" || !pattern.test(dob)) {
        errMessage += "Invalid date of birth\n";
        return false;
    }
    else {
        return true
    }
}