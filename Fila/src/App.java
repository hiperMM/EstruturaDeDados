public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Fila fila = new Fila(5);

        fila.insere(5);
        fila.insere(73);
        fila.insere(8);
        fila.remove();
        fila.insere(4);
        fila.imprime();
    }
}