package br.ufpb.dcx.poo2024_1.exerc03_02;

public class Amigo implements Comparable<Amigo> {
    private String nome;
    private String email;
    private String emailAmigoSorteado;

    public Amigo(String nome, String email, String emailAmigoSorteado) {
        this.nome = nome;
        this.email = email;
        this.emailAmigoSorteado = emailAmigoSorteado;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailAmigoSorteado() {
        return emailAmigoSorteado;
    }
    public void setEmailAmigoSorteado(String emailAmigoSorteado) {
        this.emailAmigoSorteado = emailAmigoSorteado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Amigo amigo = (Amigo) o;
        return nome.equals(amigo.nome) && email.equals(amigo.email);
    }

    @Override
    public int hashCode() {
        int result = nome.hashCode();
        result = 31 * result + email.hashCode();
        return result;
    }

    @Override
    public int compareTo(Amigo o) {
        return this.nome.compareTo(o.nome);
    }
}
