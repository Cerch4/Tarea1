package tarea.pkg1;
import java.util.Date;
public class DocTributario {
    private Cliente C;
    private Date fecha;
    public DocTributario(Cliente c, Date fecha){
        C = c;
        this.fecha = fecha;
    }
    public String getnombre(){return C.getnombre(); }
    public String getrut(){return C.getrut(); }
    public Date getfecha(){return fecha; }
    public void setnombre(String nombre){C.setnombre(nombre);}
    public void setrut(String rut){C.setrut(rut);}
    public void setfecha(Date fecha){this.fecha = fecha;}
}
class Boleta extends DocTributario{public Boleta(Cliente c, Date fecha){super(c, fecha);}}
class Factura extends DocTributario{public Factura(Cliente c, Date fecha){super(c, fecha);}}
