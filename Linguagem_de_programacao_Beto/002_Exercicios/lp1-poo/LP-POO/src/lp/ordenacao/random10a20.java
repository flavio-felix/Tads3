package lp.ordenacao;

import java.util.Random;

public class random10a20 {

    public static void main(String[] args) {
        
        int vetor[] = new int[10];
        Random aleatorio = new Random();

        int min = 10, max = 20;
        int qto = 0;

        for(int i=0; i < 10; i++){
            boolean found = true;
            int temp = 0;
                while(found){
                    found = false;
                    temp = aleatorio.nextInt(max - min) + min;
                    for(int j  = 0; j < qto; j++){
                        if(temp == vetor[j]){
                            found  = true;
                }
            }
        }
        vetor[i] = temp;
        System.out.println(temp + " ");
        qto++;
        } 

    }
}
