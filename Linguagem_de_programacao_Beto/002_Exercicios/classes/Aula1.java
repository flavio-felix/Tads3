package classes;

public class Aula1 {
 
    public static void main(String[] args) {
        //estou crindo um objeto do tipo cachorro chamado doguinho
        //estou instanciando através do operador new
        //apos o new eu chamo o construtor da classe
    Cachorro doguinho = new Cachorro("Doguinho"); // objeto doguinho

    doguinho.setNome("Rex");
    doguinho.setIdade(7);
    doguinho.setRaca("Caramelo");
    doguinho.setDono(true);
    doguinho.setCastrado(false);
    doguinho.setPeso(7.3f);

// System.out.println(doguinho.getNome());
// System.out.println(doguinho.getIdade());
// System.out.println(doguinho.getRaca());
// System.out.println(doguinho.getDono());
//System.out.println(doguinho.getCastrado());
// System.out.println(doguinho.getPeso());
  

System.out.println(doguinho.toString());
    }

}