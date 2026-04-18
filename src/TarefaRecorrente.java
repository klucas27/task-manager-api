public class TarefaRecorrente extends Tarefa {
    private String frequencia;

    public TarefaRecorrente(String titulo, String status, String dataCriacao, String frequencia) {
        super(titulo, status, dataCriacao);
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
}
