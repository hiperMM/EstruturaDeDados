public class Fila {
    private ListaEncadeada fila;

    public Fila(){
        this.fila = new ListaEncadeada();
    }

    public void entrar(Information info){
        fila.AddUltimo(info);
    }

    public void remover(){
        fila.removePrimeiro();    
    }

    public void imprime(){
        fila.imprimeFila();
    }
}
