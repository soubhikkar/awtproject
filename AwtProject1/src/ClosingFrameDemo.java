import java.awt.*;
import java.awt.Frame;
import java.awt.Button;
import java.awt.event.*;  

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//import javax.swing.text.AttributeSet.ColorAttribute;




public class ClosingFrameDemo extends WindowAdapter{
    public Frame frame;

    public ClosingFrameDemo(){
        frame = new Frame("Application");
        frame.addWindowListener(this);
        
        Label firstName = new Label("Enter your name"); // Lable 1 Name
        firstName.setBounds(30,60,130,20);
        //firstName.setFont(new Font("Verdana", Font.PLAIN, 15)); 
        TextField firstNametext = new TextField(); // Lable 1 Text field 
        firstNametext.setBounds(163,60,200,20);

        Label emailAddres = new Label("Enter your Email"); // Lable 2 Email addrese
        emailAddres.setBounds(30,80,130,20);
       // emailAddres.setFont(new Font("Verdana", Font.PLAIN, 15));
        TextField emailaddresText = new TextField(); // Lable 2 Email addres text field 
        emailaddresText.setBounds(163,80,200,20); 
        Label selct_lang = new Label("What Programing language you know? "); // Lable 3 Select PROGRAMING LANGUAGE
        selct_lang.setBounds(30,120,260,20);
        //selct_lang.setFont(new Font("Arial",Font.PLAIN,15));
/*<------------Check Box------------------------------------------------->*/
        Checkbox checkbox_Male = new Checkbox("C"); //CheckBox C
        //checkbox_Male.setFont(new Font("Arial",Font.PLAIN,15));
        checkbox_Male.setBounds(30,140,60,30);

        Checkbox checkbox_Female = new Checkbox("C++"); // checkBox C++
        //checkbox_Female.setFont(new Font("Arial", Font.PLAIN, 15));
        checkbox_Female.setBounds(100,140,60,30);

        Checkbox checkbox_java = new Checkbox("Java"); // checkBox Java
        //checkbox_java.setFont(new Font("Arial", Font.PLAIN, 15));
        checkbox_java.setBounds(200,140,60,30);

        Checkbox checkbox_others = new Checkbox("Others"); // checkBox Java
        //checkbox_others.setFont(new Font("Arial", Font.PLAIN, 15));
        checkbox_others.setBounds(300,140,60,30);
//---------------------------------------------------------------->
        Label exper_comment = new Label("Previous expirence"); //Previous Experence Label 
        exper_comment.setBounds(30, 180, 140, 30);
       // exper_comment.setFont(new Font("Arial", Font.PLAIN, 15));

        TextArea area = new TextArea(); //Text area........
        area.setBounds(30,230,300,300);

        Label depetment = new Label("What is your depertment");
        //depetment.setFont(new Font("Arial", Font.PLAIN, 15));
        depetment.setBounds(30, 600, 120, 20);
        Choice dep_Choice = new Choice();
        //dep_Choice.setFont(new Font("Arial", Font.PLAIN, 15));
        dep_Choice.setBounds(30,620,60,20);
        dep_Choice.add("CSE");
        dep_Choice.add("ECE");
        dep_Choice.add("EE");
        dep_Choice.add("ME");

        List list = new List(4,true);
        list.setBounds(30, 660, 80, 50);
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        Checkbox male = new Checkbox("Male",true);
        male.setBounds(30,640,60,20);

        //menu bar..........
        {  MenuBar mb=new MenuBar();  

         Menu menu=new Menu("File");  
         Menu edit=new Menu("Edit");
         Menu view=new Menu("View");
         Menu submenu=new Menu("Sub Menu");
         Menu submenu1=new Menu("Zoom");  
         MenuItem i1=new MenuItem("Save");  
         MenuItem i2=new MenuItem("Save As");  
         MenuItem i3=new MenuItem("Print");  
         MenuItem i4=new MenuItem("Item 4");  
         MenuItem i5=new MenuItem("Item 5");  
         MenuItem zoomIn= new MenuItem("Zoom In");
         MenuItem zoomOUt= new MenuItem("Zoom Out");
         menu.add(i1);  
         menu.add(i2);  
         menu.add(i3);  
         submenu.add(i4);  
         submenu.add(i5);  
         submenu1.add(zoomOUt);
         submenu1.add(zoomIn);
         menu.add(submenu);
         view.add(submenu1);
           
         mb.add(menu);
         mb.add(edit); 
         mb.add(view); 
         frame.setMenuBar(mb); 
      }

      PopupMenu popupmenu =new PopupMenu();
      MenuItem cut = new MenuItem("Cut");
      cut.setActionCommand("Cut");
      MenuItem copy = new MenuItem("Copy");
      copy.setActionCommand("Copy");
      MenuItem paste = new MenuItem("Paste");
      paste.setActionCommand("paste");
      popupmenu.add(cut);
      popupmenu.add(copy);
      popupmenu.add(paste);
      frame.addMouseListener(new MouseAdapter() {  
        public void mouseClicked(MouseEvent e) {              
            popupmenu.show(frame , e.getX(), e.getY());  
        }                 
     });  
      
        
    
     Panel panel = new Panel();
     panel.setBounds(30, 750, 320, 80);
     panel.setBackground(Color.black);
            Button sumbit = new Button ("RESET"); // SUBMIT  BUTTON 
            sumbit.setFont(new Font("Arial",Font.PLAIN,20));
            sumbit.setBackground(Color.red); //Button color 
            sumbit.setForeground(Color.white); //BUtton Text color
            sumbit.setBounds(34, 780,80, 40);

            Button reset = new Button ("RESET"); // SUBMIT  BUTTON 
            reset.setFont(new Font("Arial",Font.PLAIN,20));
            reset.setBackground(Color.red); //Button color 
            reset.setForeground(Color.white); //BUtton Text color
            reset.setBounds(40, 780,80, 40);
 
     panel.add(sumbit);
     panel.add(reset);
    
     Image icone = Toolkit.getDefaultToolkit().getImage("E:\\java\\AWT PROJECT\\AwtProject1\\apple-photos-493155.png");  
     frame.setIconImage(icone);

     reset.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            Toolkit.getDefaultToolkit().beep();  
        }  
    });       
    
        
        
        /*<-----------add component-----------> */
      { //frame.add(sumbit);
        frame.add(firstName);
        frame.add(emailAddres);
        frame.add(firstNametext);
        frame.add(emailaddresText);
        frame.add(selct_lang);
        frame.add(checkbox_Male);
        frame.add(checkbox_Female);
        frame.add(checkbox_java);
        frame.add(checkbox_others);
        frame.add(exper_comment);
        frame.add(area);
        frame.add(dep_Choice);
        frame.add(depetment);
        frame.add(male);
        frame.add(list);
        frame.add(popupmenu);
        frame.add(panel);
    }
      
        


        frame.setSize(500,350);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void windowClosing (WindowEvent e){
        frame.dispose();
        System.exit(0);
    }
    public static void main(String args[]){
        new ClosingFrameDemo();
    }

}

