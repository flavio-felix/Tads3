package poo.SistemaBibliotecario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Emprestimo {
    private String servidor;
    private String livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private String estudante;

    public Emprestimo() {
        super();
    }

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getEstudante() {
        return estudante;
    }

    public void setEstudante(String estudante) {
        this.estudante = estudante;
    }

    /// METODO PARA IMPRIMIR O LIVRO RETIRADO
    public String imprimirEmprestimo() {
        return ("O " + this.livro + "\nRetirado em: " +
                this.dataEmprestimo + "\nDevolucao em:" + this.dataDevolucao);
    }

    /// METODO PARA RETIRAR UM LIVRO
    public static Emprestimo cadastrarEmprestimo() {
        Scanner sc = new Scanner(System.in);

        // inserir nome do servidor
        System.out.print("Digite o nome do servidor: ");
        String _servidor = sc.next();
        Emprestimo servidor = new Emprestimo();
        servidor.setServidor(_servidor);

        // inserir nome do livro
        System.out.print("Digite o nome do livro: ");
        String _livro = sc.next();
        Emprestimo livro = new Emprestimo();
        livro.setServidor(_livro);

        // inserir data do emprestimo
        System.out.print("Digite data da retirada(dd/mm/aaa): ");
        String dataEmpDigitada = sc.next();
        DateTimeFormatter dataEmpFormatada = DateTimeFormatter.ofPattern(dataEmpDigitada);
        LocalDate _dataEmprestimo = LocalDate.parse(dataEmpDigitada, dataEmpFormatada);

        Emprestimo dataEmp = new Emprestimo();
        dataEmp.setDataEmprestimo(_dataEmprestimo);

        // inserir data do devolucao
        System.out.print("Digite data da devolucao(dd/mm/aaa): ");
        String dataDevDigitada = sc.next();
        DateTimeFormatter dataDevFormatada = DateTimeFormatter.ofPattern(dataDevDigitada);
        LocalDate _dataDevolucao = LocalDate.parse(dataDevDigitada, dataDevFormatada);

        Emprestimo dataDev = new Emprestimo();
        dataDev.setDataDevolucao(_dataDevolucao);

        return dataDev;
    }

}
