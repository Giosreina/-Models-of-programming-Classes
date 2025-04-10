package Bridge;
import java.util.*;


public abstract class Contenedor implements Recorrido {
    public Item item;
    public List<Item> items;

    public abstract void addItem(Item item);
    public abstract void removeItem(Item item);
    public abstract void setItem(Item item);
    public abstract Item getItem();
}
