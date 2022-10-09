package tarea.pkg1;
public class Direccion {
    private String direccion;
    public Direccion(String Direccion){
        this.direccion = direccion;
    }
    public String getdireccion(){return direccion; }
    public void setdireccion(String direccion){this.direccion = direccion;}
    public String direcciontoString(){return("La direccion es:" + direccion);}
}
