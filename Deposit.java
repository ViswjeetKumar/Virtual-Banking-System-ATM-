package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    JTextField textField;
    JButton button1,button2;
    Deposit(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1550,830);
        add(l1);

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setFont(new Font("System", Font.BOLD,16));
        label1.setForeground(Color.white);
        label1.setBounds(460,180,400,35);
        l1.add(label1);

        textField= new JTextField();
        textField.setBackground(new Color(65,125,128));
        setForeground(Color.white);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        textField.setBounds(460,230,320,25);
        l1.add(textField);

        button1=new JButton("DEPOSIT");
//        button1.setFont(new Font("Raleway",Font.BOLD,35));
        button1.setBounds(700,362,150,35);
        button1.setBackground(new Color(65,125,128));
        button1.setForeground(Color.white);
        button1.addActionListener(this);
        l1.add(button1);

        button2=new JButton(" BACK ");
//        button2.setFont(new Font("Raleway",Font.BOLD,35));
        button2.setBounds(700,406,150,35);
        button2.setBackground(new Color(65,125,128));
        button2.setForeground(Color.white);
        button2.addActionListener(this);
        l1.add(button2);






        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Deposit("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String amount = textField.getText();
            Date date = new Date();
            if (e.getSource() == button1){
                if (textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please Enter The Amount That You Want To Deposit!!");
                }else {
                    Con con= new Con();
                    con.statement.executeUpdate("insert into Bank values('"+pin+"','"+date+"','Deposited', '"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs "+amount+" Deposited Successfully.");
                    setVisible(false);
                    new main_class(pin);
                }
            } else if (e.getSource() == button2) {
                setVisible(false);
                new main_class(pin);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }
}
