import java.util.ArrayList;
class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                contatos.remove(contato);
                return;
            }
        }
        System.out.println("Contato com nome '" + nome + "' não encontrado na agenda.");
    }

    public void buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                System.out.println("Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone());
                return;
            }
        }
        System.out.println("Contato com nome '" + nome + "' não encontrado na agenda.");
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
        } else {
            System.out.println("Lista de contatos na agenda:");
            for (Contato contato : contatos) {
                System.out.println("Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone());
            }
        }
    }
}