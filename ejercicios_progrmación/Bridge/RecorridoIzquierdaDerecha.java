package Bridge;
import java.util.*;
public class RecorridoIzquierdaDerecha implements Recorrido {
    public void recorrer(List<Item> items) {
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            System.out.println("Nombre: " + item.getNombre() + ", Tipo: " + item.getTipo() + ", Tamaño: " + item.getTamaño());
        }
    }
    
}
