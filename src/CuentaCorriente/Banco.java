package CuentaCorriente;

public class Banco {

    float saldo1;
    float saldo2;

    public Banco(float saldo1, float saldo2){
        this.saldo1 = saldo1;
        this.saldo2 = saldo2;
    }

    public void transferencia(CuentaCorriente src, CuentaCorriente dst, float cuanto){
        if(src.getSaldo()>=cuanto) {
            src.retirar(cuanto);
            dst.ingresar(cuanto);
        }else{
            System.out.println("Operación no permitida.");
        }
    }

    /*public float[] transferencia(float dineros){
        saldo2 += dineros;
        saldo1 -= dineros;
        float[] saldos = {saldo1, saldo2};
        return saldos;

    }*/
}
