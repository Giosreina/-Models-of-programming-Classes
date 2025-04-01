
import Singleton.Cajero;


public class Cliente {
    public static void main (String args[]){
        Cajero cajero0 = Cajero.getInstancia();

        cajero0.setNumeroDeCajero(1);
        System.out.println("El número de cajero es: " + cajero0.getNumeroDeCajero());
    }
}