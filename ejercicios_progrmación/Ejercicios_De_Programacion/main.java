package Ejercicios_De_Programacion;
import java.io.IOException;
public class main {
    public static void main(String[] args) throws IOException{
        EjercicioBufferedWriter escribirArchivo = new EjercicioBufferedWriter();
        escribirArchivo.escribirArchivo();
        EjercicioBufferedReader leerArchivo = new EjercicioBufferedReader();
        leerArchivo.leerArchivo();
    }
}