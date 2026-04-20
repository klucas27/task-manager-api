import java.util.Date;

public abstract class Tarefa {
    protected String id;
    protected String titulo;
    protected String status;
    protected String dataCriacao;

    // Constructs
    public Tarefa(String id, String titulo, String status, String dataCriacao) {

        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("Título não pode estar vazio");
        }
        this.id = id;
        this.titulo = titulo;
        this.status = status.toUpperCase();
        this.dataCriacao = dataCriacao;
    }

    public Tarefa(String id, String titulo, String status) {

        this(id, titulo, status, new Date().toString());
    }

    public Tarefa(String id, String titulo) {
        this(id, titulo, "Pendente");
    }

    // methods abstracts
    public abstract void completar();


    // getters
    public void exibir() {
        System.out.printf("%nID: %s%nTitulo: %s%n Status: %s%n Data de Criação: %s%n", this.id, this.titulo, this.status, this.dataCriacao);
    }

    public String getStatus() {
        return this.status;
    }

    public boolean ehAgendavel() {
        return false;
    }

    public String getId() {
        return this.id;
    }
    public String getTitulo() {
        return this.titulo;
    }


}
