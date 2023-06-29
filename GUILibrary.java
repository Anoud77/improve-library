/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectoop2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.event.AncestorListener;

/**
 *
 * @author hadeel
 */
public class GUILibrary extends JFrame implements ActionListener {
    
             Color LIGHT_BROWN = new Color(160,82,45);
        Color CREAMY = new Color( 245,245,220);
        JButton button1 =new JButton("Aouthor");
        JButton button2 =new JButton("Reader");
        JButton button3 =new JButton("Exit");
        JButton button4 =new JButton("View all books");
        JButton b;
        JLabel label =new JLabel("Are you an Aouthor or a Reader?"),us,helper;
        JTextField TEXT= new JTextField(15);
        JMenuBar menuBar;    
        JMenu file,edit,help,aboutUs;    
        JMenuItem cut,copy,paste,selectAll,info;    
      
        

        

    public GUILibrary(){
  helper=new JLabel("Digital Library System");
   us =new JLabel("Developed by:Hadeel-Wasan-Anoud");
   cut=new JMenuItem("cut");    
   copy=new JMenuItem("copy");    
   paste=new JMenuItem("paste");    
   selectAll=new JMenuItem("selectAll");    
   menuBar=new JMenuBar();    
   file=new JMenu("File");    
   edit=new JMenu("Edit");    
   help=new JMenu("Help");   
   aboutUs=new JMenu("About Us");
   
   



   edit.add(cut);
   edit.add(copy);
   edit.add(paste);
   edit.add(selectAll);  
   aboutUs.add(us);
   help.add(helper);

   cut.setForeground(LIGHT_BROWN);
   copy.setForeground(LIGHT_BROWN);
   paste.setForeground(LIGHT_BROWN);
   selectAll.setForeground(LIGHT_BROWN);
   
   us.setForeground(LIGHT_BROWN);
   helper.setForeground(LIGHT_BROWN);

   menuBar.add(file);
   menuBar.add(edit);
   menuBar.add(help);  
   menuBar.add(aboutUs);


    add(menuBar);    
    setJMenuBar(menuBar);  
    
   // menuBar.setBackground(LIGHT_BROWN);
    menuBar.setForeground(LIGHT_BROWN);

    setLayout(new GridLayout(1,2));
    
    setTitle("Library");
    setSize(700,500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    
  
    JLabel background=new JLabel(new ImageIcon("BackG.jpg"));
    JLabel welcome =new JLabel("Welcome-to-our-Library!!");

    

    
    welcome.setFont(new Font("Bradley Hand", Font.PLAIN, 22)); 
    label.setFont(new Font("Apple Chancery", Font.ITALIC, 20));

   button1.setFont(new Font("Apple Chancery", Font.ITALIC, 16));
   button2.setFont(new Font("Apple Chancery", Font.ITALIC, 16));
   button3.setFont(new Font("Apple Chancery", Font.ITALIC, 16));
   button4.setFont(new Font("Apple Chancery", Font.ITALIC, 16));
   
      
    label.setPreferredSize(new Dimension(300, 40));
    button1.setPreferredSize(new Dimension(90, 20));
    button2.setPreferredSize(new Dimension(90, 20));
    button4.setPreferredSize(new Dimension(150, 50));
    button3.setPreferredSize(new Dimension(90, 20));
       
  
    JPanel panel0=new JPanel();
    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    JPanel panel3=new JPanel();
    JPanel panel4=new JPanel(new GridLayout(5,1));
    JPanel panel5=new JPanel();

    panel0.add(welcome,BorderLayout.NORTH);
    panel1.add(welcome);
    panel2.add(label);
    panel5.add(button4);
    panel3.add(button1);
    panel3.add(button2);
    
    panel3.add(button3);
    welcome.setForeground(LIGHT_BROWN);
    label.setForeground(LIGHT_BROWN);
    button1.setForeground(LIGHT_BROWN);
    button2.setForeground(LIGHT_BROWN);
    button3.setForeground(LIGHT_BROWN);
    button4.setForeground(LIGHT_BROWN);
    //button4.setBackground(CREAMY);
    
    panel0.setBackground(CREAMY);
    panel1.setBackground(CREAMY);
    panel2.setBackground(CREAMY);
    panel3.setBackground(CREAMY);
    panel5.setBackground(CREAMY);

    panel4.add(panel0);
    panel4.add(panel1);
    panel4.add(panel2);
    panel4.add(panel5);
    panel4.add(panel3);
        
         
    add(panel4);
    add(background);
    button1.addActionListener(new author());
    button2.addActionListener(new Reader());
    button3.addActionListener(new exit());
    button4.addActionListener(this);
    
    setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<String> information = new ArrayList<String>();
        if(e.getSource()==button4){
       
            try{
              File file =new File("book.txt");
                  
                  Scanner scan=new Scanner(file);
                  
                 
                  information.add(" "+scan.nextLine()+"\n");
                  
                 
                  while(scan.hasNext()){
                     information.add(scan.nextLine()+"\n");    
                  }
                          
                            JOptionPane.showMessageDialog(null,"BOOK NAME   \t\t   YEAR   \t\t    BOOK GENRE    \t\t\t      AUTHOR NAME   \t\t\n----------------------------"
            + "------------------------------------------------------\n"+information+"\n");
                            
                        
                          
            }
            catch(FileNotFoundException ex){
                
            }
  
    }
    
}     
   // }



    
     private class author implements ActionListener
    {
         public void actionPerformed(ActionEvent e)  
        {
             GUIBook ex = new GUIBook();
           
            ex.setVisible(true);
        }
     }
      private class Reader implements ActionListener
    {
         public void actionPerformed(ActionEvent e)  
        {
            GUIReader ex = new GUIReader();
            ex.setVisible(true);
        }
     }

         
  private class exit  implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==button3){
               
                 JFrame x= new JFrame();
                 x.setTitle("Library");
              x.setSize(700,500);
              x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              x.setLocationRelativeTo(null);
             
              JLabel bye=new JLabel(new ImageIcon("Bye.gif"));
              JPanel Bye=new JPanel(new FlowLayout());
              
          JButton  return_=new JButton("Return");
          return_.setPreferredSize(new Dimension(90, 20));
          return_.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                         new GUILibrary();
                     }
              
          });
          
              b=new JButton("bye");
                b.setPreferredSize(new Dimension(90, 20));
                b.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                           System.exit(0);
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

   
    
    public static void main(String[] args) {
        new GUILibrary();
    }
    

}
    