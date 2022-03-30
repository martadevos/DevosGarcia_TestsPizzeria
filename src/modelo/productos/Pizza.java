package modelo.productos;

public class Pizza extends Producto {

    public enum TamanoPizza {MEDIANA, FAMILIAR}

    private final TamanoPizza tamano;
    private static int totalPizzasPreparadas=0;
    private static int totalPizzasServidas=0;

    public Pizza(Tipo tipo, TamanoPizza tamano) {
        super(tipo);
        this.tamano = tamano;
        totalPizzasPreparadas++;
    }

    public static int getTotalPizzasPreparadas() {
        return totalPizzasPreparadas;
    }

    public static int getTotalPizzasServidas() {
        return totalPizzasServidas;
    }

    public TamanoPizza getTamano() {
        return tamano;
    }

    @Override
    public void servir() {
        super.servir();
        totalPizzasServidas++;
    }

    @Override
    public String toString() {
        return String.format("La pizza pedida tamaño %s es %s", tamano, super.toString());
    }
}
