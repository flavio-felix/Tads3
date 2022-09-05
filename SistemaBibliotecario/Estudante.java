package poo.SistemaBibliotecario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Estudante extends Pessoa {
    private String rA;
    private String curso;
    private LocalDate dataMatricula;

    //// GETTER AND SETTERS----------------------
    public String getrA() {
        return rA;
    }

    public void setrA(String rA) {
        this.rA = rA;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    /// CONSTRUTORES------------------------------
    Estudante(String _nome,
            String _sobreNome,
            LocalDate _dtNascimento,
            String _curso,
            String _rA,
            LocalDate _dataMatricula) {
        this.nome = _nome;
        this.sobreNome = _sobreNome;
        this.dtNascimento = _dtNascimento;
        this.curso = _curso;
        this.rA = _rA;
        this.dataMatricula = _dataMatricula;
    }

    /// METODO PARA IMPRIMIR O NOME DO ESTUDANTE
    public String imprimirEstudante() {
        return ("Aluno\t" + this.nome +
                " da matricula " + this.rA +
                " cadastrado com sucesso.");
    }

    /// METODO PARA CADASTRAR ESTUDANTE
    public static Estudante cadastrarEstudante() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String _nome = sc.next();

        System.out.print("Sobrenome: ");
        String _sobreNome = sc.next();

        System.out.print("Data nascimento(dd/mm/aaaa): ");
        String dtNasc = sc.next();
        DateTimeFormatter dataNascFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate _dtNascimento = LocalDate.parse(dtNasc, dataNascFormatada);

        System.out.print("Curso: ");
        String _curso = sc.next();

        System.out.print("RA: ");
        String _rA = sc.next();

        System.out.print("Data da Matricula(dd/mm/aaaa): ");
        String dataMat = sc.next();
        DateTimeFormatter dataMatFormatada = DateTimeFormatter.ofPattern("ddd/MM/yyyy");
        LocalDate _dataMatricula = LocalDate.parse(dataMat, dataMatFormatada);

        Estudante nomeEstudante = new Estudante(_nome, _sobreNome, _dtNascimento, _curso, _rA, _dataMatricula);
        return nomeEstudante;
    }
}
