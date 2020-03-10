/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_Bean;

import java.util.Properties;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author suxia
 */
@Stateless
@LocalBean
public class JM {
 public void sendEmail(String toemail, String emailmessage) {
        final String username = "suxiao20152015@gmail.com";  // you need change the gmail acount to your gmail acount
        final String password = "199608260412sx"; // you need change the password to your password

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(toemail));
            message.setSubject("lost and found");
            message.setText(emailmessage+"!");

            Transport.send(message);

            System.out.println("Sent email to client pls check it!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
 
}
}
