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
import java.util.*;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hadeel
 */
public class GUIReader extends JFrame implements  ActionListener {
      String[] arr={};
  
      Color LIGHT_BROWN = new Color(160,82,45);
      Color CREAMY = new Color( 245,245,220);
    ArrayList<String> information = new ArrayList<String>();
      
         JButton finish;
      
     JLabel label =new JLabel("FILL IN YOUR INFORMATION.");
     JLabel label1 =new JLabel("Enter name : ");
     JLabel label2 =new JLabel("Enter PhoneNumber : ");
     JLabel label3 =new JLabel("Enter name of book : ");
     JTextField text1= new JTextField(15);
     JTextField text2= new JTextField(15);
     JTextField text3= new JTextField(15);
      JTextArea output= new JTextArea();
     JLabel check =new JLabel();
     JButton next,end;
         

     
    
     public GUIReader(){
  
     
    setLayout(new GridLayout(1,2));
    setTitle("Library");
    setSize(700,500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    

    JLabel background=new JLabel(new ImageIcon("BookBack.jpg"));
    background.setSize(new Dimension(350,400));
    label.setFont(new Font("Bradley Hand", Font.PLAIN, 20)); 
    label1.setFont(new Font("Apple Chancery", Font.ITALIC, 17));
    label2.setFont(new Font("Apple Chancery", Font.ITALIC, 17));
    
    label3.setFont(new Font("Apple Chancery",     Font.ITALIC, 17));
    check.setFont(new Font("SERIF ", Font.PLAIN, 10)); 
       
   
    label1.setPreferredSize(new Dimension(250, 50));
    label2.setPreferredSize(new Dimension(250, 50));
    label3.setPreferredSize(new Dimension(250, 50));
    text1.setPreferredSize(new Dimension(250, 20));
    text2.setPreferredSize(new Dimension(250, 20));
    text3.setPreferredSize(new Dimension(250, 20));
    check.setPreferredSize(new Dimension(250, 50));
        
        
      // text2.addKeyListener(this);
       
    next =new JButton(">>");
    end =new JButton("Exit");
    next.addActionListener(this);
     end.addActionListener(this);
    end.setFont(new Font("Apple Chancery", Font.ITALIC, 17));
    
    next.setPreferredSize(new Dimension(50,20));
    end.setPreferredSize(new Dimension(50,20));

    
    
    JPanel panel=new JPanel();
    JPanel panel0=new JPanel();
    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    JPanel panel3=new JPanel();
    JPanel panel4=new JPanel();
    JPanel panel5=new JPanel();
    JPanel panel6=new JPanel();
    JPanel panel7=new JPanel(new GridLayout(8,1));
    
    
    
    panel.add(label);
    panel0.add(label1);
    panel1.add(text1);
    panel2.add(label2);
    panel3.add(text2);
    panel3.add(check);
    panel4.add(label3);
    panel5.add(text3);
    panel6.add(next);
     panel6.add(end);
    
    label.setForeground(LIGHT_BROWN);
    label1.setForeground(LIGHT_BROWN);
    label2.setForeground(LIGHT_BROWN);
    label3.setForeground(LIGHT_BROWN);
    text1.setForeground(LIGHT_BROWN);
    text2.setForeground(LIGHT_BROWN);
    text3.setForeground(LIGHT_BROWN);
    next.setForeground(LIGHT_BROWN);
    end.setForeground(LIGHT_BROWN);
    

    
    panel.setBackground(CREAMY);
    panel0.setBackground(CREAMY);
    panel1.setBackground(CREAMY);
    panel2.setBackground(CREAMY);
    panel3.setBackground(CREAMY);
    panel4.setBackground(CREAMY);
    panel5.setBackground(CREAMY);
    panel6.setBackground(CREAMY);
    next.setBackground(CREAMY);
    end.setBackground(CREAMY);
  

    
      panel7.add(panel);
      panel7.add(panel0);
      panel7.add(panel1);
      panel7.add(panel2);
      panel7.add(panel3);
      panel7.add(panel4);
      panel7.add(panel5);
      panel7.add(panel6);
      
       add(panel7);
       add(background); 
      
       setResizable(false);
       setVisible(true);
    
       
   
     

    

    }


    @Override
    public void actionPerformed(ActionEvent e) {
           ArrayList<String> information = new ArrayList<String>();
        if(e.getSource()==next){
       
            try{
                
                  String line;

                String book=text3.getText();
                String name=text1.getText();
                
                        ArrayList<String> info = new ArrayList<String>();
                   File file =new File("book.txt");
                  
                  Scanner scan=new Scanner(file);
                    
                    
               
                    
                   
                        
              while(scan.hasNext()){ 
                        line=scan.nextLine();
                        if (line.startsWith(book)){ 
                             info.add(line+"\n");   
                       
                        }
                   
                    }  
              
               
                       JOptionPane.showMessageDialog(null,"BOOK NAME   \t\t   YEAR   \t\t BOOK GENRE    \t\t\t   AUTHOR NAME   \t\t\n----------------------------"
            + "------------------------------------------------------\n"+info+"\n");
                   
         JOptionPane.showMessageDialog(null,"\n\n"+" Name : "+name+"\nThe book you ask for :"+book+"\n"+"it MUST returend within FIVE DAYS\n"+"information:\n"+info); // print the line that start with the search word
                  
               }
               
               
         
              catch (FileNotFoundException ex){
              JOptionPane.showMessageDialog(null,ex.getMessage());
         }
         
    
                  

    }
      
      
           else if (e.getSource()==end){
               
                 JFrame x= new JFrame();
                 x.setTitle("Library");
              x.setSize(700,500);
              x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              x.setLocationRelativeTo(null);
             
              JLabel bye1=new JLabel(new ImageIcon("Bye.gif"));
              JPanel Bye1=new JPanel(new FlowLayout());
              
           
             JButton finish=new JButton("bye");
                finish.setPreferredSize(new Dimension(90, 20));
                finish.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                           System.exit(0);
                     }
                 });
                Bye1.setBackground(CREAMY);
                Bye1.add(bye1);
                Bye1.add(finish,FlowLayout.CENTER);
                finish.setBackground(CREAMY);
                finish.setForeground(LIGHT_BROWN);
                finish.setPreferredSize(new Dimension(90, 20));
                 x.add(Bye1);
               x.setVisible(true);
        }
          
            }
        


     
     // public static void main(String[] args) {
     
  //  new GUIReader();
//}
}



            
      
    

    

 

