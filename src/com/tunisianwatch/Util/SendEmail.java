package com.tunisianwatch.Util;

import java.util.*;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail {

    public void send(String to, String subject, String msg, String file, final String from, final String password) {
        try {
            Properties props = new Properties();
            props.setProperty("mail.transport.protocol", "smtp");
            props.setProperty("mail.host", "smtp.gmail.com");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");
            props.put("mail.debug", "true");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.socketFactory.fallback", "false");
            Session session = Session.getDefaultInstance(props,
                    new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(from, password);
                }
            });

            session.setDebug(true);
            Transport transport = session.getTransport();
            InternetAddress addressFrom = new InternetAddress(from);

            MimeMessage message = new MimeMessage(session);
            message.setSender(addressFrom);
            message.setSubject(subject);
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            //message.setContent(msg, "text/plain");

            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(msg);
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);


            if (file != null) {

                DataSource source = new FileDataSource(file);
                messageBodyPart.setDataHandler(new DataHandler(source));
                messageBodyPart.setFileName("joint");
                multipart.addBodyPart(messageBodyPart);
            }



            message.setContent(multipart);

            transport.connect();
            Transport.send(message);
            transport.close();
        } catch (NoSuchProviderException ex) {
            System.out.println("pas de provid'eur'");
        } catch (AddressException ex) {
            System.out.println("addrexc : " + ex);
        } catch (MessagingException ex) {
            System.out.println("addrexc : " + ex);
        }
    }
}
