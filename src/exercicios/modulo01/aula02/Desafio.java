void main() {
    IO.println("=== TaskForge v0 ===");
    String opcao;
    int numTarefas = 0;

    do {
        opcao = IO.readln("Escolha uma opção -> 1 - Criar tarefa; 2 - Ver resumo; 3 - Sair: ");

        switch(opcao) {
            case "1" -> {
                criarTarefa();
                numTarefas++;
            }
            case "2" -> IO.println("Tarefas criada até o momento: " + numTarefas);
            case "3" -> {}
            default -> IO.println("Opção inválida.");
        }
    }
    while (!opcao.equals("3"));
}

void criarTarefa() {
    String nome = IO.readln("Nome da tarefa: ");
    String descricao = IO.readln("Descrição: ");
    int prioridade;

    do {
        prioridade = Integer.parseInt(IO.readln("Prioridade (1 a 5): "));
        if (prioridade < 1 || prioridade > 5) {
            IO.println("Prioridade inválida.");
        }
    } while (prioridade < 1 || prioridade > 5);

    double horasEstimadas = Double.parseDouble(IO.readln("Horas estimadas: "));

    int status;
    do {
        IO.println("Escolha uma opção: ");
        IO.println("1 - Pendente");
        IO.println("2 - Em Andamento");
        IO.println("3 - Concluída");
        IO.println("4 - Cancelada");
        status = Integer.parseInt(IO.readln());
        if (status < 1 || status > 4) {
            IO.println("Status inválido.");
        }
    } while (status < 1 || status > 4);

    String responsavel = IO.readln("Responsavel: ");

    IO.println("");
    IO.println("------ TAREFA CRIADA ------");
    IO.println("Tarefa:     " + nome);
    IO.println("Descrição:  " + descricao);
    IO.println("Responsável: " + responsavel);
    IO.print("Prioridade: ");
    for(int i = 0; i < prioridade; i++) {
        IO.print("*");
    }
    IO.println();
    IO.println("Horas Estimadas: " + horasEstimadas);
    String statusNome = "";
    switch (status) {
        case 1 -> statusNome = "Pendente";
        case 2 -> statusNome = "Em Andamento";
        case 3 -> statusNome = "Concluída";
        case 4 -> statusNome = "Cancelada";
        default -> statusNome = "Status Inválido";
    }
    IO.println("Status: " + statusNome);
    IO.println("---------------------------");
}