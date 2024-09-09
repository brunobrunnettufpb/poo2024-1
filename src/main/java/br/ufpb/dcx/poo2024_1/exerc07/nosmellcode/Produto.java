package br.ufpb.dcx.poo2024_1.exerc07.nosmellcode;

//Mesmo código sem Smell Code
public class Produto {
    private String nome;
    private Moeda preco;
    private int QuantidadeEmEstoque;

    public Produto(String nome, double preco, String simbolo, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = new Moeda(preco, simbolo);
        this.QuantidadeEmEstoque = quantidadeEmEstoque;
    }

    public class Moeda {
        private double preco;
        private String simbolo;

        public Moeda(double preco, String moeda) {
            this.preco = preco;
            this.simbolo = moeda;
        }
    }
}
