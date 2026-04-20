import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Usuario user = new Usuario("Lucas", "lucas@gmail.com");

        GerenciadorTarefas gerenciador = new GerenciadorTarefas(user);

        // Adiciona diferentes tipos
        gerenciador.adicionar(new TarefaUnica("id1", "Estudar", "PENDENTE", "01/01/2026", "20/04/2026"));
        gerenciador.adicionar(new TarefaRecorrente("id2", "Trabalhar", "COMPLETA", "03/01/2026", "23/04/2026"));
        gerenciador.adicionar(new TarefaUnica("id3", "Caminhar", "PENDENTE", "04/01/2026", "26/04/2026"));
        gerenciador.adicionar(new TarefaUnica("id3", "Correr", "COMPLETA", "04/01/2026", "26/04/2026"));

        Optional<Tarefa> resultado = gerenciador.buscarId("id3");

        // #1
        resultado.
                ifPresentOrElse(t -> System.out.println(t.getTitulo()),
                        () -> System.out.println("não encontrada"));

        // #2
        Tarefa t1 =  resultado.orElseThrow(() -> new RuntimeException("Erro ao encontrar o Id."));
        System.out.println(t1);

        // # 3
        Optional<String> titulo = resultado.map(t -> t.getTitulo().toUpperCase());
        titulo.ifPresentOrElse(System.out::println, () -> System.out.println("Erro ao obter o titulo"));


    }
}