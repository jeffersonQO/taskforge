package aluno;

public class Aluno {
    private String nome;
    private double notaPrimeiroBimestre;
    private double notaSegundoBimestre;

    public Aluno(String nome, double notaPrimeiroBimestre, double notaSegundoBimestre) {
        this.nome = nome;
        this.notaPrimeiroBimestre = notaPrimeiroBimestre;
        this.notaSegundoBimestre = notaSegundoBimestre;
    }

    public void media() {
        IO.println(nome + ": " + ((notaPrimeiroBimestre + notaSegundoBimestre) / 2));
    }
}
