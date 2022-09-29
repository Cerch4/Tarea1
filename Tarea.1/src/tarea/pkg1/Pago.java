package tarea.pkg1;
import java.util.Date;
public class Pago {
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
}

class Efectivo extends Pago{
    public Efectivo(float monto, int year, int month, int day){
        super(monto, year, month, day);
    }
    public float calcDevolucion(){
        return super.getmonto()-calcPrecio(); //corregir cuando este listo calcPrecio
    }
}

class Transferencia extends Pago{
    private String banco;
    private String numCuenta;
    public Transferencia(String banco, String numCuenta, float monto, int year, int month, int day){
        super(monto, year, month, day);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }
    public String getbanco(){return banco;}
    public String getnumCuenta(){return numCuenta;}
    public void setbanco(String banco){this.banco=banco;}
    public void setnumCuenta(String numCuenta){this.numCuenta=numCuenta;}
}

class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
    public Tarjeta(String tipo, String numTransaccion, float monto, int year, int month, int day){
        super(monto, year, month, day);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }
    public String gettipo(){return tipo;}    
    public String getnumTransaccion(){return numTransaccion;}
    public void setipo(String tipo){this.tipo=tipo;}
    public void setnumTransaccion(String numTransaccion){this.numTransaccion=numTransaccion;}
}