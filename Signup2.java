package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class Signup2 extends JFrame implements ActionListener {
    String formno;
    JTextField textPan,textAad;
    JButton NextButton11;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JRadioButton radioButton1,radioButton2,radioButton3,radioButton4;
Signup2(String formno){
    super(" APPLICATION FORM ");
    ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("Icons/bank1.png"));
    Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(150,5,100,100);
    add(image);
    this.formno = formno;

    JLabel l1 = new JLabel("Page - 2");
    l1.setFont(new Font("Raleway",Font.BOLD, 22));
    l1.setBounds(300,30,600,40);
    add(l1);

    JLabel l2 = new JLabel("Additional Details");
    l2.setFont(new Font("Raleway",Font.BOLD, 22));
    l2.setBounds(300,60,600,40);
    add(l2);

    JLabel l3 = new JLabel("Religion : ");
    l3.setFont(new Font("Raleway",Font.BOLD, 22));
    l3.setBounds(100,120,150,30);
    add(l3);

    String religion[] ={"Hindu","Muslim","Sikh","christian","Other"};
    comboBox = new JComboBox<>(religion);
    comboBox.setBackground(new Color(252,208,76));
    comboBox.setFont(new Font("Raleway",Font.BOLD,14));
    comboBox.setBounds(350,120,320,30);
    add(comboBox);

    JLabel l4 = new JLabel("Category : ");
    l4.setFont(new Font("Raleway",Font.BOLD, 22));
    l4.setBounds(100,170,150,30);
    add(l4);

    String Category[] ={"General","OBC","SC","ST","Other"};
    comboBox2 = new JComboBox<>(Category);
    comboBox2.setBackground(new Color(252,208,76));
    comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
    comboBox2.setBounds(350,170,320,30);
    add(comboBox2);

    JLabel l5 = new JLabel("Income : ");
    l5.setFont(new Font("Raleway",Font.BOLD, 22));
    l5.setBounds(100,220,150,30);
    add(l5);

    String Income[] ={"NULL","5k To 1L","1L To 3L","3L To 5L","5L To 10L","10L To 20L","Above 20L"};
    comboBox3 = new JComboBox<>(Income);
    comboBox3.setBackground(new Color(252,208,76));
    comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
    comboBox3.setBounds(350,220,320,30);
    add(comboBox3);

    JLabel l6 = new JLabel("Educational : ");
    l6.setFont(new Font("Raleway",Font.BOLD, 22));
    l6.setBounds(100,270,150,30);
    add(l6);

    String Education[] ={"Non Graduate","Graduate In Bsc-IT","Graduate In BCA","Graduate In B-COM","MSC","Doctrate","Others"};
    comboBox4 = new JComboBox<>(Education);
    comboBox4.setBackground(new Color(252,208,76));
    comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
    comboBox4.setBounds(350,270,320,30);
    add(comboBox4);

    JLabel l7 = new JLabel("Occupation : ");
    l7.setFont(new Font("Raleway",Font.BOLD, 22));
    l7.setBounds(100,340,150,30);
    add(l7);

    String Occupation[] ={"Salaried","Self Employed","Business","Student","Retired","Others"};
    comboBox5 = new JComboBox<>(Occupation);
    comboBox5.setBackground(new Color(252,208,76));
    comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
    comboBox5.setBounds(350,340,320,30);
    add(comboBox5);

    JLabel l8 = new JLabel("PAN Number : ");
    l8.setFont(new Font("Raleway",Font.BOLD, 22));
    l8.setBounds(100,390,180,30);
    add(l8);

    textPan = new JTextField();
    textPan.setFont(new Font("Raleway",Font.BOLD,18));
    textPan.setBounds(350,390,320,30);
    textPan.setBackground(new Color(213, 199, 161));
    add(textPan);

    JLabel l9 = new JLabel("Aadhar Number : ");
    l9.setFont(new Font("Raleway",Font.BOLD, 22));
    l9.setBounds(100,440,199,30);
    add(l9);

    textAad = new JTextField();
    textAad.setFont(new Font("Raleway",Font.BOLD,18));
    textAad.setBounds(350,440,320,30);
    textAad.setBackground(new Color(213, 199, 161));
    add(textAad);

    JLabel l10 = new JLabel("Senior Citizen : ");
    l10.setFont(new Font("Raleway",Font.BOLD, 22));
    l10.setBounds(100,490,199,30);
    add(l10);
    radioButton1 = new JRadioButton("Yes, I Am.");
    radioButton1.setFont(new Font("Raleway",Font.ITALIC,14));
    radioButton1.setBounds(350,490,100,30);
    radioButton1.setBackground(new Color(252,208,76));
    add(radioButton1);

    radioButton2 = new JRadioButton("No, I Am Not.");
    radioButton2.setFont(new Font("Raleway",Font.ITALIC,14));
    radioButton2.setBounds(540,490,150,30);
    radioButton2.setBackground(new Color(252,208,76));
    add(radioButton2);

    ButtonGroup buttonGroup = new ButtonGroup();
    buttonGroup.add(radioButton1);
    buttonGroup.add(radioButton2);

    JLabel l11 = new JLabel("Existing Account : ");
    l11.setFont(new Font("Raleway",Font.BOLD, 22));
    l11.setBounds(100,540,230,30);
    add(l11);
    radioButton3 = new JRadioButton("Yes");
    radioButton3.setFont(new Font("Raleway",Font.ITALIC,14));
    radioButton3.setBounds(350,540,100,30);
    radioButton3.setBackground(new Color(252,208,76));
    add(radioButton3);

    radioButton4 = new JRadioButton("No");
    radioButton4.setFont(new Font("Raleway",Font.ITALIC,14));
    radioButton4.setBounds(540,540,150,30);
    radioButton4.setBackground(new Color(252,208,76));
    add(radioButton4);

    ButtonGroup buttonGroup1 = new ButtonGroup();
    buttonGroup1.add(radioButton3);
    buttonGroup1.add(radioButton4);

    JLabel l12 = new JLabel("Form Number : ");
    l12.setFont(new Font("Raleway",Font.BOLD, 20));
    l12.setBounds(600,10,150,30);
    add(l12);

    JLabel l13 = new JLabel(formno);
//    JLabel l13 = new JLabel("1298");
    l13.setFont(new Font("Raleway",Font.BOLD, 20));
    l13.setBounds(750,10,70,30);
    add(l13);

    NextButton11 = new JButton(" Next > ");
    NextButton11.setBackground(Color.GREEN);
    NextButton11.setForeground(Color.black);
    NextButton11.setFont(new Font("Arial",Font.BOLD,14));
    NextButton11.setBounds(570,640,100,30);
    NextButton11.addActionListener(this);
    add(NextButton11);

    setLocation(450,80);
    setLayout(null);
    setVisible(true);
    setSize(850,750);
    getContentPane().setBackground(new Color(252,208,76));
}

    public static void main(String[] args) {
        new Signup2("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String Religion = (String) comboBox.getSelectedItem();
            String category = (String) comboBox2.getSelectedItem();
            String income = (String) comboBox.getSelectedItem();
            String education = (String) comboBox4.getSelectedItem();
            String occupation = (String) comboBox5.getSelectedItem();
            String pan = textPan.getText().trim();
            String aadhar = textAad.getText().trim();
            String citizen = "";
            if (radioButton1.isSelected()){
                citizen = " Yes ";
            } else if (radioButton2.isSelected()) {
                citizen=" No ";
            }
            String existing_account = "";
            if (radioButton3.isSelected()){
                existing_account = " Yes ";
            } else if (radioButton4.isSelected()) {
                existing_account=" No ";
            }
            try {

                if (!pan.matches("\\d{10}")) {
                    JOptionPane.showMessageDialog(null, "Invalid PAN! Must be exactly 10 digits.");
                }
                 else if (!aadhar.matches("\\d{16}")) {  // Ensures pin is exactly 16 digits
                    JOptionPane.showMessageDialog(null, "Invalid Aadhaar!! \nMust be exactly 16 digits.");
                    return;  // Stops execution if PIN is invalid
                }

//                if (textAad.getText().equals("") || textAad.getText().equals("")){
//                    JOptionPane.showMessageDialog(null, "Please Enter All The Fields!!");
//                }
                else{
                    Con c1 = new Con();
                    String q = "insert into SignUp2 values ('"+formno+"','"+Religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+citizen+"','"+existing_account+"')";
                    c1.statement.executeUpdate(q);
                    new Signup3(formno);
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
