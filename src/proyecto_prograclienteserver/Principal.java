/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_prograclienteserver;

import javax.swing.JOptionPane;

/**
 *
 * @author XPC
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //hola
        //probando si sirve
        //AAAAA
        //Holaa
        
        ManejoBD mane = new ManejoBD();
        Menu menu = new Menu();
        menu.Importar();
        menu.MostrarDatos();
        menu.MenuCliente();
    }
    
}
