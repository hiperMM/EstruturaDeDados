
public class hashTable {
    private int tamanho;
    private ListaEncadeada[] listaHash;
    private int[] lista;



    public hashTable(int tamanho, int lista[]){
        this.tamanho = tamanho;
        this.lista = lista;
        this.listaHash = new ListaEncadeada[tamanho];

        for (int i = 0; i < tamanho; i++) {
            listaHash[i] = new ListaEncadeada();
        }
    }

   

    public void inserir(int option){
        int colisão = 0;
        hash1 hash1 = new hash1();
        hash2 hash2 = new hash2();
        hash3 hash3 = new hash3();

        if(option == 1){
            for(int i = 0; i < listaSize(lista); i++){
                int numero = hash1.hashFunc(lista[i], tamanho);
                if(listaHash[numero].getSize() != 0){
                    colisão ++;
                }   
                listaHash[numero].AddNode(lista[i]);
            }
        }
        if(option == 2){
            for(int i = 0; i < listaSize(lista); i++){
                int numero = hash2.hashFunc(lista[i], tamanho);
                if(listaHash[numero].getSize() != 0){
                    colisão ++;
                }   
                listaHash[numero].AddNode(lista[i]);
            }
        }
        if(option == 3){
            for(int i = 0; i < listaSize(lista); i++){
                int numero = hash3.hashFunc(lista[i], tamanho);
                if(listaHash[numero].getSize() != 0){
                    colisão ++;
                }   
                listaHash[numero].AddNode(lista[i]);
            }
        }
        System.out.println(colisão);

    }

    public void imprimir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Índice " + i + ": ");
            
            if (listaHash[i].getSize() == 0) {
                System.out.println("está vazio");
            } else {
                listaHash[i].imprimir();
            }
        }
    }
    

    public void buscarHashTable(int numero, int option){
        hash1 hash1 = new hash1();
        hash2 hash2 = new hash2();
        hash3 hash3 = new hash3();

        if(option == 1){
            int resultado = hash1.hashFunc(numero, tamanho);
            listaHash[resultado].busca(numero);
        }
        if(option == 2){
            int resultado = hash2.hashFunc(numero, tamanho);
            listaHash[resultado].busca(numero);
        }
        if(option == 3){
            int resultado = hash3.hashFunc(numero, tamanho);
            listaHash[resultado].busca(numero);
        }
    }

    public int listaSize(int[] lista){
        int tamanhoLista = 0;
        for(Integer n : lista){
            tamanhoLista++;
        }
        return tamanhoLista;
    }
}
