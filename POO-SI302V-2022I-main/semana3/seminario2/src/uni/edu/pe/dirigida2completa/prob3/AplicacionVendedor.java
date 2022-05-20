package uni.edu.pe.dirigida2completa.prob3;

public class AplicacionVendedor {
    public static void main(String[] args) {
        Vendedor vendedorHari = new Vendedor("Hari Seldon",8000);
        Vendedor vendedorSalvor= new Vendedor("Salvor Hardin",30,5000,1300);
        System.out.println(Vendedor.getCantidad());
        System.out.println(vendedorHari.getSueldo());
        System.out.println(vendedorSalvor.getSueldo());
    }
}
