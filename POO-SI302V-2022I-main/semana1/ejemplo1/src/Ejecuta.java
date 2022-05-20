public class Ejecuta {
    public static void main(String[] args) {
        Auto a1 = new Auto(0,"clasico","lila");
        Auto a2 = new Auto(1,"deportivo","verde");
        Auto a3= new Auto(2,"lujo","azul");


        //System.out.println(a1.id+" "+a1.modelo+ " "+a1.color);
        //System.out.println(a2.id+" "+a2.modelo+ " "+a2.color);
        //System.out.println(a3.id+" "+a3.modelo+ " "+a3.color);

        System.out.println(a1.getId()+" "+a1.getModelo()+" "+a1.getColor());
        //System.out.println(a1.getId()+" "+a1.getModelo()+" "+a1.getColor());
    }
}
