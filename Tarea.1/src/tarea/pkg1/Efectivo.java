package tarea.pkg1;
public class Efectivo extends Pago {
    public Efectivo(float monto, int year, int month, int day){
        super(monto, year, month, day);
    }
    public float calcDevolucion(int pago){
        return super.getmonto()-pago;
    }
    @Override
    public String toString(){
        return ("Monto pagado: " + super.getmonto() + "\nFecha del pago: " + super.getfecha().toString());
    }
}
