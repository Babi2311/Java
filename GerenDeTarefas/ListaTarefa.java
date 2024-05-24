package GerenDeTarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarefa {
    private static ArrayList<Tarefa> tarefas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("--- MENU LISTA DE TAREFAS ---");
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Adicionar nova tarefa");
            System.out.println("2. Marcar tarefa como concluída");
            System.out.println("3. Listar todas as tarefas");
            System.out.println("4. Listar tarefas por categoria");
            System.out.println("5. Ordenar tarefas");
            System.out.println("6. Remover tarefa");
            System.out.println("7. Sair");

            switch (opcao) {
                case 1:
                    adicionarTarefa();
                    break;
                case 2:
                    marcarTarefaConcluida();
                    break;
                case 3:
                    listarTodasTarefas();
                    break;
                case 4:
                    listarTarefasPorCategoria();
                    break;
                case 5:
                    ordenarTarefas();
                    break;
                case 6:
                    removerTarefa();
                    break;
                case 7:
                    System.out.println("Saindo..");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcao != 7);

        scanner.close();

    }

    public static void adicionarTarefa() {
        System.out.println("Descrição da tarefa: ");
        String descricao = scanner.nextLine();
        System.out.println("Categoria da tarefa: ");
        String categoria = scanner.nextLine();

        Tarefa tarefa = new Tarefa(descricao, categoria);
        tarefas.add(tarefa);

        System.out.println("Tarefa adicionada com sucesso!");
    }

    public static void marcarTarefaConcluida() {
        System.out.println("Descrição da tarefa a ser marcada como concluída: ");
        String descricao = scanner.nextLine();

        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefa.marcarConcluida();
                System.out.println("Tarefa marcada como concluída!");
                return;
            }
        }
        System.out.println("Tarefa não encontrada");
    }

    public static void listarTodasTarefas() {
        System.out.println("-- Lista De Tarefas --");
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

    public static void listarTarefasPorCategoria() {
        System.out.println("Categoria da tarefa: ");
        String categoria = scanner.nextLine();
        System.out.println("Terefas na Categoria: " + categoria);

        boolean encontrouTarefa = false;
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getCategoria().equals(categoria)) {
                System.out.println(tarefa);
                encontrouTarefa = true;
            }
        }

        if (!encontrouTarefa) {
            System.out.println("Nenhuma tarefa encontrada para a categoria " + categoria);
        }
    }

    public static void ordenarTarefas() {

    }

    public static void removerTarefa() {
        System.out.println("Descrição da tarefa a ser removida: ");
        String descricao = scanner.nextLine();

        boolean remover = false;
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefas.remove(tarefa);
                remover = true;
                System.out.println("Tarefa removida com sucesso!!");
                break;
            }
            if (!remover) {
                System.out.println("Funcionário não encontrado");
            }
        }
    }
}
