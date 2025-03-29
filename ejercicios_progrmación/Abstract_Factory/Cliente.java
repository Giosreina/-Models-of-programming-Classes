package Abstract_Factory;
import java.io.IOException;
public class Cliente{
        FabricaAbstracta fabrica;
        ProductoEntrada entrada;
        ProductoSalida salida;
        public Cliente (FabricaAbstracta fabrica) throws IOException{
            this.fabrica = fabrica;
            entrada = fabrica.crearEntrada();
            salida = fabrica.crearSalida();
    }
}