package tarea.pkg1;
import java.util.Date;
public abstract class Pago {
    private float monto;
    private Date fecha;
    public Pago(float monto, int year, int month, int day){
        this.monto = monto;
        fecha = new Date(year,month,day);
    }
    public void setmonto(float monto){this.monto = monto;}
    public float getmonto(){return monto;}    
    public void setfecha(int year, int month, int day){fecha = new Date(year,month,day);}
    public Date getfecha(){return fecha;}
    @Override
    public abstract String toString();
}