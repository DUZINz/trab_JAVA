import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao simulador de carro!");

        System.out.println("Por favor, insira a marca do carro:");
        String marca = scanner.nextLine();

        System.out.println("Por favor, insira o modelo do carro:");
        String modelo = scanner.nextLine();

        System.out.println("Por favor, insira o ano do carro:");
        int ano = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, insira a placa do carro:");
        String placa = scanner.nextLine();

        System.out.println("Por favor, insira a velocidade inicial do carro (em km/h):");
        int velocidadeInicial = scanner.nextInt();

        Carro meuCarro = new Carro(marca, modelo, ano, placa, velocidadeInicial);

        System.out.println("\nInformações do carro:");
        meuCarro.exibirInformacoes();

        while (true) {
            System.out.println("\nO que você gostaria de fazer?");
            System.out.println("1. Acelerar");
            System.out.println("2. Frear");
            System.out.println("3. Sair");

            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Quanto você gostaria de acelerar (em km/h)?");
                    int quantidadeAceleracao = scanner.nextInt();
                    meuCarro.acelerar(quantidadeAceleracao);
                    System.out.println("\nInformações atualizadas do carro:");
                    meuCarro.exibirInformacoes();
                    break;
                case 2:
                    System.out.println("Quanto você gostaria de frear (em km/h)?");
                    int quantidadeFreio = scanner.nextInt();
                    meuCarro.frear(quantidadeFreio);
                    System.out.println("\nInformações atualizadas do carro:");
                    meuCarro.exibirInformacoes();
                    break;
                case 3:
                    System.out.println("Obrigado por usar o simulador de carro!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Escolha inválida! Por favor, escolha uma opção válida.");
            }
        }
    }
}
