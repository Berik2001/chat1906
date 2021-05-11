package kz.aitu.chat1906.controller;

import kz.aitu.chat1906.repository.ParticipantRepository;
import kz.aitu.chat1906.service.ParticipantService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

    @RequestMapping("/api/v1/participant")
    public class ParticipantController {

        private final ParticipantService participantService;

        @GetMapping({"/chat/{id}"})
        public ResponseEntity<?> getParticipantByChatId(@PathVariable(name = "id") Long chatId){
            return ResponseEntity.ok(participantService.getUsersByChat(chatId));
        }

        @GetMapping({"/user/{id}"})
        public ResponseEntity<?> getParticipantByUserId(@PathVariable(name = "id") Long userId){
            return ResponseEntity.ok(participantService.getParticipantByUser(userId));
        }

    }



