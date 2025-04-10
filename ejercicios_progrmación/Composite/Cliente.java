package Composite;

public class Cliente {
    public static void main(String[] args) {
        Carro carro1 = new Carro(1000, "ABC123", "Toyota");
        Carro carro2 = new Carro(1200, "XYZ456", "Honda");
        Carro carro3 = new Carro(800, "LMN789", "Ford");

        CamionNiñera camion = new CamionNiñera(5000);

        camion.subirCarro(carro1, 0, 0);
        camion.subirCarro(carro2, 0, 1);
        camion.subirCarro(carro3, 1, 2);

        System.out.println("Peso total del camion: " + camion.calcularPeso());
    }
}
