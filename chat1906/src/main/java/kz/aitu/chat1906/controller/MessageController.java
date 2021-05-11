package kz.aitu.chat1906.controller;

import kz.aitu.chat1906.model.Message;
import kz.aitu.chat1906.repository.MessageRepository;
import kz.aitu.chat1906.service.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/message")
public class MessageController {
    private final MessageService messageService;

    @GetMapping({"/chat/{id}"})
    public ResponseEntity<?> getMessagesByChatId(@PathVariable(name = "id") Long chatId){
        return ResponseEntity.ok(messageService.getAllChatById(chatId));
    }
    @GetMapping("/getTenMessagesByChatId/{id}")
    public ResponseEntity<?> getTenMessageByChatId(@PathVariable Long id){
        return ResponseEntity.ok(messageService.getTenMessagesByChatId(id));
    }

    @GetMapping("getTenMessagesByUserId/{id}")
    public ResponseEntity<?> getTenMessageByUserId(@PathVariable Long id){
        return ResponseEntity.ok(messageService.getTenMessagesByUserId(id));
    }

}

