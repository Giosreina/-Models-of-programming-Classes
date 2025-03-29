package Ejercicios_De_Programacion;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SerializadorEjemplo {
    
    public static void main(String[] args) {
        // Crear un objeto para serializar
        Persona persona = new Persona("Juan", 30);
        
        try {
            // Crear el stream de salida
            FileOutputStream fileOut = new FileOutputStream("persona.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            
            // Escribir el objeto en el archivo
            out.writeObject(persona);
            
            // Escribir algunos datos primitivos
            out.writeInt(123);
            out.writeBoolean(true);
            out.writeDouble(45.67);
            out.writeUTF("Información adicional");
            
            // Cerrar streams
            out.close();
            fileOut.close();
            
            System.out.println("Objeto serializado guardado en persona.ser");
            System.out.println("Datos del objeto: " + persona);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}