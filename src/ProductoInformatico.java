public class ProductoInformatico {

    private String codigo;
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;
    private String marca;

    public ProductoInformatico() {}

    public ProductoInformatico(String codigo, String nombre, String categoria,
                               double precio, int stock, String marca) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
        this.marca = marca;
    }


    // getters y setters...
}