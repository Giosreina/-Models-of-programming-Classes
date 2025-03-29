import Abstract_Factory.*;
import java.io.IOException;

public class FabricaCirculo extends FabricaFiguras {
    public Figura crearFigura() throws IOException {
        ProductoEntrada entrada = new EntradaTerminal();
        ProductoSalida salida = new SalidaTerminal();
        salida.enviar("Ingresa el radio del circulo: ");
        double radio = Double.parseDouble(entrada.capturar());
        return new FiguraCirculo(radio);
    }
}