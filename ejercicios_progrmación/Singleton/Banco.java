package Singleton;
import java.util.ArrayList;
import java.util.List;

public class Banco{
    private static Banco instancia;
    private final List<Cajero> cajeros;
    private Cajero cajero;
    private int saldo;

    private Banco() {
        this.cajeros = new ArrayList<>();
        this.cajero = Cajero.getInstancia();
        this.saldo = 1_000_000;
    }
    public static Banco getInstancia() {
        if (instancia == null) {
            instancia = new Banco();
        }
        return instancia;
    }
    public List<Cajero> getCajeros(int cantidad) {
        int saldoCajero = saldo/cantidad;
        for (int i = 0; i < cantidad; i++) {
            cajero.setNumeroDeCajero(i);
            cajero.setSaldo(saldoCajero);
            Cajero cajero1 = Cajero.getInstancia();
            cajeros.add(cajero1);
        }
        return cajeros;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public int getSaldo() {
        return saldo;
    }
}