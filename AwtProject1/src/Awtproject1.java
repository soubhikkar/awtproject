import java.awt.*;  
import java.awt.event.*;
import  java.lang.String;
public class Awtproject1 {  
    private static Dialog d;  
    Awtproject1() {  
   //helooo      
//        d = new Dialog();
        d.setLayout( new FlowLayout() );  
        Button b = new Button ("OK");  
        /*b.addActionListener ( new ActionListener()  
        {  
            public void actionPerformed( ActionEvent e )  
            {  
                Awtproject1.d.setVisible(false);  
            }  
        });
        */  
        d.add( new Label ("Click button to continue."));  
        d.add(b);   
        d.setSize(300,300);    
        d.setVisible(true);  
    }  
    public static void main(String args[])  
    {  
        new Awtproject1();  
    }  
}  
