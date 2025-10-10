# Spring Boot
En Spring boot utilizaremos lo siguiente:

## @Controller
Marca la clase como un controlador web en Sprin Boot. Permite manejar solicitudes HTTP.

## @GetMapping("/")
Mapea la ruta raíz (http://localhost:8080), que muestra la vista del formulario.

## @PostMapping("/esultado") (cuando envías el formulario por POST) a la función procesarFormulario()
- Recibe el valor del campo nombre usado en @RequetParam("nombre").
- Agrega ese valor al modelo (model.addAtribute) para que esté disponible en la vista resultado.

## Flujo básico:
1. El usuario entra en la pagina principal: se muestra e formulario.
2. Rellena el campo nombre y lo envía.
3. El controlador recibe ese dato y lo pasa a la vista de resutlado, donde se muestra el nombre enviado.

## Conceptos clave

### Vista
En Spring Boot, una __vista__ a es la __representacion visual que ve el usuario__, normalmente en __HTML__. Se genera  usando __plantillas__ (como Thymeleaf o JSP) y __recibe los datos__ que __el controlador__ le pasa con __el modelo__.

## @RequestParam("nombre")
Esta anotacion indica que __esperas recibir un parametro del formulario__ llamado nombre. Spring automáticamente __toma el valo que le usuario escribió__ en el formulario y __lo asigna al parámetro del método del controlador__.

### Ejemplo
@PostMapping("/resultado)
public String procesar@RequestParam("nombre) String nombre{
 //nombre tendrá el valo qeu el usuario escribió   
}

## Model
El "modelo" en Spring Boot es una forma de __pasar datos__ desde el __controlador a la vista__. Cuando pones algo en el __modelo__, ese dato es __accesible__ en la plantilla HTML. Por ejemplo:
model.addAtribute("nombre", nombre);

## Thymeleaf
Thymeleaf es un motor de prantillas para Java, especialmente usado con Springboot, que permite crear páginas HTML dinamicas y amigables para el desarrollador.
Permite insertar datos Java directamente en la vista (HTML) usando una sintaxis sencilla, manteniendo a estructura HTML válida, y facilitando la integración entre backend y frontent.
- Thymeleaf traduce vaiables, bucles, condicionales y muchos más desde el backend a la pagina web que ve el usuario.
- Es alternativo a otros motores como JSP, Velocity, etc.

- Se usa normalmente creando archivos .html en la carpeta resources/templates.


## ¿Cómo se comunican estas capas?

### El usuario ve el frontend (vista):

Puede ser un formulario HTML.

Ejemplo: formulario.html con campos para llenar.

### Envía los datos (acción GET o POST):

- __GET__: Para __pedir__ información (por ejemplo, ver un formulario).

- __POST__: Para __enviar__ información (por ejemplo, enviar datos de un formulario).

### El controlador recibe la petición:

- @GetMapping: Atiende las __peticiones GET__ y normalmente __muestra vistas__.

- @PostMapping: Atiende __envíos de información (POST)__, la __procesa__ y puede __guardar datos, calcular algo, o mostrar la respuesta__..

### El modelo transfiere datos entre backend y vista:

1. El controlador pone los datos en el Model para pasárselos a la vista.

2. La vista muestra el resultado:

3. Usando los datos que le dio el controlador, genera HTML personalizado para el usuario.

### Ejemplo paso a paso (TODO JUNTO)
1. El usuario entra a la web:
GET → @GetMapping("/") → Controlador muestra el formulario (vista).

2. El usuario envía el formulario:
POST → @PostMapping("/resultado") → Controlador recibe el dato nombre, lo añade al modelo.

3. El controlador pasa el dato a la vista resultado:
La vista usa ${nombre} para mostrar el dato enviado por el usuario.

### Resumen rápido de cada parte
- __Vista___: Lo que ve el usuario (HTML generados con Thymeleaf/JSP).

- ___Controlador___: Recibe las peticiones del usuario y maneja la lógica de navegación.

- ___Modelo___: Sirve de "paquete" para mandar datos del backend a la vista.

- ___Backend___: Todo lo que no se ve: gestión de datos, lógica, accesos a bases de datos