/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg1;
import java.util.Date;
/**
 *
 * @author cefranco2021
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Articulo arTest = new Articulo((float)0.250, "Cerbeza Stones", "Cerbeza con sabor decente", 950);
        Articulo arTest2 = new Articulo((float)1, "Mayoneza Hellmans", "Para unas cominas inigualables", 2500);
        Articulo arTest3 = new Articulo((float)0.400, "Bebida Energetica Monster", "Para que estudiar para calculo no te de sueño", 1500);
        Articulo arTest4 = new Articulo((float)1, "Super8", "Dulce de chocolate con sabor a chocolate", 800);
        Articulo arTest5 = new Articulo((float)9, "Alimento para perros SabroKan", "Dale a tu mejor amigo lo mejor, dale SabroKan", 10500);
        
        
        Date Today = new Date(2077, 9, 19);
        
        DetalleOrden OrdenTest = new DetalleOrden(7, arTest);
        DetalleOrden OrdenTest2 = new DetalleOrden(2, arTest2);
        DetalleOrden OrdenTest3 = new DetalleOrden(26, arTest3);
        DetalleOrden OrdenTest4 = new DetalleOrden(10, arTest4);
        DetalleOrden OrdenTest5 = new DetalleOrden(2, arTest5);
        
        Direccion Dirtest1 = new Direccion("Casa blanca, Washintong D.C");
        
        Cliente clienTest = new Cliente("Joe Biden", "00000000-1", Dirtest1);
        Cliente clienTest2 = new Cliente("Tutankamon", "66666666-9", Dirtest1);
        
        OrdenCompra JoeOrden = new OrdenCompra(Today, clienTest, clienTest.getdireccion());
        OrdenCompra AlienOrden = new OrdenCompra(Today, clienTest2, clienTest2.getdireccion());
        OrdenCompra AlienOrden2 = new OrdenCompra(Today, clienTest2, clienTest2.getdireccion());
        
        JoeOrden.addOrden(OrdenTest);
        JoeOrden.addOrden(OrdenTest2);
        
        AlienOrden.addOrden(OrdenTest4);
        AlienOrden.addOrden(OrdenTest5);
        
        AlienOrden2.addOrden(OrdenTest3);
        
        Efectivo TestPago= new Efectivo(15000, Today);
        Transferencia pagoTransferencia = new Transferencia("Banco BCO","000000001",JoeOrden.calcPrecio(), Today);
        Tarjeta pagoTarjeta = new Tarjeta("Credito","102397541", AlienOrden2.calcPrecio()/2, Today );
        Efectivo pagoEfectivo = new Efectivo(28045, Today);
        
        Boleta Boleta1 = new Boleta("234123", clienTest.getrut(), clienTest.getdireccion(), Today);
        Factura Factura1 = new Factura("123", clienTest2.getrut(), clienTest2.getdireccion(), Today);
        Boleta Boleta2 = new Boleta("124", clienTest2.getrut(), clienTest2.getdireccion(), Today);
        
        JoeOrden.setDocTributario(Boleta1);
        AlienOrden2.setDocTributario(Factura1);
        AlienOrden.setDocTributario(Boleta2);
        
        AlienOrden.addPago(TestPago);
        JoeOrden.addPago(pagoTarjeta);
        AlienOrden2.addPago(pagoTransferencia);
        AlienOrden2.addPago(pagoEfectivo);
        
        float devolucion = AlienOrden.DevolucionEfectivo();
        float devolucion2 = AlienOrden2.DevolucionEfectivo();
        
        
        String teString1 = AlienOrden.toString();
        String teString2 = AlienOrden2.toString();
        String teString3 = JoeOrden.toString();
        
        System.out.print(teString1+ "\n\n");
        System.out.print(teString1+ "\n\n");
        System.out.print(teString1+ "\n\n");
        
    }
    
}
