package br.ufpb.dcx.poo2024_1.exerc05;

import java.util.*;

import br.ufpb.dcx.poo2024_1.exerc05.Exceptions.*;

public class SistemaComercialMap implements SistemaComercial {
    private Map<String, Cliente> clientes;
    private Map<String, Produto> produtos;

    public SistemaComercialMap() {
        this.clientes = new HashMap<String, Cliente>();
        this.produtos = new HashMap<String, Produto>();
    }


    @Override
    public boolean existeProduto(Produto produto) {
        if (this.produtos.containsKey(produto.getCodigo())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Produto pesquisaProduto(String codigoProduto)
            throws ProdutoNaoExisteException {
        if (this.produtos.containsKey(codigoProduto)) {
            return this.produtos.get(codigoProduto);
        }
        throw new ProdutoNaoExisteException("Não foi encontrado produto"
                + " com o código " + codigoProduto);

    }

    @Override
    public boolean cadastraProduto(Produto produto) {
        if (existeProduto(produto)) {
            return false;
        } else {
            this.produtos.put(produto.getCodigo(), produto);
            return true;
        }
    }

    public boolean cadastraCliente(Cliente cliente) {
        return false;
    }

    @Override
    public boolean existeCliente(Cliente cliente) {
        return this.clientes.get(cliente.getId()) != null;
    }

    @Override
    public Cliente pesquisaCliente(String id) throws ClienteNaoExisteException {
        for (Cliente c: this.clientes.values()) {
            if (c.getId().equals(id)) return c;
        }

        throw new ClienteNaoExisteException("Cliente de id " + id + " não cadastrado!");
    }

    public Collection<Cliente> pesquisaClientesComNomeComecandoCom(String prefixo) {
        return null;
    }

    @Override
    public Collection<Produto> pesquisaProdutosDaCategoria(CategoriaProduto categoria) {
        List<Produto> produtos = new ArrayList<>();

        for (Produto p: this.produtos.values()) {
            if (p.getCategoria().equals(categoria)) produtos.add(p);
        }

        return produtos;
    }
}