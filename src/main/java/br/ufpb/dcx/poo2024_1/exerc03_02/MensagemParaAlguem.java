package br.ufpb.dcx.poo2024_1.exerc03_02;

public class MensagemParaAlguem extends Mensagem {
    private String emailDestinatario;

    public MensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean anonima) {
        super(texto, emailRemetente, anonima);
        this.emailDestinatario = emailDestinatario;
    }

    public String getEmailDestinatario() {
        return emailDestinatario;
    }
    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }

    public String getTextoCompletoAExibir() {
        if (this.ehAnonima()) return "Mensagem para " + this.getEmailDestinatario() + ". Texto: " + this.getTexto();
        return "Mensagem de " + this.getEmailRemetente() + " para " + this.getEmailDestinatario() + ": Mensagem: " + this.getTexto();
    }
}
