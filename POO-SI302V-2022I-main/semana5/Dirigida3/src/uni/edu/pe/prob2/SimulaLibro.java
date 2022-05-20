package uni.edu.pe.prob2;

public class SimulaLibro {
    public static void main(String[] args) {

        Libro l1 = new Libro();

        /*
        System.out.println(l1.validaISBN(2572337843l));
        System.out.println(l1.validaISBN(8420681865l));
        System.out.println(l1.validaISBN(1259060977));
        System.out.println(l1.validaISBN(1247514142));
        System.out.println(l1.validaISBN(1247514131));
        System.out.println(l1.validaISBN(1247514125));
         */

        procesaLibros();
    }

    private static void procesaLibros() {
        Libro[] libros = new Libro[6];
        libros[0]= new Libro("Tradiciones peruanas", "Ricardo Palma", 2572337843l, 1, "Patronato del libro" );
        libros[1] = new Libro("Cuentos andinos", "Enrique Lopez Albujar", 8420681865l, 2, "Patronato del libro" );
        libros[2] = new Libro("Paco yunque", "Cesar Vallejo", 1259060977, 1, "Universidad Ricardo Palma" );
        libros[3] = new Libro("Los gallinazos sin plumas", "Julio Ramos Riveiro", 1247514142, 1, "Patronato del libro" );
        libros[4] = new Libro("La fiesta del chivo", "Mario Vargas Llosa", 1247514131, 1, "Alfaguara" );
        libros[5] = new Libro("De los Apeninos a los andes", "Edmondo de amicis", 1247514125, 1, "Biblioteca de clásicos universales" );

        System.out.println(hayLibrosIguales(libros));
        int size = libros.length;
        for(int i=0; i<size-1;i++){
            for(int j=i+1; j<size;j++){
                if(libros[i].getTitulo().compareTo(libros[j].getTitulo())>0){
                    Libro aux = libros[i];
                    libros[i] = libros[j];
                    libros[j] = aux;
                }
            }
        }

        for(Libro l: libros){
            //System.out.println(l.getIsbn());
            if(l.validaISBN()){
                l.imprimirDetalleLibro();
            }
        }
    }

    private static boolean hayLibrosIguales(Libro[] libros) {
        boolean flagIguales = false;
        int size = libros.length;
        for(int i=0; i<size-1;i++){
            for(int j=i+1; j<size;j++){
                if(libros[i].equals(libros[j])){
                    flagIguales = true;
                    break;
                }
            }
        }
        return flagIguales;
    }

}
