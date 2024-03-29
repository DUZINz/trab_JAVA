import java.util.ArrayList;

public class Pedido {
    private static int contadorPedidos = 0;
    private int numeroPedido;
    private ArrayList<Pizza> pizzas;
    private String enderecoEntrega;
    private double valorTotal;

    public Pedido(String enderecoEntrega) {
        this.numeroPedido = ++contadorPedidos;
        this.pizzas = new ArrayList<>();
        this.enderecoEntrega = enderecoEntrega;
        this.valorTotal = 0.0;
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
        valorTotal += pizza.getValor();
    }

    public void cancelarPedido() {
        pizzas.clear();
        valorTotal = 0.0;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void exibirDetalhesPedido() {
        System.out.println("Número do Pedido: " + numeroPedido);
        System.out.println("Endereço de Entrega: " + enderecoEntrega);
        System.out.println("Pizzas:");
        for (Pizza pizza : pizzas) {
            System.out.println("- " + pizza.getNome() + ": R$" + pizza.getValor());
        }
        System.out.println("Valor Total: R$" + valorTotal);
    }
}
