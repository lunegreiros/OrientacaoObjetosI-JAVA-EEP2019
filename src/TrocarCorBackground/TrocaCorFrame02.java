/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrocarCorBackground;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author jmartins
 */
class TrocaCorFrame02 extends JFrame {

    public TrocaCorFrame02() {
        setTitle("Exemplo Troca Cor");
        setSize(300, 200);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        getContentPane().add(new TrocaCorPanel());
    }

    public static void main(String[] args) {
        new TrocaCorFrame02().setVisible(true);
    }

}

class TrocaCorPanel extends JPanel implements ActionListener {

    public TrocaCorPanel() {
        yellowButton = new JButton("Amarelo");
        blueButton = new JButton("Azul");
        redButton = new JButton("Vermelho");
        add(yellowButton);
        add(blueButton);
        add(redButton);
        yellowButton.addActionListener(this);
        blueButton.addActionListener(this);
        redButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evt) {
        Object source = evt.getSource();
        Color color = getBackground();
        if (source == yellowButton) {
            color = Color.yellow;
        } else if (source == blueButton) {
            color = Color.blue;
        } else if (source == redButton) {
            color = Color.red;
        }
        setBackground(color);
        repaint();
    }
    private JButton yellowButton;
    private JButton blueButton;
    private JButton redButton;
}
