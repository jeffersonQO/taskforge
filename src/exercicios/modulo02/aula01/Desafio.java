void main() {
    IO.println("=== src.TaskForge v0 ===");

    Tarefa tarefa1 = new Tarefa("Estudar java", "Estudar encapsulamento", 3,
            "Jefferson Queiroz", 2, 1);

    tarefa1.imprimirCartao();

    Tarefa tarefa2 = new Tarefa("Estudar frontend", "Estudar vue", 5,
            "Jefferson Queiroz", 5, 1);
    tarefa2.setStatus(2);
    tarefa2.imprimirCartao();
}