package uni.edu.pe.laboratorio1;

public class CalculaMontos2 {
    public static void main(String[] args) {
        procesaVentas();
        //CalculaMontos cm = new CalculaMontos();
        /*
        Venta[] ventas =  cm.procesaVentas();
        cm.imprimeTotalVentas(ventas);
        cm.imprimeVentaMayor(ventas);
        cm.imprimeVentaMenor(ventas);

         */
    }

    public static Venta[] procesaVentas(){
        Producto p1 = new Producto();
        p1.setNombre("Coronitas");
        p1.setCantidad(1);
        p1.setPrecioUnitario(0.5f);
        p1.setCodigo("cor001");
        System.out.println(p1);

        Producto p2 = new Producto("Glacitas","GLA001", 0.8F, 2);
        System.out.println(p2);

        Producto p3 = new Producto("Casino","CAS001", 1.0F, 1);
        Producto p4 = new Producto("Morochas","Mor001", 0.6F, 3);

        Producto[] productos1 = new Producto[]{p1,p2};
        Producto[] productos2 = new Producto[]{p2,p3, p4};
        Producto[] productos3 = new Producto[]{p3,p4};
        Producto[] productos4 = new Producto[]{p3,p4, p1};
        Venta v1 = new Venta();
        v1.setCodigoVenta("v01");
        v1.setProductos(productos1);

        Venta v2 = new Venta("v02",productos2);
        Venta v3 = new Venta("v03",productos3);
        Venta v4 = new Venta("v04",productos4);

        Venta[] ventas = new Venta[]{v1,v2,v3,v4 };


        System.out.println(v1);

        for(Venta v: ventas){
            float montoTotal = 0f;
            for(Producto p :v.getProductos()){
                montoTotal+=p.getCantidad()*p.getPrecioUnitario();
            }
            v.setTotalVenta(montoTotal);
        }

        System.out.println("\n");
        for (Venta v: ventas){
            System.out.println(v);
        }

        for(int i=0; i<ventas.length-1;i++){
            for(int j=i+1;j<ventas.length;j++){
                if(ventas[i].getTotalVenta()>ventas[j].getTotalVenta()){
                    Venta aux = ventas[i];
                    ventas[i] = ventas[j];
                    ventas[j] = aux;
                }
            }
        }

        System.out.println("<===== Despues de ordenar ====>");
        for (Venta v: ventas){
            System.out.println(v);
        }
        return ventas;
    }


    public void imprimeTotalVentas(Venta[] ventas){
        float ventaTotal = 0f;
        for(Venta v:ventas){
            ventaTotal +=v.getTotalVenta();
        }
        System.out.println("Ventas totales: "+ventaTotal);
    }

    public void imprimeVentaMayor(Venta[] ventas){
        System.out.println("Venta Mayor: "+ventas[ventas.length-1]);
    }
    public void imprimeVentaMenor(Venta[] ventas){
        System.out.println("Venta Menor: "+ventas[0]);
    }

}
