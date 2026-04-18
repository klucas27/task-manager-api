# Task Manager API (Exemplos em Java)

Projeto educativo em Java que demonstra conceitos de POO (classes abstratas, herança, interfaces e polimorfismo) usando um pequeno gerenciador de tarefas.

## Visão geral

O repositório contém várias classes de exemplo que modelam um sistema simples de tarefas:

- `Tarefa` (abstract): classe base para tarefas.
- `TarefaUnica`: tarefa com data de vencimento; implementa `Agendavel` e `Notificavel`.
- `TarefaRecorrente`: tarefa com frequência (ex.: diária, semanal).
- `GerenciadorTarefas`: armazena tarefas e fornece operações como gerar relatório, completar todas e contar pendentes.
- `SistemaTarefas`: classe com um `main(String[] args)` demonstrando algumas operações.
- `Main`: outro exemplo que popula um `GerenciadorTarefas` e chama seus métodos (observe nota abaixo sobre assinatura do método `main`).
- `Agendavel`, `Notificavel`: interfaces que definem comportamento de agendamento e notificação.

Estrutura (arquivos em `src/`):

- Agendavel.java
- GerenciadorTarefas.java
- Main.java
- Notificavel.java
- SistemaTarefas.java
- Tarefa.java
- TarefaRecorrente.java
- TarefaUnica.java

## Requisitos

- JDK 11+ (recomenda-se JDK 17 ou superior)

## Compilar

1. A partir da raiz do projeto (onde está este README) compile as fontes e coloque as classes em um diretório `out`:

```bash
javac src/*.java -d out
```

2. Se preferir compilar diretamente para o diretório atual, remova `-d out` (não recomendado para projetos maiores).

## Executar

- Executar o demo principal fornecido em `SistemaTarefas` (tem a assinatura válida `public static void main(String[] args)`):

```bash
java -cp out SistemaTarefas
```

Saída esperada aproximada ao executar `SistemaTarefas`:

```
Erro! Titulo Vazio
---------
Tarefa: Estudar Java
Status: PENDENTE
---------
Deletou a Tarefa? false
```

- Observação sobre `Main.java`: o arquivo `Main.java` contém um método `public static void main()` sem o parâmetro `String[] args`. Esse método não é considerado ponto de entrada padrão pela JVM (a JVM procura `public static void main(String[] args)`). Para executar a demonstração definida em `Main.java` você pode:

  - Alterar a assinatura para `public static void main(String[] args)` e recompilar; ou
  - Criar uma classe wrapper com `main(String[] args)` que chame `Main.main()` explicitamente.

Exemplo de wrapper (crie `Runner.java`):

```java
public class Runner {
    public static void main(String[] args) {
        Main.main(); // chama o main sem args definido em Main.java
    }
}
```

Compile e execute depois de adicionar `Runner.java`:

```bash
javac src/*.java -d out
java -cp out Runner
```

## Testes e experimentação

- Experimente criar novas instâncias de `TarefaUnica` e `TarefaRecorrente`, adicioná-las ao `GerenciadorTarefas` e chamar `gerarRelatorio()`, `contarPendentes()` e `completarTodas()`.

## Extensões sugeridas

- Adicionar persistência simples em arquivo (salvar/ler tarefas).
- Implementar filtragem/ordenação de tarefas por data ou status.
- Corrigir/enriquecer formatos de data usando `java.time` (ex.: LocalDate) em vez de `String`.
- Adicionar testes unitários (JUnit) e script de build (Maven/Gradle).

## Contribuição

Pull requests e issues são bem-vindos. Este projeto é intencionalmente simples e educativo.

## Licença

Use conforme desejar — se quiser adicionar uma licença formal, crie um arquivo `LICENSE`.

---

Se quiser, eu posso também: adicionar um `Runner.java` pronto para executar o demo do `GerenciadorTarefas`, ajustar `Main.java` para usar a assinatura correta de `main` ou adicionar um pequeno script de build (Maven/Gradle). Diga o que prefere.

