package Ejercicios_De_Programacion;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import Abstract_Factory.*;
public class EjercicioBufferedWriter {
    File directorio = new File("Ejercicios_De_Programacion");
    File archivo = new File(directorio, "archivo.txt");
    List<String> lista = new ArrayList<>();
    public String escribirArchivo() throws IOException {
        ProductoEntrada entrada = new EntradaTerminal();
        ProductoSalida salida = new SalidaTerminal();
        if (!directorio.exists() && !archivo.exists()) {
            directorio.mkdirs();
            archivo.createNewFile();
        }
        String respuesta = "";
        while(!respuesta.equals("n")) {
            salida.enviar("¿Deseas agregar una linea de texto?y/n: ");
            respuesta = entrada.capturar().toLowerCase();
            if(respuesta.equals("y")){
                salida.enviar("Ingresa la linea: ");
                String linea = entrada.capturar();
                lista.add(linea);
            }else if(respuesta.equals("n")){
                break;
            }else{
                salida.enviar("Opcion no valida");
            }
                
        }
        for (String linea : lista) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
                writer.write(linea);
                writer.close();
            }catch (IOException e) {
                System.out.println("Error al escribir en el archivo");
            }
        }
        return archivo.getAbsolutePath();
    }
}
