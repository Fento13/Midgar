// Por id del html
document.getElementById("titulo");

// Por clase del html
document.getElementsByClassName("texto");

// Por etiqueta
document.getElementsByTagName("p");

// Con que QuerySelector (más flexible, estilo CSS)
let titulo = document.querySelector("#titulo"); // por id
let texto = document.querySelector(".texto");  // por clase
let parrafo = document.querySelectorAll("p");    // todos los <p>

// Crear un nuevo elemento
let nuevoParrafo = document.createElement("p");
nuevoParrafo.textContent("Hola, soy un nuevo párrafo!");

// Agregar el nuevo elemento al DOM IMPORTANTE LO DE ESPEFICICAR BODY
document.body.appendChild(nuevoParrafo);

//Eliminar elemento
document.body.removeChild(nuevoParrafo);

alert(8);
window.alert(8);