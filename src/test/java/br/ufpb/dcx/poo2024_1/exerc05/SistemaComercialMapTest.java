package br.ufpb.dcx.poo2024_1.exerc05;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SistemaComercialMapTest {
    @Test
    public void testaCadastroProdutos() {
        SistemaComercialMap sistema = new SistemaComercialMap();
        Collection<Produto> alimentos = sistema.pesquisaProdutosDaCategoria(CategoriaProduto.ALIMENTO);
        assertTrue(alimentos.size() == 0);

        try {
            Produto produto = new Produto("001", "É um alimento", 10.0, 1, CategoriaProduto.ALIMENTO);

            sistema.cadastraProduto(produto);
            assertTrue(sistema.existeProduto(produto));
            assertEquals(1, sistema.pesquisaProdutosDaCategoria(CategoriaProduto.ALIMENTO).size());
        }
        catch (Exception ex) {

        }
    }
}
