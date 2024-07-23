package br.ufpb.dcx.ayla.artesanato;

import br.ufpb.dcx.ayla.artesanato.exceptions.ItemInexistenteException;

import java.util.*;

public class SistemaFeiraArtesanatoRioTinto implements SistemaFeiraArtesanato {
    private Map<String, ItemDeArtesanato> itensDeArtesanato;

    public SistemaFeiraArtesanatoRioTinto() {
        this.itensDeArtesanato = new HashMap<>();
    }

    public boolean cadastrarItem(ItemDeArtesanato item) {
        if (this.itensDeArtesanato.containsKey(item.getCodigo())) return false;

        this.itensDeArtesanato.put(item.getCodigo(), item);
        return true;
    }

    public List<ItemDeArtesanato> pesquisaItemPeloNome(String nome) {
        List<ItemDeArtesanato> itensPeloNome = new LinkedList<>();

        for (ItemDeArtesanato item: this.itensDeArtesanato.values()) {
            if (item.getNome().startsWith(nome)) itensPeloNome.add(item);
        }

        return itensPeloNome;
    }

    public List<ItemDeArtesanato> pesquisaItensAbaixoDoPreco(double preco) {
        List<ItemDeArtesanato> itensPorPreco = new LinkedList<>();

        for (ItemDeArtesanato item: this.itensDeArtesanato.values()) {
            if (item.getPreco() <= preco) itensPorPreco.add(item);
        }

        Collections.sort(itensPorPreco);

        return itensPorPreco;
    }

    public ItemDeArtesanato pesquisaItemPeloCodigo(String codigo) throws ItemInexistenteException {
        ItemDeArtesanato item = this.itensDeArtesanato.get(codigo);

        if (item == null) throw new ItemInexistenteException("Não existe item com o código " + codigo);
        else return item;
    }
}
