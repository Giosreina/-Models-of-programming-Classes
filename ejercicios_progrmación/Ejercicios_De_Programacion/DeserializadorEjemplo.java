package Ejercicios_De_Programacion;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DeserializadorEjemplo {
    
    public static void main(String[] args) {
        try {
            // Crear streams para leer
            FileInputStream fileIn = new FileInputStream("persona.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            
            // Leer el objeto
            Persona persona = (Persona) in.readObject();
            
            // Leer los datos primitivos en el mismo orden
            int numero = in.readInt();
            boolean flag = in.readBoolean();
            double decimal = in.readDouble();
            String texto = in.readUTF();
            
            // Cerrar streams
            in.close();
            fileIn.close();
            
            // Mostrar resultados
            System.out.println("Objeto deserializado desde persona.ser");
            System.out.println("Datos del objeto: " + persona);
            System.out.println("Valor del datoTemporal: " + persona.getDatoTemporal()); // Será null
            
            System.out.println("\nDatos primitivos leídos:");
            System.out.println("Número entero: " + numero);
            System.out.println("Valor booleano: " + flag);
            System.out.println("Número decimal: " + decimal);
            System.out.println("Texto: " + texto);
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
