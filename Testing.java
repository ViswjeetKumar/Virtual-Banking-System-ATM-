import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Testing extends JFrame implements ActionListener {
    JTextField textPin;
    JButton NextButton;

    public Testing() {
        setLayout(null);

        JLabel labelPin = new JLabel("Enter 6-digit PIN:");
        labelPin.setBounds(100, 150, 200, 30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setBounds(300, 150, 150, 30);
        add(textPin);

        NextButton = new JButton("Next");
        NextButton.setBounds(200, 250, 100, 30);
        NextButton.addActionListener(this);
        add(NextButton);

        setSize(600, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == NextButton) {
            String pin = textPin.getText().trim();

            // PIN Validation: Must be exactly 6 digits and numeric
            if (!pin.matches("\\d{6}")) {
                JOptionPane.showMessageDialog(this, "PIN Code must be exactly 6 digits and contain only numbers!", "Invalid PIN", JOptionPane.ERROR_MESSAGE);
                return; // Stop further execution
            }

            // If PIN is valid, proceed to the next steps (your existing logic)
            System.out.println("Valid PIN entered: " + pin);

            // Continue with saving data or moving to the next screen...
        }
    }

    public static void main(String[] args) {
        new Testing();
    }
}
