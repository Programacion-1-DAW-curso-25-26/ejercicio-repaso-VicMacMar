import java.util.*;

public class Inventario {

    private ArrayList<ProductoInformatico> productos = new ArrayList<>();

    public Inventario() {
    }

    public void listarTodos() {
        for(ProductoInformatico pro : productos){
            System.out.println(pro);
        }
    }

    public void listarSinStock() {
        for(ProductoInformatico pro : productos){
            if(pro.getStock() == 0){
                System.out.println(pro);
            }
        }
    }

    public boolean agregarProducto(ProductoInformatico p) {
        if (productos.contains(p)){
            return false;
        }else{
            productos.add(p);
            return true;
        }
    }

    public List<ProductoInformatico> buscarPorNombre(String nombre) {
        List<ProductoInformatico> lista = new ArrayList<>();
        for (ProductoInformatico producto : productos){
            if (producto.getNombre().equals(nombre)){
                lista.add(producto);
            }
        }
        return lista;
    }

    public List<ProductoInformatico> buscarPorCategoria(String cat) {
        List<ProductoInformatico> lista = new ArrayList<>();
        for (ProductoInformatico producto : productos){
            if (producto.getCategoria().equals(cat)){
                lista.add(producto);
            }
        }
        return lista;
    }

    public List<ProductoInformatico> buscarPorPrecio(double min, double max) {
        List<ProductoInformatico> lista = new ArrayList<>();
        for (ProductoInformatico producto : productos){
            if (producto.getPrecio() >= min && producto.getPrecio() <= max){
                lista.add(producto);
            }
        }
        return lista;
    }

    public boolean incrementarStock(String cod, int c) {
        for (ProductoInformatico pro : productos){
            if (pro.getCodigo().equals(cod)){
                pro.setStock(pro.getStock()+c);
                return true;
            }
        }
        return false;
    }

    public boolean decrementarStock(String cod, int c) {
        for (ProductoInformatico pro : productos){
            if (pro.getCodigo().equals(cod)){
                if(pro.getStock()>=c){
                    pro.setStock(pro.getStock()-c);
                    return true;
                }
            }
        }
        return false;
    }


    public List<ProductoInformatico> ordenarPorPrecioAsc() {
        //Collections.sort(productos, Comparator.comparingDouble(ProductoInformatico::getCodigo));
        return List.of();
    }
}