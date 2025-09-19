/*Queremos escribir un programa que imprima dos números, los números de
vacas y pollos en una granja, con las palabras Vacas y Pollos después de ellos, y
ceros acolchados antes de ambos números para que siempre tengan tres dígitos
de largo */
function AcolcharConCeros(numero, amplitud){
    
    return String(numero).padStart(amplitud, '0');
}

function imprimirInventarioGranja(vacas, pollos, cerdos) {
    const contenedor = document.getElementById("granja");
    contenedor.innerHTML = ""; // Limpiar contenido previo

    const crearEtiqueta = (numero, animal) =>{
        const p = document.createElement("p");
        p.textContent = `${AcolcharConCeros(numero, 3)} ${animal}`;
        contenedor.appendChild(p);
    }

    crearEtiqueta(vacas, "Vacas");
    crearEtiqueta(pollos, "Pollos");
    crearEtiqueta(cerdos, "Cerdos");


}
imprimirInventarioGranja(7, 11, 9);