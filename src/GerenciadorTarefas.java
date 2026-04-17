import java.util.ArrayList;

public class GerenciadorTarefas {

    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionar(Tarefa t) {
        this.tarefas.add(t);
    }

    public void gerarRelatorio() {

        System.out.println("***** Relatorio *****");

        for (Tarefa t : tarefas) {
            t.exibir();
            System.out.println();
        }
    }

    public void completarTodas() {
        for (Tarefa t : tarefas) {
            t.completar();
        }
    }

    public int contarPendentes() {

        int ctt = 0;
        for (Tarefa t : tarefas) {
            if (t.getStatus().equals("PENDENTE")) {
                ctt++;
            }
        }
        return ctt;
    }

}
