public class TarefaRecorrente extends Tarefa {
    private String frequencia;

    public TarefaRecorrente(String id, String titulo, String status, String dataCriacao, String frequencia) {
        super(id, titulo, status, dataCriacao);
        this.frequencia = frequencia;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Frequencia: " + this.frequencia);

    }

    @Override
    public void completar() {
        super.status = "COMPLETA";
        System.out.println("\nTarefa '" + this.titulo + "' foi marcada como completa");
    }

    @Override
    public String getId() {
        return super.getId();
    }
}
