package br.ufpb.dcx.poo2024_1.exerc05;

public abstract class Cliente {
    private String nome;
    private String endereco;
    private String email;

    public abstract String getId();

    public Cliente(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }
}
