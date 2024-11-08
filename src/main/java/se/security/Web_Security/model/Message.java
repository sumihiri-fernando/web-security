package se.security.Web_Security.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@Table(name = "messages") // Ensure the table name matches your DB
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String messageId; // Consider renaming to `messageId` for clarity

    @NonNull
    private String text;

    public Message(@NonNull String text){ // Use the same parameter name
        this.text = text;
    }
}


