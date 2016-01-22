/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.sovelluslogiikka;

/**
 *
 * @author Teemu
 */
public class OmaLaskuri implements Laskuri{
    
    private int laskuri=0;
    
    public OmaLaskuri() {
        
    }
    
    public int annaArvo() {
        
        return this.laskuri;
    }

    public void kasvata() {
        this.laskuri ++;
    }
}
