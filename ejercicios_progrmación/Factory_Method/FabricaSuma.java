public class FabricaSuma extends FabricaOperaciones {
    public Operaciones crearOperaciones() {
        return new OperacionSuma();
    }
}