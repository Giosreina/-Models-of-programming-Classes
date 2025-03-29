import java.io.IOException;
import Abstract_Factory.*;
public class FabricaCuadrado extends FabricaFiguras {
    public Figura crearFigura() throws IOException{
        ProductoEntrada entrada = new EntradaTerminal();
        ProductoSalida salida = new SalidaTerminal();
        salida.enviar("Ingresa el lado del cuadrado: ");
        double lado = Double.parseDouble(entrada.capturar());
        return new FiguraCuadrado(lado);
    }
}