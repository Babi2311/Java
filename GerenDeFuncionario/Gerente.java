package GerenDeFuncionario;
public class Gerente extends Funcionario{
    
    private String equipe;
    private double bonusAnual;

    public Gerente(String nome, String matricula, double salario, String equipe, double bonusAnual){
        super(nome, matricula, salario);
        this.equipe = equipe;
        this.bonusAnual = bonusAnual;
    }

    @Override
    public void calcularSalario(){
        double salarioFinal = getSalario() + getBonusAnual();
        System.out.println("O salario final: " + salarioFinal);
    }

    public String getEquipe(){
        return equipe;
    }

    public void setEquipe(String equipe){
        this.equipe = equipe;
    }

    public double getBonusAnual(){
        return bonusAnual;
    }


    public void setBonusAnual() {
        this.bonusAnual = bonusAnual;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Bônus Anual: " + bonusAnual + ", Equipe: " + equipe;
    }

    public void trabalhar() {
        System.out.println("O gerente está trabalhando");
    }

    public void relatarProgresso() {
        System.out.println("O gerente já terminou sua parte");
    }

}
