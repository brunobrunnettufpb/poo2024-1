package br.ufpb.dcx.poo2024_1.exerc06;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class AgendaDeAylaTest {
    @Test
    public void testaCadastro() {
        AgendaDeAyla sistema = new AgendaDeAyla();

        sistema.cadastraContato("Contato 1", 1,1);
        assertEquals(1, sistema.pesquisaAniversariantes(1,1).size());

        sistema.cadastraContato("Contato 2", 2,2);
        assertEquals(1, sistema.pesquisaAniversariantes(2,2).size());

        sistema.removeContato("Contato 1");
        assertEquals(0, sistema.pesquisaAniversariantes(1,1).size());
    }

    @Test
    void testaSalvar() {
        AgendaDeAyla sistema = new AgendaDeAyla();
        File file = new File(GravadorDeDados.ARQUIVO_CONTATOS);

        if (file.exists()) file.delete();

        sistema.cadastraContato("Contato 1", 1,1);
        assertEquals(1, sistema.pesquisaAniversariantes(1,1).size());

        sistema.cadastraContato("Contato 2", 2,2);
        assertEquals(1, sistema.pesquisaAniversariantes(2,2).size());

        sistema.salvarDados();
        assertTrue(file.exists());

        file.delete();
        assertFalse(file.exists());
    }

    @Test
    void testaRecuperar() {
        AgendaDeAyla sistema = new AgendaDeAyla();
        sistema.recuperarDados();
        File file = new File(GravadorDeDados.ARQUIVO_CONTATOS);

        sistema.cadastraContato("Contato 1", 1,1);
        assertEquals(1, sistema.pesquisaAniversariantes(1,1).size());

        sistema.cadastraContato("Contato 2", 2,2);
        assertEquals(1, sistema.pesquisaAniversariantes(2,2).size());

        file.delete();
        assertFalse(file.exists());
    }
}
