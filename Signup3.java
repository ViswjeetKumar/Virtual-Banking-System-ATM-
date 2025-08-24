//package bank.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Random;
//
//public class Signup3 extends JFrame implements ActionListener {
//    JRadioButton radioButton1, radioButton2, radioButton3, radioButton4;
//    JButton NextButton11,NextButton12;
//    JCheckBox checkBox1, checkBox2, checkBox3, checkBox4,checkBox5,checkBox6;
//    String formno;
//    Signup3(String formno){
//        this.formno=formno;
//        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("Icons/bank1.png"));
//        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(150,5,100,100);
//        add(image);
//
//        JLabel l1 = new JLabel("Page - 3");
//        l1.setFont(new Font("Raleway",Font.BOLD, 22));
//        l1.setBounds(280,40,400,40);
//        add(l1);
//
//        JLabel l2 = new JLabel("Account Details");
//        l2.setFont(new Font("Raleway",Font.BOLD, 22));
//        l2.setBounds(280,70,400,40);
//        add(l2);
//
//        JLabel l3 = new JLabel("Account Type");
//        l3.setFont(new Font("Raleway",Font.BOLD, 18));
//        l3.setBounds(100,140,300,30);
//        add(l3);
//
//        radioButton1 = new JRadioButton("Saving Account");
//        radioButton1.setFont(new Font("Raleway",Font.ITALIC,14));
//        radioButton1.setBounds(100,180,150,30);
//        radioButton1.setBackground(new Color(215,252,252));
//        add(radioButton1);
//
//        radioButton2 = new JRadioButton("Fixed Deposit Account");
//        radioButton2.setFont(new Font("Raleway",Font.ITALIC,14));
//        radioButton2.setBounds(350,180,300,30);
//        radioButton2.setBackground(new Color(215,252,252));
//        add(radioButton2);
//
//        radioButton3 = new JRadioButton("Current Account");
//        radioButton3.setFont(new Font("Raleway",Font.ITALIC,14));
//        radioButton3.setBounds(100,220,250,30);
//        radioButton3.setBackground(new Color(215,252,252));
//        add(radioButton3);
//
//        radioButton4 = new JRadioButton("Recurring Deposit Account");
//        radioButton4.setFont(new Font("Raleway",Font.ITALIC,14));
//        radioButton4.setBounds(350,220,300,30);
//        radioButton4.setBackground(new Color(215,252,252));
//        add(radioButton4);
//
//        ButtonGroup buttonGroup = new ButtonGroup();
//        buttonGroup.add(radioButton1);
//        buttonGroup.add(radioButton2);
//        buttonGroup.add(radioButton3);
//        buttonGroup.add(radioButton4);
//
//        JLabel l4 = new JLabel("Card Number : ");
//        l4.setFont(new Font("Raleway",Font.BOLD, 18));
//        l4.setBounds(100,300,200,30);
//        add(l4);
//
//        JLabel l5 = new JLabel("(Your 16-Digit Card No)");
//        l5.setFont(new Font("Raleway",Font.BOLD, 12));
//        l5.setBounds(100,330,200,20);
//        add(l5);
//
//        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4208");
//        l6.setFont(new Font("Raleway",Font.BOLD, 18));
//        l6.setBounds(330,300,290,20);
//        add(l6);
//
//        JLabel l7 = new JLabel("It Would Appear On ATM Card/Cheque Book And Statements");
//        l7.setFont(new Font("Raleway",Font.BOLD, 12));
//        l7.setBounds(330,330,500,20);
//        add(l7);
//
//        JLabel l8 = new JLabel("PIN : ");
//        l8.setFont(new Font("Raleway",Font.BOLD, 18));
//        l8.setBounds(100,370,200,20);
//        add(l8);
//
//        JLabel l9 = new JLabel("XXXX");
//        l9.setFont(new Font("Raleway",Font.BOLD, 18));
//        l9.setBounds(330,370,200,20);
//        add(l9);
//
//        JLabel l10 = new JLabel("(4-Digit Password)");
//        l10.setFont(new Font("Raleway",Font.BOLD, 12));
//        l10.setBounds(100,400,200,20);
//        add(l10);
//
//        JLabel l11 = new JLabel("Services Required");
//        l11.setFont(new Font("Raleway",Font.BOLD, 18));
//        l11.setBounds(100,450,200,20);
//        add(l11);
//
//        checkBox1 = new JCheckBox("ATM Card");
//        checkBox1.setFont(new Font("Raleway",Font.BOLD, 18));
//        checkBox1.setBounds(100,500,200,30);
//        checkBox1.setBackground(new Color(215,252,252));
//        add(checkBox1);
//
//        checkBox2 = new JCheckBox("Internet Banking");
//        checkBox2.setFont(new Font("Raleway",Font.BOLD, 18));
//        checkBox2.setBounds(350,500,200,30);
//        checkBox2.setBackground(new Color(215,252,252));
//        add(checkBox2);
//
//        checkBox3 = new JCheckBox("Mobile Banking");
//        checkBox3.setFont(new Font("Raleway",Font.BOLD, 18));
//        checkBox3.setBounds(100,550,200,30);
//        checkBox3.setBackground(new Color(215,252,252));
//        add(checkBox3);
//
//        checkBox4 = new JCheckBox("Email Alerts");
//        checkBox4.setFont(new Font("Raleway",Font.BOLD, 18));
//        checkBox4.setBounds(350,550,200,30);
//        checkBox4.setBackground(new Color(215,252,252));
//        add(checkBox4);
//
//        checkBox5 = new JCheckBox("Cheque Book");
//        checkBox5.setFont(new Font("Raleway",Font.BOLD, 18));
//        checkBox5.setBounds(100,600,200,30);
//        checkBox5.setBackground(new Color(215,252,252));
//        add(checkBox5);
//
//        checkBox6 = new JCheckBox("E-Statements");
//        checkBox6.setFont(new Font("Raleway",Font.BOLD, 18));
//        checkBox6.setBounds(350,600,200,30);
//        checkBox6.setBackground(new Color(215,252,252));
//        add(checkBox6);
//
//        JCheckBox checkBox7 = new JCheckBox("I here by declare that the above entered details correct to the best of my knowledge",true);
//        checkBox7.setFont(new Font("Raleway",Font.BOLD, 12));
//        checkBox7.setBounds(100,680,600,20);
//        checkBox7.setBackground(new Color(215,252,252));
//        add(checkBox7);
//
//        JLabel l12 = new JLabel("Form Number : ");
//        l12.setFont(new Font("Raleway",Font.BOLD, 20));
//        l12.setBounds(600,10,150,30);
//        add(l12);
//
////        JLabel l13 = new JLabel(formno);
//    JLabel l13 = new JLabel("1298");
//        l13.setFont(new Font("Raleway",Font.BOLD, 20));
//        l13.setBounds(750,10,70,30);
//        add(l13);
//
//        NextButton11 = new JButton(" Submit ");
//        NextButton11.setBackground(Color.GREEN);
//        NextButton11.setForeground(Color.black);
//        NextButton11.setFont(new Font("Arial",Font.BOLD,14));
//        NextButton11.setBounds(250,720,100,30);
//        NextButton11.addActionListener(this);
//        add(NextButton11);
//
//        NextButton12 = new JButton(" Cancel ");
//        NextButton12.setBackground(Color.GREEN);
//        NextButton12.setForeground(Color.black);
//        NextButton12.setFont(new Font("Arial",Font.BOLD,14));
//        NextButton12.setBounds(420,720,100,30);
//        NextButton12.addActionListener(this);
//        add(NextButton12);
//
//        getContentPane().setBackground(new Color(215,252,252));
//        setSize(850,800);
//        setLayout(null);
//        setLocation(400,20);
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new Signup3("");
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        try {
//            String account_type = null;
//            if (radioButton1.isSelected()){
//                account_type="Saving Account";
//            } else if (radioButton2.isSelected()) {
//                account_type="Fixed Deposit Account";
//            } else if (radioButton3.isSelected()) {
//                account_type="Current Account";
//            } else if (radioButton4.isSelected()) {
//                account_type="Recurring Deposit Account";
//            }
//
//            Random random=new Random();
//            long first7= (random.nextLong() % 90000000L) + 1409963000000000L;
//            String cardno = "" + Math.abs(first7);
//
//            long first3 = (random.nextLong() % 9000L) + 1000L;
//            String pin = "" + Math.abs(first3);
//
//            String services_required = "" ;
//            if (checkBox1.isSelected()){
//                services_required = "ATM Card";
//            } else if (checkBox2.isSelected()) {
//                services_required="Internet Banking";
//            } else if (checkBox3.isSelected()) {
//                services_required = "Mobile Banking";
//            } else if (checkBox4.isSelected()) {
//                services_required = "Email Alerts";
//            } else if (checkBox5.isSelected()) {
//                services_required="Cheque Book";
//            } else if (checkBox6.isSelected()) {
//                services_required="E-Statements";
//            }
//
//            try {
//                if (e.getSource() == NextButton11){
//                    if (account_type.equals("")){
//                        JOptionPane.showMessageDialog(null,"Please Fill All The Field !!" );
//                    }else {
//                        Con c1= new Con();
//                        String q = "insert into SignUp3 values('"+formno+"','"+account_type+"','"+cardno+"','"+pin+"','"+services_required+"')";
//                        String q2 = "insert into Login values('"+formno+"','"+cardno+"','"+pin+"')";
//                        c1.statement.executeUpdate(q);
//                        c1.statement.executeUpdate(q2);
//                        JOptionPane.showMessageDialog(null, "Card Number : "+cardno +"\nPIN : "+pin);
//                        new Deposit(pin);
//                        setVisible(false);
//                    }
//                } else if (e.getSource() == NextButton12) {
//                    System.exit(0);
//                }
//
//            }catch (Exception EE){
//                EE.printStackTrace();
//            }
//
//        }catch (Exception E){
//            E.printStackTrace();
//        }
//    }
//}
//










// new


package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import java.sql.*;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton radioButton1, radioButton2, radioButton3, radioButton4;
    JButton NextButton11, NextButton12;
    JCheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6;
    String formno;

    Signup3(String formno) {
        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/bank1.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        JLabel image = new JLabel(new ImageIcon(i2));
        image.setBounds(150, 5, 100, 100);
        add(image);

        JLabel l1 = new JLabel("Page - 3");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(280, 70, 400, 40);
        add(l2);

        JLabel l3 = new JLabel("Account Type");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100, 140, 300, 30);
        add(l3);

        radioButton1 = new JRadioButton("Saving Account");
        radioButton2 = new JRadioButton("Fixed Deposit Account");
        radioButton3 = new JRadioButton("Current Account");
        radioButton4 = new JRadioButton("Recurring Deposit Account");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);

        radioButton1.setBounds(100, 180, 150, 30);
        radioButton2.setBounds(350, 180, 300, 30);
        radioButton3.setBounds(100, 220, 250, 30);
        radioButton4.setBounds(350, 220, 300, 30);

        for (JRadioButton rb : new JRadioButton[]{radioButton1, radioButton2, radioButton3, radioButton4}) {
            rb.setFont(new Font("Raleway", Font.ITALIC, 14));
            rb.setBackground(new Color(215, 252, 252));
            add(rb);
        }

        JLabel l4 = new JLabel("Card Number : ");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100, 300, 200, 30);
        add(l4);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4208");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(330, 300, 290, 20);
        add(l6);

        JLabel l8 = new JLabel("PIN : ");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100, 370, 200, 20);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(330, 370, 200, 20);
        add(l9);

        JLabel l11 = new JLabel("Services Required");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100, 450, 200, 20);
        add(l11);

        checkBox1 = new JCheckBox("ATM Card");
        checkBox2 = new JCheckBox("Internet Banking");
        checkBox3 = new JCheckBox("Mobile Banking");
        checkBox4 = new JCheckBox("Email Alerts");
        checkBox5 = new JCheckBox("Cheque Book");
        checkBox6 = new JCheckBox("E-Statements");

        JCheckBox[] checkBoxes = {checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6};
        int x1 = 100, x2 = 350, yPos = 500;

        for (int i = 0; i < checkBoxes.length; i++) {
            checkBoxes[i].setFont(new Font("Raleway", Font.BOLD, 18));
            checkBoxes[i].setBounds(i % 2 == 0 ? x1 : x2, yPos, 200, 30);
            checkBoxes[i].setBackground(new Color(215, 252, 252));
            add(checkBoxes[i]);

            if (i % 2 == 1) { // Move to the next row after every second checkbox
                yPos += 50;
            }





//        int yPos = 500;
//        for (JCheckBox cb : checkBoxes) {
//            cb.setFont(new Font("Raleway", Font.BOLD, 18));
//            cb.setBounds(yPos % 2 == 0 ? 100 : 350, yPos, 200, 30);
//            cb.setBackground(new Color(215, 252, 252));
//            add(cb);
//            yPos += yPos % 2 == 0 ? 0 : 50;
        }

        NextButton11 = new JButton("Submit");
        NextButton12 = new JButton("Cancel");

        NextButton11.setBounds(250, 720, 100, 30);
        NextButton12.setBounds(420, 720, 100, 30);

        for (JButton btn : new JButton[]{NextButton11, NextButton12}) {
            btn.setBackground(Color.GREEN);
            btn.setForeground(Color.black);
            btn.setFont(new Font("Arial", Font.BOLD, 14));
            btn.addActionListener(this);
            add(btn);
        }

        getContentPane().setBackground(new Color(215, 252, 252));
        setSize(850, 800);
        setLayout(null);
        setLocation(400, 20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == NextButton11) {
                String account_type = "";
                if (radioButton1.isSelected()) account_type = "Saving Account";
                else if (radioButton2.isSelected()) account_type = "Fixed Deposit Account";
                else if (radioButton3.isSelected()) account_type = "Current Account";
                else if (radioButton4.isSelected()) account_type = "Recurring Deposit Account";

                if (account_type.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please select an account type.");
                    return;
                }

                Random random = new Random();
                String cardno = "" + Math.abs((random.nextLong() % 9000000000000000L) + 1000000000000000L);
                String pin = "" + Math.abs((random.nextInt(9000) + 1000));

                StringBuilder services = new StringBuilder();
                for (JCheckBox cb : new JCheckBox[]{checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6}) {
                    if (cb.isSelected()) {
                        services.append(cb.getText()).append(", ");
                    }
                }

                if (services.length() == 0) {
                    JOptionPane.showMessageDialog(null, "Please select at least one service.");
                    return;
                }

                // Fetching email address from the database using formno
                String clientEmail = "";
                Con c = new Con();
                String fetchEmailQuery = "SELECT Email_Address FROM signup WHERE Form_Number = '" + formno + "'";
                ResultSet rs = c.statement.executeQuery(fetchEmailQuery);
                if (rs.next()) {
                    clientEmail = rs.getString("Email_Address");
                }

                // Insert data into signup3 table
                String query = "INSERT INTO signup3 (Form_Number, Account_Type, Card_Number, PIN_Number, Services_Required) VALUES ('"
                        + formno + "', '" + account_type + "', '" + cardno + "', '" + pin + "', '" + services + "')";
                c.statement.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n PIN: " + pin);

                // Sending email after showing card number and pin
                sendEmail(clientEmail, cardno, pin);

                setVisible(false);
//                new Deposit(cardno).setVisible(true);
                new main_class(pin).setVisible(true);
            } else if (e.getSource() == NextButton12) {
                setVisible(false);
                new Login().setVisible(true);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void sendEmail(String toEmail, String cardNumber, String pin) {
        String fromEmail = "loveuvishwajeetkumar@gmail.com";  // Enter your email here
        String password = "mkbdvpixeeicueaq";   // Enter your email password here

        // Set up mail server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        // Get session object
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            // Create the message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject("Your Bank Account Details");
//            message.setText("Dear Customer,\n\n" +
//                    "Your account has been successfully created. Please find your account details below:\n\n" +
//                    "Card Number: " + cardNumber + "\n" +
//                    "PIN: " + pin + "\n\n" +
//                    "Thank you for banking with us.\n\n" +
//                    "Best Regards,\n" +
//                    "Virtual Bank ATM 🏦");


            String emailBody = "<html>" +
                    "<body>" +
                    "<p>Dear Valued Customer,</p>" +
                    "<p><strong>Congratulations!</strong> Your Virtual Bank account has been successfully created.</p>" +
                    "<p><strong>Your account details are as follows:</strong></p>" +
                    "<table border='1' cellpadding='5' cellspacing='0' style='border-collapse: collapse;'>" +
                    "<tr><td><strong>Card Number</strong></td><td>" + cardNumber + "</td></tr>" +
                    "<tr><td><strong>PIN (Keep it Secure)</strong></td><td>" + pin + "</td></tr>" +
                    "</table>" +
                    "<p><strong>Important Notice:</strong> Please reset your PIN immediately upon your first login to ensure your account's security.</p>" +
                    "<p><strong>Security Precautions:</strong></p>" +
                    "<ul>" +
                    "<li>Do not share your PIN with anyone. It is strictly confidential.</li>" +
                    "<li>Change your PIN immediately after logging in for the first time.</li>" +
                    "<li>For added security, use Virtual Bank's secure app or website for all transactions.</li>" +
                    "<li>If you suspect any suspicious activity or fraud, contact our support team immediately.</li>" +
                    "</ul>" +
                    "<p><strong>Fraud Warning:</strong></p>" +
                    "<p>Please be cautious of phishing attempts and fraudulent websites. Always ensure that you are accessing Virtual Bank's official website or app.</p>" +
                    "<p>Thank you for choosing Virtual Bank. We are excited to have you as a valued customer!</p>" +
                    "<p><strong>Best Regards,</strong><br>Virtual Bank Team</p>" +
                    "</body>" +
                    "</html>";

            // Set the email content type to HTML
            message.setContent(emailBody, "text/html");

            // Send the email
            Transport.send(message);

            System.out.println("Email sent successfully!");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup3("");
    }
}













//
//
//package bank.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.*;
//import java.util.Properties;
//import javax.mail.*;
//import javax.mail.internet.*;
//
//public class Signup3 extends JFrame implements ActionListener {
//    JRadioButton radioButton1, radioButton2, radioButton3, radioButton4;
//    JButton NextButton11, NextButton12;
//    JCheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6;
//    String formno;
//
//    Signup3(String formno) {
//        this.formno = formno;
//
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/bank1.png"));
//        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//        JLabel image = new JLabel(new ImageIcon(i2));
//        image.setBounds(150, 5, 100, 100);
//        add(image);
//
//        JLabel l1 = new JLabel("Page - 3");
//        l1.setFont(new Font("Raleway", Font.BOLD, 22));
//        l1.setBounds(280, 40, 400, 40);
//        add(l1);
//
//        JLabel l2 = new JLabel("Account Details");
//        l2.setFont(new Font("Raleway", Font.BOLD, 22));
//        l2.setBounds(280, 70, 400, 40);
//        add(l2);
//
//        JLabel l3 = new JLabel("Account Type");
//        l3.setFont(new Font("Raleway", Font.BOLD, 18));
//        l3.setBounds(100, 140, 300, 30);
//        add(l3);
//
//        radioButton1 = new JRadioButton("Saving Account");
//        radioButton2 = new JRadioButton("Fixed Deposit Account");
//        radioButton3 = new JRadioButton("Current Account");
//        radioButton4 = new JRadioButton("Recurring Deposit Account");
//
//        ButtonGroup buttonGroup = new ButtonGroup();
//        buttonGroup.add(radioButton1);
//        buttonGroup.add(radioButton2);
//        buttonGroup.add(radioButton3);
//        buttonGroup.add(radioButton4);
//
//        radioButton1.setBounds(100, 180, 150, 30);
//        radioButton2.setBounds(350, 180, 300, 30);
//        radioButton3.setBounds(100, 220, 250, 30);
//        radioButton4.setBounds(350, 220, 300, 30);
//
//        for (JRadioButton rb : new JRadioButton[]{radioButton1, radioButton2, radioButton3, radioButton4}) {
//            rb.setFont(new Font("Raleway", Font.ITALIC, 14));
//            rb.setBackground(new Color(215, 252, 252));
//            add(rb);
//        }
//
//        JLabel l4 = new JLabel("Card Number : ");
//        l4.setFont(new Font("Raleway", Font.BOLD, 18));
//        l4.setBounds(100, 300, 200, 30);
//        add(l4);
//
//        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4208");
//        l6.setFont(new Font("Raleway", Font.BOLD, 18));
//        l6.setBounds(330, 300, 290, 20);
//        add(l6);
//
//        JLabel l8 = new JLabel("PIN : ");
//        l8.setFont(new Font("Raleway", Font.BOLD, 18));
//        l8.setBounds(100, 370, 200, 20);
//        add(l8);
//
//        JLabel l9 = new JLabel("XXXX");
//        l9.setFont(new Font("Raleway", Font.BOLD, 18));
//        l9.setBounds(330, 370, 200, 20);
//        add(l9);
//
//        JLabel l11 = new JLabel("Services Required");
//        l11.setFont(new Font("Raleway", Font.BOLD, 18));
//        l11.setBounds(100, 450, 200, 20);
//        add(l11);
//
//        checkBox1 = new JCheckBox("ATM Card");
//        checkBox2 = new JCheckBox("Internet Banking");
//        checkBox3 = new JCheckBox("Mobile Banking");
//        checkBox4 = new JCheckBox("Email Alerts");
//        checkBox5 = new JCheckBox("Cheque Book");
//        checkBox6 = new JCheckBox("E-Statements");
//
//        JCheckBox[] checkBoxes = {checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6};
//        int yPos = 500;
//        for (JCheckBox cb : checkBoxes) {
//            cb.setFont(new Font("Raleway", Font.BOLD, 18));
//            cb.setBounds(yPos % 2 == 0 ? 100 : 350, yPos, 200, 30);
//            cb.setBackground(new Color(215, 252, 252));
//            add(cb);
//            yPos += yPos % 2 == 0 ? 0 : 50;
//        }
//
//        NextButton11 = new JButton("Submit");
//        NextButton12 = new JButton("Cancel");
//
//        NextButton11.setBounds(250, 720, 100, 30);
//        NextButton12.setBounds(420, 720, 100, 30);
//
//        for (JButton btn : new JButton[]{NextButton11, NextButton12}) {
//            btn.setBackground(Color.GREEN);
//            btn.setForeground(Color.black);
//            btn.setFont(new Font("Arial", Font.BOLD, 14));
//            btn.addActionListener(this);
//            add(btn);
//        }
//
//        getContentPane().setBackground(new Color(215, 252, 252));
//        setSize(850, 800);
//        setLayout(null);
//        setLocation(400, 20);
//        setVisible(true);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        try {
//            if (e.getSource() == NextButton11) {
//                String email = getEmailFromDatabase(formno); // Fetch email dynamically
//                String[] accountDetails = getAccountDetailsFromDatabase(formno); // Fetch card number and PIN
//
//                String cardno = accountDetails[0];
//                String pin = accountDetails[1];
//
//                sendEmail(email, cardno, pin);
//                JOptionPane.showMessageDialog(null, "Card details have been emailed.");
//                setVisible(false);
//                new Deposit(cardno).setVisible(true);
//            } else if (e.getSource() == NextButton12) {
//                setVisible(false);
//                new Login().setVisible(true);
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    private String getEmailFromDatabase(String formno) {
//        String email = "";
//        try {
//            Con conn = new Con();
//            String query = "SELECT Email_Address FROM signup WHERE Form_Number = ?";
//            PreparedStatement pstmt = conn.connection.prepareStatement(query);
//            pstmt.setString(1, formno);
//            ResultSet rs = pstmt.executeQuery();
//            if (rs.next()) {
//                email = rs.getString("Email_Address");
//            }
//            rs.close();
//            pstmt.close();
//            conn.connection.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return email;
//    }
//
//    private String[] getAccountDetailsFromDatabase(String formno) {
//        String[] accountDetails = new String[2];
//        try {
//            Con conn = new Con();
//            String query = "SELECT Card_Number, PIN_Number FROM SignUp3 WHERE Form_Number = ?";
//            PreparedStatement pstmt = conn.connection.prepareStatement(query);
//            pstmt.setString(1, formno);
//            ResultSet rs = pstmt.executeQuery();
//            if (rs.next()) {
//                accountDetails[0] = rs.getString("Card_Number");
//                accountDetails[1] = rs.getString("PIN_Number");
//            }
//            rs.close();
//            pstmt.close();
//            conn.connection.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return accountDetails;
//    }
//
//    private void sendEmail(String recipient, String cardno, String pin) {
//        final String senderEmail = "loveuvishwajeetkumar@gmail.com";
//        final String senderPassword = "mkbdvpixeeicueaq";
//
//        Properties props = new Properties();
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.port", "587");
//
//        Session session = Session.getInstance(props, new Authenticator() {
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(senderEmail, senderPassword);
//            }
//        });
//
//        try {
//            // Create a new MimeMessage object
//            Message message = new MimeMessage(session);
//
//            // Set the sender's email address
//            message.setFrom(new InternetAddress(senderEmail));
//
//            // Set the recipient's email address
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
//
//            // Set the subject of the email
//            message.setSubject("Your New Virtual Bank Account Details");
//
//            // Email body content with card number 💳 and PIN
//            String emailBody = "<html>" +
//                    "<body>" +
//                    "<p>Dear Valued Customer,</p>" +
//                    "<p><strong>Congratulations!</strong> Your Virtual Bank account has been successfully created.</p>" +
//                    "<p><strong>Your account details are as follows:</strong></p>" +
//                    "<table border='1' cellpadding='5' cellspacing='0' style='border-collapse: collapse;'>" +
//                    "<tr><td><strong>Card Number</strong></td><td>" + cardno + "</td></tr>" +
//                    "<tr><td><strong>PIN (Keep it Secure)</strong></td><td>" + pin + "</td></tr>" +
//                    "</table>" +
//                    "<p><strong>Important Notice:</strong> Please reset your PIN immediately upon your first login to ensure your account's security.</p>" +
//                    "<p><strong>Security Precautions:</strong></p>" +
//                    "<ul>" +
//                    "<li>Do not share your PIN with anyone. It is strictly confidential.</li>" +
//                    "<li>Change your PIN immediately after logging in for the first time.</li>" +
//                    "<li>For added security, use Virtual Bank's secure app or website for all transactions.</li>" +
//                    "<li>If you suspect any suspicious activity or fraud, contact our support team immediately.</li>" +
//                    "</ul>" +
//                    "<p><strong>Fraud Warning:</strong></p>" +
//                    "<p>Please be cautious of phishing attempts and fraudulent websites. Always ensure that you are accessing Virtual Bank's official website or app.</p>" +
//                    "<p>Thank you for choosing Virtual Bank. We are excited to have you as a valued customer!</p>" +
//                    "<p><strong>Best Regards,</strong><br>Virtual Bank Team</p>" +
//                    "</body>" +
//                    "</html>";
//
//            // Set the email content type to HTML
//            message.setContent(emailBody, "text/html");
//
//            // Send the email
//            Transport.send(message);

//            System.out.println("Email sent successfully!");
//
//        } catch (Exception ex) {
//            // Handle any exceptions
//            ex.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        new Signup3("");
//    }
//}
















//
//package bank.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Random;
//
//public class Signup3 extends JFrame implements ActionListener {
//    JRadioButton radioButton1, radioButton2, radioButton3, radioButton4;
//    JButton NextButton11, NextButton12;
//    JCheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6;
//    String formno;
//
//    Signup3(String formno) {
//        this.formno = formno;
//
//        // Bank Logo
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/bank1.png"));
//        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//        JLabel image = new JLabel(new ImageIcon(i2));
//        image.setBounds(150, 5, 100, 100);
//        add(image);
//
//        JLabel l1 = new JLabel("Page - 3");
//        l1.setFont(new Font("Raleway", Font.BOLD, 22));
//        l1.setBounds(280, 40, 400, 40);
//        add(l1);
//
//        JLabel l2 = new JLabel("Account Details");
//        l2.setFont(new Font("Raleway", Font.BOLD, 22));
//        l2.setBounds(280, 70, 400, 40);
//        add(l2);
//
//        // Account Type Selection
//        JLabel l3 = new JLabel("Account Type");
//        l3.setFont(new Font("Raleway", Font.BOLD, 18));
//        l3.setBounds(100, 140, 300, 30);
//        add(l3);
//
//        radioButton1 = new JRadioButton("Saving Account");
//        radioButton2 = new JRadioButton("Fixed Deposit Account");
//        radioButton3 = new JRadioButton("Current Account");
//        radioButton4 = new JRadioButton("Recurring Deposit Account");
//
//        ButtonGroup buttonGroup = new ButtonGroup();
//        buttonGroup.add(radioButton1);
//        buttonGroup.add(radioButton2);
//        buttonGroup.add(radioButton3);
//        buttonGroup.add(radioButton4);
//
//        radioButton1.setBounds(100, 180, 150, 30);
//        radioButton2.setBounds(350, 180, 250, 30);
//        radioButton3.setBounds(100, 220, 200, 30);
//        radioButton4.setBounds(350, 220, 250, 30);
//
//        add(radioButton1);
//        add(radioButton2);
//        add(radioButton3);
//        add(radioButton4);
//
//        // Card Number and PIN
//        JLabel l4 = new JLabel("Card Number: ");
//        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4208");
//        JLabel l8 = new JLabel("PIN: ");
//        JLabel l9 = new JLabel("XXXX");
//
//        l4.setFont(new Font("Raleway", Font.BOLD, 18));
//        l6.setFont(new Font("Raleway", Font.BOLD, 18));
//        l8.setFont(new Font("Raleway", Font.BOLD, 18));
//        l9.setFont(new Font("Raleway", Font.BOLD, 18));
//
//        l4.setBounds(100, 300, 200, 30);
//        l6.setBounds(330, 300, 290, 20);
//        l8.setBounds(100, 370, 200, 20);
//        l9.setBounds(330, 370, 200, 20);
//
//        add(l4);
//        add(l6);
//        add(l8);
//        add(l9);
//
//        // Services Required
//        JLabel l11 = new JLabel("Services Required");
//        l11.setFont(new Font("Raleway", Font.BOLD, 18));
//        l11.setBounds(100, 450, 200, 20);
//        add(l11);
//
//        checkBox1 = new JCheckBox("ATM Card");
//        checkBox2 = new JCheckBox("Internet Banking");
//        checkBox3 = new JCheckBox("Mobile Banking");
//        checkBox4 = new JCheckBox("Email Alerts");
//        checkBox5 = new JCheckBox("Cheque Book");
//        checkBox6 = new JCheckBox("E-Statements");
//
//        checkBox1.setBounds(100, 500, 200, 30);
//        checkBox2.setBounds(350, 500, 200, 30);
//        checkBox3.setBounds(100, 550, 200, 30);
//        checkBox4.setBounds(350, 550, 200, 30);
//        checkBox5.setBounds(100, 600, 200, 30);
//        checkBox6.setBounds(350, 600, 200, 30);
//
//        add(checkBox1);
//        add(checkBox2);
//        add(checkBox3);
//        add(checkBox4);
//        add(checkBox5);
//        add(checkBox6);
//
//        // Buttons
//        NextButton11 = new JButton("Submit");
//        NextButton12 = new JButton("Cancel");
//
//        NextButton11.setBounds(250, 720, 100, 30);
//        NextButton12.setBounds(420, 720, 100, 30);
//
//        NextButton11.addActionListener(this);
//        NextButton12.addActionListener(this);
//
//        add(NextButton11);
//        add(NextButton12);
//
//        getContentPane().setBackground(new Color(215, 252, 252));
//        setSize(850, 800);
//        setLayout(null);
//        setLocation(400, 20);
//        setVisible(true);
//    }
//
//    public void actionPerformed(ActionEvent e) {
//        try {
//            if (e.getSource() == NextButton11) {
//                // Account Type Selection
//                String account_type = "";
//                if (radioButton1.isSelected()) account_type = "Saving Account";
//                if (radioButton2.isSelected()) account_type = "Fixed Deposit Account";
//                if (radioButton3.isSelected()) account_type = "Current Account";
//                if (radioButton4.isSelected()) account_type = "Recurring Deposit Account";
//
//                // Generating Random Card Number and PIN
//                Random random = new Random();
//                String cardno = "" + Math.abs(random.nextLong() % 9000000000000000L + 1000000000000000L);
//                String pin = "" + Math.abs(random.nextInt(9000) + 1000);
//
//                // Services Required
//                StringBuilder services = new StringBuilder();
//                if (checkBox1.isSelected()) services.append(" ATM Card");
//                if (checkBox2.isSelected()) services.append(" Internet Banking");
//                if (checkBox3.isSelected()) services.append(" Mobile Banking");
//                if (checkBox4.isSelected()) services.append(" Email Alerts");
//                if (checkBox5.isSelected()) services.append(" Cheque Book");
//                if (checkBox6.isSelected()) services.append(" E-Statements");
//
//                // Database Connectivity (Pseudo-code)
//                // String query = "INSERT INTO account_details (form_no, account_type, card_number, pin, services) VALUES ('" + formno + "','" + account_type + "','" + cardno + "','" + pin + "','" + services.toString() + "')";
//                // Database.executeUpdate(query);
//
//                JOptionPane.showMessageDialog(null, "Account Created Successfully!\nCard No: " + cardno + "\nPIN: " + pin);
//            } else if (e.getSource() == NextButton12) {
//                setVisible(false);
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        new Signup3("");
//    }
//}








//package bank.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Properties;
//import java.util.Random;
//import javax.mail.*;
//import javax.mail.internet.*;
//
//public class Signup3 extends JFrame implements ActionListener {
//    JRadioButton radioButton1, radioButton2, radioButton3, radioButton4;
//    JButton NextButton11, NextButton12;
//    JCheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6;
//    String formno;
//
//    Signup3(String formno) {
//        this.formno = formno;
//
//        // Bank Logo
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/bank1.png"));
//        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//        JLabel image = new JLabel(new ImageIcon(i2));
//        image.setBounds(150, 5, 100, 100);
//        add(image);
//
//        JLabel l1 = new JLabel("Page - 3");
//        l1.setFont(new Font("Raleway", Font.BOLD, 22));
//        l1.setBounds(280, 40, 400, 40);
//        add(l1);
//
//        JLabel l2 = new JLabel("Account Details");
//        l2.setFont(new Font("Raleway", Font.BOLD, 22));
//        l2.setBounds(280, 70, 400, 40);
//        add(l2);
//
//        // Account Type Selection
//        JLabel l3 = new JLabel("Account Type");
//        l3.setFont(new Font("Raleway", Font.BOLD, 18));
//        l3.setBounds(100, 140, 300, 30);
//        add(l3);
//
//        radioButton1 = new JRadioButton("Saving Account");
//        radioButton2 = new JRadioButton("Fixed Deposit Account");
//        radioButton3 = new JRadioButton("Current Account");
//        radioButton4 = new JRadioButton("Recurring Deposit Account");
//
//        ButtonGroup buttonGroup = new ButtonGroup();
//        buttonGroup.add(radioButton1);
//        buttonGroup.add(radioButton2);
//        buttonGroup.add(radioButton3);
//        buttonGroup.add(radioButton4);
//
//        radioButton1.setBounds(100, 180, 150, 30);
//        radioButton2.setBounds(350, 180, 250, 30);
//        radioButton3.setBounds(100, 220, 200, 30);
//        radioButton4.setBounds(350, 220, 250, 30);
//
//        add(radioButton1);
//        add(radioButton2);
//        add(radioButton3);
//        add(radioButton4);
//
//        // Buttons
//        NextButton11 = new JButton("Submit");
//        NextButton12 = new JButton("Cancel");
//
//        NextButton11.setBounds(250, 720, 100, 30);
//        NextButton12.setBounds(420, 720, 100, 30);
//
//        NextButton11.addActionListener(this);
//        NextButton12.addActionListener(this);
//
//        add(NextButton11);
//        add(NextButton12);
//
//        getContentPane().setBackground(new Color(215, 252, 252));
//        setSize(850, 800);
//        setLayout(null);
//        setLocation(400, 20);
//        setVisible(true);
//    }
//
//    public void actionPerformed(ActionEvent e) {
//        try {
//            if (e.getSource() == NextButton11) {
//                // Account Type Selection
//                String account_type = "";
//                if (radioButton1.isSelected()) account_type = "Saving Account";
//                if (radioButton2.isSelected()) account_type = "Fixed Deposit Account";
//                if (radioButton3.isSelected()) account_type = "Current Account";
//                if (radioButton4.isSelected()) account_type = "Recurring Deposit Account";
//
//                // Generating Random Card Number and PIN
//                Random random = new Random();
//                String cardno = "" + Math.abs(random.nextLong() % 9000000000000000L + 1000000000000000L);
//                String pin = "" + Math.abs(random.nextInt(9000) + 1000);
//
//                // Sending Email to User
//                String recipientEmail = JOptionPane.showInputDialog("Enter your Email for account details:");
//                if (recipientEmail != null && !recipientEmail.trim().isEmpty()) {
////                    sendEmail(recipientEmail, cardno, pin);
//                    sendEmail(recipientEmail, cardno, pin, account_type);
//
//                    JOptionPane.showMessageDialog(null, "Account Created Successfully!\nCard No: " + cardno + "\nPIN: " + pin + "\nDetails have been sent to your email.");
//                } else {
//                    JOptionPane.showMessageDialog(null, "Invalid email! Account Created but email not sent.");
//                }
//            } else if (e.getSource() == NextButton12) {
//                setVisible(false);
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    private void sendEmail(String recipientEmail, String cardno, String pin, String account_type) {
//        final String senderEmail = "loveuvishwajeetkumar@gmail.com";  // 🔴 Your Gmail
//        final String senderPassword = "mkbdvpixeeicueaq";  // 🔴 Your Google App Password
//
//        // SMTP Configuration
//        Properties props = new Properties();
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.port", "587");
//
//        // Create session
//        Session session = Session.getInstance(props, new Authenticator() {
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(senderEmail, senderPassword);
//            }
//        });
//
//        try {
//            // Create Email
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(senderEmail));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
//            message.setSubject("Welcome to Virtual Bank – Your Account Details");
//
//            // Email Body with HTML Formatting
//            String emailContent = "<html>"
//                    + "<body>"
//                    + "<h2>Welcome to Virtual Bank!</h2>"
//                    + "<p>Dear Customer,</p>"
//                    + "<p>We are pleased to inform you that your bank account has been successfully created.</p>"
//                    + "<h3>Your Account Details:</h3>"
//                    + "<ul>"
//                    + "<li><strong>Account Type:</strong> " + accountType + "</li>"
//                    + "<li><strong>Card Number:</strong> " + cardno + "</li>"
//                    + "<li><strong>PIN:</strong> " + pin + " (Keep this confidential)</li>"
//                    + "</ul>"
//                    + "<h3>Important Security Guidelines:</h3>"
//                    + "<ul>"
//                    + "<li>Do not share your Card Number, PIN, or any banking credentials with anyone.</li>"
//                    + "<li>Always use Virtual Bank’s official channels for transactions and inquiries.</li>"
//                    + "<li>If you notice any suspicious activity, contact our support team immediately.</li>"
//                    + "</ul>"
//                    + "<h3>Next Steps to Get Started:</h3>"
//                    + "<ul>"
//                    + "<li><strong>Activate Your Account:</strong> Log in using your credentials and explore our banking services.</li>"
//                    + "<li><strong>Set Up Internet & Mobile Banking:</strong> Enable seamless transactions from anywhere.</li>"
//                    + "<li><strong>Stay Secure:</strong> Update your PIN regularly and enable multi-factor authentication.</li>"
//                    + "</ul>"
//                    + "<p>If you have any queries or require assistance, feel free to contact our 24/7 customer support.</p>"
//                    + "<p>📞 <strong>Customer Support:</strong> [Bank Helpline Number]</p>"
//                    + "<p>📧 <strong>Email Support:</strong> [Bank Support Email]</p>"
//                    + "<p>🌐 <strong>Online Banking:</strong> [Bank Website URL]</p>"
//                    + "<br>"
//                    + "<p>Thank you for choosing <strong>Virtual Bank</strong>. We look forward to serving you.</p>"
//                    + "<br>"
//                    + "<p><strong>Best Regards,</strong><br>Virtual Bank Team</p>"
//                    + "</body></html>";
//
//            message.setContent(emailContent, "text/html");
//
//            // Send Email
//            Transport.send(message);
//            System.out.println("Email sent successfully to " + recipientEmail);
//        } catch (MessagingException e) {
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Failed to send email. Please check your internet connection and try again.");
//        }
//    }
//
//
//    public static void main(String[] args) {
//        new Signup3("");
//    }
//}








//package bank.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Properties;
//import java.util.Random;
//import javax.mail.*;
//import javax.mail.internet.*;
//
//public class Signup3 extends JFrame implements ActionListener {
//    JRadioButton radioButton1, radioButton2, radioButton3, radioButton4;
//    JButton NextButton11, NextButton12;
//    JCheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6;
//    String formno;
//
//    Signup3(String formno) {
//        this.formno = formno;
//
//        // Bank Logo
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/bank1.png"));
//        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//        JLabel image = new JLabel(new ImageIcon(i2));
//        image.setBounds(150, 5, 100, 100);
//        add(image);
//
//        JLabel l1 = new JLabel("Page - 3");
//        l1.setFont(new Font("Raleway", Font.BOLD, 22));
//        l1.setBounds(280, 40, 400, 40);
//        add(l1);
//
//        JLabel l2 = new JLabel("Account Details");
//        l2.setFont(new Font("Raleway", Font.BOLD, 22));
//        l2.setBounds(280, 70, 400, 40);
//        add(l2);
//
//        // Account Type Selection
//        JLabel l3 = new JLabel("Account Type");
//        l3.setFont(new Font("Raleway", Font.BOLD, 18));
//        l3.setBounds(100, 140, 300, 30);
//        add(l3);
//
//        radioButton1 = new JRadioButton("Saving Account");
//        radioButton2 = new JRadioButton("Fixed Deposit Account");
//        radioButton3 = new JRadioButton("Current Account");
//        radioButton4 = new JRadioButton("Recurring Deposit Account");
//
//        ButtonGroup buttonGroup = new ButtonGroup();
//        buttonGroup.add(radioButton1);
//        buttonGroup.add(radioButton2);
//        buttonGroup.add(radioButton3);
//        buttonGroup.add(radioButton4);
//
//        radioButton1.setBounds(100, 180, 150, 30);
//        radioButton2.setBounds(350, 180, 250, 30);
//        radioButton3.setBounds(100, 220, 200, 30);
//        radioButton4.setBounds(350, 220, 250, 30);
//
//        add(radioButton1);
//        add(radioButton2);
//        add(radioButton3);
//        add(radioButton4);
//
//        // Buttons
//        NextButton11 = new JButton("Submit");
//        NextButton12 = new JButton("Cancel");
//
//        NextButton11.setBounds(250, 720, 100, 30);
//        NextButton12.setBounds(420, 720, 100, 30);
//
//        NextButton11.addActionListener(this);
//        NextButton12.addActionListener(this);
//
//        add(NextButton11);
//        add(NextButton12);
//
//        getContentPane().setBackground(new Color(215, 252, 252));
//        setSize(850, 800);
//        setLayout(null);
//        setLocation(400, 20);
//        setVisible(true);
//    }
//
//    public void actionPerformed(ActionEvent e) {
//        try {
//            if (e.getSource() == NextButton11) {
//                // Account Type Selection
//                String accountType = "";
//                if (radioButton1.isSelected()) accountType = "Saving Account";
//                if (radioButton2.isSelected()) accountType = "Fixed Deposit Account";
//                if (radioButton3.isSelected()) accountType = "Current Account";
//                if (radioButton4.isSelected()) accountType = "Recurring Deposit Account";
//
//                // Generating Random Card Number and PIN
//                Random random = new Random();
//                String cardno = "" + Math.abs(random.nextLong() % 9000000000000000L + 1000000000000000L);
//                String pin = "" + Math.abs(random.nextInt(9000) + 1000);
//
//                // Getting user email
//                String recipientEmail = JOptionPane.showInputDialog("Enter your Email for account details:");
//                if (recipientEmail != null && !recipientEmail.trim().isEmpty()) {
//                    sendEmail(recipientEmail, cardno, pin, accountType);
//                    JOptionPane.showMessageDialog(null, "Account Created Successfully!\nCard No: " + cardno + "\nPIN: " + pin + "\nDetails have been sent to your email.");
//                } else {
//                    JOptionPane.showMessageDialog(null, "Invalid email! Account Created but email not sent.");
//                }
//            } else if (e.getSource() == NextButton12) {
//                setVisible(false);
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    private void sendEmail(String recipientEmail, String cardno, String pin, String accountType) {
//        final String senderEmail = "loveuvishwajeetkumar@gmail.com";  // 🔴 Replace with your Gmail
//        final String senderPassword = "mkbdvpixeeicueaq";  // 🔴 Replace with your **Google App Password**
//
//        // SMTP Configuration
//        Properties props = new Properties();
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.port", "587");
//
//        // Create session
//        Session session = Session.getInstance(props, new Authenticator() {
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(senderEmail, senderPassword);
//            }
//        });
//
//        try {
//            // Create Email
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(senderEmail));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
//            message.setSubject("Welcome to Virtual Bank - Your Account Details");
//
//            // Professional Email Body
//            String emailContent = "Dear Valued Customer,\n\n"
//                    + "Congratulations! Your Virtual Bank account has been successfully created.\n\n"
//                    + "Here are your account details:\n"
//                    + "------------------------------------------------------\n"
//                    + "🔹 **Account Type:** " + accountType + "\n"
//                    + "🔹 **Card Number:** " + cardno + "\n"
//                    + "🔹 **PIN (Keep it Secret):** " + pin + "\n"
//                    + "------------------------------------------------------\n\n"
//                    + "🔒 **Security Tips:**\n"
//                    + "1️⃣ Do not share your PIN with anyone.\n"
//                    + "2️⃣ Change your PIN immediately after first login.\n"
//                    + "3️⃣ Use Virtual Bank’s secure app or website for transactions.\n\n"
//                    + "Thank you for choosing Virtual Bank. We are excited to have you on board!\n\n"
//                    + "**Best Regards,**\n"
//                    + "Virtual Bank Team";
//
//            message.setText(emailContent);
//
//            // Send Email
//            Transport.send(message);
//            System.out.println("Email sent successfully to " + recipientEmail);
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        new Signup3("");
//    }
//}
