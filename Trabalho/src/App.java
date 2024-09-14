public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pilha historico = new Pilha();
        Fila filadeatendimento = new Fila();
        ListaEncadeada lista = new ListaEncadeada();

        //info da pilha/historico
        Information historico1 = new Information("REQ001", "Instalação de software", "2024-08-20 10:30");
        Information historico2 = new Information("REQ002", "Manutenção preventiva", "2024-08-20 11:00");
        Information historico3 = new Information("REQ003", "Atualização de sistema", "2024-08-20 11:30");
        Information historico4 = new Information("REQ004", "Suporte técnico", "2024-08-20 12:00");

        historico.empilhar(historico1);
        historico.empilhar(historico2);
        historico.empilhar(historico3);

        historico.imprime();
        System.out.println("historico depois da remoção:");
        historico.remover();
        historico.imprime();

        System.out.println("historico depois da adição");
        historico.empilhar(historico4);
        historico.imprime();

        System.out.println();
        System.out.println();
        //info da fila/filadeatendimento
        Information atendimento1 = new Information("CLI001", "Maria Silva", "Dúvida sobre produto");
        Information atendimento2 = new Information("CLI002", "João Souza", "Reclamação de serviço");
        Information atendimento3 = new Information("CLI003", "Ana Costa", "Solicitação de reembolso");
        Information atendimento4 = new Information("CLI004", "Pedro Alves", "Informações de entrega");

        filadeatendimento.entrar(atendimento1);
        filadeatendimento.entrar(atendimento2);
        filadeatendimento.entrar(atendimento3);

        System.out.println("fila de atendimento: ");

        filadeatendimento.imprime();
        System.out.println("fila de atendimento depois da remoção:");
        filadeatendimento.remover();
        filadeatendimento.imprime();
        System.out.println("fila de atendimento depois da adição:");
        filadeatendimento.entrar(atendimento4);
        filadeatendimento.imprime();

        
    }
}
