/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5.Character;

/**
 *
 * @author Cloud
 */
public class Bola {
    
    private int x, y, besar, xArah, step;
    private java.awt.Color warna;
    
    public Bola() {
        x = 10;
        y = 10;
        besar = 50;
        step = 1;
        xArah = 1;
        warna = java.awt.Color.RED;
    }
    
    public void setX(int x) {this.x = x;}
    public int getX() {return x;}
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {return y;}
    public void setBesar(int besar){this.besar = besar;}
    public int getBesar() {return besar;}
    public void setXArah(int xArah) {this.xArah = xArah;}
    public int getXArah() {return xArah;}
    public void setStep(int step) {this.step = step;}
    public int getStep() {return step;}
    public void setWarna(java.awt.Color warna){this.warna = warna;}
    public java.awt.Color getWarna() {return warna;}
    
    public void tampil(java.awt.Graphics g){
        x = x + (xArah * step);
        java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
        java.awt.geom.Ellipse2D bola = new java.awt.geom.Ellipse2D.Double(x, y, besar, besar);
        java.awt.GradientPaint gp = new java.awt.GradientPaint(x, y, warna, x+besar, y+besar, java.awt.Color.BLACK);
        g2.setPaint(gp);
        g2.fill(bola);
    }
}
