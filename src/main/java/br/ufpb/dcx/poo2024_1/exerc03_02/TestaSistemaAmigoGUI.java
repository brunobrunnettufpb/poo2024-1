package br.ufpb.dcx.poo2024_1.exerc03_02;

import javax.swing.*;

public class TestaSistemaAmigoGUI {
    public static void main(String[] args) {
        SistemaAmigo sistema = new SistemaAmigo();

        boolean cont = true;
        while (cont) {
            JOptionPane.showInputDialog("Digite uma opção:" +
                    "\n\n1.Cadastrar amigo." +
                    "\n2.Configurar amigo." +
                    "\n3.");
        }
    }
}
