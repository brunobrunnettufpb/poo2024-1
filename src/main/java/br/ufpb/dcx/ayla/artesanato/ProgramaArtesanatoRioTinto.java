package br.ufpb.dcx.ayla.artesanato;

import javax.swing.*;
import java.util.List;

public class ProgramaArtesanatoRioTinto {
    public static void main(String[] args) {
        SistemaFeiraArtesanato sistema = new SistemaFeiraArtesanatoRioTinto();

        boolean cont = true;
        while (cont) {
            String opcao = JOptionPane.showInputDialog("Digite uma opção:" +
                    "\n1.Cadastrar item." +
                    "\n2.Pesquisar item pelo nome." +
                    "\n3.Pesquisar item pelo código." +
                    "\n0.Sair");

            if (opcao.equals("1")) {
                ItemDeArtesanato item = new ItemDeArtesanato();
                String codigo = JOptionPane.showInputDialog("Qual o código?");
                item.setCodigo(codigo);
                item.setNome(JOptionPane.showInputDialog("Qual o nome do item?"));
                item.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do item?")));
                if (sistema.cadastrarItem(item)) {
                    JOptionPane.showMessageDialog(null, "Item cadastrado com sucesso: " + item.toString());
                }
                else {
                    JOptionPane.showMessageDialog(null, "");
                }
            }
            if (opcao.equals("2")) {
                String nomeItemAPesquisar = JOptionPane.showInputDialog("Qual o nome do item?");
                List<ItemDeArtesanato> itensPorNome = sistema.pesquisaItemPeloNome(nomeItemAPesquisar);


            }
            if (opcao.equals("3")) {

            }
            if (opcao.equals("0")) {

            }
        }
    }
}
