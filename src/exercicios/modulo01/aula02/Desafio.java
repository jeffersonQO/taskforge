void main() {
    IO.println("=== TaskForge v0 ===");
    String opcao;
    int numTarefas = 0;

    do {
        opcao = IO.readln("Escolha uma opção -> 1 - Criar tarefa; 2 - Ver resumo; 3 - Sair: ");

        switch(opcao) {
            case "1" -> {
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
                boolean concluida = Boolean.parseBoolean(IO.readln("Concluída: "));
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
                IO.println("Status: " + (concluida ? "Concluída" : "Pendente"));
                IO.println("---------------------------");

                numTarefas++;
            }
            case "2" -> IO.println("Tarefas criada até o momento: " + numTarefas);
            case "3" -> {}
            default -> IO.println("Opção inválida.");
        }
    }
    while (!opcao.equals("3"));
}