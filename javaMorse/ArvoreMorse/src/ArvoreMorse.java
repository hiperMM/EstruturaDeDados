import java.util.ArrayList;

public class ArvoreMorse {

    private Node raiz;

    public ArvoreMorse(){
        this.raiz = new Node(' ');
        InicializarArvore();
    }

    public void InicializarArvore(){
        inserirMorse('A', ".-");
        inserirMorse('B', "-...");
        inserirMorse('C', "-.-.");
        inserirMorse('D', "-..");
        inserirMorse('E', ".");
        inserirMorse('F', "..-.");
        inserirMorse('G', "--.");
        inserirMorse('H', "....");
        inserirMorse('I', "..");
        inserirMorse('J', ".---");
        inserirMorse('K', "-.-");
        inserirMorse('L', ".-..");
        inserirMorse('M', "--");
        inserirMorse('N', "-.");
        inserirMorse('O', "---");
        inserirMorse('P', ".--.");
        inserirMorse('Q', "--.-");
        inserirMorse('R', ".-.");
        inserirMorse('S', "...");
        inserirMorse('T', "-");
        inserirMorse('U', "..-");
        inserirMorse('V', "...-");
        inserirMorse('W', ".--");
        inserirMorse('X', "-..-");
        inserirMorse('Y', "-.--");
        inserirMorse('Z', "--..");
    }

    public void inserirMorse(char Letra, String code){
        Node atual = raiz;
        for(char c : code.toCharArray()){
            if(c == '.'){
                if (atual.getEsquerda() == null){
                    atual.setEsquerda(new Node('.'));
                }
                atual = atual.getEsquerda();
            }
            else if (c == '-'){
                if (atual.getDireita() == null){
                    atual.setDireita(new Node('-'));
                }
                atual = atual.getDireita();
            }
        }
        atual.setInfo(Letra);
    }

    public boolean getPath(Node raiz, ArrayList<Character> path, char letra){
        if(raiz == null){
            return false;
        }
        path.add(raiz.getInfo());
        if(getPath(raiz.getEsquerda(), path, letra) || getPath(raiz.getDireita(), path, letra)){
            return true;
        }
        path.remove(size1(path) -1);
        return false;
        
    }

    public ArrayList<Character> codificarLetra(char Letra){
        ArrayList<Character> lista = new ArrayList<>();
        getPath(raiz, lista, Letra);
        return lista;
    }

    public void decodificar(String Palavra){
        Node atual = raiz;
        String resultado = "";
        for(char c : Palavra.toCharArray()){
            if(c == '.'){
                if (atual.getEsquerda() != null) {
                    atual = atual.getEsquerda();
                }
                else{
                System.out.println("erro");
                return;
                }
            }
            else if (c == '-') {
                if (atual.getDireita() != null) {
                    atual = atual.getDireita();
                }
                else {
                    System.out.println("erro");
                    return;
                }
            }
            resultado += atual.getInfo();
            atual = raiz;
        }
        System.out.println(resultado);
    }

    public int size1(ArrayList<Character> palavra){
        int tamanho = 0;
        for (Character c : palavra) {
            tamanho++; 
        }
        return tamanho;
    }

}
