public class TarefaUnica extends Tarefa implements Agendavel, Notificavel {

    private String dataVencimento;

    public TarefaUnica(String titulo, String status, String dataCriacao, String dataVencimento) {
        super(titulo, status, dataCriacao);
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
        System.out.println("Tarefa '" + this.titulo + "' foi marcada como completa");

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
}
