
package Control.Class;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // Método para agregar un producto al inventario
    public void agregarProducto(int id, String nombre, int cantidad, double precio) {
        Producto producto = new Producto(id, nombre, cantidad, precio);
        productos.add(producto);
        System.out.println("Producto agregado exitosamente.");
    }

    // Método para modificar la cantidad de un producto en el inventario
    public void modificarCantidad(int id, int nuevaCantidad) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                producto.setCantidad(nuevaCantidad);
                System.out.println("Cantidad modificada exitosamente.");
                return;
            }
        }
        System.out.println("Producto con ID " + id + " no encontrado.");
    }

    // Método para modificar el precio de un producto en el inventario
    public void modificarPrecio(int id, double nuevoPrecio) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                producto.setPrecio(nuevoPrecio);
                System.out.println("Precio modificado exitosamente.");
                return;
            }
        }
        System.out.println("Producto con ID " + id + " no encontrado.");
    }

    // Método para mostrar la información de todos los productos en el inventario
    public void mostrarInformacion() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
    }
}

