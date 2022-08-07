package classes;


public class ContaCorrente {
    private String nome;
    private double saldo;
    private int conta;
    private int agencia;
    private double limite;

    //---construtor para um saldo inicial 
    public ContaCorrente(double saldo, double limite){
        this.saldo = saldo;
        this.limite = limite;
    }

    //getter e setters
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    } 

    public int getConta(){
        return this.conta;
    }
    public void setConta(int c){
        this.conta = c;
    } 
    public int getAgencia(){
        return this.agencia;
    }
    public void setAgencia(int a){
        this.agencia = a;
    }

    public double getLimite(){
        return this.limite;
    }
    public void setLimite(double l){
        this.limite = l;
    }


    public void depositar(double valor){
        if(valor > 0) {
            this.saldo += valor;
            System.out.println("Saldo = R$"+this.saldo);
            System.out.println( "Deposito efetuado");
            }
        }
    public void sacar(int valor){
        if(valor > 0 && valor <= this.saldo + this.limite){
            this.saldo -= valor;
            System.out.println("Saque efetuado, retire seu dinheiro");
            System.out.println("Saldo = R$"+this.saldo);
        }
    }
    }
