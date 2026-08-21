void main() {
    String senha;

    do {
        senha = IO.readln("Senha: ");
    } while (!senha.equals("java123"));

    IO.print("Acesso liberado!");
}