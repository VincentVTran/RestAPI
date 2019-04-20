
function clicked() {
    var request = new XMLHttpRequest;
    request.open("GET","http://localhost:8080/test")
    request.onload = function() {

    }
    request.send()
    console.log("Worked")
}