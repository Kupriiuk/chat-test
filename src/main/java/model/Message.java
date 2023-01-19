package model;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Message {

    private String action;
    private String value;
    private String username;
    private LocalDateTime date;

    public Message() {
        this.date = LocalDateTime.now();
    }

    public Message(String action, String username, String value) {
        this.action = action;
        this.username = username;
        this.value = value;
        this.date = LocalDateTime.now();
    }

    public Message(String action, String value) {
        this.action = action;
        this.value = value;
        this.date = LocalDateTime.now();
    }
}
