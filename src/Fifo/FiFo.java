package Fifo;

import java.util.Random;

public class FiFo {

    private int[] fifo;
    private int[] newFifo;

    public FiFo(int numeroDeElementos){

        fifo = new int[numeroDeElementos];
        for(int i = 0; i < fifo.length; i++){
            fifo[i] = i;
        }

    }

    public void push(int x){
        newFifo = new int[fifo.length+1];
        for(int i = 0; i < fifo.length; i++) {
            newFifo[i] = fifo[i];
        }
        newFifo[fifo.length] = x;

        fifo = newFifo;
    }

    public int pop(){
        if(fifo.length == 0){
            return -1;
        }else {
            int valorARetirar = fifo[0];
            newFifo = new int[fifo.length - 1];
            for (int i = 0; i < newFifo.length; i++) {
                newFifo[i] = fifo[i + 1];
            }

            fifo = newFifo;

            return valorARetirar;
        }
    }

    public void printArray(){
        System.out.print("[");
        for(int i = 0; i < fifo.length; i++){
            if(i < fifo.length-1) {
                System.out.print(fifo[i] + ", ");
            }else{
                System.out.print(fifo[i]);
            }

        }
        System.out.println("]");
    }

}
