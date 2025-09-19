// Función tradicional
function flecha (a){
  return a + 100;
}

// Desglose de la función flecha

// 1. Elimina la palabra "function" y coloca la flecha entre el argumento y el corchete de apertura.
(a) => {
  return a + 100;
}

// 2. Quita los corchetes del cuerpo y la palabra "return" — el return está implícito.
(a) => a + 100;

// 3. Suprime los paréntesis de los argumentos
a => a + 100;

console.log(flecha(50));
console.log((a) => {
  return a + 100;
});
console.log((a) => a + 100);
console.log(a => a + 100);
