package Bridge;
import java.util.*;

public class RecorridoDerechaIzquierda implements Recorrido{
    public void recorrer(List<Item> items){
        for (int i = 0 ; i < items.size(); i++){
            Item item = items.get(items.size()-i-1);
            System.out.println("Nombre: " + item.getNombre() + ", Tipo: " + item.getTipo() + ", Tamaño: " + item.getTamaño());
        }
    }
}
