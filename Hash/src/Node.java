public class Node {
    private int info;
    private Node proximo;

    public Node(int info){
        this.info = info;
        this.proximo = null;
    }

    public Node(){
        this.info = 0;
        this.proximo = null;
    }


    public int getInfo() {
        return this.info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Node getProximo() {
        return this.proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    

}
