/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.kayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import clicker.sovelluslogiikka.*;
import javax.swing.JLabel;

/**
 *
 * @author Teemu
 */
public class KlikkaustenKuuntelija implements ActionListener {

    private Laskuri laskuri;
    private JLabel label;

    public KlikkaustenKuuntelija(Laskuri laskuri, JLabel label) {
        this.laskuri = laskuri;
        this.label = label;
    }

    @Override    
    public void actionPerformed(ActionEvent e) {
        this.laskuri.kasvata();
        this.label.setText(this.laskuri.annaArvo()+"");
    }
}

