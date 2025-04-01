package Singleton;
import java.util.ArrayList;
import java.util.List;

public class Banco{
    private static Banco instancia;
    private final List<Cajero> cajeros;

    private Banco() {
        cajeros = new ArrayList<>();
    }

    public static Banco getInstancia() {
        if (instancia == null) {
            instancia = new Banco();
        }
        return instancia;
    }

    public void agregarCajero(int numeroCajero) {
        Cajero nuevoCajero = Cajero.getInstancia(numeroCajero);
        cajeros.add(nuevoCajero);
    }

    public List<Cajero> getCajeros() {
        return cajeros;
    }
    public void mostrarCajeros() {
        for (Cajero cajero : cajeros) {
            System.out.println("Cajero: " + cajero.getNumeroDeCajero());
        }
    }
}