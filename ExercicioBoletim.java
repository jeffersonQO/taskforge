void main() {
    double notaFinal = Double.parseDouble(IO.readln("Nota final: "));

    if (notaFinal >= 7) {
        IO.print("Situação: Aprovado");
    } else if (notaFinal >= 5 && notaFinal <= 6.9) {
        IO.print("Situação: Recuperação");
    } else {
        IO.print("Situação: Reprovado");
    }
}