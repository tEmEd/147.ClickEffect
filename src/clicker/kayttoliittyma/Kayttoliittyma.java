package clicker.kayttoliittyma;

import clicker.sovelluslogiikka.Laskuri;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;
import clicker.sovelluslogiikka.OmaLaskuri;
import java.awt.event.ActionListener;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;

    private Laskuri laskuri;

    private JButton nappi;
    private JLabel label;

    public Kayttoliittyma(Laskuri laskuri) {
        this.laskuri = laskuri;
    }

    public Kayttoliittyma() {
        this.laskuri = new OmaLaskuri();
    }

    @Override
    public void run() {
        frame = new JFrame("The Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        label = new JLabel();
        nappi = new JButton();
    
        frame.setLayout(new BorderLayout());
        
        label.setText("0");
        container.add(label, BorderLayout.CENTER);
    
        nappi.setText("Click!");
        
        nappi.addActionListener(new KlikkaustenKuuntelija(this.laskuri, this.label));
        
        container.add(nappi, java.awt.BorderLayout.PAGE_END);
    }

    public JFrame getFrame() {
        return frame;
    }
}
