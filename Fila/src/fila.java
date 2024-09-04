
class Fila {
    private int primeiro;
    private int fim;
    private int tamanho;
    private int[] dados;

    public Fila(int tamanho) {
        this.tamanho = tamanho;
        this.dados = new int[tamanho];
        this.primeiro = 0; // Inicializa o início da fila
        this.fim = -1; // Inicializa o fim da fila
    }

    public boolean cheia() {
        return fim == tamanho - 1;
    }

    public boolean vazia() {
        return primeiro > fim;
    }

    public void insere(int elemento) {
        if (cheia()) {
            System.out.println("A fila está cheia");
        } else {
            fim++;
            dados[fim] = elemento;
        }
    }

    public void remove() {
        if (vazia()) {
            System.out.println("A fila está vazia");
        } else {
            dados[primeiro] = 0; // Opcional, você pode querer apenas ajustar o índice
            primeiro++;
        }
    }

    public void imprime() {
        if (vazia()) {
            System.out.println("A fila está vazia");
            return;
        }
        for (int i = primeiro; i <= fim; i++) {
            System.out.println(dados[i]);
        }
    }

    
}