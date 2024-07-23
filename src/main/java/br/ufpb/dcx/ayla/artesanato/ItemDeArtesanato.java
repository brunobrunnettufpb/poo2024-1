package br.ufpb.dcx.ayla.artesanato;

public class ItemDeArtesanato implements Comparable<ItemDeArtesanato> {
    private String codigo;
    private String nome;
    private double preco;

    public ItemDeArtesanato(String codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public ItemDeArtesanato() {
        this("", "", 0.0);
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemDeArtesanato that = (ItemDeArtesanato) o;

        return codigo.equals(that.codigo);
    }

    @Override
    public int hashCode() {
        return codigo.hashCode();
    }

    @Override
    public int compareTo(ItemDeArtesanato o) {
        //OPÇÃO 1
        //return this.nome.compareTo(o.getNome());

        //OPÇÃO 2
        /*if (this.preco < o.getPreco()) return -1;
        else if (this.preco == o.getPreco()) return 0;
        else return 1;*/

        //OPÇÃO 3
        return (int) (this.getPreco() - o.getPreco());
    }
}
