import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de gerenciamento de jogadores!");

        System.out.print("Digite o nome do jogador: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a pontuação inicial do jogador: ");
        int pontuacao = scanner.nextInt();
        System.out.print("Digite o nível inicial do jogador: ");
        int nivel = scanner.nextInt();

        Jogador jogador = new Jogador(nome, pontuacao, nivel);

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Aumentar pontuação");
            System.out.println("2. Subir de nível");
            System.out.println("3. Exibir informações do jogador");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a quantidade de pontos a ser adicionada: ");
                    int pontos = scanner.nextInt();
                    jogador.aumentarPontuacao(pontos);
                    break;
                case 2:
                    jogador.subirNivel();
                    break;
                case 3:
                    jogador.exibirInformacoes();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
