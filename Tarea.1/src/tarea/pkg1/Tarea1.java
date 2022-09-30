/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg1;

/**
 *
 * @author cefranco2021
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Articulo test = new Articulo(27, "Cerbeza Stones", "Cerbeza que no da asco", 250);
        String test2 = test.toString();
        System.out.print(test);
        
        DetalleOrden OrdenTest = new DetalleOrden(7, test);
        String testDetalle = OrdenTest.toString();
        System.out.print(testDetalle);
    }
    
}
