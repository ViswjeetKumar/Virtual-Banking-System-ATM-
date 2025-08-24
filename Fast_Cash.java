package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Fast_Cash extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    String pin;
    Fast_Cash(String pin){
        this.pin=pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1550,830);
        add(l1);

        JLabel label=new JLabel("Select Your Withdrawal Amount");
        label.setBounds(430,180,700,35);
        label.setFont(new Font("System",Font.BOLD,28));
        label.setForeground(Color.white);
        l1.add(label);

        b1=new JButton("Rs 100");
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(410,275,150,35);
        b1.addActionListener(this);
        l1.add(b1);

        b2=new JButton("Rs 500");
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(700,275,150,35);
        b2.addActionListener(this);
        l1.add(b2);

        b3=new JButton("Rs 1000");
        b3.setForeground(Color.white);
        b3.setBackground(new Color(65,125,128));
        b3.setBounds(410,318,150,35);
        b3.addActionListener(this);
        l1.add(b3);

        b4=new JButton("Rs 2000");
        b4.setForeground(Color.white);
        b4.setBackground(new Color(65,125,128));
        b4.setBounds(700,318,150,35);
        b4.addActionListener(this);
        l1.add(b4);

        b5=new JButton("Rs 5000");
        b5.setForeground(Color.white);
        b5.setBackground(new Color(65,125,128));
        b5.setBounds(410,362,150,35);
        b5.addActionListener(this);
        l1.add(b5);

        b6=new JButton("Rs 10,000");
        b6.setForeground(Color.white);
        b6.setBackground(new Color(65,125,128));
        b6.setBounds(700,362,150,35);
        b6.addActionListener(this);
        l1.add(b6);

        b7=new JButton(" BACK ");
        b7.setForeground(Color.white);
        b7.setBackground(new Color(65,125,128));
        b7.addActionListener(this);
        b7.setBounds(700,406,150,35);
        l1.add(b7);

        setLayout(null);
        setVisible(true);
        setSize(1550,1080);
        setLocation(0,0);
    }

    public static void main(String[] args) {
        new Fast_Cash("");
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b7){
            setVisible(false);
            new main_class(pin);
        }else{
            String amount = ((JButton)e.getSource()).getText().substring(3);
            Con c = new Con();
            Date date = new Date();
            try {
                ResultSet resultSet=c.statement.executeQuery("select * from Bank where PIN= '"+pin+"'");
                int balance = 0;
                while (resultSet.next()){
                    if (resultSet.getString("Type").equals("Deposited")){
                        balance += Integer.parseInt(resultSet.getString("Amount"));

                    }else {
                        balance -= Integer.parseInt(resultSet.getString("Amount"));
                    }
                }
                if (e.getSource() != b7 && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance!!");
                    return;
                }
                c.statement.executeUpdate("insert into Bank values('"+pin+"','"+date+"','Withdrawal','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs "+amount+" Debited Successfully.");

            }catch (Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new main_class(pin);
        }
    }
}
