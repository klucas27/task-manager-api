import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;

public class GerenciadorTarefas {

    private ArrayList<Tarefa> tarefas = new ArrayList<>();
    private Usuario proprietario;

    public GerenciadorTarefas(Usuario proprietario) {
        this.proprietario = proprietario;
    }

    // Setters
    public void adicionar(Tarefa t) {
        this.tarefas.add(t);
    }

    public Map<String, Tarefa> buildTaskMap(List<Tarefa> tarefa) {
        Map<String, Tarefa> tarefaMap = new HashMap<>();

        for (Tarefa t : tarefa) {
            if (tarefaMap.containsKey(t.getId())) {
                throw new IllegalStateException("Erro, 2 Ids Iguais! id: " + t.getId());
            }
            tarefaMap.put(t.getId(), t);
        }
        System.out.println(tarefaMap);
        return tarefaMap;
    }

    // lambdas
    private List<Tarefa> filtrarTarefas(List<Tarefa> lista, Predicate<Tarefa> condicao) {
        List<Tarefa> resultado = new ArrayList<>();

        for (Tarefa item : lista) {
            if (condicao.test(item)) {
                resultado.add(item);
            }
        }
        return resultado;
    }


    // getters
    public Optional<Tarefa> buscarId(String id){
        return this.tarefas.stream().filter(t -> t.getId().equals(id)).findFirst();
    }

    public List<String> titulosPendentesOrdenados() {
        return this.tarefas.stream().filter(t -> t.getStatus().equals("PENDENTE")).map(Tarefa::getTitulo).sorted().toList();
    }

    public Tarefa buscarPrimeiraPorStatus(String status) {
        return this.tarefas.stream().
                filter(t -> t.getStatus().equals(status)).
                findFirst().
                orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
    }

    public Map<String, Long> contarPorStatus(){
        return this.tarefas.stream().collect(groupingBy(Tarefa::getStatus, Collectors.counting()));
    }

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
        return filtrarTarefas(this.tarefas, tarefa -> tarefa.getStatus().equals("PENDENTE")).size();
    }

    public List<Tarefa> listarPorStatus(String status) {
        return filtrarTarefas(this.tarefas, tarefa -> tarefa.getStatus().equals(status));
    }

    public List<Tarefa> obterAgendaveis() {
        return filtrarTarefas(this.tarefas, tarefa -> tarefa.ehAgendavel());
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
