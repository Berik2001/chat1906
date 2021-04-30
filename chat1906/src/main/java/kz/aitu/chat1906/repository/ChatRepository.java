package kz.aitu.chat1906.repository;

import kz.aitu.chat1906.model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository <Chat, Long> {
}
