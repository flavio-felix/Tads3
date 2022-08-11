package heranca;


public abstract class AnimalTerrestre {

    protected String nome;
    protected String raca;
    protected int idade;

 

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }


    public abstract void emitirSom();
    
}
