package kz.aitu.chat1906.repository;

import kz.aitu.chat1906.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}
