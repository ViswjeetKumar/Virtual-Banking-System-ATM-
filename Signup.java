package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JButton NextButton;
    JRadioButton radioButton1, radioButton2 ,radioButton3 , radioButton4, radioButton5;
    JDateChooser dateChooser;
    JTextField textName, textFname ,textEmail, textMs ,textAdd,textCity,textPin,textState;
    Random random = new Random();
    Long first4 = (random.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);
    Signup(){
        super(" APPLICATION FORM ");
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("Icons/bank1.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel jLabel1 = new JLabel("APPLICATION FORM NUMBER :" + first);
        jLabel1.setFont(new Font("Ralway",Font.BOLD,33));
        jLabel1.setBounds(160,20,600,40);
        add(jLabel1);

        JLabel jLabel2 = new JLabel("Page - 1");
        jLabel2.setFont(new Font("Ralway",Font.BOLD,22));
        jLabel2.setBounds(352,70,600,30);
        add(jLabel2);

        JLabel jLabel3 = new JLabel("Personal Details");
        jLabel3.setFont(new Font("Raleway", Font.BOLD,22));
        jLabel3.setBounds(310,99,600,30);
        add(jLabel3);

        JLabel jLabelName = new JLabel("Name : ");
        jLabelName.setFont(new Font("Raleway", Font.BOLD,20));
        jLabelName.setBounds(100,190,100,30);
        add(jLabelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD,15));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel jLabelFName = new JLabel("Father's Name : ");
        jLabelFName.setFont(new Font("Raleway", Font.BOLD,20));
        jLabelFName.setBounds(100,240,160,30);
        add(jLabelFName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway", Font.BOLD,15));
        textFname.setBounds(300,240,400,30);
        add(textFname);

        JLabel DOB = new JLabel("Date Of Birth : ");
        DOB.setFont(new Font("Raleway", Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
//        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBackground(new Color(241, 191, 232));
        dateChooser.setFont(new Font("Raleway",Font.BOLD,15));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel jLabelGender = new JLabel("Gender : ");
        jLabelGender.setFont(new Font("Raleway",Font.BOLD,20));
        jLabelGender.setBounds(100,290,200,30);
        add(jLabelGender);

        radioButton1 = new JRadioButton("Male ");
        radioButton1.setFont(new Font("Raleway",Font.ITALIC,15));
        radioButton1.setBackground(new Color(241, 191, 232));
        radioButton1.setForeground(Color.BLACK);
        radioButton1.setBounds(300,290,90,30);
        add(radioButton1);


        radioButton2 = new JRadioButton("female ");
        radioButton2.setFont(new Font("Raleway",Font.ITALIC,15));
        radioButton2.setBounds(450,290,90,30);
        radioButton2.setBackground(new Color(241, 191, 232));
        radioButton2.setForeground(Color.BLACK);
        add(radioButton2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        JLabel labelEmail = new JLabel("Email : ");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD,15));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status : ");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);

        radioButton3 = new JRadioButton("Married ");
        radioButton3.setFont(new Font("Raleway", Font.ITALIC, 15));
        radioButton3.setBackground(new Color(241, 191, 232));
        radioButton3.setForeground(Color.BLACK);
        radioButton3.setBounds(300, 440, 100, 30);
        add(radioButton3);

        radioButton4 = new JRadioButton("Unmarried ");
        radioButton4.setFont(new Font("Raleway", Font.ITALIC, 15));
        radioButton4.setBackground(new Color(241, 191, 232));
        radioButton4.setForeground(Color.BLACK);
        radioButton4.setBounds(450, 440, 120, 30); // Slightly adjusted width for clarity
        add(radioButton4);

        radioButton5 = new JRadioButton("Others ");
        radioButton5.setFont(new Font("Raleway", Font.ITALIC, 15));
        radioButton5.setBackground(new Color(241, 191, 232));
        radioButton5.setForeground(Color.BLACK);
        radioButton5.setBounds(610, 440, 100, 30);
        add(radioButton5);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioButton3);
        buttonGroup1.add(radioButton4);
        buttonGroup1.add(radioButton5);

//        textMs = new JTextField();
//        textMs.setFont(new Font("Raleway", Font.BOLD,15));
//        textMs.setBounds(300,440,400,30);
//        add(textMs);

        JLabel labelAdd = new JLabel("Address : ");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD,15));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

        JLabel labelCity = new JLabel("City : ");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD,15));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        JLabel labelPin = new JLabel("PIN Code : ");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setBounds(100,590,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway", Font.BOLD,15));
        textPin.setBounds(300,590,400,30);
        add(textPin);

        JLabel labelState = new JLabel("State : ");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD,15));
        textState.setBounds(300,640,400,30);
        add(textState);

        NextButton = new JButton(" Next > ");
        NextButton.setBackground(Color.GREEN);
        NextButton.setForeground(Color.black);
        NextButton.setFont(new Font("Arial",Font.BOLD,14));
        NextButton.setBounds(620,710,90,30);
        NextButton.addActionListener(this);
        add(NextButton);

        getContentPane().setBackground(new Color(241, 191, 232));
        setLocation(360,40);
        setSize(850,830);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Signup();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String form_number = first;
            String name = textName.getText();
            String Father_name = textFname.getText();
            String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
            String gender = null;
            if (radioButton1.isSelected()){
                gender = "Male";
            } else if (radioButton2.isSelected()) {
                gender = "Female";
            }
            String email = textEmail.getText();
            String marital = null;
            if (radioButton3.isSelected()){
                marital = "Married";
            } else if (radioButton4.isSelected()) {
                marital = "Unmarried";
            } else if (radioButton5.isSelected()) {
                marital = "Others";
            }
            String address = textAdd.getText();
            String city = textCity.getText();
            String pincode = textPin.getText();
            String state = textState.getText();


            try {

                //start
                if (name.equals("") || Father_name.equals("") || dob.equals("") || email.equals("") || address.equals("") || city.equals("") || pincode.equals("") || state.equals("")) {
                    JOptionPane.showMessageDialog(null, "All fields are required!");
                }

                //end

                else {
                    if (!pincode.matches("\\d{6}")) {  // Ensures pin is exactly 6 digits
                        JOptionPane.showMessageDialog(null, "PIN code must be exactly 6 digits and numeric!");
                        return;  // Stops execution if PIN is invalid
                    }
                    Con connection1 = new Con();
                    String q = "insert into SignUp values('"+form_number+"' , '"+name+"' , '"+Father_name+"' , '"+dob+"' ,'"+gender+"' , '"+email+"' , '"+marital+"' , '"+address+"' ,  '"+city+"' , '"+pincode+"' , '"+state+"')";
                    connection1.statement.executeUpdate(q);
                    new Signup2(form_number);
                    setVisible(false);
                }

            }catch (Exception E){
                E.printStackTrace();
            }


        }catch (Exception E){
            E.printStackTrace();
        }
    }
}
