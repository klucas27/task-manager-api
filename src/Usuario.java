public class Usuario {
    private String nome;
    private String email;

    // Constructor
    public Usuario(String nome, String email) {

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email não pode estar vazio");
        }
        this.nome = nome;
        this.email = email;
        System.out.printf("Usuario: %s Cadastrado!%n", nome);
    }

    // Getters
    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

}
