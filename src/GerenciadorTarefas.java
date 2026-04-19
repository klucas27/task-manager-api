import java.util.*;

public class GerenciadorTarefas {

    private ArrayList<Tarefa> tarefas = new ArrayList<>();
    private Usuario proprietario;

    public GerenciadorTarefas(Usuario proprietario) {
        this.proprietario = proprietario;
    }

    // getters private

    private int countId(String id) {
        int totalId = 0;
        for (Tarefa t : tarefas) {
            if (t.getId().equals(id)) {
                totalId++;
            }
        }
        return totalId;
    }

    // Setters
    public void adicionar(Tarefa t) {
        this.tarefas.add(t);
    }

    public Map<String, Tarefa> buildTaskMap(List<Tarefa> tarefa) {
        /* Fazer verificação */
        Map<String, Tarefa> tarefaMap = new HashMap<>();

        for (Tarefa t : tarefas) {
            if ((countId(t.getId()) > 1)) {
                throw new IllegalStateException("Erro, 2 Ids Iguais!");
            }
            tarefaMap.put(t.getId(), t);

        }

        return tarefaMap;

    }

    // getters
    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public <T> T getLast(List<T> list) {
        if (list.isEmpty()) {
            throw new RuntimeException("List is empty");
        }

        return list.getLast();
    }

    public void gerarRelatorio() {

        System.out.println("\n***** Relatorio *****");

        for (Tarefa t : this.tarefas) {
            t.exibir();
            System.out.println();
        }
    }

    public void completarTodas() {
        for (Tarefa t : this.tarefas) {
            t.completar();
        }
    }

    public int contarPendentes() {

        int ctt = 0;
        for (Tarefa t : this.tarefas) {
            if (t.getStatus().equals("PENDENTE")) {
                ctt++;
            }
        }
        return ctt;
    }

    public ArrayList<Tarefa> listarPorStatus(String status) {
        ArrayList<Tarefa> tarefasStatus = new ArrayList<>();

        for (Tarefa t : this.tarefas) {
            if (t.getStatus().equals(status)) {
                tarefasStatus.add(t);
            }
        }
        return tarefasStatus;

    }

    public ArrayList<Tarefa> obterAgendaveis() {
        ArrayList<Tarefa> tarefasAgendaveis = new ArrayList<>();
        for (Tarefa t : this.tarefas) {
            if (t.ehAgendavel()) {
                tarefasAgendaveis.add(t);
            }
        }

        return tarefasAgendaveis;
    }

    public void imprimirRelatorioDetalhado() {
        System.out.println("\n***** Relátorio Detalhado ******");

        System.out.println("Usuario: " + proprietario.getNome());

        System.out.println("Email: " + proprietario.getEmail());

        for (Tarefa t : this.tarefas) {
            t.exibir();
        }

    }

}
