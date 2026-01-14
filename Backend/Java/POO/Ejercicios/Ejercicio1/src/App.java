public class App {
    public static void main(String[] args)  {
        Persona[] personas = new Persona[3];
        personas[0] = new Persona("Juan", "Pérez", "Gómez",
                "12345678A", null);
        personas[1] = new Persona("María", "López", "Martínez",
                "87654321B", null);
        personas[2] = new Persona("Luis", "Sánchez", "Rodríguez",
                "11223344C", null);
        Cuenta[] cuentas = new Cuenta[3];
        
        cuentas[0] = new Cuenta("1", 12, personas);
        cuentas[1] = new Cuenta("2", 1000, personas);
        cuentas[2] = new Cuenta("3", 500, personas);
        mostrarCuentas(cuentas);
    }

    public static void mostrarCuentas(Cuenta[] cuentas){
        for (Cuenta cuenta : cuentas) {
            System.out.println("Cuenta:" + cuenta.toString());
        }
    } 
}
