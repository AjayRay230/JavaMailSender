package org.ajayray.PorftolioBackend.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ContactMessage {
    private String name;
    private String message;
    private String email;
}
