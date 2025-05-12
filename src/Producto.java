public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private categoriaProducto categoria;

    public Producto() {}

    public Producto(String id, String nombre, double precio, int cantidad, categoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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

    public categoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(categoriaProducto categoria) {
        this.categoria = categoria;
    }

    public void mostrarInfo(Producto p){
        System.out.println(p);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", categoria=" + categoria +
                '}';
    }
}


