import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Bem-vindo à calculadora simples em Java!");
        System.out.print("Por favor, digite o primeiro número:");
        Float num1 = ler.nextFloat();

        System.out.print("Por favor, digite o segundo número:");
        Float num2 = ler.nextFloat();

        System.out.println("Escolha a operação desejada:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int escolha = ler.nextInt();

      Float resultado; 

        switch (escolha) {
            case 1:
                resultado = Calculadora.adicao(num1, num2);
                break;
            case 2:
                resultado = Calculadora.subtracao(num1, num2);
                break;
            case 3:
                resultado = Calculadora.multiplicacao(num1, num2);
                break;
            case 4:
                try {
                    resultado = Calculadora.divisao(num1, num2);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Escolha inválida!");
                return;
        }

        System.out.print("O resultado é: " + resultado);
    }
}