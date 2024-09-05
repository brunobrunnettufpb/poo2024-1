package br.ufpb.dcx.poo2024_1.exerc07.smellcode;

//Código com Smell Code Obsessão Por Tipo Primitivo
public class Produto {
    private String Nome;
    private double Preco;
    private double QuantidadeEmEstoque;

    public Produto(String nome, double preco, double quantidadeEmEstoque) {
        this.Nome = nome;
        this.Preco = preco;
        this.QuantidadeEmEstoque = quantidadeEmEstoque;
    }
}



