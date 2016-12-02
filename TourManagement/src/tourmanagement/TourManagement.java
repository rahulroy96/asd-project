/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourmanagement;

import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author rahulroy
 */

import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;  

public class TourManagement extends JFrame implements ActionListener {
    JButton b;
    JPanel panelLogin, panelManager, panelTourist;
    JTextField tf;
    CardLayout c = new CardLayout();
    JLabel l;
    TourManagement(){
        setLayout(c);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panelLogin = new JPanel();
        panelManager = new JPanel();
        panelTourist = new JPanel();
        
        
        b = new JButton("Login");
        tf = new JTextField("Username");
        b.addActionListener(this);
        l = new JLabel();
        
        panelLogin.add(tf);
        panelLogin.add(b);
        panelLogin.add(l);
        
        panelTourist.setBackground(Color.blue);
        panelManager.setBackground(Color.red);
        
        add(panelLogin, "1");
        add(panelManager, "2");
        add(panelTourist, "3");
        //c.show(this, "1");
        //bOp = new JButton("Black");
    
        
        
        //setGUI();
    }
    
    public void actionPerformed(ActionEvent ae){
        l.setText(tf.getText());
        //if(ae.getSource()==b)
            if(tf.getText().equals("operator"))
                c.show(panelTourist.getParent(), "3");
            else if(tf.getText().equals("manager"))
                c.show(panelManager.getParent(), "2");
    }
  
    public static void main(String[] args) {
        TourManagement t = new TourManagement();
        //t.setVisible(true);
    }
    
}

