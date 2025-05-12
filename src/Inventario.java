import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void listarProductos() {
        System.out.println("Productos en el inventario:");
        for (Producto p : productos) {
            p.mostrarInfo(p);
        }
    }

    public void buscarProductosPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                p.mostrarInfo(p);
            }
        }
    }

    public void eliminarProducto(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                productos.remove(p);
            }
        }
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                p.setCantidad(nuevaCantidad);
            }
        }
    }

    public void filtrarPorCategoria(categoriaProducto categoria) {
        for (Producto producto : productos) {
            if (producto.getCategoria().equals(categoria)) {
                producto.mostrarInfo(producto);
            }
        }
    }

    public void obtenerTotalStock() {
        int stockTotal = 0;
        for (Producto producto : productos) {
            stockTotal += producto.getCantidad();
        }
        System.out.println("El stock total es: " + stockTotal);
    }

    public void getProductoConMayorStock() {
        Producto productoConMayorStock = new Producto();
        int stockMayor = 0;
        for (Producto producto : productos) {
            if (producto.getCantidad() > stockMayor) {
                stockMayor = producto.getCantidad();
                productoConMayorStock = producto;
            }
        }
        System.out.println("El producto con mayor stock es: ");
        productoConMayorStock.mostrarInfo(productoConMayorStock);
    }

    public void filtrarProductosPorRangoPrecio(double min, double max) {
        Inventario inventarioRango = new Inventario();
        for (Producto producto : productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                inventarioRango.agregarProducto(producto);
            }
        }
        System.out.println("Productos en el rango: " + inventarioRango);
    }

    public void mostrarCategoriasDisponibles(){
        for (categoriaProducto categoria : categoriaProducto.values()) {
            System.out.println(categoria + ": " + categoria.getDescripcion());
        }
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "productos=" + productos +
                '}';
    }
}