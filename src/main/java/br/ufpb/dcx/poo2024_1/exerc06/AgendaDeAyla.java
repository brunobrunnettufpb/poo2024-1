package br.ufpb.dcx.poo2024_1.exerc06;

import java.util.Collection;
import java.util.Map;

public class AgendaDeAyla implements Agenda {
    private Map<String, Contato> contatos;
    private GravadorDeDados gravador = new GravadorDeDados();

    public void salvarDados() {

    }
    public void recuperarDados() {

    }

    public boolean cadastraContato(String nome, int dia, int mes) {
        return false;
    }
    public Collection<Contato> pesquisaAniversariantes(int dia, int mes) {
        return null;
    }
    public boolean removeContato(String nome) {
        return false;
    }

}
