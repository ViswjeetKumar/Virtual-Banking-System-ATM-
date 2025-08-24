package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Mini extends JFrame implements ActionListener {
    String pin;
    JButton button;
    JLabel label1;
    JScrollPane scrollPane;

    Mini(String pin) {
        this.pin = pin;
        getContentPane().setBackground(new Color(255, 204, 204)); // Background color of the frame
        setSize(400, 600);
        setLocation(20, 20);
        setLayout(null);

        JLabel label2 = new JLabel("Vishwajeet Vam");
        label2.setFont(new Font("System", Font.BOLD, 15));
        label2.setBounds(150, 20, 200, 20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20, 80, 300, 20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20, 400, 300, 20);
        add(label4);

        // Scrollable transactions section
        label1 = new JLabel();
        label1.setVerticalAlignment(SwingConstants.TOP);
        label1.setOpaque(true); // Make label1 background visible
        label1.setBackground(new Color(255, 204, 204)); // Match frame background color
        label1.setBounds(20, 140, 360, 200);

        scrollPane = new JScrollPane(label1);
        scrollPane.setBounds(20, 140, 360, 200);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // Customize the scroll bar
        JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
        verticalScrollBar.setBackground(new Color(255, 204, 204)); // Scroll bar background color
        verticalScrollBar.setForeground(new Color(102, 102, 255)); // Scroll bar thumb color

        scrollPane.getViewport().setBackground(new Color(255, 204, 204)); // Match frame background color
        add(scrollPane);

        // Display Card Number
        try {
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("SELECT * FROM SignUp3 WHERE PIN_Number = '" + pin + "'");
            while (resultSet.next()) {
                label3.setText("Card Number: " +
                        resultSet.getString("Card_Number").substring(0, 4) + "XXXXXXXX" +
                        resultSet.getString("Card_Number").substring(12));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Display Transactions
        try {
            Con c = new Con();
            int balance = 0;
            ResultSet resultSet = c.statement.executeQuery("SELECT * FROM Bank WHERE PIN = '" + pin + "'");
            StringBuilder transactions = new StringBuilder("<html>");
            while (resultSet.next()) {
                transactions.append(resultSet.getString("Date"))
                        .append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;")
                        .append(resultSet.getString("Type"))
                        .append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;")
                        .append(resultSet.getString("Amount"))
                        .append("<br><br>");

                if (resultSet.getString("Type").equals("Deposited")) {
                    balance += Integer.parseInt(resultSet.getString("Amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("Amount"));
                }
            }
            transactions.append("</html>");
            label1.setText(transactions.toString());
            label4.setText("Your Total Balance is Rs " + balance);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Exit Button
        button = new JButton("EXIT");
        button.setBounds(20, 500, 100, 25);
        button.addActionListener(this);
        add(button);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new Mini("");
    }
}










//package bank.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.ResultSet;
//
//public class Mini extends JFrame implements ActionListener {
//    String pin;
//    JButton button;
//    Mini( String pin){
//
//        this.pin = pin;
//        getContentPane().setBackground(new Color(255,204,204));
//        setSize(400,600);
//        setLocation(20,20);
//
//        JLabel label1 = new JLabel();
//        label1.setBounds(20,140,400,200);
//        add(label1);
//
//        JLabel label2 = new JLabel("Vishwajeet Vam");
//        label2.setFont(new Font("System",Font.BOLD,15));
//        label2.setBounds(150,20,200,20);
//        add(label2);
//
//        JLabel label3 = new JLabel();
//        label3.setBounds(20,80,300,20);
//        add(label3);
//
//        JLabel label4 = new JLabel();
//        label4.setBounds(20,400,300,20);
//        add(label4);
//
//        try {
//            Con c = new Con();
//            ResultSet resultSet= c.statement.executeQuery("select * from Login where PIN = '"+pin+"'");
//            while (resultSet.next()){
//                label3.setText("Card Number: "+ resultSet.getString("Card_Number").substring(0,4)+ "XXXXXXXX"+ resultSet.getString("Card_Number").substring(12));
//            }
//        }catch (Exception E){
//            E.printStackTrace();
//        }
//        try {
//            Con c = new Con();
//            int balance = 0;
//            ResultSet resultSet=c.statement.executeQuery("select * from Bank where PIN= '"+pin+"'");
//            while (resultSet.next()){
//                label1.setText(label1.getText()+ "<html>"+ resultSet.getString("Date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ resultSet.getString("Type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("Amount")+"<br><br><html>");
//
//                if (resultSet.getString("Type").equals("Deposited")){
//                    balance += Integer.parseInt(resultSet.getString("Amount"));
//
//                }else {
//                    balance -= Integer.parseInt(resultSet.getString("Amount"));
//                }
//            }
//            label4.setText("Your Total Balance is Rs "+balance);
//
//        }catch (Exception E){
//            E.printStackTrace();
//        }
//        button = new JButton("EXIT");
//        button.setBounds(20,500,100,25);
//        button.addActionListener(this);
//        add(button);
//
//
//
//
//
//        setLayout(null);
//        setVisible(true);
//    }
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        setVisible(false);
//
//    }
//
//    public static void main(String[] args) {
//        new Mini("");
//    }
//
//}
