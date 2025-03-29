package Abstract_Factory;
public class FabricaTerminal extends FabricaAbstracta{
    public ProductoSalida crearSalida(){
        return new SalidaTerminal();
    }
    public ProductoEntrada crearEntrada(){
        return new EntradaTerminal();
    }
}
