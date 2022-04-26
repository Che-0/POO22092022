/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentahabiente;

/**
 *
 * @author CHARLY
 */
public class Cuentahabiente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona uno = new Persona();
        
        uno.idCliente = "319199581";
        uno.alias = "Manuel";
        uno.saldo = 200;
        uno.mostrarDatos();
        
        System.out.println("El saldo es de: " + uno.obtenerSaldo());
        uno.depositar(300);
        System.out.println(uno.obtenerSaldo());
        
        
        uno.extraer(200);
        
        System.out.println(uno.obtenerSaldo());
        
        uno.evaluarNivelCliente();
    }
    
}
