

package bank.management;

import javax.swing.*;
import java.awt.*;//for color package
import java.util.*; //random package
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignUpOne extends JFrame implements ActionListener{
    
    long first4;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    JTextField t1,t2,t3,t5,t6,t7,t8;
    JRadioButton r1,r2,r3,r4,r5;
    JButton b;
    JDateChooser dateChooser;
    SignUpOne(){
        setLayout(null);//borderlayout ->setbound dont work
        Random ran = new Random();//util random numb got print 
        //System.out.println(ran);
        first4 = (ran.nextLong() % 9000L) + 1000L;
        String first = "" + Math.abs(first4);
        
        
        l1=new JLabel("APPLICATION FORM NO."+first);
        l1.setFont(new Font("Raleway", Font.BOLD, 38));
        l1.setBounds(140, 20, 600, 40);
        add(l1);
        
        l2 = new JLabel("Page 1: Personal Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(290, 80, 400, 30);
        add(l2);
        
        l3 = new JLabel("Name:");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));
        l3.setBounds(100, 140, 200, 30);
        add(l3);
        
        l4 = new JLabel("Father's Name:");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));
        l4.setBounds(100, 190, 200, 30);
        add(l4);
        
        l5 = new JLabel("Date of Birth:");
        l5.setFont(new Font("Raleway", Font.BOLD, 20));
        l5.setBounds(100, 240, 200, 30);
        add(l5);
        
        dateChooser=new JDateChooser();
	//dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
	dateChooser.setForeground(new Color(105, 105, 105));//digit
	dateChooser.setBounds(300, 240, 200, 29);
	add(dateChooser);
        
        l6 = new JLabel("Gender:");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));
        l6.setBounds(100, 290, 200, 30);
        add(l6);
        
        l7 = new JLabel("Email Address:");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));
        l7.setBounds(100, 340, 200, 30);
        add(l7);
        
        l8 = new JLabel("Marital Status:");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));
        l8.setBounds(100, 390, 200, 30);
        add(l8);
        
        l9 = new JLabel("Address:");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));
        l9.setBounds(100, 440, 200, 30);
        add(l9);
        
        l10 = new JLabel("City:");
        l10.setFont(new Font("Raleway", Font.BOLD, 20));
        l10.setBounds(100, 490, 200, 30);
        add(l10);
        
        l11 = new JLabel("Pin Code:");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));
        l11.setBounds(100, 540, 200, 30);
        add(l11);
        
        l12 = new JLabel("State:");
        l12.setFont(new Font("Raleway", Font.BOLD, 20));
        l12.setBounds(100, 590, 200, 30);
        add(l12);
        
        l13 = new JLabel("Date");
        l13.setFont(new Font("Raleway", Font.BOLD, 20));
        l13.setBounds(100, 640, 200, 30);
        add(l13);
        
        JDateChooser date=new JDateChooser();
	//dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
	date.setForeground(new Color(105, 105, 105));//digit
	date.setBounds(300, 640, 200, 29);
	add(date);
        
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));
        t1.setBounds(300, 140, 200, 30);
        add(t1);
        
        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));
        t2.setBounds(300, 190, 200, 30);
        add(t2);
        
        t3 = new JTextField();
        t3.setFont(new Font("Raleway", Font.BOLD, 14));
        t3.setBounds(300, 340, 200, 30);
        add(t3);
        
        
        t5 = new JTextField();
        t5.setFont(new Font("Raleway", Font.BOLD, 14));
        t5.setBounds(300, 440, 200, 30);
        add(t5);
        
        t6 = new JTextField();
        t6.setFont(new Font("Raleway", Font.BOLD, 14));
        t6.setBounds(300, 490, 200, 30);
        add(t6);
        
        t7 = new JTextField();
        t7.setFont(new Font("Raleway", Font.BOLD, 14));
        t7.setBounds(300, 540, 200, 30);
        add(t7);
        
        t8 = new JTextField();
        t8.setFont(new Font("Raleway", Font.BOLD, 14));
        t8.setBounds(300, 590, 200, 30);
        add(t8);
        
        
        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);
        r1.setBounds(300,290,60,30);
        add(r1);
        
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);
        r2.setBounds(400,290,120,30);
        add(r2);
        
        ButtonGroup groupgender = new ButtonGroup();//dono option select hone se prevnt krta h by grping them
        groupgender.add(r1);
        groupgender.add(r2);
        
        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);
        r3.setBounds(300,390,120,30);
        add(r3);
        
        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);
        r4.setBounds(400,390,120,30);
        add(r4);
        
        r5 = new JRadioButton("Other");
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        r5.setBackground(Color.WHITE);
        r5.setBounds(500,390,120,30);
        add(r5);
        
        ButtonGroup groupstatus = new ButtonGroup();
        groupstatus.add(r3);
        groupstatus.add(r4);
        groupstatus.add(r5);
        
        b= new JButton("New");
        b.setFont(new Font("Railway",Font.BOLD,14));
        b.setForeground(Color.WHITE); 
        b.setBackground(Color.BLACK);
        b.setBounds(620,660,80,30);
        b.addActionListener(this); 
        
        add(b);
        
        setSize(850,850);
        setLocation(350,10);
        getContentPane().setBackground(Color.WHITE);//for background color of entire frame
    
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = ""+first4;//;ong value so convert it o string
        String name = t1.getText();//this help to get value from textfield
        String fname = t2.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();//get ui func uses textfield
        String gender = null;
        if(r1.isSelected()){ 
            gender= "Male";
        }else if(r2.isSelected()){ 
            gender= "Female";
        }
            
        String email = t3.getText();
        String marital = null;
        if(r3.isSelected()){ 
            marital = "Married";
        }else if(r4.isSelected()){ 
            marital = "Unmarried";
        }else if(r5.isSelected()){ 
            marital = "Other";
        }
           
        String address = t5.getText();
        String city = t6.getText();
        String pincode = t7.getText();
        String state = t8.getText();
        
        try{
         if(t1.getText().equals("") || t2.getText().equals("") || t3.getText().equals("") || t5.getText().equals("") ||t6.getText().equals("") ||t7.getText().equals("") ||t8.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c1 = new Conn();//thats why we didint  create main in this..so that we can call it anywhere
                String q1 = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                c1.s.executeUpdate(q1);
                //signup2 obj
                new SignUpTwo(formno).setVisible(true);
                setVisible(false);
            }
            
        }catch(Exception e){
             System.out.println(e);
        }
    }
    
     public static void main(String[] args){
        new SignUpOne().setVisible(true);
    }
}
