package ventaproductos;

import java.util.Scanner;
public class EjecutarVentaProductos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        VentaProductos venta = new VentaProductos();

        System.out.print("Ingrese el precio del producto: $");
        venta.setPrecio(entrada.nextDouble());

        System.out.print("Ingrese la cantidad de productos: ");
        venta.setCantidad(entrada.nextInt());

        double descuento = venta.calcularDescuento();
        double precioFinal = venta.calcularPrecioFinal();
        double total = (venta.getPrecio()*venta.getCantidad());
        
        System.out.printf("\n\nTotal sin descuento: $%.2f\n\nDescuento: $%.2f"
                + "\n\nPrecio final: $%.2f\n\n",
                   total, descuento, precioFinal);

    
    }
    
}
