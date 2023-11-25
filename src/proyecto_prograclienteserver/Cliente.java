/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prograclienteserver;

/**
 *
 * @author XPC
 */
public class Cliente implements Persona{
    private int id;
    private String nombre, apellidos, email, telefono, contra;
    private int pin;
    private boolean tarjeta;

    public Cliente(int id, String nombre, String apellidos, String email, String telefono, String contra, int pin, boolean tarjeta) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.contra = contra;
        this.pin = pin;
        this.tarjeta = tarjeta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String MostrarDatos() {
        return "ID: " + id + "\nNombre: " + nombre + "\nApellidos: " + apellidos + "\nEmail: " + email + "\nTelefono: " + telefono + "\nContra: " + contra +"\nTiene tarjetas: "+tarjeta;
    }

}
