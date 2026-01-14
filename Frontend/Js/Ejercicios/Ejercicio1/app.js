let sexoCSS = document.querySelector("#sexo");
let colorCSS = document.querySelector("#color");

function cambiarSexo() {
    if (sexoCSS.innerText == "Hombre") {
        sexoCSS.innerText = "Mujer";
        sexoCSS.style.fontSize = "20px";

    } else if (sexoCSS.innerText == "Mujer") {
        sexoCSS.innerText = "Hombre";
        sexoCSS.style.fontSize = "10px";
    }
}

function cambiarColor() {
    if (colorCSS.innerText == "Rojo") {
        colorCSS.innerText = "Verde";
        colorCSS.style.fontSize = "25px";
        colorCSS.style.backgroundColor = "green";
    } else if (colorCSS.innerText == "Verde") {
        colorCSS.innerText = "Rojo";
        colorCSS.style.fontSize = "15px";
        colorCSS.style.backgroundColor = "white";
    }
}