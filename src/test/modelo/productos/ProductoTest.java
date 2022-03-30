package test.modelo.productos;

import modelo.productos.Producto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    @Test
    void ProductoCajaNegra () {
        new Producto(Producto.Tipo.MARGARITA);

        int preparadosEsperados= 1;
        int servidosEsperados = 0;
        int productosPreparados = Producto.getTotalProductosPreparados();
        int productosServidos = Producto.getTotalProductosServidos();

        verificarAtributosProducto(preparadosEsperados, servidosEsperados, productosPreparados, productosServidos);
    }

    @Test
    void ProductoCajaBlanca () {
        new Producto(Producto.Tipo.MARGARITA);

        int preparadosEsperados= 2;
        int servidosEsperados = 0;
        int productosPreparados = Producto.getTotalProductosPreparados();
        int productosServidos = Producto.getTotalProductosServidos();

        verificarAtributosProducto(preparadosEsperados, servidosEsperados, productosPreparados, productosServidos);
    }

    void verificarAtributosProducto (int preparadosEsperados, int servidosEsperados,
                                     int productosPreparados, int productosServidos) {
        assertEquals(preparadosEsperados, productosPreparados,
                (String.format("Los productos preparados deberían ser %d y son %d", preparadosEsperados, productosPreparados)));
        assertEquals(servidosEsperados, productosServidos,
                (String.format("Los productos servidos deberían ser %d y son %d", servidosEsperados, productosServidos)));
    }
    
    @Test
    void getTotalProductosPreparados() {
        assertEquals(,,"No funciona");
    }

    @Test
    void getTotalProductosServidos() {
        assertEquals(,,"No funciona");
    }

    @Test
    void servir() {
        assertEquals(,,"No funciona");
    }
}