
package bank.management;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Deposite extends JFrame implements ActionListener{
    JLabel txt;
    JTextField amt;
    JButton d,b;
    String pin;
    Deposite(String pin){
        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 960, 1080);
        add(l3);
        
        setLayout(null);
        txt=new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        txt.setForeground(Color.white);
        txt.setFont(new Font("System", Font.BOLD, 16));
        
        amt = new JTextField();
        amt.setFont(new Font("Raleway", Font.BOLD, 22));
        
        d = new JButton("DEPOSIT");
        b = new JButton("BACK");
        
        setLayout(null);
        
        txt.setBounds(190,350,400,35);
        l3.add(txt);
        
        amt.setBounds(190,420,320,25);
        l3.add(amt);
        
        d.setBounds(390,588,150,35);
        l3.add(d);
        
        b.setBounds(390,633,150,35);
        l3.add(b);
        
        d.addActionListener(this);
        b.addActionListener(this);
        
        
        setSize(900,900);
        setLocation(300,-150);
        setUndecorated(true);//remove task bar from above
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{        
            String amount = amt.getText();
            Date date = new Date();
            if(ae.getSource()==d){
                if(amt.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
                }else{
                    Conn c1 = new Conn();
                    c1.s.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }
            }else if(ae.getSource()==b){
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     public static void main(String[] args){
        new Deposite("").setVisible(true);
    }
}
