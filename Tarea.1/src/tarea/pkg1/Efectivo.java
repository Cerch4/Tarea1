package tarea.pkg1;

import java.util.Date;


public class Efectivo extends Pago {
    public Efectivo(float monto, Date fech4){
        super(monto, fech4);
    }
    public float calcDevolucion(int pago){
        return super.getmonto()-pago;
    }
    @Override
    public String toString(){
        return ("Monto pagado: " + super.getmonto() + "\nFecha del pago: " + super.getfecha().toString());
    }
}
