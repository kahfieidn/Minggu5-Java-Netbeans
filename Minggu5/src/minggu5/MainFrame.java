/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5;

import java.awt.event.ActionEvent;

/**
 *
 * @author Cloud
 */
public class MainFrame extends javax.swing.JFrame{
    
    Panel panel;
    javax.swing.Timer timer;
    
    public MainFrame() {
        inisialisasi();
    }
    
    final void inisialisasi() {
        setTitle("Animasi 2D");
        setSize(1000, 500);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        panel = new Panel();
        getContentPane().add(panel);
        timer = new javax.swing.Timer(10, new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        pack();
        setVisible(true);
        timer.start();
    }
    
}
