import java.util.Scanner;

public class App_robo{
  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] casa = new int[5][5];

        System.out.println("Para mover o objeto escolha:\nD: Direita\nE: Esquerda\nC: Cima\nB: Baixo");
        for(int i=0; i<casa.length;i++){
            String n = sc.nextLine();
                if(n.equalsIgnoreCase("D")){
                    i++;} if(n.equalsIgnoreCase("E")){
                        i--;
                    }
            for(int j=0; j<casa.length;j++){
                    if(n.equalsIgnoreCase("B")){
                        j++;} if(n.equalsIgnoreCase("C")){
                            j--;
                            System.out.println(casa[j]);
                        }
                    }

        
/*
        for(i=0; i<casa.length; i++){
            System.out.print(" " + i);
            }
        System.out.print("\n");
        for(j=0; j<casa.length; j++){
            System.out.println(j);
            }
*/
        }
    }}
     


      
 


    //   0 1 2 3 4
    // 0|x|x|x|x|x|
    // 1|x|x|x|x|x|
    // 2|x|x|x|x|x|
    // 3|x|x|x|x|x|
    // 4|x|x|x|x|x|



