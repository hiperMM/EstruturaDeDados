public class hash1 {
    
    public int hashFunc(int numero, int tamanho){
        if(numero < 0){
            numero = numero*-1;
        }
        int resultado = numero % tamanho;
        return resultado;
    }

}
