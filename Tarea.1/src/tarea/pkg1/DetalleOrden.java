/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg1;

/**
 *
 * @author Cesar
 */
public class DetalleOrden{
    private int cantidad;
    private Articulo Art;
    public DetalleOrden(int k, Articulo A1){
        cantidad = K;
        Art = A1;
    }
    public float calcPrecio(){
     return(0.81*Art.getprecio*cantidad*0.81);   
    }
    
    public float calcPrecioSinIVA(){
        return(Art.getprecio);
    }
    
    public float calcIVA(){
        return(Art.getprecio*0.81*cantidad);
    }
    
    public float calcPeso(){
        return(Art.getPeso*cantidad);
    }
    
    public int getCantidad(){
        return(this.cantidad);
    }
    public int getArticulo(){
        return(this.Art);
    }
}
