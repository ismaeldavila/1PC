package uni.edu.pe.caso1;

public class Ejecuta {
    public static void main(String[] args) {
        Pelota pelota = new Pelota();
        pelota.setGolpes(3);
        Futbolista f1 = new Futbolista();
        Futbolista f2 = new Futbolista();
        Futbolista f3 = new Futbolista();
        Futbolista f4 = new Futbolista();
        Futbolista f5 = new Futbolista();
        Futbolista f6 = new Futbolista();
        Futbolista f7 = new Futbolista();
        Futbolista f8 = new Futbolista();
        Futbolista f9 = new Futbolista();
        Futbolista f10 = new Futbolista();

        Arquero arquero = new Arquero();

        f1.patear(pelota);
        f2.patear(pelota);
        f3.patear(pelota);
        f4.patear(pelota);
        f5.patear(pelota);
        f6.patear(pelota);
        f7.patear(pelota);
        f8.patear(pelota);
        f9.patear(pelota);
        f10.patear(pelota);
        arquero.agarrar(pelota);
        System.out.println(pelota.getGolpes());
    }
}
