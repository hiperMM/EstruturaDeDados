public class Node {
    private Information informação;
    private Node proximo;
    
    public Node(Information informação)
        {
            this.informação = informação;
            this.proximo = null;
        }
    
    public Node()
        {
            this.informação = null;
            this.proximo = null;
        }
    
        public Information getInformacao() {
            return informação;
        }
    
        public void setInformacao(Information informação) {
            this.informação = informação;
        }
    
        public Node getProximo() {
            return proximo;
        }
    
        public void setProximo(Node proximo) {
            this.proximo = proximo;
        }

}
