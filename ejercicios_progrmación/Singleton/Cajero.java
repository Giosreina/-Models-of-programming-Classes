package Singleton;

public class Cajero {
    private static Cajero instancia;
    private int idCajero;

    private Cajero() {
        this.idCajero = 0;
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
}
