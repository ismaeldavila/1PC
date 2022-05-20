public class EjecutaFiguras {
    public static void main(String[] args) {
        Cuadrado objCuadrado = new Cuadrado();
        objCuadrado.trasladar();
        objCuadrado.calcularArea();

        Circulo  objCirculo = new Circulo();
        objCirculo.calcularArea();
        objCirculo.getRadio();

        Figura figura = new Figura();

        Figura circulo2 = new Circulo();

        circulo2.calcularArea();

        Circulo circulo3 = (Circulo) circulo2;
        circulo3.getRadio();

        Circulo[] circulos = new Circulo[2];
        circulos[0] = objCirculo;
        //circulos[1] = circulo2;

        Figura[] figuras = new Figura[3];
        figuras[0] = objCirculo;
        figuras[1] = circulo2;
        figuras[2] = figura;

        for(Figura fig: figuras){
            System.out.println(fig.getCoordX()+" "+fig.getCoordY());
        }
        System.out.println("");
        for (int i=0;i<figuras.length;i++){
            System.out.println(figuras[i].getCoordX()+" "+figuras[i].getCoordY());
        }

    }
}
