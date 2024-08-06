package br.ufpb.dcx.poo2024_1.exerc05;

public class ClientePF extends Cliente {
    private String CPF;
    public ClientePF(String nome, String endereco, String email, String CPF) {
        super(nome, endereco, email);
        this.CPF = CPF;
    }
    @Override
    public String getId() {
        return this.CPF;
    }
}