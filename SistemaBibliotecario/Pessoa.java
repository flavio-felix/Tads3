package poo.SistemaBibliotecario;

import java.time.LocalDate;

public class Pessoa {
    protected String nome;
    protected String sobreNome;
    protected LocalDate dtNascimento;
    protected String Endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

}
