/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negyzet_il2hzo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author jani
 */
public class Negyzet_IL2HZO {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        JFrame frame =  new JFrame("Negyzetelés");
        JButton MButton0 = new JButton("MButton0");
        MButton0.setBackground(Color.BLUE);
        JButton MButtonP = new JButton("MButtonP");
        MButtonP.setBackground(Color.YELLOW);
        JButton GoGomb = new JButton("GoGomb");
        GoGomb.setBackground(Color.MAGENTA);
        
        JOptionPane pane = new JOptionPane();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel("5");
        JLabel keszito = new JLabel("Csete Ádám\ncseteadam91@gmail.com");
        JTabbedPane tabpane = new JTabbedPane();
        tabpane.add("Készítő", keszito);        
        
        JProgressBar bar = new JProgressBar();
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime); 
        
        
        frame.setLayout(new GridLayout(3, 3));
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(MButton0);
        frame.add(MButtonP);
        frame.add(GoGomb);
        frame.add(tabpane);
        frame.add(bar);
        frame.pack();
        
        
        frame.setLocation(width/4, height/4);
        frame.setSize(new Dimension(width/2,height/4));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        MButton0.addActionListener(new ActionListener() {
                                             @Override
                                             public void actionPerformed(ActionEvent e) {
                                                 int valt = Integer.parseInt(label3.getText());
                                                 if(valt>3) valt--;
                                                 label3.setText(Integer.toString(valt));
                                             }
                                         });
        
        
        MButtonP.addActionListener(new ActionListener() {
                                             @Override
                                             public void actionPerformed(ActionEvent e) {
                                                 int valt = Integer.parseInt(label3.getText());
                                                 if(valt<7) valt++;
                                                 label3.setText(Integer.toString(valt));
                                             }
                                         });
        
        GoGomb.addActionListener(new ActionListener() {
                                             @Override
                                             public void actionPerformed(ActionEvent e) {
                                                 int eredmeny = negyzet(Integer.parseInt(label3.getText())); 
                                                 bar.setValue(1);
                                                 bar.setStringPainted(true);
                                                 JOptionPane.showConfirmDialog(frame, label3.getText() + " négyzete: " + Integer.toString(eredmeny), "Négyzet", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE);
                                             }
                                         });
        
    }
    
    public static int negyzet(int Bemenet){
    
    return Bemenet*Bemenet;
    }
}
