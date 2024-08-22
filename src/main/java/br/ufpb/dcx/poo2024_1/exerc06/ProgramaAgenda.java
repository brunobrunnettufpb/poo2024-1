package br.ufpb.dcx.poo2024_1.exerc06;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ProgramaAgenda {
    public static void main(String[] args) {
        JFrame dialog = new AgendaGUI();
        dialog.setVisible(true);
        WindowListener closer = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        dialog.addWindowListener(closer);
    }
}
