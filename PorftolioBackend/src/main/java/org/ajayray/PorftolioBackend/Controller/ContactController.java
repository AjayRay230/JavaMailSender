package org.ajayray.PorftolioBackend.Controller;

import org.ajayray.PorftolioBackend.Model.ContactMessage;
import org.ajayray.PorftolioBackend.Service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactController {

    @Autowired
    private MailService emailService;

    @PostMapping("/message")
    public ResponseEntity<String> sendMessage(@RequestBody ContactMessage message) {
        emailService.sendMail(message.getName(), message.getEmail(), message.getMessage());
        return ResponseEntity.ok("Message sent successfully!");
    }
}
