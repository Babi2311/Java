package GerenDeFuncionario;
public class Desenvolvedor extends Funcionario {
    
    private String tecnologia;

    public Desenvolvedor(String nome, String matricula, double salario, String tecnologia) {
        super(nome, matricula, salario);
        this.tecnologia = tecnologia;
    }

    @Override
    public void calcularSalario(){
        double salarioFinal = getSalario();
        System.out.println("O salario final: " + salarioFinal);
    }

    public String getTecnologia(){
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Tecnologia: " + tecnologia;
    }

    public void trabalhar() {
        System.out.println("O desenvolvedor está trabalhando");
    }

    public void relatarProgresso() {
        System.out.println("O desenvolvedor já terminou sua parte");
    }
}
