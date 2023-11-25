/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prograclienteserver;

/**
 *
 * @author XPC
 */
public class ListaTarjetas {
    private NodoTarjeta cabeza;

    public ListaTarjetas() {
        this.cabeza = null;
    }
    
    public void agregarTarjetaBD(Tarjeta tarjeta) {
        NodoTarjeta nuevoNodo = new NodoTarjeta(tarjeta);
        NodoTarjeta aux = cabeza;
        if (cabeza == null || this.cabeza.getTarjeta().getPropietario() > tarjeta.getPropietario()) {
            nuevoNodo.setSiguiente(cabeza);
            cabeza = nuevoNodo;
        } else {
        while (aux.getSiguiente() != null && aux.getSiguiente().getTarjeta().getPropietario() < tarjeta.getPropietario()) {
                aux = aux.getSiguiente();
            }
            nuevoNodo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevoNodo);
            }  
        }
    
    public String mostrarTarjetas(){
        NodoTarjeta aux = cabeza;
        String guardar = "";
        while (aux != null) {
            guardar = aux.getTarjeta().toString();
            aux = aux.getSiguiente();
        }
        return guardar;
    }
}
