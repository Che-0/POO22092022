/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentahabiente;

/**
 *
 * @author CHARLY
 */
public class Persona {
   
     //Variables
    String idCliente;
    String alias;
    double saldo;
    
    //metodo
    public void mostrarDatos()
    {
        System.out.println(" El id del cliente es: " + idCliente + "\n " + "Su nombre es: " + alias + "\n " + "Y su saldo es: " + saldo);
    }
    
    //metodo 2 
    double obtenerSaldo()
    {
        System.out.println("Tu saldo es de: "); 
        return saldo;
    }
    
    //metodo 3
     public void depositar(double monto)
    {
        if (monto>0)
        {
        saldo += monto;
        }
        else
        {
            System.out.println("error");
        }
    }
    
    //metodo 3
     public boolean saldoDisponible(double monto)
    {
        return saldo>=monto;
    }
    
    //metodo 4
    public void extraer(double monto )
    {
        if (saldo >= monto)
        {
            System.out.println("Retiraste " + monto + " de tu cuenta");
            saldo -= monto;
        }
        else
        {
            System.out.println("Saldo insuficiente");
        }
    }
    
    //metodo 5
    public void evaluarNivelCliente()
    {
        if (saldo > 50000)
        {
            System.out.println("Cliente Premium");
        }
        else
        {
            System.out.println("Cliente Regular");
        }
        
        
        
    }
}
