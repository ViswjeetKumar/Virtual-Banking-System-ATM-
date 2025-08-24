package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {
    JButton button1,button2;
    JTextField textField;
    String pin;
    Withdrawl (String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1550,830);
        add(l1);

        JLabel label1 = new JLabel("MAXIMUM WITHDRAWAL IS 10,000 Rs.");
        label1.setFont(new Font("System", Font.BOLD,16));
        label1.setForeground(Color.white);
        label1.setBounds(460,180,700,35);
        l1.add(label1);

        JLabel label2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        label2.setFont(new Font("System", Font.BOLD,16));
        label2.setForeground(Color.white);
        label2.setBounds(460,200,400,35);
        l1.add(label2);

        textField= new JTextField();
        textField.setBackground(new Color(65,125,128));
        setForeground(Color.white);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        textField.setBounds(460,230,320,25);
        l1.add(textField);

        button1=new JButton("WITHDRAWAL");
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {

        try {
            String amount = textField.getText();
            Date date = new Date();
            if (textField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter Amount That You Want To Withdrawal!!");
            } else {
                Con c = new Con();
                ResultSet resultSet = c.statement.executeQuery("select * from Bank where PIN='" + pin + "'");
                int balance = 0;
                while (resultSet.next()) {
                    if (resultSet.getString("Type").equals("Deposited")) {
                        balance += Integer.parseInt(resultSet.getString("Amount"));
                    } else {
                        balance -= Integer.parseInt(resultSet.getString("Amount"));
                    }
                }
                if (balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance!!");
                    return;
                }
                c.statement.executeUpdate("insert into Bank values('" + pin + "', '" + date + "', 'Withdrawal' ,'" + amount + "')");
                JOptionPane.showMessageDialog(null, "Rs " + amount + " Withdrawal Successfully");
                setVisible(false);
                new main_class(pin);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }
    } else if (e.getSource() == button2) {
            setVisible(false);
            new main_class(pin);
        }
    }

    public static void main(String[] args) {
        new Withdrawl("");
    }
}
