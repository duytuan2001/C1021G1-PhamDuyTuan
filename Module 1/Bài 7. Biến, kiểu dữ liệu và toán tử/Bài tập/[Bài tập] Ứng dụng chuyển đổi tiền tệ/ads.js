function showMessage(){
    let n= document.getElementById("t1").value;
    let a= document.getElementById("a"). value;
    let b= document.getElementById("b"). value;

    if(a=="vnd" && b=="usd"){
        result = n/23000
        document.getElementById("re").innerText=result;
    } else if (a=="usd" && b=="vnd"){
        result = n*23000
        document.getElementById("re").innerText=result;
    }
    else if (a=="vnd" && b=="vnd" ){
        result = n*1
        document.getElementById("re").innerText=result;
    }
    else {
        result = n*1
        document.getElementById("re").innerText=result;

    }

}
