package CuentaCorriente;

public class CuentaCorriente {
    private float saldo;

    public CuentaCorriente(float saldo){
        this.saldo = saldo;
    }

    public void retirar(float dinero){
        if(saldo-dinero < 0){
            System.out.println("No tiene dinero suficiente.");
        }else {
            saldo -= dinero;
        }
    }
    public void ingresar(float dinero){
        saldo += dinero;
    }
    public float verSaldo(){
        System.out.println("Tiene " + saldo + "€");
        if(saldo > 1000000){
            System.out.println("Eres asquerosamente rico, comparte algo.");
        }
        return saldo;
    }


    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
