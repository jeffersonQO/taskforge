void main() {
    String opcao = IO.readln("Escolha (1-3): ");

    switch (opcao) {
        case "1" -> IO.print("Bom dia!");
        case "2" -> IO.print("Boa tarde!");
        case "3" -> IO.print("Boa noite!");
        default -> IO.print("Opção inválida.");
    }
}