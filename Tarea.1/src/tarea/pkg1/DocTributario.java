package tarea.pkg1;
import java.util.Date;
public abstract class DocTributario {
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
    public Direccion getdireccion(){return direccion; }
    public Date getfecha(){return fecha; }
    public void setnumero(String numero){this.numero = numero;}
    public void setrut(String rut){this.rut = rut;}
    public void setdireccion(Direccion direccion){this.direccion = direccion;}
    public void setfecha(Date fecha){this.fecha = fecha;}
    @Override
    public abstract String toString();
}
class Boleta extends DocTributario{
    public Boleta(String numero, String rut, Direccion direccion, Date fecha){
        super(numero, rut, direccion, fecha);
    }
    @Override
    public String toString(){
        return("Tipo de Documento Tributario: Boleta" + "\nNumero Documento: " + super.getnumero() + "\nRut: " + super.getrut() + "\n" + super.getdireccion().toString() + "Fecha: " + super.getfecha().toString());
    }
}
class Factura extends DocTributario{
    public Factura(String numero, String rut, Direccion direccion, Date fecha){
        super(numero, rut, direccion, fecha);
    }
    @Override
    public String toString(){
        return("Tipo de Documento Tributario: Factura" + "\nNumero Documento: " + super.getnumero() + "\nRut: " + super.getrut() + "\n" + super.getdireccion().toString() + "\nFecha: " + super.getfecha().toString());
    }
}
