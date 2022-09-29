/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg1;
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author Cesar
 */
public class OrdenCompra {
    private Date fecha;
    private ArrayList<DetalleOrden> varl;
    private String estado;
    public OrdenCompra(Date ftoday, String state ){
        fecha = ftoday;
        estado = state;
        this.varl = new ArrayList<DetalleOrden>();
    }
    public void addOrden(DetalleOrden dOrden){
       varl.add(Dorden);
   }
    public float calcPrecioSinIVA(){
       float precio=0;
       DetalleOrden aux = null;
       for(int i = 0; i < varl.size(); i = i +1){
           aux = varl.get(i);
           precio = aux.calcPrecioSinIVA() + precio;
       } 
      return(precio); 
    }
    
    public float calcIVA(){
       float precio=0;
       DetalleOrden aux = null;
       for(int i = 0; i < varl.size(); i = i +1){
           aux = varl.get(i);
           precio = aux.calcIVA() + precio;
       } 
      return(precio); 
    }
    
     public float calcPrecio(){
       float precio=0;
       DetalleOrden aux = null;
       for(int i = 0; i < varl.size(); i = i +1){
           aux = varl.get(i);
           precio = aux.calcPrecio() + precio;
       } 
      return(precio); 
    }
    
     public float calcPeso(){
         float peso=0;
       DetalleOrden aux = null;
       for(int i = 0; i < varl.size(); i = i +1){
           aux = varl.get(i);
           peso = aux.calcPeso() + peso;
       } 
      return(peso); 
     }
}
