package poo.SistemaBibliotecario;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static final String[] OPCOES = {
            "---- xxxx || SISTEMA BIBLIOTECA TADS3 || xxxx -----",
            "------------->>SELECIONE UMA OPCAO<<---------------",
            "***************************************************",
            "              1 - Cadastrar um livro               ",
            "           2 - Cadastrar um Funcionario            ",
            "              3 - Cadastrar um Aluno               ",
            "              4 - Cadastrar um Autor               ",
            "            5 - Realizar um empréstimo             ",
            "                   6 - Devolucao                   ",
            "                     0 - Sair                      ",
            "***************************************************"
    }; //// usando o final para nunca se alterar o formato

    private static List<Livro> addLivros = new ArrayList<Livro>();
    private static List<Funcionario> addFuncionario = new ArrayList<Funcionario>();
    private static List<Estudante> addEstudantes = new ArrayList<Estudante>();
    private static List<Autor> addAutor = new ArrayList<Autor>();
    private static List<Emprestimo> addEmprestimo = new ArrayList<Emprestimo>();

    private static Scanner sc = new Scanner(System.in);

    /// -----------------------------------------------------------------------
    public static void main(String[] args) throws IOException {
        /// loop do menu
        int op = 1;
        while (op != 0) {
            imprimirMenu();
            System.out.print("\nOpcao: ");
            op = sc.nextInt();
            escolherOpcao(op);
            System.in.read(); // System("pause")
        }
    }

    //// ---------------------------------------------------------------------
    /// imprimir o menu
    private static void imprimirMenu() {
        for (String op : OPCOES) {
            System.out.println(op);
        }
    }

    //// --------------------------------------------------------------------
    /// escolher opcao

    private static void escolherOpcao(int op) {
        switch (op) {
            case 1:
                Livro novoLivro = Livro.cadastroLivro();
                System.out.println(novoLivro.livroCadastrado()); /// METODO CRIADO PARA IMPRIMIR O
                // NOME DO LIVRO
                addLivros.add(novoLivro);
                System.out.println("ENTER PARA CONTINUAR!!!");
                break;
            case 2:
                Funcionario novoFuncionario = Funcionario.cadastroFuncionario();
                System.out.println(novoFuncionario.imprimirNome());
                addFuncionario.add(novoFuncionario);
                System.out.println("ENTER PARA CONTINUAR!!!");
                break;
            case 3:
                Estudante novoEstudante = Estudante.cadastrarEstudante();
                System.out.println(novoEstudante.imprimirEstudante());
                addEstudantes.add(novoEstudante);
                System.out.println("ENTER PARA CONTINUAR!!!");
                break;
            case 4:
                Autor novoAutor = Autor.cadastrarAutor();
                System.out.println(novoAutor.imprimirAutor());
                addAutor.add(novoAutor);
                System.out.println("ENTER PARA CONTINUAR!!!");
                break;
            case 5:
                Emprestimo novoEmprestimo = Emprestimo.cadastrarEmprestimo();
                System.out.println(novoEmprestimo.imprimirEmprestimo());
                addEmprestimo.remove(novoEmprestimo);
                System.out.println("ENTER PARA CONTINUAR!!!");
                break;

            case 6:
                break;

            default:
                System.out.println("*** Saindo do Sistema... ***\n\nOBRIGADO!");
        }
        sc.close();
    }
}
