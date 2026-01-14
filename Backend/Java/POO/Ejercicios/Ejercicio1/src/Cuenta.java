import java.util.Arrays;

public class Cuenta {
    private String numeroIdentificativo;
    private double saldo;
    private Persona[] titulares;
    private static final int MAX_TITULAREES = 3;
    
    public Cuenta() {
    }

    public Cuenta(String numeroIdentificativo, double saldo, Persona[] titulares) {
        this.numeroIdentificativo = numeroIdentificativo;
        this.saldo = saldo;
        this.titulares = titulares;
    }
    
    public static double ingresarCantidad(double cantidad, double saldoActual){
        if (cantidad > 0 ) {
            return saldoActual + cantidad;
        }
        return saldoActual;
    }

    public static double retirarCantidad(double cantidad, double saldoActual){
        if (cantidad > 0 ) {
            return saldoActual - cantidad;
        }
        return saldoActual;
    }

    public String getNumeroIdentificativo() {
        return numeroIdentificativo;
    }

    public void setNumeroIdentificativo(String numeroIdentificativo) {
        this.numeroIdentificativo = numeroIdentificativo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona[] getTitulares() {
        return titulares;
    }

    public void setTitulares(Persona[] titulares) {
        this.titulares = titulares;
    }

    @Override
    public String toString() {
        return "Cuenta [numeroIdentificativo=" + numeroIdentificativo + ", saldo=" + saldo + ", titulares="
                + Arrays.toString(titulares) + "]";
    }

    public static int getMaxTitularees() {
        return MAX_TITULAREES;
    }

    public static double Bizum(double cantidad, double saldoEmisor, Cuenta cuentaReceptor){
        if (cantidad > 0) {
            if (saldoEmisor >= cantidad) {
                double nuevoSaldoReceptor = cuentaReceptor.getSaldo() + cantidad;
                cuentaReceptor.setSaldo(nuevoSaldoReceptor);
                return saldoEmisor - cantidad;
            }
        }
        return saldoEmisor;
    }
}
