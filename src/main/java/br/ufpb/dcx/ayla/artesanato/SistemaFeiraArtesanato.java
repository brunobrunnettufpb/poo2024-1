package br.ufpb.dcx.ayla.artesanato;

import br.ufpb.dcx.ayla.artesanato.exceptions.ItemInexistenteException;

import java.util.List;

/**
 * Sistema para gerenciar itens de artesanato.
 */
public interface SistemaFeiraArtesanato {
    /**
     * Cadastra um novo item no sistema.
     * @param item O item a ser adicionado.
     * @return true se o item foi cadastro, ou false caso ele já exista no sistema.
     */
    public boolean cadastrarItem(ItemDeArtesanato item);

    /**
     * Pesquisa todos os items cujo nome começa como nome passado como parâmetro.
     * @param nome O nome a pesquisar
     * @return uma lista contendo os itens cujo o nome começa com o parâmetro passado.
     */
    public List<ItemDeArtesanato> pesquisaItemPeloNome(String nome);

    /**
     * Pesquisa os itens cujo preço é menor ou igual ao valor passado no parâmetro.
     * @param preco O valor do itens a pesquisar
     * @return a lista dos itens cujo preço é menor ou igual ao valor passado no parâmetro.
     */
    public List<ItemDeArtesanato> pesquisaItensAbaixoDoPreco(double preco);

    /**
     * Pesquisa o item cujo código é passado por parâmetro.
     * @param codigo O código do item a pesquisar.
     * @return o item encontrado.
     * @throws ItemInexistenteException Se não for encontrado nenhum item como código passado.
     */
    public ItemDeArtesanato pesquisaItemPeloCodigo(String codigo) throws ItemInexistenteException;
}
