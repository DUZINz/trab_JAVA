import java.util.Scanner;
    
public class Main {
    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Remover contato");
            System.out.println("3. Buscar contato");
            System.out.println("4. Listar contatos");
            System.out.println("5. Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o telefone do contato: ");
                    String telefone = scanner.nextLine();
                    minhaAgenda.adicionarContato(new Contato(nome, telefone));
                    System.out.println("Contato adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o nome do contato a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    minhaAgenda.removerContato(nomeRemover);
                    break;
                case 3:
                    System.out.print("Digite o nome do contato a ser buscado: ");
                    String nomeBuscar = scanner.nextLine();
                    minhaAgenda.buscarContato(nomeBuscar);
                    break;
                case 4:
                    minhaAgenda.listarContatos();
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
        scanner.close();
    }
}
