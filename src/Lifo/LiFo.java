package Lifo;

public class LiFo {

    private int[] lifo;
    private int[] newLifo;

    public LiFo(){
        lifo = new int[0];
    }

    public LiFo(int numeroDeElementos){

        lifo = new int[numeroDeElementos];
        for(int i = 0; i < lifo.length; i++){
            lifo[i] = i;
        }

    }

    public void push(int x){
        newLifo = new int[lifo.length+1];
        for(int i = 0; i < lifo.length; i++) {
            newLifo[i+1] = lifo[i];
        }
        newLifo[0] = x;

        lifo = newLifo;
    }

    public int pop(){
        if(lifo.length == 0){
            return -1;
        }else {
            int valorARetirar = lifo[0];
            newLifo = new int[lifo.length - 1];
            for (int i = 0; i < newLifo.length; i++) {
                newLifo[i] = lifo[i + 1];
            }

            lifo = newLifo;

            return valorARetirar;
        }
    }

    public void printArray(){
        System.out.println("|   |");
        for(int i = 0; i < lifo.length; i++){
            System.out.println("| " + lifo[i] + " |");

        }
        System.out.println("TTTTT");
    }
}
