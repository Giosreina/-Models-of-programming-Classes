package Abstract_Factory;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EntradaArchivo extends ProductoEntrada {
    private File directorio = new File("ejercicios");
    private File archivo = new File(directorio, "archivo.txt");
    List<String> entrada = new ArrayList<>();
    EntradaTerminal entradaTerminal = new EntradaTerminal();
    SalidaTerminal salidaTerminal = new SalidaTerminal();
    public String capturar() throws IOException {
        String respuesta = "";
        if (!directorio.exists() && !archivo.exists()) {
            directorio.mkdirs();
            archivo.createNewFile();
        }
        while(!respuesta.equals("n")) {
            salidaTerminal.enviar("¿Deseas agregar una linea de texto?y/n: ");
            respuesta = entradaTerminal.capturar().toLowerCase();
            if(respuesta.equals("y")){
                salidaTerminal.enviar("Ingresa la linea: ");
                String linea = entradaTerminal.capturar();
                entrada.add(linea);
            }else if(respuesta.equals("n")){
                break;
            }else{
                salidaTerminal.enviar("Opcion no valida");
            }
                
        }
        for (String linea : entrada) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) { 
                writer.write(linea);
                writer.newLine();
                
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo: " + e.getMessage());
                return null;
            }
        }
        return archivo.getAbsolutePath(); 
    }
}
