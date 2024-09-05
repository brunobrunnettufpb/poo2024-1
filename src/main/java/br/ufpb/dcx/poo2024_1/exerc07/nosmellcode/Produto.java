package br.ufpb.dcx.poo2024_1.exerc07.nosmellcode;

//Mesmo código sem Smell Code
public class Produto {
    private String Nome;
    private Preco Preco;
    private int QuantidadeEmEstoque;

    public Produto(String nome, double preco, String moeda, int quantidadeEmEstoque) {
        this.Nome = nome;
        this.Preco = new Preco(preco, moeda);
        this.QuantidadeEmEstoque = quantidadeEmEstoque;
    }

    public class Preco {
        private double Preco;
        private String Moeda;

        public Preco(double preco, String moeda) {
            Preco = preco;
            Moeda = moeda;
        }
    }
}



