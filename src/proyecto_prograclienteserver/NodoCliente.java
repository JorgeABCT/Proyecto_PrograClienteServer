/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prograclienteserver;

/**
 *
 * @author XPC
 */
public class NodoCliente {
    private Cliente cliente;
    private NodoCliente siguiente;

    public NodoCliente(Cliente cliente) {
        this.cliente = cliente;
        this.siguiente = null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public NodoCliente getSiguiente() {
        return siguiente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setSiguiente(NodoCliente siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "NodoCliente{" + "cliente=" + cliente + '}';
    }
}
