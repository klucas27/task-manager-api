public class SistemaTarefas {

    public static String criarTarefa(String titulo, String status) {

        if (titulo == null || titulo.isBlank()) {
            return "Erro! Titulo Vazio";
        }

        return "Tarefa Criada!" + "\n Titulo: " + titulo + "\n Status: " + status;

    }

    public static void listarTarefa(String titulo, String status) {

        System.out.println("---------");
        System.out.println("Tarefa: " + titulo);
        System.out.println("Status: " + status);
        System.out.println("---------");
    }

    public static boolean deletarTarefa(String titulo) {

        return titulo != null && !titulo.isBlank();
    }

    public static void main(String[] args) {

        String resultado = criarTarefa(null, "PENDENTE");
        System.out.println(resultado);

        // Listando
        listarTarefa("Estudar Java", "PENDENTE");

        // Deletando a tarefa
        boolean marcou = deletarTarefa("");
        System.out.println("Deletou a Tarefa? " + marcou);


    }
}
