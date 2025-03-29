import Abstract_Factory.*;
import java.io.IOException;

public class FabricaTriangulo extends FabricaFiguras {
    public Figura crearFigura() throws IOException {
        ProductoSalida salida = new SalidaTerminal();
        ProductoEntrada entrada = new EntradaTerminal();
        salida.enviar("Ingresa un lado del triagnulo: ");
        double lado1 = Double.parseDouble(entrada.capturar());
        salida.enviar("Ingresa otro lado del triangulo: ");
        double lado2 = Double.parseDouble(entrada.capturar());
        salida.enviar("Ingresa el ultimo lado del triangulo: ");
        double lado3 = Double.parseDouble(entrada.capturar());
        return new FiguraTriangulo(lado1, lado2, lado3);
    }
}