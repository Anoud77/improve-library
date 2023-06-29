/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectoop2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hadeel
 */
public class GUIBook extends JFrame {
     Color LIGHT_BROWN = new Color(160,82,45);
      Color CREAMY = new Color( 245,245,220);
    
     private final int WINDOW_WIDTH = 700; 
     private final int WINDOW_HEIGHT = 500;
     JLabel BookName=new JLabel("Book name : ");
     JLabel year=new JLabel("Year of book : ");
     JLabel story=new JLabel("Book Genre : ");
     JTextField BookName1=new JTextField(15);
     JTextField story1=new JTextField(15);
     JTextField year1=new JTextField(15);
     JButton next=new JButton(">>");
     private String str;
     JLabel intro=new JLabel("FILL IN BOOK INFORMATION.");
     JPanel panel3;
     JTextField ER;
    
    public GUIBook()
    {
      setLayout(new GridLayout(1,2));
      setTitle("Library");
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setLocationRelativeTo(null);

      
     JLabel background=new JLabel(new ImageIcon("BookInfo.JPG"));

    
     
      
     intro.setFont(new Font("Bradley Hand", Font.PLAIN, 22));
     BookName.setFont(new Font("Apple Chancery", Font.ITALIC, 20));
     year.setFont(new Font("Apple Chancery", Font.ITALIC, 20));
     story.setFont(new Font("Apple Chancery", Font.ITALIC, 20));
     next.setFont(new Font("Apple Chancery", Font.ITALIC, 13));
    
     
  
     story1.setPreferredSize( new Dimension( 50, 20 ) );
     next.setPreferredSize(new Dimension(50, 20));
     
     
     
      JPanel panel0=new JPanel();
      panel0.add(intro);
      
      JPanel panel1=new JPanel();
      panel1.add(BookName);
      panel1.add(BookName1);
      
      JPanel panel2=new JPanel();
      panel2.add(year);
      panel2.add(year1);
      
      panel3=new JPanel();
      panel3.add(story);
      panel3.add(story1);
     
      
      JPanel panel4=new JPanel();
     
      panel4.add(next);
      
      JPanel panel5=new JPanel(new GridLayout(5,1));
      
       intro.setForeground(LIGHT_BROWN);
       panel0.setBackground(CREAMY);
       
      // BookName1.setBackground(CREAMY);
       BookName1.setForeground(LIGHT_BROWN);
       BookName.setForeground(LIGHT_BROWN);
       panel1.setBackground(CREAMY);
       
      // year1.setBackground(CREAMY);
       year1.setForeground(LIGHT_BROWN);
       year.setForeground(LIGHT_BROWN);
       panel2.setBackground(CREAMY);
       
       //story1.setBackground(CREAMY);
       story1.setForeground(LIGHT_BROWN);
       story.setForeground(LIGHT_BROWN);
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
     next.addActionListener(new Bookinfo());
       setVisible(true);  
    }
    private class Bookinfo implements ActionListener
    {
         public void actionPerformed(ActionEvent e)  
        {
            try {

                     FileWriter fw=new FileWriter("book.txt",true);
                     PrintWriter pw = new PrintWriter(fw);
          
                  
             
                     
                    pw.printf("%-10s ",BookName1.getText());
                    pw.printf("%10s  ",year1.getText());

                    pw.printf("%20s ",story1.getText());
             
                  
               ER=new JTextField(15);
               ER.setForeground(LIGHT_BROWN);
               ER.setText("order is submitted");
               ER.setEditable(false);
              ER.setVisible(true);
               
              
                pw.close();
          } catch (IOException ex) {
              Logger.getLogger(GUIAuthor.class.getName()).log(Level.SEVERE, null, ex);
          }
             GUIAuthor ex = new GUIAuthor();
            
            ex.setVisible(true); 
        }
    }
    
     // public static void main(String[] args) {

     //   new GUIBook();
    //}

    
}

