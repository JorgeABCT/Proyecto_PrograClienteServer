/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prograclienteserver;

import javax.swing.JOptionPane;

/**
 *
 * @author XPC
 */
public class ListaCliente {
    private NodoCliente cabeza;
    

    public NodoCliente getCabeza() {
        return cabeza;
    }

    // Agrega personas en lista enlanzada
    public void inserta(Cliente dato){
        NodoCliente nuevo = new NodoCliente(dato);
        if(cabeza==null){
            cabeza = nuevo;
        }else if(dato.getId()<=cabeza.getCliente().getId()){
            nuevo.setSiguiente(cabeza);
            cabeza=nuevo;
        }else if(cabeza.getSiguiente()==null){
            cabeza.setSiguiente(nuevo);
        }else{
            NodoCliente aux=this.cabeza;
            while(aux.getSiguiente()!=null && aux.getSiguiente().getCliente().getId()<dato.getId()){
                aux=aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }
    
    public String buscar() {
    NodoCliente aux = cabeza;
    boolean bandera=false;// para saber si lo encontramos
         int buscar=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Id del cliente"));
        while(aux!=null){
            if(aux.getCliente().getId()==buscar){ //lo busca si lo encuentra muestra los datos
                return "ID: " + aux.getCliente().getId() +
                        "\nNombre: " + aux.getCliente().getNombre() +
                        "\nApellido: "+aux.getCliente().getApellidos() +
                        "\nEmail: "+ aux.getCliente().getEmail()+
                        "\nNumero de Telefono: "+aux.getCliente().getTelefono();
            }
            aux=aux.getSiguiente();
        }
        return "No se encontro el usuario";
    }
    
    public String mostrarNombres(){
        NodoCliente aux = cabeza;
        String guardar = "";
        int nombre = 0;
        while (aux != null) {
            guardar += "Nombre "+nombre+": ";
            guardar += aux.getCliente().getNombre();
            guardar+="\n";
            aux = aux.getSiguiente();
            nombre++;
        }
        return guardar;
    }
    
    public String mostrarClientes() {
        NodoCliente aux = cabeza;
        String guardar = "";
        while (aux != null) {
            guardar += aux.getCliente().MostrarDatos();
            guardar += "\n";
            aux = aux.getSiguiente();
        }
        return guardar;
    }
}
