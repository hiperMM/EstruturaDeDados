
public class pilha {
    private int topo;
    private int tamanho;
    private int[] dados;


    public pilha(int tamanho){
        this.tamanho = tamanho;
        this.dados = new int[tamanho];
        this.topo = -1;
    }

    public boolean cheia(){
        return topo == tamanho - 1;
    }

    public boolean vazia(){
        return topo == -1;
    }

    public void insere(int elemento){
        if (cheia()){
            System.out.println("a pilha esta cheia");
        }
        else{
            topo++;
            dados[topo] = elemento;
            
        }
    }

    public void remove(){
        if (vazia()){
            System.out.println("a pilha esta vazia");
        }
        else{
            dados[topo] = 0;
            topo--;
        }
    }

    public void imprime(){
        if (vazia()){
            System.out.println("a pilha esta vazia");
        }
        else {
        for (int i = 0; i <= topo; i++) {
         System.out.println(dados[i]);   
        }}
    }
}
