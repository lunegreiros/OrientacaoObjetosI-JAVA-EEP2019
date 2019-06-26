/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrocarFeelAndLook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author jmartins
 */
class TrocaAparenciaFrame extends JFrame {

    public TrocaAparenciaFrame() {
        setTitle("Exemplo Troca Aparencia");
        setSize(300, 200);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        getContentPane().add(new TrocaAparenciaPanel());
    }

    public static void main(String[] args) {
        new TrocaAparenciaFrame().setVisible(true);
    }

}

class TrocaAparenciaPanel extends JPanel implements ActionListener {

    public TrocaAparenciaPanel() {
        metalButton = new JButton("Metal");
        motifButton = new JButton("Motif");
        windowsButton = new JButton("Windows");
        add(metalButton);
        add(motifButton);
        add(windowsButton);
        metalButton.addActionListener(this);
        motifButton.addActionListener(this);
        windowsButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evt) {
        Object source = evt.getSource();
        String aparencia = "";
        if (source == metalButton) {
            aparencia = "javax.swing.plaf.metal.MetalLookAndFeel";
        } else if (source == motifButton) {
            aparencia = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
        } else if (source == windowsButton) {
            aparencia = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
        }
        try {
            UIManager.setLookAndFeel(aparencia);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    private JButton metalButton;
    private JButton motifButton;
    private JButton windowsButton;
}
