import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
        System.out.print("Digite o numero da sua conta:");
        String numeroConta = scanner.next();
        System.out.print("Digite seu nome:");
        String nomeTitular = scanner.next();
        System.out.println("bem vindo:" +  nomeTitular);
        ContaBancaria minhaConta = new ContaBancaria(); 
        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Verificar saldo");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
    
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    minhaConta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor a sacar: ");
                    double valorSaque = scanner.nextDouble();
                    minhaConta.sacar(valorSaque);
                    break;
                case 3:
                    System.out.println("Saldo atual: " + minhaConta.getSaldo());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            
        } 
        scanner.next();
    }while (opcao != 0);
}
    }

