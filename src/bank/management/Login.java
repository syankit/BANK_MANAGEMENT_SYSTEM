
package bank.management;

import javax.swing.*;
import java.awt.*;// image package
import java.awt.event.*;//actionlisnerpackage-> take action for button 
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JButton b1,b2,b3;
    JTextField tf1;
    JPasswordField pf2;

    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);//change shape of obj
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);//image can't be pass in jalble so first convert image to imageicon
        l11.setBounds(70, 10, 100, 100);//loaction of lable
        add(l11);//farmek upr palce krne k liye uska obj pass kr do
        
        l1 = new JLabel("WELCOME TO ATM");
        l1.setFont(new Font("Osward", Font.BOLD, 38));
        l1.setBounds(200,40,450,40);
        add(l1);
        
        tf1= new JTextField(15);//box entry box part of swing package
        tf1.setBounds(300,150,230,30);
        tf1.setFont(new Font("Arial", Font.BOLD, 14));
        add(tf1);
        
        l2 = new JLabel("Card No:");
        l2.setFont(new Font("Raleway", Font.BOLD, 28));
        l2.setBounds(125,150,375,30);
        add(l2);
        
        pf2=new JPasswordField(15);
        pf2.setFont(new Font("Arial", Font.BOLD, 14));
        pf2.setBounds(300,220,230,30);
        add(pf2);
        
        l3 = new JLabel("PIN:");
        l3.setFont(new Font("Raleway", Font.BOLD, 28));
        l3.setBounds(125,220,375,30);
        add(l3);
        
        b1 = new JButton("SIGN IN");
        b1.setBounds(300,300,100,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);
        
        b2 = new JButton("CLEAR");
        b2.setBounds(430,300,100,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);
        
        b3 = new JButton("SIGN UP");
        b3.setBounds(300,350,230,30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        setSize(800,480);//set len and bred
        setLocation(550,200);//tell loaction of box where to open
        setVisible(true);
        
        
    }
     public void actionPerformed(ActionEvent ae){//for overrriding abstraction error konsa button click hua
         if(ae.getSource()==b1){
                Conn c3 = new Conn();
                String cardno  = tf1.getText();
                String pin  = pf2.getText();
                String query = "select * from login where cardno = '"+cardno+"' and pin = '"+pin+"'";
                try{
                ResultSet rs = c3.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
                }catch(Exception e){
                    System.out.println(e);
                }
            }else if(ae.getSource()==b2){
                tf1.setText("");
                pf2.setText("");
            }else if(ae.getSource()==b3){
                setVisible(false);
                new SignUpOne().setVisible(true);
            }
    }
     public static void main(String[] args){
        new Login().setVisible(true);//create obj so that frame is create as so as be call func
    }
}
