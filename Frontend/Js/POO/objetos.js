class Usuario {
    constructor(nombre, edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    saludar() {
        console.log("Hola, soy " + this.nombre);
    }
}

const u1 = new Usuario("Ana", 28);
u1.saludar(); // Muestra: Hola, soy Ana

class contador { 
    constructor() {
        this.valor = 0;
    }

    incrementar() {
        this.valor++;
    }

    mostrar() {
        console.log("Valor del contador " +this.valor);
    }
}

const c1 = new contador();
c1.incrementar();
c1.mostrar(); // Muestra: Valor del contador 1
c1.incrementar();
c1.incrementar();
c1.mostrar(); // Muestra: Valor del contador 3

class Alumno extends Usuario {
    constructor(nombre, edad, curso, asignaturas){
        super(nombre, edad);
        this.curso = curso;
        this.asignaturas = new Array(...asignaturas);
    }
}

const a1 = new Alumno("Luis", 22, "Ingeniería", ["Matemáticas", "Física", "Programación"]);
a1.saludar(); // Muestra: Hola, soy Luis
console.log(a1.curso); // Muestra: Ingeniería
console.log(a1.asignaturas); // Muestra: [ 'Matemáticas', 'Física', 'Programación' ]

