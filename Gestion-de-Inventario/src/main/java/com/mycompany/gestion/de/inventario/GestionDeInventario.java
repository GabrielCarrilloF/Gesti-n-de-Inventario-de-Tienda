package com.mycompany.gestion.de.inventario;

import Control.Class.Inventario;
import java.util.Scanner;

public class GestionDeInventario {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("Bienvenido al sistema de gestión de inventario de la tienda.");

        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Agregar nuevo producto");
            System.out.println("2. Modificar cantidad de un producto");
            System.out.println("3. Modificar precio de un producto");
            System.out.println("4. Mostrar información de todos los productos");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del producto: ");
                    int id = scanner.nextInt();
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese la cantidad en stock: ");
                    int cantidad = scanner.nextInt();
                    System.out.print("Ingrese el precio: ");
                    double precio = scanner.nextDouble();
                    inventario.agregarProducto(id, nombre, cantidad, precio);
                    break;
                case 2:
                    System.out.print("Ingrese el ID del producto: ");
                    int idModCantidad = scanner.nextInt();
                    System.out.print("Ingrese la nueva cantidad: ");
                    int nuevaCantidad = scanner.nextInt();
                    inventario.modificarCantidad(idModCantidad, nuevaCantidad);
                    break;
                case 3:
                    System.out.print("Ingrese el ID del producto: ");
                    int idModPrecio = scanner.nextInt();
                    System.out.print("Ingrese el nuevo precio: ");
                    double nuevoPrecio = scanner.nextDouble();
                    inventario.modificarPrecio(idModPrecio, nuevoPrecio);
                    break;
                case 4:
                    inventario.mostrarInformacion();
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el sistema de gestión de inventario.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();

    }
}
