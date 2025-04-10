package Bridge;

import java.util.*;

public class Cliente {
    public static void main(String args[]){
        Item item1 = new Item("Item1", "Tipo1", "Tamaño1");
        Item item2 = new Item("Item2", "Tipo2", "Tamaño2");
        Item item3 = new Item("Item3", "Tipo3", "Tamaño3");
        List<Item> items = new ArrayList<Item>();

        Contenedor inventario = new Inventario(items);
        inventario.addItem(item1);
        inventario.addItem(item2);
        inventario.addItem(item3);
        inventario.recorrer(inventario.items);

        Item manzana = new Item("Manzana", "Fruta", "Pequeña");
        Item sandwich = new Item("Sandwich", "Comida", "Mediana");
        Item galleta = new Item("Galleta", "Snack", "Pequeña");
        List<Item> itemsLonchera = new ArrayList<Item>();

        Contenedor Lonchera = new Lonchera(itemsLonchera);
        Lonchera.addItem(manzana);
        Lonchera.addItem(sandwich);
        Lonchera.addItem(galleta);
        Lonchera.recorrer(Lonchera.items);
    }
}
