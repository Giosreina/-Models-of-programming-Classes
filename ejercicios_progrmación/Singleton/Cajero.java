package Singleton;

public class Cajero {
    private static Cajero instancia;
    private int idCajero;
    private double saldo;

    private Cajero() {
        this.idCajero = 1;
    }
    public static Cajero getInstancia() {
        if (instancia == null) {
            instancia = new Cajero();
        }
        return instancia;
    }
    public int getNumeroDeCajero() {
        return idCajero;
    }
    public void setNumeroDeCajero(int idCajero) {
        this.idCajero = idCajero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
