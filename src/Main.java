import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Usuario user = new Usuario("Lucas", "lucas@gmail.com");

        GerenciadorTarefas gerenciador = new GerenciadorTarefas(user);

        // Adiciona diferentes tipos
        gerenciador.adicionar(new TarefaUnica("id1", "Estudar", "PENDENTE", "01/01/2026", "20/04/2026"));
        gerenciador.adicionar(new TarefaRecorrente("id2", "Trabalhar", "COMPLETA", "03/01/2026", "23/04/2026"));
        gerenciador.adicionar(new TarefaUnica("id3", "Ler", "PENDENTE", "04/01/2026", "26/04/2026"));
//        gerenciador.adicionar(new TarefaUnica("id3", "Correr", "COMPLETA", "04/01/2026", "26/04/2026"));

        System.out.println(gerenciador.buildTaskMap(gerenciador.getTarefas()).get("id3").getId());

    }
}