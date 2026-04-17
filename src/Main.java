import java.util.ArrayList;

public class Main {
    public static void main() {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        // Adiciona diferentes tipos
        gerenciador.adicionar(new TarefaUnica("Estudar", "PENDENTE", "01/01/2026", "20/04/2026"));
        gerenciador.adicionar(new TarefaRecorrente("Treinar", "PENDENTE", "01/01/2026", "diária"));
        gerenciador.adicionar(new TarefaUnica("Ler", "COMPLETA", "01/01/2026", "25/04/2026"));

        // Relatório polimórfico
        gerenciador.gerarRelatorio();

        // Contar pendentes
        System.out.println("Tarefas pendentes: " + gerenciador.contarPendentes());

        // Completar todas (cada uma à sua maneira)
        System.out.println("Completando todas...");
        gerenciador.completarTodas();

    }
}