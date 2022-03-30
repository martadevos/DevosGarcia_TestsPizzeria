package modelo.productos;

enum Tipo {MARGARITA, FUNGUI, CUATROESTACIONES}
enum Estado {PEDIDA, SERVIDA}

public class Producto {

    public enum Tipo {MARGARITA, FUNGUI, CUATROESTACIONES}
    public enum Estado {PEDIDA, SERVIDA}
    protected Tipo tipo;
    protected Estado estado;
    protected static int totalProductosPreparados=0;
    protected static int totalProductosServidos=0;

    public Producto(Tipo tipo) {
        this.tipo = tipo;
        this.estado = Estado.PEDIDA;
        totalProductosPreparados++;
    }

    public static int getTotalProductosPreparados() {
        return totalProductosPreparados;
    }

    public static int getTotalProductosServidos() {
        return totalProductosServidos;
    }

    public void servir(){
        this.estado=Estado.SERVIDA;
        totalProductosServidos++;
    }

    @Override
    public String toString() {
        return String.format("%s y se encuentra  %s", tipo, estado);
    }
}
