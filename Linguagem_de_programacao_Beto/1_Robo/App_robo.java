import java.util.Scanner;

public class App_robo{
  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] casa = new int[5][5];

        int d = 1;
        int e = -1;
        int b = 1;
        int c = -1;
        System.out.println("Para mover o objeto escolha:\nD: Direita\nE: Esquerda\nC: Cima\nB: Baixo");
        for(int i=0; i<casa.length; i++){
            String n = sc.nextLine();
                if(n.equalsIgnoreCase("D"))
                for(int j=0; j<casa.length; j++){
                    if(n.equalsIgnoreCase("B"))
                    for(int i=0; i<casa.length; i--){
                        if(n.equalsIgnoreCase("E"))}
                        for(int j=0; j<casa.length; j++){
                            if(n.equalsIgnoreCase("C"))
            }         

        System.out.println("Posicao :"+"("+i+","+j+")");     
        

        for(i=0; i<casa.length; i++){
            System.out.print(" " + i);
            }
        System.out.print("\n");
        for(j=0; j<casa.length; j++){
            System.out.println(j);
            }

        }
    }}
    


      
 


    //   0 1 2 3 4
    // 0|x|x|x|x|x|
    // 1|x|x|x|x|x|
    // 2|x|x|x|x|x|
    // 3|x|x|x|x|x|
    // 4|x|x|x|x|x|



