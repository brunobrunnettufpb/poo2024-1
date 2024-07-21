package br.ufpb.dcx.poo2024_1.exerc02;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class SistemaLivros {
    public static void main(String[] args) {
        List<Livro> listLivros = new ArrayList<>();

        boolean cont = true;
        while (cont) {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção:" +
                    "\n\n1.Adicionar livro" +
                    "\n2.Remover livro" +
                    "\n3.Listar livros" +
                    "\n0.Sair"));

            if (opcao == 0) cont = false;
            if (opcao == 1) {
                try {
                    String titulo, autor;
                    int paginas;

                    titulo = JOptionPane.showInputDialog("Digite o título do livro:");
                    autor = JOptionPane.showInputDialog("Digite o autor do livro:");
                    paginas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de páginas do livro:"));

                    listLivros.add(new Livro(titulo, autor, paginas));
                }
                catch (NumberFormatException ex) {
                    System.out.println("Não foi possivel cadastrar o livro!\nFormato de número de páginas inválido!");
                }
                catch (Exception ex) {
                    System.out.println("Não foi possivel cadastrar o livro!\nOcorreu um ero no preenchimento.\n\nCausa: " + ex.getMessage());
                }
            }
            if (opcao == 2) {

            }
            if (opcao == 3) {
                System.out.printf("O sistema possui {0} livros:\n", listLivros.size());
                for (Livro l: listLivros) {
                    System.out.println(l.toString());
                }
            }
        }


    }
}
