package Singleton;

public class Cajero {
    private static Cajero instancia;
    private int NumeroDeCajero;

    private Cajero(int NumeroDeCajero) {
        this.NumeroDeCajero = NumeroDeCajero;
    }
    public static Cajero getInstancia(int NumeroDeCajero) {
        if (instancia == null) {
            instancia = new Cajero(NumeroDeCajero);
        }
        return instancia;
    }
    public int getNumeroDeCajero() {
        return NumeroDeCajero;
    }
    public void setNumeroDeCajero(int NumeroDeCajero) {
        this.NumeroDeCajero = NumeroDeCajero;
    }
}
