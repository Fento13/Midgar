import java.time.LocalDate;

public class Persona {
    private String nombe, primerApellido, segundoApellido, DNI;
    private LocalDate fechaNacimiento;
    

    public Persona(String nombe, String primerApellido, String segundoApellido, String dNI, LocalDate fechaNacimiento) {
        this.nombe = nombe;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        DNI = dNI;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona [nombe=" + nombe + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido
                + ", DNI=" + DNI + ", fechaNacimiento=" + fechaNacimiento + "]";
    }

    
}
