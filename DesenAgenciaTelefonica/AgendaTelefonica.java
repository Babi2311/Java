package DesenAgenciaTelefonica;

import java.util.ArrayList;
import java.util.Scanner;


public class AgendaTelefonica implements OperacoesAgenda{
    private static ArrayList<Contato> contatos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica();

        contatos.add(new ContatoPessoal("Joao", "(41)99125-9314", "12/12/2000"));
        contatos.add(new ContatoPessoal("Brayan", "(41)99277-6402", "31/10/2003"));
        contatos.add(new ContatoProfissional("Barbara", "(41)99234-4567", "teste@gmail.com"));

        int opcao;

        do {
            System.out.println("---- MENU ----");
            System.out.println("Escolha uma opção");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Buscar contato");
            System.out.println("3. Ver lista de contatos");
            System.out.println("4. Remover contato");
            System.out.println("5. finalizar programa");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    agenda.adicionar();
                    break;
                case 2:
                    agenda.buscar();
                    break;
                case 3:
                    agenda.listar();
                    break;
                case 4:
                    agenda.remover();
                    break;
                case 5:
                    System.out.println("Finalizando a sessão...");
                    break;
                default:
                    System.out.println("Opção inválida!!");
                    break;
            }

        } while (opcao != 5);
    }

    @Override
    public void adicionar() {
        System.out.println("Escolha o tipo de Contato que gostaria de adicionar: ");
        System.out.println("1. Contato Pessoal");
        System.out.println("2. Contato Profissional");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Número de telefone: ");
        String numeroTel = scanner.nextLine();
        scanner.nextLine();

        switch (tipo) {
            case 1:
                System.out.println("Data de nascimento: ");
                String dataNascimento = scanner.nextLine();
                contatos.add(new ContatoPessoal(nome, numeroTel, dataNascimento));
                break;
            case 2:
                System.out.println("E-mail: ");
                String email = scanner.nextLine();
                contatos.add(new ContatoProfissional(nome, numeroTel, email));
                break;
            default:
                System.out.println("Erro!! Contato não adicionado.");
                break;
        }
    }

    @Override
    public void buscar() {
        System.out.println("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        Contato contatoEncontrado = null;

        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatoEncontrado = contato;
                break;
            }
        }
        if (contatoEncontrado != null) {
            System.out.println("Nome: " + contatoEncontrado.getNome());
            System.out.println("Número de telefone: " + contatoEncontrado.getNumeroTelef());
        } else {
            System.out.println("Contato não encontrado");
        }
    }

    @Override
    public void listar() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado");
        } else {
            for (Contato contato : contatos) {
                System.out.println(contato);
            }
        }
    }
    
    @Override
    public void remover() {
        System.out.println("Digite o nome do contato que deseja excluir: ");
        String nome = scanner.nextLine();
        boolean excluir = false;
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                contatos.remove(contato);
                excluir = true;
                System.out.println("Contato excluido com sucesso!!");
                break;
            }
        }
        if (!excluir) {
            System.out.println("Contato não encontrado");
        }

    }
    

}
    

