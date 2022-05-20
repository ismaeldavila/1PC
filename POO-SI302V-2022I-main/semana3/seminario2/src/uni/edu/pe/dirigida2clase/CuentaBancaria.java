package uni.edu.pe.dirigida2clase;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CuentaBancaria {
    private Long nroCuenta;
    private Long dni;
    private Double saldoActual;
    private Double interes;

    public CuentaBancaria(Long dni, Double saldoActual, Double interes) {
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public void actualizarSaldo(int nroDias){
        Double intDario = this.interes/365;
        this.saldoActual+= intDario*nroDias;
    }

    public void ingresar(Double monto){
        this.saldoActual += monto;
    }

    public void retirar(Double monto){
        if(this.saldoActual > monto){
            this.saldoActual -= monto;
        }else{
            System.out.println("Error, monto insuficiente, no se debito");
        }
    }

    public void imprimirDetalle(){
        System.out.println(this.toString());
    }

    public String formateaDNI(){
        return this.dni +""+ this.calcularLetra();
    }

    private String calcularLetra() {

        Map<Integer, Character> hm = new HashMap<>();
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

        //System.out.println(hm);
        //System.out.println(hm.get(1));
        int resto = (int)(this.dni%23) ;
        return String.valueOf(hm.get(resto));

    }

    /*
    public static void main(String[] args) {
        calcularLetra();
    }
    */



    public CuentaBancaria() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuentaBancaria that = (CuentaBancaria) o;
        return Objects.equals(nroCuenta, that.nroCuenta) && Objects.equals(dni, that.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nroCuenta, dni);
    }
}
