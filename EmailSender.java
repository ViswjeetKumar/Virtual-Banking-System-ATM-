package bank.management.system;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailSender {

    public static void sendEmail(String recipient, String cardNumber, String pin) {
        final String senderEmail = "your-email@gmail.com";  // Replace with your Gmail ID
        final String senderPassword = "mkbdvpixeeicueaq";  // Replace with your Gmail App Password

        // Configure SMTP Server Properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Create a Session with authentication
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            // Create email message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
            message.setSubject("Your ATM Card Details");

            // Email content
            String emailContent = "Dear Customer,\n\n" +
                    "Thank you for signing up with our bank. Here are your ATM card details:\n\n" +
                    "Card Number: " + cardNumber + "\n" +
                    "PIN: " + pin + "\n\n" +
                    "Please keep these details safe and do not share them with anyone.\n\n" +
                    "Best Regards,\n" +
                    "Your Bank Name";

            message.setText(emailContent);

            // Send Email
            Transport.send(message);
            System.out.println("Email Sent Successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
