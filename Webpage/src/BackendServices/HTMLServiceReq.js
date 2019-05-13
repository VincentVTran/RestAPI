    function clicked() {
        var request = new XMLHttpRequest();
        request.open("GET","http://localhost:8080/test")
        request.onreadystatechange = function(){
            if(request.readyState === 4 && request.status ===200){
                console.log(request.response)
            }
        }
        request.onload = function() {
            document.getElementById("result").textContent = request.responseText
        }
        request.send()
        console.log("Worked")
    }

    