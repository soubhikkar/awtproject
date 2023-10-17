package Lab;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab extends JFrame implements ActionListener{

    private static Lab Lab1;

    JButton jb1;
    JTextField jt1, jt2;
    JLabel lbl;
    Lab(){
        jt1=new JTextField();
        jt1.setBounds(100, 50, 150, 40);
        add(jt1);
    
        jt2=new JTextField();
        jt2.setBounds(100,110,150,40);
        add(jt2);
        
        lbl=new JLabel("Result");
        lbl.setBounds(20, 300, 150, 40);
        add(lbl);
        
        jb1=new JButton("Division");
        jb1.setBounds(90,220,150,30);
        add(jb1);
        
        jb1.addActionListener(this);
        
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        
        int a=0,b=0;
       try{
           a=Integer.parseInt(jt1.getText());
           b=Integer.parseInt(jt2.getText());
        }
        catch(NumberFormatException ne){
            JOptionPane.showMessageDialog(this,"Enter integers");
        }

        double c=0;

        if(e.getSource().equals(jb1)){
            
        
        try{
            c=a/b;
        }
        catch(ArithmeticException ae){
            JOptionPane.showMessageDialog(this, "divider must not be 0.");
        }
        
            lbl.setText(String.valueOf(c));
        }
    }
    public static void main(String[] args) {
       Lab Lab1=new Lab();
    }
    
}