package br.ufpb.dcx.poo2024_1.exerc03;

import java.util.ArrayList;
import java.util.List;
import br.ufpb.dcx.poo2024_1.exerc03.Exceptions.*;

public class SistemaAmigo {
    private List<Mensagem> mensagens;
    private List<Amigo> amigos;

    public void cadastraAmigo(String nomeAmigo, String emailAmigo) {

    }
    public Amigo pesquisaAmigo(String emailAmigo) {
        for (Amigo amigo: amigos) {
            if (amigo.getEmail().equals(emailAmigo)) return amigo;
        }

        return null;
    }

    public void enviarMensagemParaTodos(String texto, String emailRemetente, boolean ehAnonima) {

    }

    public void enviarMensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean ehAnonima) {

    }

    public List<Mensagem> pesquisaMensagensAnonimas() {
        List<Mensagem> msgsAnonimas = new ArrayList<>();
        for (Mensagem msg: mensagens) {
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
}
