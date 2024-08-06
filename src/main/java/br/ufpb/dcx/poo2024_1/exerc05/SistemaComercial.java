package br.ufpb.dcx.poo2024_1.exerc05;

import java.util.Collection;
public interface SistemaComercial {
    boolean existeProduto(Produto produto);
    Produto pesquisaProduto(String codigoProduto) throws ProdutoNaoExisteException;
    boolean cadastraProduto(Produto produto);
    boolean existeCliente(Cliente cliente);
    Cliente pesquisaCliente(String id) throws ClienteNaoExisteException;
    Collection<Produto> pesquisaProdutosDaCategoria(CategoriaProduto categoria);
}