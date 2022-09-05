package poo.SistemaBibliotecario;

import java.util.Scanner;

public class Autor extends Pessoa {
    private String formacao;
    private int numLivros;

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public int getNumLivros() {
        return numLivros;
    }

    public void setNumLivros(int numLivros) {
        this.numLivros = numLivros;
    }

    Autor(String _nome) {
        this.nome = _nome;
    }

    //// METOD PARA IMPRIMIR
    public String imprimirAutor() {
        return (this.nome + this.numLivros);
    }

    /// METODO PARA CADASTRAR AUTOR
    public static Autor cadastrarAutor() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o nome do Autor: ");
        String _nome = sc.next();

        /// Nome do autor
        Autor nomeAutor = new Autor(_nome);
        return nomeAutor;
    }

}
