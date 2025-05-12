public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("1", "Arroz", 1100, 100, categoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("2", "Pantolón", 35000, 30, categoriaProducto.ALIMENTOS);
        Producto p3 = new Producto("3", "PS5", 800000, 5, categoriaProducto.ALIMENTOS);

        Inventario inventario = new Inventario();

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);

        inventario.listarProductos();
        System.out.println("---------------------------------------");
        inventario.obtenerTotalStock();
        System.out.println("---------------------------------------");
        inventario.getProductoConMayorStock();
        System.out.println("---------------------------------------");
        inventario.filtrarProductosPorRangoPrecio(34000, 900000);
        System.out.println("---------------------------------------");
        inventario.mostrarCategoriasDisponibles();
    }
}
