package Bridge;

public class Item {
    public String nombre;
    public String tipo;
    public String tamaño;

    public Item(String nombre, String tipo, String tamaño){
        setNombre(nombre);
        setTamaño(tamaño);
        setTipo(tipo);
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    } 
    public String getTipo(){
        return this.tipo;
    }
    public void setTamaño(String tamaño){
        this.tamaño = tamaño;
    }
    public String getTamaño(){
        return this.tamaño;
    }
}
