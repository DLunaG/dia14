package CuentaCorriente;
//Crear una clase CuentaCorriente, que contendrá el saldo del usuario y los siguientes métodos:
//- retirar(int cantidad) (OJO, NO SE PUEDE RETIRAR MÁS DE LO QUE SE TIENE!)
//- ingresar(int cantidad)

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Con cuánto dinero va a iniciar su cuenta corriente?");
        float inicioCuenta = sc.nextFloat();
        CuentaCorriente cliente = new CuentaCorriente(inicioCuenta);
        boolean power = true;
        float movimiento = -1;

        while(power) {
            System.out.println("¿Qué desea usted hacer?\n1.Retirar dinero.\n2.Ingresar dinero.\n3.Ver saldo\n4.Salir ");
            int eleccion = sc.nextInt();
            switch(eleccion){
                case 1:
                    System.out.println("¿Cuánto quiere retirar?");
                    movimiento = sc.nextFloat();
                    cliente.retirar(movimiento);
                    break;
                case 2:
                    System.out.println("¿Cuánto quiere ingresar?");
                    movimiento = sc.nextFloat();
                    cliente.ingresar(movimiento);
                    break;
                case 3:
                    cliente.verSaldo();
                    break;
                case 4:
                    System.out.println("Gracias por utilizar JDVBank. \nSu dinero nos hace fuertes.");
                    power = false;
                    break;
                default:
                    System.out.println("Número inválido.");
            }
        }
    }
}
