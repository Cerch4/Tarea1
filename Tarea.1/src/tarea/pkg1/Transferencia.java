package tarea.pkg1;
public class Transferencia extends Pago{
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
    String PagotoString(){
        return ("Monto pagado: " + super.getmonto() + "\nFecha del pago: " + super.getfecha().toString() + "\nBanco: " + banco + "\nNumero de cuenta: " + numCuenta);
    }
}
