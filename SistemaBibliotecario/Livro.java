package poo.SistemaBibliotecario;

import java.util.Scanner;

public class Livro {
    private String nome;
    private String editora;
    private String anoLancamento;

    /// GETTERS AND SETTERS---------------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    /// CONSTRUTORES-----------------------------------
    Livro(String _nome,
            String _editora,
            String _anoLancamento) {
        this.nome = _nome;
        this.editora = _editora;
        this.anoLancamento = _anoLancamento;
    }

    //// METODO PARA IMPRIMIR O NOME DO LIVRO
    public String livroCadastrado() {
        return ("Livro Cadastrado:" +
                "Livro: " + this.nome +
                "\nEditora: " + this.editora +
                "\nAno: " + this.anoLancamento);

    } ///// TIRAR DÚVIDA COM O PROFESSOR - PQ NAO ESTA ACEITANDO O OVERRIDE

    /// METODO PARA CADASTRO DO LIVRO -----------------
    public static Livro cadastroLivro() {
        Scanner sc = new Scanner(System.in);
        /// nome do livro
        System.out.print("Insira o titulo do livro: ");
        String _nome = sc.next();

        /// Editora
        System.out.print("Insira a Editora: ");
        String _editora = sc.next();

        /// Ano lancamento
        System.out.print("Insira o ano de lancamento: ");
        String _anoLancamento = sc.next();

        // CONSTRUTOR
        Livro novoLivro = new Livro(_nome, _editora, _anoLancamento);
        sc.close();
        return novoLivro;

    }
}
