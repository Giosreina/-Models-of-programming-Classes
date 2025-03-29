package Abstract_Factory;
import java.io.FileReader;
import java.io.BufferedReader;

public class SalidaArchivo extends ProductoSalida {
    FileReader archivo;
    BufferedReader reader;
    SalidaTerminal sa = new SalidaTerminal();
    
    public void enviar(String mensaje) {
        try {
            archivo = new FileReader("ejercicios/archivo.txt");
            reader = new BufferedReader(archivo);
            if(archivo.ready()) {
                String linea = reader.readLine();
                while (linea != null) {
                    System.out.println(linea);
                    linea = reader.readLine();
                }
                reader.close();
            } else {
                sa.enviar("Error: El archivo no se encuentra disponible");
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
    }
}