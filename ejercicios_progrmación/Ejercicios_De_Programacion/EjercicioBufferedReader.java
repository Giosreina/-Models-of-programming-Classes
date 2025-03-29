package Ejercicios_De_Programacion;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import Abstract_Factory.*;

public class EjercicioBufferedReader {
    public void leerArchivo() throws IOException {
        FileReader archivo;
        ProductoSalida salida = new SalidaTerminal();
        try (BufferedReader reader = new BufferedReader(new FileReader("Ejercicios_De_Programacion/archivo.txt"))) {
            archivo = new FileReader("Ejercicios_De_Programacion/archivo.txt");
            if (archivo.ready()) {
                String linea = reader.readLine();
                while (linea != null) {
                    salida.enviar(linea);
                    linea = reader.readLine();
                }
                reader.close();
            }
            else {
                salida.enviar("Error: El archivo no se encuentra disponible");
            }
        }catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
    }
}