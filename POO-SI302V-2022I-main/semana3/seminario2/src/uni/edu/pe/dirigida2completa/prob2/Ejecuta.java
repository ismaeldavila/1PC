package uni.edu.pe.dirigida2completa.prob2;

import java.util.ArrayList;
import java.util.List;

public class Ejecuta {
    public static void main(String[] args) {
        CuentaBancaria cb1 = new CuentaBancaria(42123451L, 12000.5D,0.1D);
        cb1.ingresar(100D);
        cb1.ingresar(50D);
        cb1.retirar(30D);
        //ponemos los dias que la cuenta lleva creada, asumimos en cada caso pues no no los indican
        cb1.actualizarSaldo(50);
        cb1.imprimirDetalle();
        CuentaBancaria cb2 = new CuentaBancaria(42123452L, 14000.5D,0.12D);
        cb2.ingresar(100D);
        cb2.ingresar(50D);
        cb2.retirar(60D);
        cb2.actualizarSaldo(20);
        cb2.imprimirDetalle();
        CuentaBancaria cb3 = new CuentaBancaria(42123453L, 18000.5D,0.12D);
        cb3.ingresar(120D);
        cb3.ingresar(50D);
        cb3.retirar(80D);
        cb3.actualizarSaldo(20);
        cb3.imprimirDetalle();
        CuentaBancaria cb4 = new CuentaBancaria(42123454L, 17000.5D,0.11D);
        cb4.ingresar(100D);
        cb4.ingresar(50D);
        cb4.retirar(30D);
        cb4.actualizarSaldo(50);
        cb4.imprimirDetalle();
        CuentaBancaria cb5 = new CuentaBancaria(42123455L, 11000.5D,0.13D);
        cb5.ingresar(100D);
        cb5.ingresar(50D);
        cb5.retirar(30D);
        cb5.actualizarSaldo(60);
        cb5.imprimirDetalle();
        CuentaBancaria cb6 = new CuentaBancaria(42123456L, 15600.5D,0.14D);
        cb6.ingresar(50D);
        cb6.ingresar(30D);
        cb6.retirar(200D);
        cb6.actualizarSaldo(80);
        cb6.imprimirDetalle();

        List<CuentaBancaria> lstCta = new ArrayList<>();
        lstCta.add(cb1);
        lstCta.add(cb2);
        lstCta.add(cb3);
        lstCta.add(cb4);
        lstCta.add(cb5);
        lstCta.add(cb6);

        int nroCtas = lstCta.size();
        for(int i=0; i<nroCtas-1;i++){
            for(int j=i+1;j<nroCtas;j++){
                if(lstCta.get(i).equals(lstCta.get(j))){
                    System.out.println("cuentas iguales encontradas");
                    // agregandole una excepción para validar, bastaba con el mensaje anterior
                    throw new RuntimeException("Cuentas iguales");
                }
            }
        }

        Double montoTotal = 0.0D;
        Double mayorSaldo = -1D;
        CuentaBancaria ctaMayorSaldo = null;

        for(CuentaBancaria cb: lstCta){
            montoTotal += cb.getSaldoActual();
            if(cb.getSaldoActual()>mayorSaldo){
                mayorSaldo = cb.getSaldoActual();
                ctaMayorSaldo = cb;
            }
        }

        System.out.println("Saldo promedio de las cuentas: "+montoTotal/nroCtas);
        System.out.println("Cuenta con mayor saldo: DNI: ["+ctaMayorSaldo.formateaDNI()+
                "], numero de cuenta: ["+ctaMayorSaldo.getNroCuenta()+"], saldo actual ["
                +ctaMayorSaldo.getSaldoActual()+"]");

    }
}
