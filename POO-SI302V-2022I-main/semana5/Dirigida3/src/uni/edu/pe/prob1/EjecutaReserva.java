package uni.edu.pe.prob1;

import java.util.Arrays;
import java.util.List;

public class EjecutaReserva {


    public static void main(String[] args) {

        Habitacion h1 = new Habitacion(Habitacion.HABITACION_DOBLE, 2);
        Habitacion h2 = new Habitacion(Habitacion.HABITACION_SENCILLA, 3);
        Habitacion h3 = new Habitacion(Habitacion.HABITACION_SUITE, 1);
        Habitacion h4 = new Habitacion(Habitacion.HABITACION_SENCILLA, 1);
        Habitacion h5 = new Habitacion(Habitacion.HABITACION_DOBLE, 2);
        Habitacion h6 = new Habitacion(Habitacion.HABITACION_SUITE, 3);

        Usuario u1 = new Usuario("nestor","45326512", 24);
        Usuario u2 = new Usuario("juan","44536212", 26);
        Usuario u3 = new Usuario("julian","45325689", 22);
        Usuario u4 = new Usuario("enrique","48635983", 21);
        Usuario u5 = new Usuario("yuro","42536847", 19);
        Usuario u6 = new Usuario("javier","49863522", 20);
        Usuario u7 = new Usuario("juan","42532213", 21);
        Usuario u8 = new Usuario("enrique","49864356", 20);

        Habitacion[] habitaciones1 = {h1,h2,h3};
        Habitacion[] habitaciones2 = {h1,h3};
        Habitacion[] habitaciones3 = {h1,h2,h3,h4};
        Habitacion[] habitaciones4 = {h1,h5,h3};
        Habitacion[] habitaciones5 = {h5,h6,h3};
        Habitacion[] habitaciones6 = {h6,h2};



        Reserva r1 = new Reserva(u1,habitaciones1);
        Reserva r2 = new Reserva(u2,habitaciones2);
        Reserva r3 = new Reserva(u3,habitaciones3);
        Reserva r4 = new Reserva(u4,habitaciones4);
        Reserva r5 = new Reserva(u5,habitaciones5);
        Reserva r6 = new Reserva(u6,habitaciones6);
        Reserva r7 = new Reserva(u7,habitaciones1);
        Reserva r8 = new Reserva(u8,habitaciones3);

        Reserva[] reservas = {r1,r2,r3,r4,r5,r6, r7, r8};
        for(int i=0; i< reservas.length-1;i++){
            for(int j= i+1; j< reservas.length;j++){
                if(reservas[i].getUsuario().getNombre().compareTo(reservas[j].getUsuario().getNombre())>0){
                    intercambia(reservas, i,j);
                }else if(reservas[i].getUsuario().getNombre().compareTo(reservas[j].getUsuario().getNombre())==0) {
                    if(reservas[i].getMontoReserva()<reservas[j].getMontoReserva()){
                        intercambia(reservas, i,j);
                    }
                }
            }
        }

        for(Reserva res: reservas){
            //System.out.println(res);
            System.out.println("Reserva: "+res.getNroReserva()+" usuario: "+res.getUsuario().getNombre()+" dni: "+res.getUsuario().getDni()+" monto: "+res.getMontoReserva());
        }
    }

    private static void intercambia(Reserva[] reservas, int i, int j) {
        Reserva aux = reservas[i];
        reservas[i] = reservas[j];
        reservas[j] = aux;
    }
}
