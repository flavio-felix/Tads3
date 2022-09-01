import java.util.Scanner;

public class App_robo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("----***----O Objeto esta na posicao [0, 0].----***----\n");
        System.out.println("Para mover o objeto escolha:\nD: Direita\nA: Esquerda\nW: Cima\nS: Baixo");

        int somai = 0;
        int somaj = 0;

        String n = "";

        while (!n.equalsIgnoreCase("sair")) {
            System.out.print("Escolha um movimento ou digite sair: ");
            n = sc.next();
            // n = n;
            if (n.equalsIgnoreCase("D")) {
                n = sc.nextLine();
                somai += 1;
            } else if (n.equalsIgnoreCase("A")) {
                n = sc.nextLine();
                somai -= 1;
            } else if (n.equalsIgnoreCase("W")) {
                n = sc.nextLine();
                somaj += 1;
            } else if (n.equalsIgnoreCase("S")) {
                n = sc.nextLine();
                somaj -= 1;
            } else {
                if (!n.equalsIgnoreCase("sair"))
                    System.out.print("\n---***--- Digite um valor valido!---***---\n".toUpperCase());
            }
            if (somai > 4 || somai < 0 || somaj > 4 || somaj < 0) {
                System.out.println("O objeto vai cair. Escolha outra movimento! ");
            } else {
                System.out.printf("\n*** O objeto ficou na posicao: ".toUpperCase() +
                        "[%d, %d] ***\n", somai, somaj);
            }
        }

        // System.out.printf("O objeto ficou na posicao: [%d, %d]\n", somai, somaj);
        System.out.print("\nObrigado por participar.\n\n\n" + "***********");

        /*
         * for (int i = 0; i <= 4; i++) {
         * System.out.print(" " + i);
         * }
         * System.out.print("\n");
         * for (int j = 0; j <= 4; j++) {
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
