package tarea6ed;

public class Tarea6EDClase {
    private static final double DESCUENTO_GENERAL = 0.95;
    private static final double DESCUENTO_ESPECIAL = 0.8;
    private static final double DESCUENTO_PRODUCTO = 5;

   
    public void aplicarDescuento(double precioProducto, int numProductos) {
        if (numProductos > 3) {
            precioProducto -= DESCUENTO_PRODUCTO;
        }
        if (numProductos != 0) {
            calcularTotalConDescuentoEspecial(precioProducto);
        } else {
            calcularTotalSinDescuentoEspecial(precioProducto);
        }
    }

    private void calcularTotalConDescuentoEspecial(double precioProducto) {
        double total = precioProducto * DESCUENTO_ESPECIAL;
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }

    private void calcularTotalSinDescuentoEspecial(double precioProducto) {
        double total = precioProducto * DESCUENTO_GENERAL;
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }
}

