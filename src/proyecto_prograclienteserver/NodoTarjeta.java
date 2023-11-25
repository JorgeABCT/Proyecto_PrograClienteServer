/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prograclienteserver;

/**
 *
 * @author XPC
 */
public class NodoTarjeta {
    private Tarjeta tarjeta;
    private NodoTarjeta siguiente;

    public NodoTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
        this.siguiente = null;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public NodoTarjeta getSiguiente() {
        return siguiente;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public void setSiguiente(NodoTarjeta siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "NodoTarjeta{" + "tarjeta=" + tarjeta + '}';
    }
}
