public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605);
        Livro livro2 = new Livro("1984", "George Orwell",1949);
        Livro livro3 = new Livro("Diario de um banana", "Jeff Kinney", 2008);
        Livro livro4 = new Livro("Metamorfose", "Franz Kafka", 1915);
        Livro livro5 = new Livro("Ensaio Sobre a Cegueira", "José Saramago", 1995);
        Livro livro6 = new Livro("Crime e Castigo", "Fiódor Dostoiévsky", 1866);
        Livro livro7 = new Livro("O Sol é Para Todos", "Harper Lee", 1960);
        Livro livro8 = new Livro("Os Miseráveis", "Victor Hugo", 1982);
        Livro livro9 = new Livro("A História de uma Serva", " Margaret Atwood", 2000);

        System.out.println("Informações do Livro 1:");
        livro1.exibirInfo();

        System.out.println("\nInformações do Livro 2:");
        livro2.exibirInfo();

        System.out.println("\nInformações do Livro 3:");
        livro3.exibirInfo();

        System.out.println("\nInformações do Livro 4:");
        livro4.exibirInfo();

        System.out.println("\nInformações do Livro 5:");
        livro5.exibirInfo();

        System.out.println("\nInformações do Livro 6:");
        livro6.exibirInfo();

        System.out.println("\nInformações do Livro 7:");
        livro7.exibirInfo();

        System.out.println("\nInformações do Livro 8:");
        livro8.exibirInfo();

        System.out.println("\nInformações do Livro 9:");
        livro9.exibirInfo();
    }
}