package tarea.pkg1;
public class Cliente {
    private String nombre;
    private String rut;
    public Cliente(String nombre, String rut){
        this.nombre = nombre;
        this.rut = rut;
    }
    public String getnombre(){return nombre; }
    public String getrut(){return rut; }
    public void setnombre(String nombre){this.nombre = nombre;}
    public void setrut(String rut){this.rut = rut;}
}