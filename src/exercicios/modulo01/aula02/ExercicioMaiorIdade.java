void main() {
    int idade = Integer.parseInt(IO.readln("Sua idade: "));

    if(idade >= 18) {
        IO.print("Você é maior de idade.");
    } else {
        IO.print("Você é menor de idade.");
    }
}