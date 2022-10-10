package tarea.pkg1;
import java.util.Date;
public abstract class Pago {
    private float monto;
    private Date fecha;
    public Pago(float monto, Date fecha){
        this.monto = monto;
        this.fecha = fecha;
    }
    public void setmonto(float monto){this.monto = monto;}
    public float getmonto(){return monto;}    
    public void setfecha(int year, int month, int day){fecha = new Date(year,month,day);}
    public Date getfecha(){return fecha;}
    @Override
    public abstract String toString();
}