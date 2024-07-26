package br.ufpb.dcx.poo2024_1.exerc03_02;

public class MensagemParaTodos extends Mensagem {
    public MensagemParaTodos(String texto, String emailRemetente, boolean anonima) {
        super(texto, emailRemetente, anonima);
    }
    public String getTextoCompletoAExibir() {
        if (this.ehAnonima()) return "Mensagem para todos. Texto: " + this.getTexto();
        else return "Mensagem de " + this.getEmailRemetente() + " para todos. Texto: " + this.getTexto();
    }
}
