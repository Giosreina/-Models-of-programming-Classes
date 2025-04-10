package Bridge;
import java.util.*;

public class Inventario extends Contenedor {
    RecorridoIzquierdaDerecha recorridoIzquierdaDerecha = new RecorridoIzquierdaDerecha();
    public Inventario(List<Item>items) {
        this.items = items;
    }
    public void recorrer(List<Item> items){
        recorridoIzquierdaDerecha.recorrer(items);
    }
    //Agregar un item al inventario
    @Override
    public void addItem(Item item) {
        this.items.add(item);

    }
    //Eliminar un item del inventario
    @Override
    public void removeItem(Item item) {
        this.items.remove(item);
    }
    //Establecer un item en el inventario
    @Override
    public void setItem(Item item) {
        this.item = item;
    }
    //Obtener un item del inventario
    @Override
    public Item getItem() {
        return this.item;
    }
}
