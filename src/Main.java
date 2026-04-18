import java.util.ArrayList;

public class Main {
    public static void main() {

        Usuario user = new Usuario("Lucas", "lucas@gmail.com");

        GerenciadorTarefas gerenciador = new GerenciadorTarefas(user);

        // Adiciona diferentes tipos
        gerenciador.adicionar(new TarefaUnica("Estudar", "PENDENTE", "01/01/2026", "20/04/2026"));
        gerenciador.adicionar(new TarefaRecorrente("Trabalhar", "COMPLETA", "03/01/2026", "23/04/2026"));
        gerenciador.adicionar(new TarefaUnica("Ler", "PENDENTE", "04/01/2026", "26/04/2026"));

        System.out.println(gerenciador);
        System.out.println(gerenciador.getLast(gerenciador.getTarefas()).titulo);

        // Filtrando por Status
//        System.out.println(gerenciador.listarPorStatus("CANCELADA"));
//
//        // Obtendo os Agendaveis
//        System.out.println(gerenciador.obterAgendaveis());
//
//        // Imprimindo Relatorios detalhado
//        gerenciador.imprimirRelatorioDetalhado();
//
//        // Completando todas
//        gerenciador.completarTodas();
//
//        // Chamando novamente
//        gerenciador.gerarRelatorio();


    }
}