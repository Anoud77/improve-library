/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectoop2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
/**
 *
 * @author hadeel
 */
public class GUIOption extends JFrame implements ActionListener {
    Color LIGHT_BROWN = new Color(160,82,45);
        Color CREAMY = new Color( 245,245,220);
        private final int WINDOW_WIDTH = 700; 
        private final int WINDOW_HEIGHT = 500;
        JRadioButton Yes=new JRadioButton("Yes");  
        JRadioButton NO=new JRadioButton("No");  
        JLabel Ask=new JLabel("Do you want to add another book?");
        JButton next=new JButton(">>");
        ButtonGroup group = new ButtonGroup();
        JButton  b;
    
 public GUIOption()
 {
       setLayout(new GridLayout(1,2));
       setTitle("Library");
       setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
       setResizable(false);
       setLocationRelativeTo(null);
       JLabel background=new JLabel(new ImageIcon("bok.JPG"));
       
       Ask.setPreferredSize(new Dimension(300, 50));
       
         background.setForeground(Color.BLACK);
        Ask.setFont(new Font("Apple Chancery", Font.ITALIC, 17));
        next.setFont(new Font("Apple Chancery", Font.ITALIC, 13));
        Yes.setFont(new Font("Apple Chancery", Font.ITALIC, 17));
        NO.setFont(new Font("Apple Chancery", Font.ITALIC, 17));
    
        
        group.add(Yes);
        group.add(NO);
        
        next.setPreferredSize(new Dimension(50, 20)); 
        next.addActionListener(this);
        JPanel panel0=new JPanel();
        panel0.add(Ask);

        JPanel panel1=new JPanel();
        panel1.add(Yes);


        JPanel panel2=new JPanel();
        panel2.add(NO);

        JPanel panel3=new JPanel();
        panel3.add(next);

        JPanel panel4=new JPanel(new GridLayout(4,1));

        Ask.setForeground(LIGHT_BROWN);
        panel0.setBackground(CREAMY);

     
       Yes.setForeground(LIGHT_BROWN);
       Yes.setBackground(CREAMY);
       panel1.setBackground(CREAMY);
       
       NO.setForeground(LIGHT_BROWN);
       NO.setBackground(CREAMY);
       panel2.setBackground(CREAMY);
       
       next.setForeground(LIGHT_BROWN);
       next.setBackground(CREAMY);
       panel3.setBackground(CREAMY);
       
       panel4.add(panel0);
       panel4.add(panel1);
       panel4.add(panel2);
       panel4.add(panel3);
       add(panel4);
       add(background);
       
       setVisible(true);
 }   
  
 

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if (e.getSource()==next){
            
            if (Yes.isSelected()){
                
                
                new GUIBook();
                
       
                
            }
            else if (NO.isSelected()){
                
               JFrame x= new JFrame();
                 x.setTitle("Library");
              x.setSize(700,500);
              x.setDefaultCloseOperation(EXIT_ON_CLOSE);
              x.setLocationRelativeTo(null);
             
              JLabel bye=new JLabel(new ImageIcon("Bye.gif"));
              JPanel Bye=new JPanel(new FlowLayout());
              
            b=new JButton("bye");
                
          
              //  JButton b=new JButton("bye");
                b.setPreferredSize(new Dimension(90, 20));
                b.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                           System.exit(0);
                     }
                 });
     
                 JButton  return_=new JButton("Return");
          return_.setPreferredSize(new Dimension(90, 20));
          return_.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                         new GUILibrary();
                     }
              
          });
          
                 Bye.setBackground(CREAMY);
                Bye.add(bye);
                Bye.add(b,FlowLayout.CENTER);
                Bye.add(return_,FlowLayout.CENTER);
                return_.setBackground(CREAMY);
                return_.setForeground(LIGHT_BROWN);
                
                b.setBackground(CREAMY);
                b.setForeground(LIGHT_BROWN);
                b.setPreferredSize(new Dimension(90, 20));
                 x.add(Bye);
               x.setVisible(true);
                
                
             
               
                
                
            }
        }
        
    }
    
    
   private class Leave implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==b){
                
                System.exit(0);
            }
        }
 
    

   }
   public static void main(String[] args) {

     new GUIOption();  
    }
   
}
