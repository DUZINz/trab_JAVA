import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Produto> estoque = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Atualizar Produto");
            System.out.println("3. Remover Produto");
            System.out.println("4. Exibir Relatório de Estoque");
            System.out.println("5. Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    atualizarProduto();
                    break;
                case 3:
                    removerProduto();
                    break;
                case 4:
                    exibirRelatorioEstoque();
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    private static void adicionarProduto() {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Digite a quantidade em estoque do produto: ");
        int quantidade = scanner.nextInt();

        Produto novoProduto = new Produto(nome, codigo, preco, quantidade);
        estoque.add(novoProduto);
        System.out.println("Produto adicionado com sucesso!");
    }

    private static void atualizarProduto() {
        System.out.print("Digite o código do produto a ser atualizado: ");
        int codigo = scanner.nextInt();

        boolean encontrado = false;
        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                System.out.print("Digite o novo nome do produto: ");
                String novoNome = scanner.next();
                System.out.print("Digite o novo preço do produto: ");
                double novoPreco = scanner.nextDouble();
                System.out.print("Digite a nova quantidade em estoque do produto: ");
                int novaQuantidade = scanner.nextInt();

                produto.setNome(novoNome);
                produto.setPreco(novoPreco);
                produto.setQuantidadeEmEstoque(novaQuantidade);

                System.out.println("Produto atualizado com sucesso!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Produto com código '" + codigo + "' não encontrado.");
        }
    }

    private static void removerProduto() {
        System.out.print("Digite o código do produto a ser removido: ");
        int codigo = scanner.nextInt();

        boolean removido = false;
        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                estoque.remove(produto);
                System.out.println("Produto removido com sucesso!");
                removido = true;
                break;
            }
        }
        if (!removido) {
            System.out.println("Produto com código '" + codigo + "' não encontrado.");
        }
    }

    private static void exibirRelatorioEstoque() {
        if (estoque.isEmpty()) {
            System.out.println("O estoque está vazio.");
        } else {
            System.out.println("Relatório de Estoque:");
            for (Produto produto : estoque) {
                produto.exibirInformacoes();
                System.out.println();
            }
        }
    }
}
