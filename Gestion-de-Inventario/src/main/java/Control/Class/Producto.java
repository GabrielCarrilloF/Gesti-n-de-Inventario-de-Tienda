package Control.Class;

public class Producto {
    private int Id;
    private String Nombre;
    private int Cantidad;
    private double Precio;

    public Producto(int id, String nombre, int cantidad, double precio) {
        this.Id = id;
        this.Nombre = nombre;
        this.Cantidad = cantidad;
        this.Precio = precio;
    }

    public int getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        if(Cantidad >= 0){
            this.Cantidad = Cantidad;
        }
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        if(Precio >= 0){
            this.Precio = Precio;
        }
    }

    @Override
    public String toString() {
        return "Producto{" +
                "Id=" + Id +
                ", Nombre='" + Nombre + '\'' +
                ", Cantidad=" + Cantidad +
                ", Precio=" + Precio +
                '}';
    }
}
