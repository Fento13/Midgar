import java.time.LocalDate;

public class Ejercicio2_1 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Pérez", "Gómez", "12345678A", LocalDate.of(1990, 5, 15));
        Persona persona2 = new Persona("María", "López", "Martínez", "87654321B", LocalDate.of(1985, 8, 22));
        Persona persona3 = new Persona("Carlos", "Sánchez", "Ruiz", "11223344C", LocalDate.of(1992, 3, 10));
        
        Cuenta cuenta1 = new Cuenta("ES12345678901234567890", 1000.0, new Persona[]{persona1, persona2});
        Cuenta cuenta2 = new Cuenta("ES09876543210987654321", 500.0, new Persona[]{persona3});  
        Cuenta cuenta3 = new Cuenta("ES11223344556677889900", 200.0, new Persona[]{persona1});  

        for (Cuenta cuenta : new Cuenta[]{cuenta1, cuenta2, cuenta3}) {
            System.out.println(cuenta);
        }
        
            System.out.println("--------------------------------------------------");
            for (Persona persona : new Persona[]{persona1, persona2, persona3}) {
                System.out.println(persona);
            }
            
    cuenta1.ingresarDinero(500);                                                                                                                                                                                                                                                                                                                                                                                                        
    cuenta2.retirarDinero(10);
    cuenta1.transferirDinero(cuenta3, 100);
    }
}
