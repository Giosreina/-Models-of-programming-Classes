package Singleton;
import java.util.*;
public class Banco {
    public static void main(String[] args) {
        List<Cajero> cajeros = new ArrayList<>();
        Cajero cajero1 = Cajero.getInstancia(1);
        Cajero cajero2 = Cajero.getInstancia(2);
        Cajero cajero3 = Cajero.getInstancia(3);

        System.out.println("Cajero 1: " + cajero1.getNumeroDeCajero());
        System.out.println("Cajero 2: " + cajero2.getNumeroDeCajero());
        System.out.println("Cajero 3: " + cajero3.getNumeroDeCajero());

        if (cajero1 == cajero2) {
            System.out.println("Los cajeros son la misma instancia.");
        } else {
            System.out.println("Los cajeros son diferentes instancias.");
        }
    }
}
