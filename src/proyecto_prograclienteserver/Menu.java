/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prograclienteserver;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author XPC
 */
public class Menu {
    ManejoBD mane = new ManejoBD();
    ListaCliente lista = new ListaCliente();
    ListaTarjetas listaT = new ListaTarjetas();
    public void Importar(){
        mane.Importar(lista);
    }
    public void MostrarDatos(){
        JOptionPane.showMessageDialog(null, lista.mostrarClientes());
    }
    
    public void MenuCliente(){
        int opcion = 0;
        while(opcion!=5){
            String[] opciones = {"Mostrar Info", "Solicitar Tarjeta", "Ingresar dinero", "Retirar dinero", "Crear cuenta", "Salir"};
                opcion = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opción",
                "Menu Cliente",
                0,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[5]
            );
            switch(opcion){
                case 0:{
                    String buscar = JOptionPane.showInputDialog("Escriba la ID (cedula) a buscar");
                    String contra = JOptionPane.showInputDialog("Escriba su contrasenna");
                    mane.select(buscar, contra);
                break;
                }
                case 1:{
                    JOptionPane.showMessageDialog(null, "1");
                break;}
                case 2:{
                    JOptionPane.showMessageDialog(null, "2");
                break;}
                case 3:{
                    JOptionPane.showMessageDialog(null, "3");
                break;}
                case 4: {
                    if (JOptionPane.showConfirmDialog(null, "Quiere crear una cuenta?", "Confirmar",
                            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        String nombre = JOptionPane.showInputDialog("Escriba su nombre\nSin apellidos");
                        if (nombre == null) {
                            JOptionPane.showMessageDialog(null, "Se ha cancelado la creacion de cuenta");
                            break;
                        }
                        String apellido = JOptionPane.showInputDialog("Escriba sus apellidos");
                        if (apellido == null) {
                            JOptionPane.showMessageDialog(null, "Se ha cancelado la creacion de cuenta");
                            break;
                        }
                        int id = 0;
                        try {
                            id = Integer.parseInt(JOptionPane.showInputDialog("Escriba su ID (Cedula en formato 101110111)"));
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Escriba un numero valido");
                        }
                        String email = JOptionPane.showInputDialog("Escriba su email");
                        if (email == null) {
                            JOptionPane.showMessageDialog(null, "Se ha cancelado la creacion de cuenta");
                            break;
                        }
                        String telefono = JOptionPane.showInputDialog("Escriba su numero de telefono");
                        if (telefono == null) {
                            JOptionPane.showMessageDialog(null, "Se ha cancelado la creacion de cuenta");
                            break;
                        }
                        String contra = JOptionPane.showInputDialog("Escriba una contrasenna para la cuenta");
                        if (contra == null) {
                            JOptionPane.showMessageDialog(null, "Se ha cancelado la creacion de cuenta");
                            break;
                        }
                        int pin = 0;
                        try {
                            pin = Integer.parseInt(JOptionPane.showInputDialog("Escriba un PIN para entrar al banco"));
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Escriba un numero valido");
                        }
                        JOptionPane.showMessageDialog(null, mane.insertarCliente(id, nombre, apellido, email, telefono, contra, pin));
                        lista.inserta(new Cliente(id, nombre, apellido, email, telefono, contra, pin, false));
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Se ha cancelado la creacion de cuenta");
                        break;
                    }
                }
                case 5:{
                break;}
            }
        }
    }
    
    public void MenuEmpleado(){
        int opcion = 0;
        while(opcion!=5){
            String[] opciones = {"Mostrar Info", "Solicitar Tarjeta", "Ingresar dinero", "Retirar dinero", "Crear cuenta", "Salir"};
                opcion = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opción",
                "Menu Cliente",
                0,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[5]
            );
            switch(opcion){
                case 1: {}}
    }
}
}
