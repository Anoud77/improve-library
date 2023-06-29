/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectoop2;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author hadeel
 */
public class GUIAuthor extends JFrame{
          Color LIGHT_BROWN = new Color(160,82,45);
      Color CREAMY = new Color( 245,245,220);
      
     private final int WINDOW_WIDTH = 700; 
    private final int WINDOW_HEIGHT = 500;
     JLabel firstName=new JLabel("Enter first name : ");
     JLabel lastName=new JLabel("Enter last name : ");
     JLabel ID=new JLabel("Enter ID :          ");
     JTextField firstName1=new JTextField(15);
     JTextField ID1=new JTextField(15);
     JTextField lastName1=new JTextField(15);
     JButton next=new JButton(">>");
     private String str;
    
   
   JLabel intro=new JLabel("FILL IN YOUR INFORMATION");
    
    public GUIAuthor()
    {
      setLayout(new GridLayout(1,2));
      setTitle("Library");
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setLocationRelativeTo(null);
   
      
     JLabel background=new JLabel(new ImageIcon("hall.JPG"));
 
    
     
      
     intro.setFont(new Font("Bradley Hand", Font.PLAIN, 20));
     firstName.setFont(new Font("Apple Chancery", Font.ITALIC, 17));
     lastName.setFont(new Font("Apple Chancery", Font.ITALIC, 17));
     ID.setFont(new Font("Apple Chancery", Font.ITALIC, 17));
     next.setFont(new Font("Apple Chancery", Font.ITALIC, 13));
   
     next.setPreferredSize(new Dimension(50, 20)); 
    
     
    firstName.setPreferredSize(new Dimension(250, 50));
    lastName.setPreferredSize(new Dimension(250, 50));
    ID.setPreferredSize(new Dimension(250, 50));
    firstName1.setPreferredSize(new Dimension(250, 20));
    lastName1.setPreferredSize(new Dimension(250, 20));
    ID1.setPreferredSize(new Dimension(250, 20));
     
      JPanel panel0=new JPanel();
      panel0.add(intro);
      
      JPanel panel1=new JPanel();
      panel1.add(firstName);
      panel1.add(firstName1);
      
      JPanel panel2=new JPanel();
      panel2.add(lastName);
      panel2.add(lastName1);
      
      JPanel panel3=new JPanel();
      panel3.add(ID);
      panel3.add(ID1);
      
      JPanel panel4=new JPanel();
 
      panel4.add(next);
      
      JPanel panel5=new JPanel(new GridLayout(5,1));
      
       intro.setForeground(LIGHT_BROWN);
       panel0.setBackground(CREAMY);
       
      
       firstName1.setForeground(LIGHT_BROWN);
       firstName.setForeground(LIGHT_BROWN);
       panel1.setBackground(CREAMY);
       
 
       lastName1.setForeground(LIGHT_BROWN);
       lastName.setForeground(LIGHT_BROWN);
       panel2.setBackground(CREAMY);
       
      
       ID1.setForeground(LIGHT_BROWN);
       ID.setForeground(LIGHT_BROWN);
       panel3.setBackground(CREAMY);
       
       next.setForeground(LIGHT_BROWN);
       next.setBackground(CREAMY);
       panel4.setBackground(CREAMY);
       
       
       
       panel5.add(panel0);
       panel5.add(panel1);
       panel5.add(panel2);
       panel5.add(panel3);
       panel5.add(panel4);
       add(panel5);
       add(background);
       next.addActionListener(new authinfo());
       setVisible(true);
       
        
    }
    private class authinfo implements ActionListener
    {
      @Override
      public void actionPerformed(ActionEvent e)  
      {
          
                
          try {
                 FileWriter fw = new FileWriter("book.txt", true);
                 PrintWriter pw = new PrintWriter(fw);
          
             
                   
                   pw.printf("%15s ",firstName1.getText());
                    pw.printf("%5s \n",lastName1.getText());
                
           
          pw.println("----------------------------------------------------------------");
              
                     pw.close();
          } catch (IOException ex) {
              Logger.getLogger(GUIAuthor.class.getName()).log(Level.SEVERE, null, ex);
          }
               
          GUIOption ex = new GUIOption();
          ex.setVisible(true);
      }
    }

    
}