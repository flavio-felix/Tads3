package poo.SistemaBibliotecario;

import java.time.LocalDate;
import java.util.Scanner;

public class Funcionario extends Pessoa {

    private String matricula;
    private LocalDate dtAdmissao;
    private String cargo;

    //// GETTER AND SETTERS----------------------
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDtAdmissao() {
        return dtAdmissao;
    }

    public void setDtAdmissao(LocalDate dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /// CONSTRUTORES------------------------------
    Funcionario(String _nome,
            String _sobreNome,
            String _matricula) {
        this.nome = _nome;
        this.sobreNome = _sobreNome;
        this.matricula = _matricula;
    }

    /// METODO PARA IMPRIMIR O NOME
    public String imprimirNome() {
        return ("O funcionario " + this.nome + " " +
                this.sobreNome +
                " da matricula " + this.matricula +
                " foi cadastrado.");
    }

    /// METODO PARA CADASTRAR FUNCIONARIO
    public static Funcionario cadastroFuncionario() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro nome: ");
        String _nome = sc.next();

        System.out.print("Digite sobrenome: ");
        String _sobreNome = sc.next();

        System.out.print("Digite a matricula: ");
        String _matricula = sc.next();

        Funcionario nomeFuncionario = new Funcionario(_nome, _sobreNome, _matricula);
        return nomeFuncionario;

    }

}
