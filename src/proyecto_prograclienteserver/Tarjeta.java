/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_prograclienteserver;
import java.util.Random;
import java.time.LocalDate;
/**
 *
 * @author XPC
 */
public class Tarjeta {
    private int propietario;
    private String numeroTarjeta;
    private int CVV;
    private String fechaVencimiento;
    private int balance;
    private boolean activa;

    public Tarjeta(int propietario) {
        LocalDate fecha = LocalDate.now();
        Random rand = new Random();
        String numeros = "5518";
        for (int i = 0; i < 12; i++) {
            int digito = rand.nextInt(10);
            numeros += digito;
        }
        String cvv = "";
        for (int i = 0; i < 3; i++) {
            int digito = rand.nextInt(10);
            cvv += digito;
        }
        int anno = fecha.getYear();
        int mes = fecha.getMonthValue();
        anno+=5;
        
        this.propietario = propietario;
        this.numeroTarjeta = numeros;
        this.CVV = Integer.parseInt(cvv);
        this.fechaVencimiento = anno+"-"+mes+"-01";
        this.balance = 0;
        this.activa = false;
    }

    public int getPropietario() {
        return propietario;
    }

    public void setPropietario(int propietario) {
        this.propietario = propietario;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    @Override
    public String toString() {
        return "Propietario: " + propietario + "\nNumero de Tarjeta: " + numeroTarjeta + "\nCVV: " + CVV + "\nFecha de Vencimiento" + fechaVencimiento + "\nBalance" + balance;
    }

    
}
