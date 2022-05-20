package uni.edu.pe.sobreescritura;

public class CuentaInversiones extends CuentaBancaria {
    private float montoEnEfectivo;
    private float montoDeInversiones;

    public float getMontoEnEfectivo() {
        return montoEnEfectivo;
    }

    public void setMontoEnEfectivo(float montoEnEfectivo) {
        this.montoEnEfectivo = montoEnEfectivo;
    }

    public float getMontoDeInversiones() {
        return montoDeInversiones;
    }

    public void setMontoDeInversiones(float montoDeInversiones) {
        this.montoDeInversiones = montoDeInversiones;
    }

    public float getBalance() {
        return montoDeInversiones+montoEnEfectivo;
    }
}
