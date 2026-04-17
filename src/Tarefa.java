import java.util.Date;

public abstract class Tarefa {
    protected String titulo;
    protected String status;
    protected String dataCriacao;

    // Constructs
    public Tarefa(String titulo, String status, String dataCriacao) {

        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("Título não pode estar vazio");
        }

        this.titulo = titulo;
        this.status = status.toUpperCase();
        this.dataCriacao = dataCriacao;
    }

    public Tarefa(String titulo, String status) {

        this(titulo, status, new Date().toString());
    }

    public Tarefa(String titulo) {
        this(titulo, "Pendente");
    }

    // methods abstracts
    public abstract void completar();


    // getters
    public void exibir() {
        System.out.printf("%nTitulo: %s%n Status: %s%n Data de Criação: %s%n", this.titulo, this.status, this.dataCriacao);
    }

    public String getStatus() {
        return this.status;
    }

}
