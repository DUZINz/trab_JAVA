public class Main {
    public static void main(String[] args) {
        // Criando uma conta bancária
        ContaBancaria conta1 = new ContaBancaria(12345, "João", 1000);

        // Realizando operações
        conta1.depositar(500);
        conta1.sacar(200);
        
        // Consultando saldo
        double saldoAtual = conta1.consultarSaldo();
        System.out.println("Saldo atual da conta: R$" + saldoAtual);
    }
}
