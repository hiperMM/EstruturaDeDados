

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        pilha Pilha = new pilha(5);

        Pilha.insere(5);
        Pilha.insere(6);
        Pilha.insere(4);
        Pilha.insere(8);
        Pilha.remove();
        Pilha.imprime();
    }
}
