
//import java.awt.BorderLayout;
import java.awt.*;
//import javax.swing.BorderFactory;
import javax.swing.*;
import javax.swing.border.LineBorder;
//import java.io.FileNotFoundException;

public class Design {
    

    private void initComponents() {
        JFrame frame=new JFrame("CALCULATOR");
        ImageIcon img=new ImageIcon("G://java program/Calculator-512.png");
        frame.setIconImage(img.getImage());   //Icon of software
        ImageIcon imgback=new ImageIcon("G:/NetBeans_java/Project1/src/p3.jpg");
        Image img2 = imgback.getImage();
        Image newImg = img2.getScaledInstance(310, 460, Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        frame.setContentPane(new JLabel(newImc));
        frame.setSize(325, 500);
        
        //Style of Text Field and Button: Create "Font" class
        Font font=new Font("Tahoma", 1, 25);

        
        
        //Create text field
        JTextField text=new JTextField("");
        LineBorder lb=new LineBorder(Color.BLACK, 2, true);
        text.setBorder(lb);
        text.setBackground(new Color(247, 243, 247));
        text.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        text.setBounds(3,5,303,50);
        text.setFont(font);
        
        
        //Create button1 column wise
        JButton b1=new JButton("C");
        b1.setBounds(5,100,50,35);
        b1.setFont(font);
        b1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b1.setForeground(Color.BLACK);
        b1.setBackground(new Color(204, 255, 204));
        
        //Create button2 column wise
        JButton b2=new JButton("%");
        b2.setBounds(90,100,50,35);
        b2.setFont(font);
        b2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b2.setForeground(Color.BLACK);
        b2.setBackground(new Color(204, 255, 204));
        
         
        //Create button3 column wise
        //Button3 icon
        ImageIcon icon=new ImageIcon("G:/NetBeans_java/Project1/src/backspace.png");
        Image img1 = icon.getImage();
        Image newImg1 = img1.getScaledInstance(33, 30, Image.SCALE_SMOOTH);
        ImageIcon newImc1 = new ImageIcon(newImg1);
        
        JButton b3=new JButton(newImc1);
        b3.setBounds(175,100,50,35);
        b3.setFont(font);
        b3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b3.setForeground(Color.BLACK);
        b3.setBackground(new Color(204, 255, 204));
        
        //Create button4 column wise
        JButton b4=new JButton("/");
        b4.setBounds(255,100,50,35);
        b4.setFont(font);
        b4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b4.setForeground(Color.BLACK);
        b4.setBackground(new Color(204, 255, 204));
        
        //Create button5 column wise
        JButton b5=new JButton("7");
        b5.setBounds(5,175,50,35);
        b5.setFont(font);
        b5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b5.setForeground(Color.BLACK);
        b5.setBackground(new Color(204, 255, 204));
        
        //Create button6 column wise
        JButton b6=new JButton("8");
        b6.setBounds(90,175,50,35);
        b6.setFont(font);
        b6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b6.setForeground(Color.BLACK);
        b6.setBackground(new Color(204, 255, 204));
        
         
        //Create button7 column wise
        JButton b7=new JButton("9");
        b7.setBounds(175,175,50,35);
        b7.setFont(font);
        b7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b7.setForeground(Color.BLACK);
        b7.setBackground(new Color(204, 255, 204));
        
        //Create button8 column wise
        //Button3 icon
        ImageIcon icon1=new ImageIcon("G:/NetBeans_java/Project1/src/p3.png");
        Image img3 = icon1.getImage();
        Image newImg2 = img3.getScaledInstance(15, 20, Image.SCALE_SMOOTH);
        ImageIcon newImc2 = new ImageIcon(newImg2);
        
        JButton b8=new JButton(newImc2);
        b8.setBounds(255,175,50,35);
        b8.setFont(font);
        b8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b8.setForeground(Color.BLACK);
        b8.setBackground(new Color(204, 255, 204));
        
        //Create button9 column wise
        JButton b9=new JButton("4");
        b9.setBounds(5,250,50,35);
        b9.setFont(font);
        b9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b9.setForeground(Color.BLACK);
        b9.setBackground(new Color(204, 255, 204));
        
        //Create button10 column wise
        JButton b10=new JButton("5");
        b10.setBounds(90,250,50,35);
        b10.setFont(font);
        b10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b10.setForeground(Color.BLACK);
        b10.setBackground(new Color(204, 255, 204));
        
         
        //Create button11 column wise
        JButton b11=new JButton("6");
        b11.setBounds(175,250,50,35);
        b11.setFont(font);
        b11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b11.setForeground(Color.BLACK);
        b11.setBackground(new Color(204, 255, 204));
        
        //Create button12 column wise
        JButton b12=new JButton("-");
        b12.setBounds(255,250,50,35);
        b12.setFont(font);
        b12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b12.setForeground(Color.BLACK);
        b12.setBackground(new Color(204, 255, 204));
        
        //Create button13 column wise
        JButton b13=new JButton("1");
        b13.setBounds(5,330,50,35);
        b13.setFont(font);
        b13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b13.setForeground(Color.BLACK);
        b13.setBackground(new Color(204, 255, 204));
        
        //Create button14 column wise
        JButton b14=new JButton("2");
        b14.setBounds(90,330,50,35);
        b14.setFont(font);
        b3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b14.setForeground(Color.BLACK);
        b14.setBackground(new Color(204, 255, 204));
        
         
        //Create button15 column wise
        JButton b15=new JButton("3");
        b15.setBounds(175,330,50,35);
        b15.setFont(font);
        b15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b15.setForeground(Color.BLACK);
        b15.setBackground(new Color(204, 255, 204));
        
        //Create button16 column wise
        JButton b16=new JButton("+");
        b16.setBounds(255,330,50,35);
        b16.setFont(font);
        b16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b16.setForeground(Color.BLACK);
        b16.setBackground(new Color(204, 255, 204));
        
        //Create button17 column wise
        JButton b17=new JButton("00");
        b17.setBounds(5,410,50,35);
        b17.setFont(font);
        b17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b17.setForeground(Color.BLACK);
        b17.setBackground(new Color(204, 255, 204));
        
        //Create button18 column wise
        JButton b18=new JButton("0");
        b18.setBounds(90,410,50,35);
        b18.setFont(font);
        b18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b18.setForeground(Color.BLACK);
        b18.setBackground(new Color(204, 255, 204));
        
         
        //Create button19 column wise
        JButton b19=new JButton(".");
        b19.setBounds(175,410,50,35);
        b19.setFont(font);
        b19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b19.setForeground(Color.BLACK);
        b19.setBackground(new Color(204, 255, 204));
        
        //Create button20 column wise
        JButton b20=new JButton("=");
        b20.setBounds(255,410,50,35);
        b20.setFont(font);
        b20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b20.setForeground(Color.BLACK);
        b20.setBackground(new Color(204, 255, 204));
        
        //Add text field
        frame.add(text);
        
        //Add button
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b10);
        frame.add(b11);
        frame.add(b12);
        frame.add(b13);
        frame.add(b14);
        frame.add(b15);
        frame.add(b16);
        frame.add(b17);
        frame.add(b18);
        frame.add(b19);
        frame.add(b20);
        
        
        frame.setResizable(false); //Disable maximize button
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
    }
    public static void main(String args[])
    {
        Design frame=new Design();
        frame.initComponents();
       
    }
    
}
