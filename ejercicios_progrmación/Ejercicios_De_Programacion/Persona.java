package Ejercicios_De_Programacion; 
import java.io.Serializable;

public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String nombre;
    private int edad;
    private transient String datoTemporal;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.datoTemporal = "Este dato no se guardará";
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getDatoTemporal() {
        return datoTemporal;
    }
    
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", datoTemporal='" + datoTemporal + '\'' +
                '}';
    }
}