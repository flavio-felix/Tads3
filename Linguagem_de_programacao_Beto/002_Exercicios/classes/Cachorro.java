package classes;

public class Cachorro {
//----Atributos------//
    private String nome;
    private int idade;
    private String raca;
    private boolean dono;
    private boolean castrado;
    private float peso;


    //-------CONSTRUTORES--------//
   // public Cachorro () {}
    public Cachorro(String name){
        this.setNome(name);
        System.out.println("Criando o objeto com o nome: " + this.nome);
    }

    //------GETTER E SETTERS------///
    //***nome ***/
    public void setNome(String n){
        this.nome = n;
    }

    public String getNome(){
        return this.nome;
    }
    //***idade ***/
    public void setIdade(int i){
        this.idade = i;
    }
    public int getIdade(){
        return this.idade;
    }
   //*** raca ***/
   public void setRaca(String r){
    this.raca = r;
   }
   public String getRaca(){
        return this.raca;
   }
   //** dono ***/
   public void setDono(boolean d){
        this.dono = d;
   }
   public boolean getDono(){
        return this.dono;
   }
   /// castrado----//
   public void setCastrado(boolean c){
        this.castrado = c;
   }
   public boolean getCastrado(){
        return this.castrado;
   }
     //** peso ***/
    public void setPeso(float p){
        this.peso = p;
    }
    public float getPeso(){
        return this.peso;
    }
/// METODOS ////
public String toString(){
    return (
        "Nome: " + this.nome+
        "\nIdade: "+this.idade+
        "\nRaça: "+this.raca+
        "\nDono: "+this.dono+
        "\nCastrado: "+this.castrado+
        "\nPeso: "+this.peso
        );
        
}


    }
