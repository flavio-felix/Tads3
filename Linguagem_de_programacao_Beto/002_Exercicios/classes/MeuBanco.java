package classes;

public class MeuBanco {
    
    public static void main(String[] args){
        ContaCorrente contaFlavio = new ContaCorrente(0, 500);
        contaFlavio.setNome("Flavio");
        contaFlavio.setAgencia(123);
        contaFlavio.setConta(5555);

        contaFlavio.depositar(200);
        contaFlavio.depositar(50);

   //     System.ou.println("Saldo da conta: "contaFlavio.getSaldo());

   contaFlavio.sacar(10000);
    }

    }
    
   
