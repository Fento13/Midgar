import java.util.Arrays;

public class Cuenta {
    private  String numeroIdentificativo;
    private double saldo;
    private Persona[] titulares;

    public Cuenta() {
    }

    public Cuenta(String numeroIdentificativo, double saldo, Persona[] titulares) {
        this.numeroIdentificativo = numeroIdentificativo;
        this.saldo = saldo;
        this.titulares = titulares;
    }

    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            
        }else{
            System.out.println("La cantidad a ingresar debe ser mayor a 0, por favo intentelo de nuevo ");
        }
    }

    public void retirarDinero( double cantidad) {
            if (cantidad > 0) {
                if (this.saldo >= cantidad) {
                    this.saldo -= cantidad;
                } else {
                    System.out.println("El saldo es insuficiente respeco a la cantidad de saldo que se quiere extraer...");

                }
            }
    }

    public void transferirDinero(Cuenta cuentaDestinatario, double cantidad){
        if (cantidad > 0) {
            if (this.saldo >= cantidad ) {
                this.retirarDinero(cantidad);
                cuentaDestinatario.ingresarDinero(cantidad);
            }
        }
    }

    @Override
    public String toString() {
        return "Cuenta [numeroIdentificativo=" + numeroIdentificativo + ", saldo=" + saldo + ", titulares="
                + Arrays.toString(titulares) + "]";
    }

}