package br.ufpb.dcx.poo2024_1.exerc03_02;

import javax.swing.*;
import java.util.List;

public class TestaSistemaAmigoMap {
    public static void main(String[] args) {
        SistemaAmigoMap sistema = new SistemaAmigoMap();

        try {
            sistema.cadastraAmigo("José", "jose@email.com.br");
            sistema.cadastraAmigo("Maria", "maria@email.com.br");

            sistema.configuraAmigoSecretoDe("jose@email.com.br", "maria@email.com.br");
            sistema.configuraAmigoSecretoDe("maria@email.com.br", "jose@email.com.br");
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        sistema.enviarMensagemParaAlguem("Olá José!", "maria@email.com.br", "jose@email.com.br", true);
        sistema.enviarMensagemParaTodos("Olá todos!", "maria@email.com.br", true);

        List<Mensagem> mensagensAnonimas = sistema.pesquisaMensagensAnonimas();
        for (Mensagem msg: mensagensAnonimas) {
            JOptionPane.showMessageDialog(null, msg.getTextoCompletoAExibir());
        }

        try {
            if (sistema.pesquisaAmigoSecretoDe("jose@email.com.br").equals("maria@email.com.br")) {
                JOptionPane.showMessageDialog(null, "Ok!");
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Amigo não configurado!\n\nCausa: " + ex.getMessage());
        }
    }
}
