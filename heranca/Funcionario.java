package heranca;

public class Funcionario {

    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString(){
        return "{"+"matricula = "+"'" + getMatricula() +"'"+"}";
    }
}
