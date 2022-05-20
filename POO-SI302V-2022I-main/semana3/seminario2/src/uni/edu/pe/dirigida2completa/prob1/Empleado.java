package uni.edu.pe.dirigida2completa.prob1;

import java.util.Objects;

public class Empleado {

    //Se declara una constante para el tipo de impuesto a la renta
    public static final Double TIPO_IR= 20D;

    private String nombre;
    private String apellido;
    private String dni;
    private Double sueldoBase;
    private Double pagoHoraExtras;
    private Integer horasExtrasMes;
    private Double porcentajeIR;
    private String estadoCivil;
    private Integer nroHijos;

    public Empleado(String dni){
        this.dni = dni;
    }

    public Empleado(String nombre, String apellido, String dni, Double sueldoBase, Double pagoHoraExtras, Integer horasExtrasMes, Double porcentajeIR, String estadoCivil, Integer nroHijos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtras = pagoHoraExtras;
        this.horasExtrasMes = horasExtrasMes;
        this.porcentajeIR = porcentajeIR;
        this.estadoCivil = estadoCivil;
        this.nroHijos = nroHijos;
    }

    public Double sueldoNeto(){
        return obtenerSueldoBruto()-obtenerRetenciones();
    }


    public Double obtenerMontoHorasExtras(){

        return pagoHoraExtras*horasExtrasMes;
    }

    public Double obtenerSueldoBruto(){
        return getSueldoBase()+ obtenerMontoHorasExtras();
    }

    public Double obtenerRetenciones(){
        Double retenciones = porcentajeIR;

        if(estadoCivil == "casado"){
            retenciones -= 2;
        }

        if(nroHijos>0){
            retenciones -= nroHijos;
        }

        return obtenerSueldoBruto()*retenciones;
    }


    public String visualizaEmpleado(){
        return this.toString();
    }

    public void visualizaTodo(){
        String dato = visualizaEmpleado()+" Sueldo base: ["+this.sueldoBase+"], monto horas extras: ["+obtenerMontoHorasExtras()+"], sueldo bruto: ["+
                obtenerSueldoBruto()+"], retencion de impuesto a la renta: ["+obtenerRetenciones()+"], sueldo neto: ["+ sueldoNeto()+"]";
        System.out.println(dato);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(Double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public Double getPagoHoraExtras() {
        return pagoHoraExtras;
    }

    public void setPagoHoraExtras(Double pagoHoraExtras) {
        this.pagoHoraExtras = pagoHoraExtras;
    }

    public Integer getHorasExtrasMes() {
        return horasExtrasMes;
    }

    public void setHorasExtrasMes(Integer horasExtrasMes) {
        this.horasExtrasMes = horasExtrasMes;
    }

    public Double getPorcentajeIR() {
        return porcentajeIR;
    }

    public void setPorcentajeIR(Double porcentajeIR) {
        this.porcentajeIR = porcentajeIR;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Integer getNroHijos() {
        return nroHijos;
    }

    public void setNroHijos(Integer nroHijos) {
        this.nroHijos = nroHijos;
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", nroHijos=" + nroHijos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(dni, empleado.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
