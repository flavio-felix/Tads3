package heranca;



public class App {

    public static void main(String[] args) {

        Cao ted = new Cao();

        ted.setNome("ted");
        ted.setIdade(4);
        ted.setRaca("Vira Lata");

        Dono flavio = new Dono();

        flavio.setNome("Flavio");
        flavio.setEndereco("Rua Marcilio, 1920");
        flavio.setAnimal(ted);

        flavio.getAnimal().emitirSom();
        flavio.alimentarAnimal(ted);
        flavio.andar();

        Funcionario bruno = new Funcionario();
        bruno.setMatricula(123456);
        bruno.toString();
        System.out.println(bruno.toString());

        
    }
    
}
