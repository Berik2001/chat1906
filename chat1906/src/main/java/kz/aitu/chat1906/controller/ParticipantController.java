package kz.aitu.chat1906.controller;

import kz.aitu.chat1906.repository.ParticipantRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/participant")
public class ParticipantController {
    private ParticipantRepository participantRepository;

    @GetMapping({""})
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(participantRepository.findAll());
    }

}
