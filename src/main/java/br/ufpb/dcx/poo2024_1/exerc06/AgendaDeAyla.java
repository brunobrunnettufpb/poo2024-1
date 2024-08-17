package br.ufpb.dcx.poo2024_1.exerc06;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class AgendaDeAyla implements Agenda {
    private HashMap<String, Contato> contatos = new HashMap<>();
    private GravadorDeDados gravador = new GravadorDeDados();

    public void salvarDados() {
        try {
            gravador.salvarContatos(contatos);
        }
        catch (IOException ex) {
            //TODO:
        }
    }
    public void recuperarDados() {
        try {
            this.contatos = gravador.recuperarContatos();
        }
        catch (IOException e) {
            //TODO:
        }
    }

    public boolean cadastraContato(String nome, int dia, int mes) {
        if (this.contatos.containsKey(nome)) { return false; }

        this.contatos.put(nome, new Contato(nome, dia, mes));
        return true;
    }
    public Collection<Contato> pesquisaAniversariantes(int dia, int mes) {
        Collection<Contato> contatos = new ArrayList<>();

        for (Contato c: this.contatos.values()) {
            if (c.getMesAniversario() == mes && c.getDiaAniversario() == dia) contatos.add(c);
        }

        return contatos;
    }
    public boolean removeContato(String nome) {
        if (this.contatos.containsKey(nome)) {
            this.contatos.remove(nome);
            return true;
        }

        return false;
    }
}
