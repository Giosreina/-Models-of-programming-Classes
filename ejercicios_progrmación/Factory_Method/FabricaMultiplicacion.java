public class FabricaMultiplicacion extends FabricaOperaciones {
    public Operaciones crearOperaciones() {
        return new OperacionMultiplicacion();
    }
}