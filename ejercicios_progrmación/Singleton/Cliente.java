package Singleton;
import java.util.*;
public class Cliente {
    public static void main (String args[]){
        Cajero cajero = Cajero.getInstancia();
        List<Cajero> cajeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            cajero.setNumeroDeCajero(i);
            Cajero cajero1 = Cajero.getInstancia();
            cajeros.add(cajero1);
            System.out.println("IdCajero: " + cajero1.getNumeroDeCajero());
        }
    }
}