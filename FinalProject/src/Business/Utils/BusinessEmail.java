/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Utils;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author rolwy
 */
public class BusinessEmail {
    public static void sendBusinessEmail(String toEmail, String subject, String body) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
//        try {
//            //create a new message instance
//            Message message = new MimeMessage(session);
//            //message headers
//        } catch (Exception e) {
//            System.out.println("Mail Exception: " +e);
//        }
    }
}
