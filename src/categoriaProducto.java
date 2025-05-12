public enum categoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");

    private final String descripcion;

    categoriaProducto(String descripcion){
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }
}
