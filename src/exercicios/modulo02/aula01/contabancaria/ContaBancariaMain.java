import exercicios.modulo02.aula01.contabancaria.ContaBancaria;

void main() {
    ContaBancaria cbAna = new ContaBancaria("Ana", 0);
    cbAna.depositar(100);
    cbAna.depositar(50);
    cbAna.mostrarSaldo();
}