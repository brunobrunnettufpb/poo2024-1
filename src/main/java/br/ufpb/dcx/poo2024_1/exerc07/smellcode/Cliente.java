package br.ufpb.dcx.poo2024_1.exerc07.smellcode;

//Código com Smell Code Obsessão Por Tipo Primitivo
public class Cliente {
    private String Nome;
    private int Idade;
    private String Nascimento; //Smell Code Aqui
    private String CEP; //Smell Code Aqui

    public Cliente(String nome, int idade, String nascimento, String CEP) {
        this.Nome = nome;
        this.Idade = idade;
        this.Nascimento = nascimento;
        this.CEP = CEP;
    }
}
