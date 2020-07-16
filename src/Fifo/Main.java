package Fifo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Buenas, introduce la longitud de matriz que quieres generar: ");
        int longitud = sc.nextInt();
        FiFo matriz = new FiFo(longitud);
        System.out.println("Creada matriz con " + longitud + " elementos.");

        boolean power = true;
        int option = 0;
        int numAAñadir;
        while(power){
            while(option < 1 || option > 4) {
                System.out.println("Elige opción: \n" +
                        "1.Añadir elemento.\n" +
                        "2.Retirar elemento.\n" +
                        "3.Imprimir elementos.\n" +
                        "4.Salir del programa.");
                option = sc.nextInt();
                if(option < 1 || option > 4){
                    System.out.println("Número inválido!");
                }
            }
            switch(option){
                case 1:
                    System.out.println("¿Cué número quieres añadir?");
                    numAAñadir = sc.nextInt();
                    matriz.push(numAAñadir);
                    System.out.println("Elemento añadido: ");
                    option = 0;
                    break;
                case 2:
                    System.out.println("Se procede a quitar el primer elemento....");
                    System.out.println("Elemento \"" + matriz.pop() + "\" retirado.");
                    option = 0;
                    break;
                case 3:
                    matriz.printArray();
                    option = 0;
                    break;
                case 4:
                    power = false;
                    System.out.println("Gracias por utilizar el fifufaifo.");
                    break;

            }

        }

    }
}
