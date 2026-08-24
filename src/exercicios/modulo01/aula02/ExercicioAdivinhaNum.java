void main() {
    int numSecreto = 12;
    int numPalpite = 0;

    while (numSecreto != numPalpite) {
        numPalpite = Integer.parseInt(IO.readln("Palpite: "));
        if (numPalpite > numSecreto) {
            IO.println("É menor!");
        } else if (numPalpite < numSecreto) {
            IO.println("É maior!");
        }
    }

    IO.print("Acertou!!!");
}