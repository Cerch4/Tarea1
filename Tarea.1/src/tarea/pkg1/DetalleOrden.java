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
        cantidad = k;
        Art = A1;
    }
    public float calcPrecio(){
     return((float)1.19*Art.getPrecio()*(float)cantidad);   
    }
    
    public float calcPrecioSinIVA(){
        return(Art.getPrecio()*19);
    }
    
    public float calcIVA(){
        return (cantidad*Art.getPrecio()*(float)0.19);
    }
    
    public float calcPeso(){
        return(Art.getPeso()*cantidad);
    }
    
    public int getCantidad(){
        return(cantidad);
    }
    public Articulo getArticulo(){
        return(Art);
    }
    public void setArticulo(Articulo artic){
        this.Art = artic;
    }
    public void setCantidad(int Can){
        cantidad = Can;
    }
    @Override
    public String toString(){
        String desc = null;
        desc = "Numero de articulos: " + Float.toString(cantidad)+ "\n"+ Art.toString();
        return(desc);
    }
}
