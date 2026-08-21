package retangulo;

public class Retangulo {
    private int altura;
    private int largura;

    public Retangulo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public void area() {
        IO.println("Área: " + altura * largura);
    }

    public void perimetro() {
        IO.println("Perimetro: " + 2 * (altura + largura));
    }
}
