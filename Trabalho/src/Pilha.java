public class Pilha {
    private ListaEncadeada pilha;

    public Pilha(){
        this.pilha = new ListaEncadeada();
    }

    public void empilhar(Information info){
        pilha.AddUltimo(info);
    }

    public void remover(){
        pilha.removeUltimo();    
    }

    public void imprime(){
        pilha.imprimePilha();
    }
}
