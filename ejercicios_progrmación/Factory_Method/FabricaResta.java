public class FabricaResta extends FabricaOperaciones {
    public Operaciones crearOperaciones() {
        return new OperacionResta();
    }
}