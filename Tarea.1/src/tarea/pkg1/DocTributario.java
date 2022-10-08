package tarea.pkg1;
import java.util.Date;
public class DocTributario {
    private String numero;
    private String rut;
    private Direccion direccion;
    private Date fecha;
    public DocTributario(String numero, String rut, Direccion direccion, Date fecha){
        this.numero = numero;
        this.rut = rut;
        this.direccion = direccion;
        this.fecha = fecha;
    }
    public String getnumero(){return numero; }
    public String getrut(){return rut; }
    public String getdireccion(){return direccion; }
    public Date getfecha(){return fecha; }
    public void setnumero(String numero){this.numero = numero;}
    public void setrut(String rut){this.rut = rut;}
    public void setdireccion(String direccion){this.direccion = direccion;}
    public void setfecha(Date fecha){this.fecha = fecha;}
}
class Boleta extends DocTributario{public Boleta(String rut, Direccion direccion, Date fecha){super(rut, direccion, fecha);}}
class Factura extends DocTributario{public Factura(String rut, Direccion direccion, Date fecha){super(rut, direccion, fecha);}}
