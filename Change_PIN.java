package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Change_PIN extends JFrame implements ActionListener {
    JButton button1,button2;
    JPasswordField p1,p2;
    String pin;
    Change_PIN(String pin){
        this.pin=pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1550,830);
        add(l1);

        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setFont(new Font("System", Font.BOLD,16));
        label1.setForeground(Color.white);
        label1.setBounds(430,180,400,35);
        l1.add(label1);

        JLabel label2 = new JLabel("Enter New PIN: ");
        label2.setFont(new Font("System", Font.BOLD,16));
        label2.setForeground(Color.white);
        label2.setBounds(430,220,150,35);
        l1.add(label2);

        p1 = new JPasswordField();
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.white);
        p1.setFont(new Font("Raleway",Font.BOLD,22));
        p1.setBounds(600,220,180,25);
        l1.add(p1);

        JLabel label3 = new JLabel("Re-Enter New PIN: ");
        label3.setFont(new Font("System", Font.BOLD,16));
        label3.setForeground(Color.white);
        label3.setBounds(430,250,200,35);
        l1.add(label3);

        p2 = new JPasswordField();
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.white);
        p2.setFont(new Font("Raleway",Font.BOLD,22));
        p2.setBounds(600,255,180,25);
        l1.add(p2);

        button1=new JButton("CHANGE PIN");
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
        try {
            String pin1=p1.getText();
            String pin2=p2.getText();

            if (!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null, "Entered PIN Doesn't Match!!");
                return;
            }
            if (e.getSource()==button1){
                if (p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter New PIN!!");
                    return;
                }
                if (p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Re-Enter New PIN!!");
                    return;
                }
                Con c = new Con();
                String q1="update Bank set PIN='"+pin1+"' where PIN = '"+pin+"'";
                String q2="update Login set PIN='"+pin1+"' where PIN = '"+pin+"'";
                String q3="update SignUp3 set PIN_Number='"+pin1+"' where PIN_Number = '"+pin+"'";
                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);
                JOptionPane.showMessageDialog(null,"PIN Changed Successfully.");
                setVisible(false);
                new main_class(pin);
            } else if (e.getSource() == button2) {
                new main_class(pin);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Change_PIN("");
    }

}
