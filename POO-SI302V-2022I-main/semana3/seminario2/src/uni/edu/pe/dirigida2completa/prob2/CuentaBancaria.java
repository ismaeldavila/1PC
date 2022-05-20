package uni.edu.pe.dirigida2completa.prob2;

import java.util.HashMap;
import java.util.Map;

public class CuentaBancaria {
    private static Long nroCuenta;
    private Long dni;
    private Double saldoActual;
    private Double interes;
    private static Long ultimoNroCuenta=100001L;
    public CuentaBancaria() {
        this.nroCuenta = ultimoNroCuenta;
        ultimoNroCuenta++;
    }

    public CuentaBancaria(Long dni, Double saldoActual, Double interes) {
        this();
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public void actualizarSaldo(int nroDias){
        Double intDiario = this.interes/360;
        this.saldoActual += intDiario*nroDias;
    }

    public void imprimirDetalle(){
        System.out.println(this.toString());
    }

    public void ingresar(Double monto){
        this.saldoActual += monto;
    }

    public void retirar(Double monto){
        this.saldoActual -= monto;
    }

    public String formateaDNI(){
        return this.dni + ""+caculaLetra();
    }

    public String caculaLetra(){
        //Muchos hn implementado esta funcionalidad con arreglos y con switch
        //yo lo hare con hashMap para que tengan un ejemplo de uso
        Map<Integer, Character> hm = new HashMap();
        hm.put(0,'T');
        hm.put(1,'R');
        hm.put(2,'W');
        hm.put(3,'A');
        hm.put(4,'G');
        hm.put(5,'M');
        hm.put(6,'Y');
        hm.put(7,'F');
        hm.put(8,'P');
        hm.put(9,'D');
        hm.put(10,'X');
        hm.put(11,'B');
        hm.put(12,'N');
        hm.put(13,'J');
        hm.put(14,'Z');
        hm.put(15,'S');
        hm.put(16,'Q');
        hm.put(17,'V');
        hm.put(18,'H');
        hm.put(19,'L');
        hm.put(20,'C');
        hm.put(21,'K');
        hm.put(22,'E');
        int resto = (int) (this.dni%23);
        return String.valueOf(hm.get(resto));
    }


    public Long getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(Long nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public Double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(Double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "nroCuenta=" + nroCuenta +
                ", dni=" + dni +
                ", saldoActual=" + saldoActual +
                ", interes=" + interes +
                '}';
    }
}
