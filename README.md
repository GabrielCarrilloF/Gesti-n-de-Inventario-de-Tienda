### Gesti-n-de-Inventario-de-Tienda

Aplicación de consola en Java para gestionar el inventario de una tienda, utilizando el principio de encapsulamiento. Permite agregar productos, modificar cantidad y precio, y mostrar la información de los productos. Protege los datos asegurando que solo puedan ser modificados a través de métodos específicos.

### Enunciado del Ejercicio

**Título: Gestión de Inventario de una Tienda**

**Descripción:**
Desarrolla una aplicación de consola en Java que gestione el inventario de productos de una tienda. La aplicación debe utilizar el principio de encapsulamiento para asegurar que los datos de los productos estén protegidos y solo puedan ser modificados mediante métodos específicos. Cada producto tendrá un identificador único, un nombre, una cantidad en stock y un precio. La aplicación debe permitir al usuario realizar las siguientes operaciones:

1. **Agregar un nuevo producto al inventario.**
2. **Modificar la cantidad de un producto existente.**
3. **Modificar el precio de un producto existente.**
4. **Mostrar la información de todos los productos en el inventario.**

**Requisitos Específicos:**

1. **Clase Producto:** Crea una clase llamada `Producto` que tenga los siguientes atributos privados:
    - `id` (int): Identificador único del producto.
    - `nombre` (String): Nombre del producto.
    - `cantidad` (int): Cantidad en stock del producto.
    - `precio` (double): Precio del producto.

   Implementa los métodos públicos necesarios para acceder y modificar estos atributos, asegurando que se cumplan las siguientes reglas:
    - El `id` del producto no puede ser modificado una vez establecido.
    - El `nombre` del producto puede ser leído, pero no modificado.
    - La `cantidad` y el `precio` del producto pueden ser tanto leídos como modificados, pero deben validarse para asegurar que no se asignen valores negativos.

2. **Clase Inventario:** Crea una clase llamada `Inventario` que gestione una lista de objetos `Producto`. Esta clase debe proporcionar métodos públicos para realizar las operaciones especificadas (agregar, modificar cantidad, modificar precio, mostrar información).

3. **Interacción con el Usuario:** Crea una clase principal con un método `main` que permita interactuar con el usuario a través de la consola. El programa debe presentar un menú de opciones al usuario y ejecutar las operaciones solicitadas. Utiliza variables temporales para almacenar los datos ingresados por el usuario antes de crear o modificar los objetos `Producto`.

**Ejemplo de Interacción:**

```
Bienvenido al sistema de gestión de inventario de la tienda.

Seleccione una opción:
1. Agregar nuevo producto
2. Modificar cantidad de un producto
3. Modificar precio de un producto
4. Mostrar información de todos los productos
5. Salir

Opción: 1
Ingrese el ID del producto: 101
Ingrese el nombre del producto: Manzanas
Ingrese la cantidad en stock: 50
Ingrese el precio: 0.99

Producto agregado exitosamente.

Seleccione una opción:
1. Agregar nuevo producto
2. Modificar cantidad de un producto
3. Modificar precio de un producto
4. Mostrar información de todos los productos
5. Salir

Opción: 4
ID: 101, Nombre: Manzanas, Cantidad: 50, Precio: 0.99

Seleccione una opción:
1. Agregar nuevo producto
2. Modificar cantidad de un producto
3. Modificar precio de un producto
4. Mostrar información de todos los productos
5. Salir

Opción: 5
Gracias por utilizar el sistema de gestión de inventario.
```

### Explicación Detallada

1. **Encapsulamiento en la Clase `Producto`:**
   - **Atributos Privados:** Los atributos `id`, `nombre`, `cantidad` y `precio` están encapsulados como privados. Esto significa que no pueden ser accedidos ni modificados directamente desde fuera de la clase `Producto`.
   - **Métodos Públicos:** Proporciona métodos públicos (`getId()`, `getNombre()`, `getCantidad()`, `setCantidad()`, `getPrecio()`, `setPrecio()`) para acceder y modificar los atributos. Estos métodos permiten controlar cómo se accede y modifica cada atributo.
   - **Validaciones:** Dentro de los métodos `setCantidad()` y `setPrecio()`, asegúrate de que los valores asignados sean válidos (no negativos).

2. **Gestión del Inventario:**
   - La clase `Inventario` debe manejar una colección de objetos `Producto`, permitiendo agregar nuevos productos y modificar los existentes mediante métodos públicos.
   - La interacción con el usuario se maneja en la clase principal, donde se reciben los datos de la consola, se validan y se pasan a la clase `Inventario` para que esta realice las operaciones necesarias.

3. **Interacción del Usuario:**
   - La clase principal proporciona una interfaz de usuario básica a través de la consola, permitiendo a los usuarios ingresar datos y seleccionar opciones.
   - Se utilizan variables temporales para almacenar los datos ingresados por el usuario antes de crear o modificar los objetos `Producto`.

Este ejercicio demuestra la importancia del encapsulamiento para proteger los datos y asegurar que solo se modifiquen a través de métodos controlados, garantizando así la integridad de la información en el sistema de inventario.
