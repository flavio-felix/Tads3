package classes;

public class ContaPoupanca {
    private String nome;
    private double saldo;
    private int conta;
    private int agencia;

    //---construtor para um saldo inicial 
    public ContaPoupanca(double saldo_inicial){
        this.saldo = saldo_inicial;
    }

    //getter e setters
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    } 

    public int getNConta(){
        return this.conta;
    }
    public void setConta(int c){
        this.conta = c;
    } 
    public int getNAgencia(){
        return this.agencia;
    }
    public void setNAgencia(int a){
        this.nome = a;
    } 

    public String sacar(int valor){
        if(valor > 0 && valor <= saldo){
            this.saldo -= valor;
            return "Saque efetuado, etire seu dinheiro.";
        }
        return "Erro ao efetuar o saque, verifique o valor.";

        }
    

    public String depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            return "Deposito efetuado";
        }
        return "Deposito não efetuado! Verifique o valor";
    }
}

    


    