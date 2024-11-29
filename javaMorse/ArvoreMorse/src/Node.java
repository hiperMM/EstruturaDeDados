public class Node {
    private char info;
    private Node esquerda;
    private Node direita;
    
    public Node(char info) {
        this.info = info;
        this.esquerda = null;
        this.direita = null;
    }
    
        // Getters e Setters
    public char  getInfo() {
        return info;
    }
    
    public void setInfo(char info) {
        this.info = info;
    }
    
    public Node getEsquerda() {
        return esquerda;
    }
    
    public void setEsquerda(Node esquerda) {
        this.esquerda = esquerda;
    }
    
    public Node getDireita() {
        return direita;
    }
    
    public void setDireita(Node direita) {
        this.direita = direita;
    }

}
