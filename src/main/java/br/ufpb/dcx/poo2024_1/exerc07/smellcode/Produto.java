package br.ufpb.dcx.poo2024_1.exerc07.smellcode;

//Código com Smell Code Obsessão Por Tipo Primitivo
public class Produto {
    private String nome;
    private double preco; //Smell Code aqui
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}



