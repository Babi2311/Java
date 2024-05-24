package GerenDeFuncionario;
public class Estagiario extends Funcionario {
    
    private String supervisor;
    private int horas;

    public Estagiario(String nome, String matricula, double salario, String supervisor, int horas) {
        super(nome, matricula, salario);
        this.supervisor = supervisor;
        this.horas = horas;
    }

    @Override
    public void calcularSalario(){
        double salarioFinal = getSalario() * getHoras();
        System.out.println("O salario final: " + salarioFinal);
    }


    public String getSupervisor(){
        return supervisor;
    }

    public void setSupervisor(String supervisor){
        this.supervisor = supervisor;
    }

    public int getHoras(){
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Horas: " + horas + ", Supervisor: " + supervisor;
    }

    public void trabalhar() {
        System.out.println("O estágiario está trabalhando");
    }

    public void relatarProgresso() {
        System.out.println("O estágiario já terminou sua parte");
    }

}
