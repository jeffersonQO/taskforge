import livro.Livro;

void main() {
    Livro livro = new Livro();
    livro.setTitulo("Java Fácil");
    livro.setPaginas(200);

    IO.println(livro.getTitulo() + " tem " + livro.getPaginas() + " páginas");

    Livro livroComConstrutor =  new Livro("Java Fácil 2", 200);
    IO.println(livroComConstrutor.getTitulo() + " tem " + livroComConstrutor.getPaginas() + " páginas");

    livro.descrever();
    livroComConstrutor.descrever();
}