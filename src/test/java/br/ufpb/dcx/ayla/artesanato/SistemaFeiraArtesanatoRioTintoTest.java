package br.ufpb.dcx.ayla.artesanato;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaFeiraArtesanatoRioTintoTest {

    @Test
    public void testaCadastro() {
        SistemaFeiraArtesanatoRioTinto sistema = new SistemaFeiraArtesanatoRioTinto();
        sistema.cadastrarItem(new Roupa());
        try {
            Roupa r = new Roupa();
            sistema.cadastrarItem(r);
            ItemDeArtesanato item = sistema.pesquisaItemPeloCodigo(r.getCodigo());
            assertEquals(item, r);

        } catch (Exception e) {
            fail();
        }
    }
}
