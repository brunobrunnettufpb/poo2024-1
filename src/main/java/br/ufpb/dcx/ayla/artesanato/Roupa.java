package br.ufpb.dcx.ayla.artesanato;

public class Roupa extends ItemDeArtesanato {
    private String material;
    private String tamanho;

    public Roupa(String codigo, String nome, double preco, String material, String tamanho) {
        super(codigo, nome, preco, TipoItem.ROUPA);
        this.material = material;
        this.tamanho = tamanho;
    }

    public Roupa() {
        this("", "", 0.0, "", "");
    }
}
