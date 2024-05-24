package GerenDeFuncionario;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        funcionarios.add(new Gerente("José", "1234", 3.800, "Marrom", 100));
        funcionarios.add(new Gerente("Maria", "5678", 4.800, "Laranja", 200));
        funcionarios.add(new Desenvolvedor("Bárbara", "0987", 5.400, "PHP"));
        funcionarios.add(new Desenvolvedor("Kelvin", "6543", 8.900, "Java"));
        funcionarios.add(new Estagiario("Gustavo", "4321", 1.300, "José", 6));
        funcionarios.add(new Estagiario("Matheus", "5931", 1.100, "Maria", 4));
       

        int opcao;

        do{
            System.out.println("---- Menu ----");
            System.out.println("Escolha uma opção");
            System.out.println("1. Adicionar funcionário");
            System.out.println("2. Exibir todos");
            System.out.println("3. Excluir funcionário");
            System.out.println("4. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarFuncionario();
                    break;
                case 2:
                    exibirTodos();
                    break;
                case 3:
                    excluirFuncionario();
                    break;
                case 4:
                    System.out.println("saindo...");
                    break;
                default:
                    System.out.println("Erro!! Tente novamente!!");
                    break;
            }
        }while(opcao != 4);
        
    }

    private static void adicionarFuncionario() {
        System.out.println("\nEscolha o tipo de funcionário que gostaria adicionar:");
        System.out.println("1. Desenvolvedor");
        System.out.println("2. Estagiário");
        System.out.println("3. Gerente");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.println("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        switch (tipo) {
            case 1:
                System.out.println("Tecnologia: ");
                String tecnologia = scanner.nextLine();
                funcionarios.add(new Desenvolvedor(nome, matricula, salario, tecnologia));
                break;
            case 2:
                System.out.println("Horas trabalhas: ");
                int horas = scanner.nextInt();
                System.out.println("Supervisor: ");
                String supervisor = scanner.nextLine();
                funcionarios.add(new Estagiario(nome, matricula, salario, supervisor, horas));
                break;
            case 3:
                System.out.println("Bônus Anual: ");
                double bonusAnual = scanner.nextDouble();
                System.out.println("Equipe: ");
                String equipe = scanner.nextLine();
                funcionarios.add(new Gerente(nome, matricula, salario, equipe, bonusAnual));
                break;
            default:
                System.out.println("Erro!! Funcionário não adicionado.");
                break;
        }

    }

    private static void exibirTodos() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario);
                
            }
        }
    }

    private static void excluirFuncionario() {
        System.out.println("Digite a matrícula do funcionario que gostaria de excluir: ");
        String matricula = scanner.nextLine();
        boolean removido = false;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getMatricula().equals(matricula)) {
                funcionarios.remove(funcionario);
                removido = true;
                System.out.println("Funcionário excluido com sucesso!!");
                break;
            }
            if (!removido) {
                System.out.println("Funcionário não encontrado");
            }
        }
    }


}
