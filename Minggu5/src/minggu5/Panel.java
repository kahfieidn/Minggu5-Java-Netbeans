/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;

/**
 *
 * @author Cloud
 */
public class Panel extends javax.swing.JPanel {
    
    minggu5.Character.Bola bola;
    
    public Panel() {
        inisialisasi();
    }
    
    final void inisialisasi(){
       setPreferredSize(new java.awt.Dimension(1000, 500));
       bola = new minggu5.Character.Bola();
    }
    
    @Override
    public void paint(java.awt.Graphics g){
        if (bola.getX() + bola.getBesar() >= this.getWidth() )
            bola.setXArah(-1);
        bola.tampil(g);
    }
    
}
