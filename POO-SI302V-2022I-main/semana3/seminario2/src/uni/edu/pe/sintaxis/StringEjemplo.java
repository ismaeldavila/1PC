package uni.edu.pe.sintaxis;

public class StringEjemplo {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("UNI - FIIS");
        sb.append(" : ");
        sb.append("POO");
        System.out.println(sb);  //UNI - FIIS : POO
        System.out.println();

        StringBuffer sb1 = new StringBuffer();
        sb1.append("FIIS UNI - POO");
        sb1.insert(9, "clase de ");
        System.out.println(sb1);  //FIIS UNI clase de - POO
        System.out.println();

        StringBuffer sb2 = new StringBuffer();
        sb2.append("FIIS UNI clase de - POO");
        sb2.delete(9, 18);
        System.out.println(sb2);  //FIIS UNI - POO
        System.out.println();

        String s = "nestoraudante";
        s.toUpperCase();
        System.out.println(s); //nestoraudante
        System.out.println(s.toUpperCase()); //NESTORAUDANTE
        System.out.println();

        String text = "Intento hacer la prueba de certificacion Java";
        System.out.println(text.indexOf("Intento"));     //imprime 0
        System.out.println(text.indexOf("Intentaba"));     //imprime -1
        System.out.println(text.indexOf("tento"));         //imprime 2
        System.out.println(text.indexOf("la"));         //imprime 14
        System.out.println(text.lastIndexOf("a"));         //imprime 44
        System.out.println(text.lastIndexOf("tenia"));    //imprime -1
        System.out.println(text.startsWith("Intento"));  //true
        System.out.println(text.startsWith("tenia"));     //false
        System.out.println(text.endsWith("Java"));         //true
        System.out.println(text.endsWith("Oracle"));     //false
    }

}
