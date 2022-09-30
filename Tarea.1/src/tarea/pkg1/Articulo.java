/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg1;

/**
 *
 * @author Cesar
 */
public class Articulo {
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;
    public Articulo(float k, String nom, String desc, float pre){
        peso = k;
        nombre = nom;
        descripcion = desc;
        precio = pre;
    }
    public float getPeso(){
        return(peso);
    }
    public float getPrecio(){
        return(precio);
    }
    public String getNombre(){
        return(nombre);
    }
    public String getDescripcion(){
        return(descripcion);
    }
    
    public void setPeso(int k){
        peso = k;
    }
    public void setNombre(String N){
        nombre = N;
    }
    public void setDescripcion(String D){
        descripcion = D;
    }
    public void setPrecio(int P){
        precio = P;
    }
    
    @Override
    public String toString(){
        String desc = null;
        desc = "Nombre articulo: "+nombre + "\n"+ "Peso(kg): " +Float.toString(peso) + "\n"+ "Precio: $" + Float.toString(precio) + "\n" + "Descripcion: " + descripcion + "\n";
        return(desc);
    }
}

