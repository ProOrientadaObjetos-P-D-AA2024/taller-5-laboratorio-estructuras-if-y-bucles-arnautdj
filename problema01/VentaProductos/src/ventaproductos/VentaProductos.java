package ventaproductos;

public class VentaProductos {
    private double precio;
    private int cantidad;


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularDescuento() {
        if (precio >= 1000 && cantidad >= 10) {
            return 0.10 * precio;
        } else {
            return 0.05 * precio;
        }
    }

    public double calcularPrecioFinal() {
        return precio - calcularDescuento();
    }
}
