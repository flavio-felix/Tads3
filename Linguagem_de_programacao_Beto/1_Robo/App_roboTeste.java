import java.util.Scanner;

public class App_roboTeste {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("----***----O Objeto esta na posicao [0, 0].----***----\n");
        System.out.println("Para mover o objeto escolha:\nD: Direita\nE: Esquerda\nC: Cima\nB: Baixo");
        // System.out.print("\nPosicao: ");
        // String n = sc.nextLine();

        int[] casa = new int[5];
        int somai = 0;
        int somaj = 0;

        String texto = "";

        while (!texto.equalsIgnoreCase("sair")) {
            System.out.print("Escolha um movimento ou digite sair: ");
            String n = sc.next();
            if (casa[somai] > casa.length && casa[somai] < 0) {
                System.out.println("O objeto esta fora da mesa.");
            } else if (n.equalsIgnoreCase("D")) {
                texto = sc.nextLine();
                somai += 1;
                System.out.printf("O objeto esta na posicao: [%d, %d]", somai, somaj);
                }
            if(casa[somai] > casa.length && casa[somai] < 0) {
                System.out.println("O objeto esta fora da mesa.");
            } else if(n.equalsIgnoreCase("E")) {
                texto = sc.nextLine();
                somai -= 1;
                System.out.printf("O objeto esta na posicao: [%d, %d]\n", somai, somaj);
            }
            if(casa[somai] > casa.length && casa[somai] < 0) {
                System.out.println("O objeto esta fora da mesa.");
            }else if(n.equalsIgnoreCase("B")) {
                texto = sc.nextLine();
                somaj += 1;
                System.out.printf("O objeto esta na posicao: [%d, %d]\n", somai, somaj);
            }
            if (casa[somai] > casa.length && casa[somai] < 0) {
                System.out.println("O objeto esta fora da mesa.");
            }else if (casa[somaj] < casa.length && n.equalsIgnoreCase("C")) {
                texto = sc.nextLine();
                somaj -= 1;
                System.out.printf("\nO objeto esta na posicao: [%d, %d]\n", somai, somaj);
            } else {
                System.out.print("Digite um valor valido.\n");
            }
        }

        System.out.printf("O objeto ficou na posicao: [%d, %d]\n", somai, somaj);
        System.out.print("\nObrigado por participar.");

        /*
         * for(i=0; i<casa.length; i++){
         * System.out.print(" " + i);
         * }
         * System.out.print("\n");
         * for(j=0; j<casa.length; j++){
         * System.out.println(j);
         * }
         */
        sc.close();
    }
}

// 0 1 2 3 4
// 0|x|x|x|x|x|
// 1|x|x|x|x|x|
// 2|x|x|x|x|x|
// 3|x|x|x|x|x|
// 4|x|x|x|x|x|

    