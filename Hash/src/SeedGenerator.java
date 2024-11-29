import java.util.Random;

public class SeedGenerator {

    private final int seed;
    private int dados[];
    private int quantidade;

    public SeedGenerator(int seed){
        this.seed = seed;
    }

    public int[] gerarTabela(int quantidade){
        
        Random random = new Random(seed);
        this.quantidade = quantidade;
        this.dados = new int[quantidade];
    
        for(int i = 0; i < quantidade; i++){
            dados[i] = random.nextInt(); // Gera números aleatórios
        }
        return dados;

    }

    public void imprimirTabela(){
        for(int i =0; i < quantidade; i++){
            System.out.println(dados[i]);
        }
    }
}
