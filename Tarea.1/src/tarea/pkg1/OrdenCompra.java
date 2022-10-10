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
    private String estado = "Pago pendiente";
    private DocTributario Doc; 
    private Cliente client;
    private Direccion Dir;
    
    
    public OrdenCompra(Date ftoday, Cliente C1, Direccion Adress ){
        fecha = ftoday;
        client = C1;
        this.varl = new ArrayList<>();
        this.var2 = new ArrayList<>();
        Dir = Adress;
    }
    
    public void addOrden(DetalleOrden Or){
       varl.add(Or);
   }
    
    public void addPago(Pago pag){
       var2.add(pag);
       float pagoactual = 0;
       Pago auxPago = null;
       for(int i = 0; i < var2.size(); i = i +1){
           auxPago = var2.get(i);
           pagoactual = pagoactual+auxPago.getmonto();
       } 
       if(pagoactual >= this.calcPrecio()){
           estado = "Pagado emitido";
       }
   }
    
    public float DevolucionEfectivo(){
       float pagoactual = 0;
       Pago auxPago = null;
       int flag = -1;
       for(int i = 0; i < var2.size(); i = i +1){
           auxPago = var2.get(i);
           pagoactual = pagoactual + auxPago.getmonto();
           if ("Efectivo".equals(auxPago.getClass().getSimpleName())){
               flag = i;
           }
       }
       if((flag != -1) && (pagoactual > this.calcPrecio())){
           Efectivo auxPago2 = new Efectivo(var2.get(flag).getmonto(), var2.get(flag).getfecha());
           return(auxPago2.calcDevolucion(this.calcPrecio()));
     }
       else {
           return((float)0);
       }               
    }

   public void setDocTributario(DocTributario dog){
       Doc = dog;
   }
   
   public void setCliente(Cliente exC){
       client = exC;
   }
   
   public void setDate(Date fe){
         fecha = fe;
     }
   public void setEstado(String sta){
         estado = sta;
     }
   
   public String getEstado(){
        return(estado);
    }
   
   public Date getDate(){
         return(fecha);
     }
   
   
   public DocTributario getDocTributario(){
      if(Doc != null){
           return(Doc);
      }
      else {
          return null;
      }
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
     

    @Override
     public String toString(){
         String tos = null;
         if(Doc != null){
         tos = "Fecha: " + fecha.toString() + "\n" + "Estado: " + estado +  "\nDatos de cliente: \n"+ client.toString()+ "\nDocumento Tributario:\n" + Doc.toString() + "\nDatos Productos:\n" ;     
         }
         else {
          tos = "Fecha: " + fecha.toString() + "\n" + "Estado: " + estado +  "\nDatos de cliente: \n"+ client.toString() + "\nDatos Productos:\n" ;     
         }
        
         DetalleOrden aux = null;
         for(int i = 0; i < varl.size(); i = i +1){
           aux = varl.get(i);
           tos = tos + aux.toString();
       } 
         tos = tos + "\nDevolucion:" + this.DevolucionEfectivo();
         return(tos);
     }
}
