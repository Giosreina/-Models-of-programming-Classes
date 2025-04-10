package Prototype.Cajita_Feliz;
public class Cliente {
    public static void main (String args[]){
        CajitaFeliz cajitaFeliz = new CajitaFeliz();

        cajitaFeliz.setHamburguesa(new Hamburguesa("Carne de res", "Pan de hamburguesa", "Lechuga", "Tomate", "Cebolla", "Salsas", "Mediana"));
        cajitaFeliz.setPapasFritas(new PapasFritas("Papas fritas", "Mediana", "Ketchup", "1"));
        cajitaFeliz.setBebida(new Bebida("Bebida", "Grande", "Coca Cola", "1"));
        cajitaFeliz.setPostre(new Postre("Postre", "Pequeño", "Chocolate", "1"));
        cajitaFeliz.setJuguete(new Juguete("Juguete", "Pequeño", "Rojo"));
        cajitaFeliz.setPrecio(100);

        System.out.println("Cajita feliz original: ");
        System.out.println("Hamburguesa: " + cajitaFeliz.getHamburguesa().carne + ", " + cajitaFeliz.getHamburguesa().pan + ", " + cajitaFeliz.getHamburguesa().lechuga + ", " + cajitaFeliz.getHamburguesa().tomate + ", " + cajitaFeliz.getHamburguesa().cebolla + ", " + cajitaFeliz.getHamburguesa().salsas + ", " + cajitaFeliz.getHamburguesa().tamaño);
        System.out.println("Papas fritas: " + cajitaFeliz.getPapasFritas().tipo + ", " + cajitaFeliz.getPapasFritas().tamaño + ", " + cajitaFeliz.getPapasFritas().salsas + ", " + cajitaFeliz.getPapasFritas().cantidad);
        System.out.println("Bebida: " + cajitaFeliz.getBebida().tipo + ", " + cajitaFeliz.getBebida().tamaño + ", " + cajitaFeliz.getBebida().sabor + ", " + cajitaFeliz.getBebida().cantidad);
        System.out.println("Postre: " + cajitaFeliz.getPostre().tipo + ", " + cajitaFeliz.getPostre().tamaño + ", " + cajitaFeliz.getPostre().sabor + ", " + cajitaFeliz.getPostre().cantidad);
        System.out.println("Juguete: " + cajitaFeliz.getJuguete().tipo + ", " + cajitaFeliz.getJuguete().tamaño + ", " + cajitaFeliz.getJuguete().color);
        System.out.println("Precio: " + cajitaFeliz.getPrecio());

        CajitaFeliz otraCajitaFeliz = cajitaFeliz.duplicar();
        System.out.println("Cajita feliz duplicada: ");
        System.out.println("Hamburguesa: " + otraCajitaFeliz.getHamburguesa().carne + ", " + otraCajitaFeliz.getHamburguesa().pan + ", " + otraCajitaFeliz.getHamburguesa().lechuga + ", " + otraCajitaFeliz.getHamburguesa().tomate + ", " + otraCajitaFeliz.getHamburguesa().cebolla + ", " + otraCajitaFeliz.getHamburguesa().salsas + ", " + otraCajitaFeliz.getHamburguesa().tamaño);
        System.out.println("Papas fritas: " + otraCajitaFeliz.getPapasFritas().tipo + ", " + otraCajitaFeliz.getPapasFritas().tamaño + ", " + otraCajitaFeliz.getPapasFritas().salsas + ", " + otraCajitaFeliz.getPapasFritas().cantidad);
        System.out.println("Bebida: " + otraCajitaFeliz.getBebida().tipo + ", " + otraCajitaFeliz.getBebida().tamaño + ", " + otraCajitaFeliz.getBebida().sabor + ", " + otraCajitaFeliz.getBebida().cantidad);
        System.out.println("Postre: " + otraCajitaFeliz.getPostre().tipo + ", " + otraCajitaFeliz.getPostre().tamaño + ", " + otraCajitaFeliz.getPostre().sabor + ", " + otraCajitaFeliz.getPostre().cantidad);
        System.out.println("Juguete: " + otraCajitaFeliz.getJuguete().tipo + ", " + otraCajitaFeliz.getJuguete().tamaño + ", " + otraCajitaFeliz.getJuguete().color);
        System.out.println("Precio: "+ otraCajitaFeliz.getPrecio());    
    }
}
