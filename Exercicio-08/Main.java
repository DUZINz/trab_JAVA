import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Pizza> listaPizzas = new ArrayList<>();

    public static void main(String[] args) {
        cadastrarPizzas();

        Pedido pedido = fazerPedido();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Pizza ao Pedido");
            System.out.println("2. Exibir Detalhes do Pedido");
            System.out.println("3. Cancelar Pedido");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    adicionarPizzaAoPedido(pedido);
                    break;
                case 2:
                    exibirDetalhesDoPedido(pedido);
                    break;
                case 3:
                    cancelarPedido(pedido);
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        scanner.close();
    }

    private static void cadastrarPizzas() {
        Pizza marguerita = new Pizza("Marguerita", 30.0, "Molho de tomate, muçarela, tomate e manjericão.");
        Pizza pepperoni = new Pizza("Pepperoni", 35.0, "Molho de tomate, muçarela, pepperoni e orégano.");
        listaPizzas.add(marguerita);
        listaPizzas.add(pepperoni);
    }

    private static Pedido fazerPedido() {
        System.out.print("Digite o endereço de entrega: ");
        String endereco = scanner.nextLine();
        return new Pedido(endereco);
    }

    private static void adicionarPizzaAoPedido(Pedido pedido) {
        System.out.println("\nEscolha uma pizza:");
        for (int i = 0; i < listaPizzas.size(); i++) {
            System.out.println((i + 1) + ". " + listaPizzas.get(i).getNome());
        }
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); 

        if (opcao >= 1 && opcao <= listaPizzas.size()) {
            Pizza pizzaSelecionada = listaPizzas.get(opcao - 1);
            pedido.adicionarPizza(pizzaSelecionada);
            System.out.println("Pizza adicionada ao pedido com sucesso!");
        } else {
            System.out.println("Opção inválida.");
        }
    }

    private static void exibirDetalhesDoPedido(Pedido pedido) {
        System.out.println("\nDetalhes do Pedido:");
        pedido.exibirDetalhesPedido();
    }

    private static void cancelarPedido(Pedido pedido) {
        pedido.cancelarPedido();
        System.out.println("\nPedido cancelado.");
    }
}
