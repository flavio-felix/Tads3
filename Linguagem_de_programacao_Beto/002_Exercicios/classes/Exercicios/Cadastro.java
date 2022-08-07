package classes.Exercicios;

public class Cadastro {
    //----atributos----
    private String clientes;
    
    //----construtores----
    public Cadastro(String name){
        this.setNome(name);
    }
    //----Getter and setters-----
    public void setNome(String n){
        this.clientes = n;
    System.out.println("Construindo o objeto: "+this.clientes);
    }
//----metodos----
public String toString(){
    return("Nome: "+this.clientes);
}

}
