package br.ufpb.dcx.poo2024_1.exerc05;

public class ClientePJ extends Cliente {
    private String CNPJ;

    public ClientePJ(String nome, String endereco, String email, String CNPJ) {
        super(nome, endereco, email);
        this.CNPJ = CNPJ;
    }
    public String getId() {
        return this.CNPJ;
    }
}
