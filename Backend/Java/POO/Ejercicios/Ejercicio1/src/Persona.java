import java.time.LocalDate;

public class Persona {
    private String nombre, primerApellido, segundoApellido, DNI;
    private LocalDate fechaNacimiento;
   
    public Persona() {
    }

    public Persona(String nombre, String primerApellido, String segundoApellido, String dNI,
            LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        DNI = dNI;
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
