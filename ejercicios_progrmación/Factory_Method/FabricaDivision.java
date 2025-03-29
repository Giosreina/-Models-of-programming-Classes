public class FabricaDivision extends FabricaOperaciones {
    public Operaciones crearOperaciones() {
        return new OperacionDivision();
    }
}