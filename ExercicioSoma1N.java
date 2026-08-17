void main() {
    int num = Integer.parseInt(IO.readln("N: "));
    int valorSomado = 0;

    for (int i = 1; i <= num; i++) {
        valorSomado += i;
    }

    IO.print("A soma de 1 até " + num + " é: " + valorSomado);
}