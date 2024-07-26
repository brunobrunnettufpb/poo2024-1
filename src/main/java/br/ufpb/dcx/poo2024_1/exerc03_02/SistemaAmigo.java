package br.ufpb.dcx.poo2024_1.exerc03_02;

import java.util.ArrayList;
import java.util.List;
import br.ufpb.dcx.poo2024_1.exerc03_02.Exceptions.*;

public class SistemaAmigo {
    private List<Mensagem> mensagens = new ArrayList<>();
    private List<Amigo> amigos = new ArrayList<>();

    public void cadastraAmigo(String nomeAmigo, String emailAmigo) {
        amigos.add(new Amigo(nomeAmigo, emailAmigo, ""));
    }
    public Amigo pesquisaAmigo(String emailAmigo) {
        for (Amigo amigo: amigos) {
            if (amigo.getEmail().equals(emailAmigo)) return amigo;
        }

        return null;
    }

    public void enviarMensagemParaTodos(String texto, String emailRemetente, boolean ehAnonima) {
        Mensagem msg = new MensagemParaTodos(texto, emailRemetente, ehAnonima);
        mensagens.add(msg);
    }

    public void enviarMensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean ehAnonima) {
        Mensagem msg = new MensagemParaAlguem(texto, emailRemetente, emailDestinatario, ehAnonima);
        mensagens.add(msg);
    }

    public List<Mensagem> pesquisaMensagensAnonimas() {
        List<Mensagem> msgsAnonimas = new ArrayList<>();
        for (Mensagem msg: this.mensagens) {
            if (msg.ehAnonima()) msgsAnonimas.add(msg);
        }

        return msgsAnonimas;
    }
    public List<Mensagem> pesquisaTodasAsMensagens() {
        return this.mensagens;
    }

    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException {
        Amigo amigo1 = pesquisaAmigo(emailDaPessoa);
        Amigo amigo2 = pesquisaAmigo(emailAmigoSorteado);

        if (amigo1 == null) throw new AmigoInexistenteException(emailDaPessoa + " não cadastrado!");
        if (amigo2 == null) throw new AmigoInexistenteException( emailAmigoSorteado + " não cadastrado!");

        amigo1.setEmailAmigoSorteado(amigo2.getEmail());
    }
    public String pesquisaAmigoSecretoDe(String emailDaPessoa) throws AmigoInexistenteException, AmigoNaoSorteadoException {
        Amigo amigo1 = pesquisaAmigo(emailDaPessoa);

        if (amigo1 == null) throw new AmigoInexistenteException(emailDaPessoa + " não cadastrado!");

        return amigo1.getEmailAmigoSorteado();
    }

    @Override
    public String toString() {
        return "O sistema possui " + this.amigos.size() + " amigos cadastrados e " + this.mensagens.size() + " mensagens enviadas.";
    }
}
