package br.ufpb.dcx.poo2024_1.exerc07.smellcode;

//Código com Smell Code Obsessão Por Tipo Primitivo
public class Cliente {
    private String nome;
    private int idade;
    private String nascimento; //Smell Code Aqui
    private String cep; //Smell Code Aqui

    public Cliente(String nome, int idade, String nascimento, String cep) {
        this.nome = nome;
        this.idade = idade;
        this.nascimento = nascimento;
        this.cep = cep;
    }
}
