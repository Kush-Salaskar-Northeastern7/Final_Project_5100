/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Utils;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author rolwy
 */
public class BusinessEmail {
    public static void sendBusinessEmail(String toEmail, String subject, String body) {
        String toemail = toEmail;
        String fromEmail = "insumax.insulin.co@gmail.com";
        String password = "Insumax@2021";
        String subj = subject;
        String msgtext = body;
        
        System.out.println("from email" +fromEmail);
        
        System.out.println("Reached here");
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        
        Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };
        Session session = Session.getInstance(props, auth);
        
        try {
            //create a new message instance
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail)); //set from
            message.setReplyTo(InternetAddress.parse(toemail));
            message.setSubject(subj); //set subject
            message.setText(msgtext); //set message body
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail)); //send mail to
            //message headers
            System.out.println("Sending message");
            Transport.send(message);
            JOptionPane.showMessageDialog(null, "Message sent.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Mail Exception: " +ex);
            JOptionPane.showMessageDialog(null, "Please fill all details.", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
}
