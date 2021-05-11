package kz.aitu.chat1906.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "message")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_id")
    private Long user_id;
    @Column(name = "chat_id")
    private Long chat_id;

    private char text;
    @Column(name = "created_timestamp")
    private Long createdTimestamp;

    @Column(name = "updated_timestamp")
    private Long updatedTimestamp;
}
