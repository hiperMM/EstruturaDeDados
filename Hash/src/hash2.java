public class hash2 {

    public int hashFunc(int numero, int tamanho) {
        if(numero<0){
            numero = numero*-1;
        }
        double A = 0.6180339887;
        double produto = numero * A;
        double parteFracionaria = produto - (int) produto;
        int indice = (int) (tamanho * parteFracionaria);

        return indice;
    }
}
