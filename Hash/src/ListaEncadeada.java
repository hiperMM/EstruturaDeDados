public class ListaEncadeada {
    private int size;
    private Node Head;
    private Node Tail; 

    public ListaEncadeada(){
        Head = null;
        Tail = null;
        size = 0;
    }

    public void busca(int info){
        if(Head == null){
            System.out.println("vazio");
        }else{
            BuscaRecursiva(Head, info);

        }
    }

    public void BuscaRecursiva(Node Atual, int info){
        if(Atual.getProximo() != null){
            if(Atual.getInfo() == info){
                System.out.println("achoou a info");
            }
            else{
                BuscaRecursiva(Atual.getProximo(), info);
            }
        }
    }

    public void  AddNode(int info){
        Node nó = new Node(info);
        if (Head == null) {
            Head = nó;
            Tail = nó;
        } else {
            Tail.setProximo(nó);
            Tail = nó;
        }
        size += 1;
    }

    public void imprimir() {
        if (Head == null) {
            System.out.println("Vazio");
        } else {
            imprimirRecursivo(Head);
        }
    }

    public void imprimirRecursivo(Node atual) {
        if (atual == null) {
            return;
        }
        System.out.print(atual.getInfo() + " ");
        imprimirRecursivo(atual.getProximo());
    }

    public int getSize(){
        return size;
    }

}
