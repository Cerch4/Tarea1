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
    private ArrayList<Pago> var2;
    private String estado = "Pendiente";
    private DocTributario docT;
    private Cliente client;
    public OrdenCompra(Date ftoday, String state, Cliente C1 ){
        fecha = ftoday;
        estado = state;
        client = C1;
        this.varl = new ArrayList<>();
        this.var2 = new ArrayList<>();
    }
    public void addOrden(DetalleOrden Or){
       varl.add(Or);
   }
    public void addPago(Pago pag){
       var2.add(pag);
   }
   public void setDocTributario(DocTributario dog){
       docT = dog;
   }
   public void setCliente(Cliente exC){
       client = exC;
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
    public void checkState(){
       float pagoactual = 0;
       Pago auxPago = null;
       for(int i = 0; i < varl.size(); i = i +1){
           auxPago = var2.get(i);
           pagoactual = pagoactual+auxPago.getMonto;
       } 
       if(pagoactual == this.calcPrecio()){
           estado = "Pagado";
       }
   }
    public String getEstado(){
        return(estado);
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
     
     public Date getDate(){
         return(fecha);
     }
     public String getEstado(){
         return(estado);
     }
     public void setDate(Date fe){
         fecha = fe;
     }
     public void setEstado(String sta){
         estado = sta;
     }
     public String toString(){
         String tos = null;
         tos = "Fecha: " + fecha.toString() + "Estado: " + estado + "Cliente: "+ "\n"+ client.toString();
         DetalleOrden aux = null;
         for(int i = 0; i < varl.size(); i = i +1){
           aux = varl.get(i);
           tos = tos + aux.toString();
       } 
         return(tos);
     }
}
