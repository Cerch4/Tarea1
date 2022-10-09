package tarea.pkg1;
public class Tarjeta extends Pago{
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
    @Override
    public String toString(){
        return ("Monto pagado: " + super.getmonto() + "\nFecha del pago: " + super.getfecha().toString() + "\n Tipo de tarjeta: " + tipo + "\n Numero de Transaccion: " + numTransaccion);
    }
}
