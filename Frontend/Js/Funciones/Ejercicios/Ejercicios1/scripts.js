document.addEventListener("DOMContentLoaded", () =>{
    let texto = document.querySelector("#texto");
    const botonColor = document.getElementById("botonColor");
    const lista = document.getElementById("lista");
    const botonLista = document.getElementById("botonLista");
    const Usuario = document.getElementById("Usuario");
    const Contraseña = document.getElementById("Contraseña");
    const botonEnviar = document.getElementById("botonEnviar");
    const formulario = document.getElementById("formulario")
    let contador = 1;

    botonColor.addEventListener("click",() => {
    texto.style.color = "red";
    });

    botonLista.addEventListener("click", () => {
        const articulo = document.createElement("li");
        articulo.textContent = "Articulo" + (contador++);
        lista.appendChild(articulo);
    });

    formulario.addEventListener("submit", (e) => {
    e.preventDefault();

    if (Usuario.value.trim() === "") {
        alert("Usuario vacío");
        Usuario.focus();   // con paréntesis
        return;
    }
    
    if (Contraseña.value.trim() === "") {
        alert("Contraseña vacía");
        Contraseña.focus();  // con paréntesis
        return;
    }
    
    const mostrarUyC = document.createElement("p");
    mostrarUyC.textContent = `${Usuario.value} con contraseña ${Contraseña.value}`;
    document.body.appendChild(mostrarUyC);

    formulario.reset(); // limpia inputs
});

    })
