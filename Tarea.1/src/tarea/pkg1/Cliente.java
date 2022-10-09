package tarea.pkg1;
public class Cliente {
    private String nombre;
    private String rut;
    private Direccion direccion;
    public Cliente(String nombre, String rut, Direccion direccion){
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }
    public String getnombre(){return nombre; }
    public String getrut(){return rut; }
    public Direccion getdireccion(){return direccion;}
    public void setnombre(String nombre){this.nombre = nombre;}
    public void setrut(String rut){this.rut = rut;}
    public void setdireccion(Direccion direccion){this.direccion = direccion;}
    @Override
    public String toString(){
        return("Nombre del Cliente: "+nombre+"\n Rut del Cliente: "+rut+"Direccion del Cliente: "+direccion.getdireccion());
    }
}
