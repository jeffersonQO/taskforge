void main() {
    int valor = Integer.parseInt(IO.readln("Escolha uma tabuada: "));

    for (int i = 1; i <= 10; i++) {
        IO.println(valor + " x " + i + " = " + (valor * i));
    }
}