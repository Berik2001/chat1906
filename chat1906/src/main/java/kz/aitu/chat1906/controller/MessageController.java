package kz.aitu.chat1906.controller;

import kz.aitu.chat1906.repository.MessageRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/message")
public class MessageController {
    private MessageRepository messageRepository;

    @GetMapping({""})
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(messageRepository.findAll());
    }
}
