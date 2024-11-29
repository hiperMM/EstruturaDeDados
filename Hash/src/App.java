public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int quantidade = 1000;
        // Gerando a tabela de seeds
        SeedGenerator seed = new SeedGenerator(45);
        int[] Lista = seed.gerarTabela(quantidade);
        int tamanhoHashTable = 1000;
        int numeroBusca = quantidade/2;
        int numeroLista = Lista[numeroBusca];

        hashTable hash1 = new hashTable(tamanhoHashTable, Lista);
        long startTime1 = System.nanoTime();
        hash1.inserir(1);
        long endTime1 = System.nanoTime();
        System.out.println("Tempo de inserção 1: " + (endTime1 - startTime1));
        long startTimeBusca1 = System.nanoTime();
        hash1.buscarHashTable(numeroLista, 1);
        long endTimeBusca1 = System.nanoTime();
        System.out.println("Tempo de busca 1: " + (endTimeBusca1 - startTimeBusca1));

        hashTable hash2 = new hashTable(tamanhoHashTable, Lista);
        long startTime2 = System.nanoTime();
        hash2.inserir(2);
        long endTime2 = System.nanoTime();
        System.out.println("Tempo de inserção 2: " + (endTime2 - startTime2));
        long startTimeBusca2 = System.nanoTime();
        hash1.buscarHashTable(numeroLista, 2);
        long endTimeBusca2 = System.nanoTime();
        System.out.println("Tempo de busca 2: " + (endTimeBusca2 - startTimeBusca2));

        hashTable hash3 = new hashTable(tamanhoHashTable, Lista);
        long startTime3 = System.nanoTime();
        hash3.inserir(3);
        long endTime3 = System.nanoTime();
        System.out.println("Tempo de inserção 3: " + (endTime3 - startTime3));
        long startTimeBusca3 = System.nanoTime();
        hash1.buscarHashTable(numeroLista, 3);
        long endTimeBusca3 = System.nanoTime();
        System.out.println("Tempo de busca 3: " + (endTimeBusca3 - startTimeBusca3));
    }
}