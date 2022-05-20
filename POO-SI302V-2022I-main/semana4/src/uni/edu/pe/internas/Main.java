package uni.edu.pe.internas;

class OuterClass {
    int x = 10;
    static class InnerClass {
        int y = 5;
    }
}
public class Main {

    public static final String TIP_DE_CLASE = "Pausa activa";

    public static void main(String[] args) {
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        System.out.println(myInner.y);

        System.out.println(TIP_DE_CLASE);


    }
}

