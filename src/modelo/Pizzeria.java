package modelo;

import modelo.productos.Panini;
import modelo.productos.Pizza;
import modelo.productos.Producto;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    public static List<Producto> listaProductos = new ArrayList<>();

    //public static void anadirProductos(Producto producto){listaProductos.add(new Producto());}

    public static void crearProductos (){
        //Se cfrean las 3 pizzas
        listaProductos.add(new Pizza(Producto.Tipo.MARGARITA, Pizza.TamanoPizza.FAMILIAR));
        listaProductos.add(new Pizza(Producto.Tipo.FUNGUI, Pizza.TamanoPizza.FAMILIAR));
        listaProductos.add(new Pizza(Producto.Tipo.CUATROESTACIONES, Pizza.TamanoPizza.MEDIANA));
        listaProductos.add(new Panini(Producto.Tipo.FUNGUI, Panini.TamanoPanini.SEVILLA, Panini.Racion.DOBLE));
        listaProductos.add(new Panini(Producto.Tipo.CUATROESTACIONES, Panini.TamanoPanini.GRANADA, Panini.Racion.SIMPLE));
    }

    public static void servirTodosProductos (){
        for (Producto producto : listaProductos){
            producto.servir();
        }
    }

    public static void mostrarTodosProductos (){
        for (Producto producto : listaProductos){
            System.out.println(producto.toString());
        }
    }

    public static void servirProductos (int[] productos){
        for (int productoServir : productos){
            listaProductos.get(0).servir();
        }
    }

    public static void mostrarTotales (){
        System.out.printf("""
                Total de pizzas pedidas: %S y servidas: %S
                Total de paninis pedidos: %S y servidos: %S
                Total de productos pedidos: %S y servidos: %S\s"""
                , Pizza.getTotalPizzasPreparadas(), Pizza.getTotalPizzasServidas()
                , Panini.getTotalPaninisPreparados(), Panini.getTotalPaninisServidos()
                , Producto.getTotalProductosPreparados(), Producto.getTotalProductosServidos());

    }
}
