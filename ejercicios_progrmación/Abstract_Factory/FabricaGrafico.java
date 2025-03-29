package Abstract_Factory;
public class FabricaGrafico extends FabricaAbstracta{
    public ProductoSalida crearSalida(){
        return new SalidaGrafico();
    }
    public ProductoEntrada crearEntrada(){
        return new EntradaGrafico();
    }
}
