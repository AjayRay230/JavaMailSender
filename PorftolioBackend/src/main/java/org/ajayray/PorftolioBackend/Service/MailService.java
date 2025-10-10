package org.ajayray.PorftolioBackend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String fromEmailId;

    public void sendMail(String senderName, String senderEmail, String messageText) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(fromEmailId);
        message.setTo(fromEmailId); 
        message.setSubject("New Contact Message from " + senderName);
        message.setText("Sender Email: " + senderEmail + "\n\nMessage:\n" + messageText);

        mailSender.send(message);
    }
}
