public class hash3 {
    
    public int hashFunc(int numero, int tamanho){
        if(numero<0){
            numero = numero*-1;
        }
        
        String numeroStr = String.valueOf(numero);
        
        
        int comprimento = size1(numeroStr);
        
        int tamanhoParte = 0;
        for (int i = 0; i < comprimento / 2; i++) {
            tamanhoParte++;
        }
        
        if (tamanhoParte == 0) tamanhoParte = comprimento;
        
        String parte1 = numeroStr.substring(0, tamanhoParte); 
        String parte2 = numeroStr.substring(tamanhoParte);
        
        int parte1Int = 0;
        for (int i = 0; i < size1(parte1); i++) {
            parte1Int = parte1Int * 10 + (parte1.charAt(i) - '0');
        }
        
        int parte2Int = 0;
        for (int i = 0; i < size1(parte2); i++) {
            parte2Int = parte2Int * 10 + (parte2.charAt(i) - '0');
        }
        int soma = parte1Int + parte2Int;
        int resto = soma;
        while (resto >= tamanho) {
            resto = resto - tamanho;
        }
        
        return resto;
    }

    public int size1(String str) {
        int contador = 0;
        for (char c : str.toCharArray()) {
            contador++;
        }
        return contador;
    }
    
}
