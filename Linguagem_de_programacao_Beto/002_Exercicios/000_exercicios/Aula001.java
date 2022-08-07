import java.util.Scanner;
import javax.swing.plaf.synth.SynthScrollBarUI;

public class Aula001 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Nota do aluno: ");
        float nota = teclado.nextFloat();
            System.out.printf("A nota de %s eh %.2f", nome, nota);
            }
    }
    
