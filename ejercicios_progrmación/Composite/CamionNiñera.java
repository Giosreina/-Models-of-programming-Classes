package Composite;

public class CamionNiñera extends Vehiculo {
    public double peso;
    public String coordenadas;
    Carro[][] carros = new Carro[2][3];

    public CamionNiñera(double peso, String coordenadas) {
        this.peso = peso;
        this.coordenadas = coordenadas;
    }

    public void subirCarro(Carro carro, int fila, int columna) {
        if (carros[fila][columna] == null) {
            carros[fila][columna] = carro;
            peso += carro.calcularPeso();
        } else {
            System.out.println("Ya hay un carro en esa posición.");
        }
    }
    public void bajarCarro(int fila, int columna) {
        if (carros[fila][columna] != null) {
            carros[fila][columna] = null;
        } else {
            System.out.println("No hay un carro en esa posición.");
        }
    }
    public Carro Buscar(Carro carro){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (carros[i][j] == carro) {
                    return carros[i][j];
                }
            }
        }
        return null;
    }
    @Override
    public double calcularPeso() {
        double pesoCamion = this.peso;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (carros[i][j] != null) {
                    pesoCamion += carros[i][j].calcularPeso();
                }
            }
        }
        return pesoCamion;
    }
    @Override
    public void getCoordenadas(Carro carro) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (carros[i][j].equals(carro)) {
                    System.out.println("Coordenadas del carro en la posición [" + i + "][" + j + "]: ");
                }
            }
        }
    }

}
