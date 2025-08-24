package bank.management.system;

import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel jLabel1, jLabel2, jLabel3 , jLabel11;
    JTextField jTextField2;
    JPasswordField jPasswordField3;
    JButton jButton1, jButton2,jButton3;

 Login(){
     super("Virtual Banking System");

     jLabel1 = new JLabel("WELCOM TO");
     jLabel1.setForeground(new Color(245,0,125));
     jLabel1.setFont(new Font("AvantGarde",Font.BOLD,32));
     jLabel1.setBounds(364,40,350,50);
     add(jLabel1);

     jLabel11 = new JLabel("VIRTUAL-ATM");
     jLabel11.setForeground(Color.white);
     jLabel11.setFont(new Font("AvantGarde",Font.BOLD,36));
     jLabel11.setBounds(573,40,350,50);
     add(jLabel11);

     jLabel2 = new JLabel("CARD No :  ");
     jLabel2.setForeground(Color.white);
     jLabel2.setFont(new Font("Ralway",Font.BOLD,24));
     jLabel2.setBounds(400,190,375,30);
     add(jLabel2);

     jLabel3 = new JLabel("PIN No :  ");
     jLabel3.setFont(new Font("Ralway",Font.BOLD,24));
     jLabel3.setForeground(Color.white);
     jLabel3.setBounds(400,250,375,30);
     add(jLabel3);

     jTextField2 = new JTextField(15);
     jTextField2.setFont(new Font("Ralway",Font.BOLD,15));
     jTextField2.setForeground(Color.black);
     jTextField2.setBounds(550,190,230,30);
     add(jTextField2);


     jPasswordField3 = new JPasswordField(15);
     jPasswordField3.setFont(new Font("Ralway",Font.BOLD, 30));
     jPasswordField3.setForeground(Color.black);
     jPasswordField3.setBounds(550,250,230,30);
     add(jPasswordField3);

     jButton1 = new JButton(" SIGN IN ");
     jButton1.setBackground(Color.green);
     jButton1.setFont(new Font("Arial",Font.BOLD,14));
     jButton1.setForeground(Color.black);
     jButton1.setBounds(480,300,100,30);
     jButton1.addActionListener(this);
     add(jButton1);

     jButton2 = new JButton(" CLEAR ");
     jButton2.setBackground(Color.GREEN);
     jButton2.setForeground(Color.black);
     jButton2.setFont(new Font("Arial",Font.BOLD,14));
     jButton2.setBounds(610,300,100,30);
     jButton2.addActionListener(this);
     add(jButton2);

     jButton3  = new JButton(" SIGN UP ");
     jButton3.setFont(new Font("Arial",Font.BOLD,14));
//     jButton3.setForeground(Color.black);
     jButton3.setForeground(new Color(245,0,125));
     jButton3.setBounds(480,350,230,30);
     jButton3.addActionListener(this);
     add(jButton3);

     ImageIcon iii1= new ImageIcon(ClassLoader.getSystemResource("Icons/backbg1.png"));
     Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
     ImageIcon iii3 = new ImageIcon(iii2);
     JLabel iiimage = new JLabel(iii3);
     iiimage.setBounds(0,0,850,480);
     add(iiimage);

     setLayout(null);
     setSize(850,480);
     setLocation(370,200);
//     setUndecorated(true);
     setVisible(true);
 }

    public static void main(String[] args) {
        new Login();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == jButton1){
                Con c = new Con();
                String cardno = jTextField2.getText();
                String pin = jPasswordField3.getText();
                String q = "select * from SignUp3 where Card_Number = '"+cardno+"' and PIN_Number='"+pin+"'";
                ResultSet resultset = c.statement.executeQuery(q);
                if (resultset.next()){
                    setVisible(false);
                    new main_class(pin);
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number and PIN!!");
                }
            } else if (e.getSource() == jButton2) {
                jTextField2.setText("");
                jPasswordField3.setText("");
            } else if (e.getSource() == jButton3) {
                new Signup();
                setVisible(false);

            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }
}
