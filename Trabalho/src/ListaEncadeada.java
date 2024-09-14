public class ListaEncadeada {
    private int size;
    private Node Head;
    private Node Tail;

    public ListaEncadeada(){
        Head = null;
        Tail = null;
        size = 0;
    }

    public void addPrimeiro(Information info){
        Node nó = new Node(info);
        nó.setProximo(Head);
        if (size == 0) {
            Tail = nó;
        }
        Head = nó;
        size += 1;
    }

    public void AddUltimo(Information info){
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

    public void removePrimeiro(){
        if(Head != null){
            Node nó = Head;
            Head = Head.getProximo();
            nó.setProximo(null);
            if (Head == null) {
                Tail = null;
            }
            size--;
        } 
    }
    
    public void removeUltimo(){
        if(Head != null){
            if (Head == Tail) {
                Head = Tail = null;
            } else {
                Node Atual = Head;
                while (Atual.getProximo() != Tail){
                    Atual = Atual.getProximo();
                }
                Tail = Atual;
                Atual.setProximo(null);
            }
            size--;
        }
    }

    public void imprimePilha() {
        if (Head != null) {
            Node atual = Head;
            while (atual != null) {
                System.out.println(atual.getInformacao().toStringPilha());
                atual = atual.getProximo();
            }
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    public void imprimeFila() {
        if (Head != null) {
            Node atual = Head;
            while (atual != null) {
                System.out.println(atual.getInformacao().toStringFila());
                atual = atual.getProximo();
            }
        } else {
            System.out.println("A lista está vazia.");
        }
    }
}
