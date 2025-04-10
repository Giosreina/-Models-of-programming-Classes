package Bridge;
import java.util.*;
public class Lonchera extends Contenedor {
    RecorridoDerechaIzquierda recorridoDerechaIzquierda = new RecorridoDerechaIzquierda();
    public Lonchera(List<Item>items) {
        this.items = items;
    }
    public void recorrer(List<Item> items){
        recorridoDerechaIzquierda.recorrer(items);
    }
    //Agregar un item a la lonchera
    @Override
    public void addItem(Item item) {
        this.items.add(item);

    }
    //Eliminar un item de la lonchera
    @Override
    public void removeItem(Item item) {
        this.items.remove(item);
    }
    //Establecer un item en la lonchera
    @Override
    public void setItem(Item item) {
        this.item = item;
    }
    //Obtener un item de la lonchera
    @Override
    public Item getItem() {
        return this.item;
    }
    //Obtener los items de la lonchera
    
}
