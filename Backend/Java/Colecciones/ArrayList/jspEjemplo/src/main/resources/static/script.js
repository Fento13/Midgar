// Función para animar elementos cuando se envía el formulario
function animarFormulario() {
    const form = document.querySelector('form');
    const button = document.querySelector('button[type="submit"]');

    // Añadir animación al botón
    button.classList.add('bounce');

    // Remover la clase después de la animación
    setTimeout(() => {
        button.classList.remove('bounce');
    }, 600);
}

// Función para efectos dinámicos en la página de resultado
function efectosResultado() {
    const nombre = document.querySelector('span');
    if (nombre) {
        // Cambiar colores aleatoriamente
        const colores = ['#ff6b6b', '#4ecdc4', '#45b7d1', '#96ceb4', '#ffeaa7'];
        let index = 0;

        setInterval(() => {
            nombre.style.color = colores[index];
            index = (index + 1) % colores.length;
        }, 1000);

        // Efecto de aparición
        nombre.style.opacity = '0';
        nombre.style.transform = 'scale(0.5)';

        setTimeout(() => {
            nombre.style.transition = 'all 0.5s ease';
            nombre.style.opacity = '1';
            nombre.style.transform = 'scale(1)';
        }, 100);
    }
}

// Ejecutar cuando la página carga
document.addEventListener('DOMContentLoaded', function() {
    // Si estamos en la página de formulario
    const form = document.querySelector('form');
    if (form) {
        form.addEventListener('submit', animarFormulario);
    }

    // Si estamos en la página de resultado
    efectosResultado();
});
