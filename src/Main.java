import java.util.ArrayList;

public class Main {
    public static void main() {

        Usuario user = new Usuario("Lucas", "lucas@gmail.com");

        GerenciadorTarefas gerenciador = new GerenciadorTarefas(user);

        // Adiciona diferentes tipos
        gerenciador.adicionar(new TarefaUnica("Estudar", "PENDENTE", "01/01/2026", "20/04/2026"));
        gerenciador.adicionar(new TarefaRecorrente("Treinar", "PENDENTE", "01/01/2026", "diária"));
        gerenciador.adicionar(new TarefaUnica("Ler", "CANCELADA", "01/03/2026", "25/07/2026"));
        gerenciador.adicionar(new TarefaRecorrente("Correr", "COMPLETA", "01/01/2026", "25/08/2026"));
        gerenciador.adicionar(new TarefaUnica("Praticar Java", "COMPLETA", "01/01/2026", "25/01/2027"));

        // Filtrando por Status
        System.out.println(gerenciador.listarPorStatus("CANCELADA"));

        // Obtendo os Agendaveis
        System.out.println(gerenciador.obterAgendaveis());

        // Imprimindo Relatorios detalhado
        gerenciador.imprimirRelatorioDetalhado();

        // Completando todas
        gerenciador.completarTodas();

        // Chamando novamente
        gerenciador.gerarRelatorio();


    }
}