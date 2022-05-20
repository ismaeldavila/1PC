package uni.edu.pe.interfaceEjemplo;

import java.util.ArrayList;
import java.util.List;

public class Ejecuta {
    public static void main(String[] args) {

        Auto auto = new AutoDeLujo();
        auto.acelerar();
        auto.desacelerar();
        auto.rotar();
        auto.calcularRecorrido();
        auto.recargarCombustible();

        Avion avion = new Avion();
        Barco barco = new Barco();

        avion.acelerar();


        Consumible auto2 = new AutoDeportivo();
        auto2.calcularRecorrido();
        auto2.recargarCombustible();


        //auto2.acelerar();

        /*
        Auto auto3 = (Auto)auto2;
        auto3.acelerar();
        */

        System.out.println("entrando a iterar");
        //ArrayList<Consumible> listAutos = new ArrayList<>();
        List<Consumible> listAutos = new ArrayList<>();
        //listAutos.add(auto);
        listAutos.add(avion);
        listAutos.add(barco);
        //listAutos.add(auto2);

        for(Consumible consumible: listAutos){
            consumible.calcularRecorrido();
        }



    }
}
