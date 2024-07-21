package br.ufpb.dcx.poo2024_1.exerc02;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    public Livro() {
        this("", "", 0);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return this.paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Livro livro = (Livro) o;
        return paginas == livro.paginas && titulo.equals(livro.titulo) && autor.equals(livro.autor);
    }

    @Override
    public int hashCode() {
        int result = titulo.hashCode();
        result = 31 * result + autor.hashCode();
        result = 31 * result + paginas;
        return result;
    }

    @Override
    public String toString() {
        return String.format("Livro de título {0}, cujo autor é {0}, possui {0} páginas.", this.titulo, this.autor, this.paginas);
    }
}
