/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libro;

/**
 *
 * @author CHARLY
 */
public class Libro {

    //var
    String nombre;
    String autor;
    int paginas;
    int fechaPublicacion;
    int precio;
    int vida;
    //Constructor
    public Libro(String nombre, String autor, int paginas, int fechaPublicacion,int precio, int vida)
    {
        
        this.nombre = nombre;
        this.autor = autor;
        this.paginas = paginas;
        this.fechaPublicacion = fechaPublicacion;
        this.precio = precio;
        this.vida = vida;
    }

    //Getters 
    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getFechaPublicacion() {
        return fechaPublicacion;
    }

    public int getPrecio() {
        return precio;
    }
    
    public int getVida(){
        return vida;
    }
    
    
    //metodo 1  restarle "vida" cada que lo metetes a la mochila 
    int guardar ()
    {
        this.vida = this.vida -5;
        return vida;
    }
    
    //metodo 2  (leer 10 paginas) 
    
    int leer()
    {
        this.paginas = paginas-10;
        return(paginas);
    }
    
    //metodo 3
    
    void declarar()
    {
        System.out.println ("Los datos de tu libro son: ");
        System.out.println (this.nombre + " de " + this.autor + " con " +this.paginas + " paginas " + "y se publico en " + this.fechaPublicacion + ", cuesta $" + this.precio );
        /*System.out.println (this.autor);
        System.out.println (this.paginas);
        System.out.println (this.fechaPublicacion);
        System.out.println (this.precio);
        System.out.println (this.vida);*/
    }
            
    public static void main(String[] args) {
        
        //instancia
        Libro libro1 = new Libro("Filosofia en el tocador","Marques de Sade",127,1795,100,100);
        
        //metodos
        int guardarlo = libro1.guardar();
        System.out.println("la 'salud' de la pasta de tu libro es de " + guardarlo +"%");
        
        int leerlo = libro1.leer();
        System.out.println("Restan " + leerlo + " paginas por leer");
        
        libro1.declarar();
    
}
}
