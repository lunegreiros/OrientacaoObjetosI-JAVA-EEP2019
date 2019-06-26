/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula9;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Event;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author GC
 */
class CloseableFrame extends JFrame {

    public CloseableFrame() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image image = tk.getImage(CloseableFrame.class.getResource("imagens/duke.gif"));
        setIconImage(image);
        Dimension d = tk.getScreenSize();
        setSize(300, 200);
        int h = getHeight();
        int w = getWidth();
        setLocation((d.width - w) / 2, (d.height - h) / 2);

        setTitle("FrameQueFecha");

//        addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//        });
        // setDefaultCloseOperation(EXIT_ON_CLOSE):
    }

}

public class FrameQueFecha {

    public static void main(String[] args) {
        JFrame frame = new CloseableFrame();
        frame.setVisible(true);
    }
}
