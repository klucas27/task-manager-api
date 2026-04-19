public class TarefaUnica extends Tarefa implements Agendavel, Notificavel {

    private String dataVencimento;

    public TarefaUnica(String id, String titulo, String status, String dataCriacao, String dataVencimento) {
        super(id, titulo, status, dataCriacao);
        this.dataVencimento = dataVencimento;

    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Vencimento: " + this.dataVencimento);

    }

    @Override
    public void completar() {
        super.status = "COMPLETA";
        System.out.println("\nTarefa '" + this.titulo + "' foi marcada como completa");

    }

    @Override
    public void agendar(String data) {
        System.out.println("Tarefa foi agendada para: " + data);

    }

    @Override
    public String obterData() {
        return this.dataVencimento;
    }

    @Override
    public void notificar(String msg) {
        System.out.println(msg);

    }

    @Override
    public boolean ehAgendavel() {
        return true;

    }

    @Override
    public String getId() {
        return super.getId();
    }
}
