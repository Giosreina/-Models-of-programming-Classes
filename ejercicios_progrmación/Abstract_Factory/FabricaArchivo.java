package Abstract_Factory;
public class FabricaArchivo extends FabricaAbstracta {
    public SalidaArchivo crearSalida(){
        return new SalidaArchivo();
    }

    public EntradaArchivo crearEntrada(){
        return new EntradaArchivo();
    }
}
