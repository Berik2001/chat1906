package kz.aitu.chat1906.repository;

import kz.aitu.chat1906.model.Chat;
import kz.aitu.chat1906.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChatRepository extends JpaRepository <Chat, Long> {


}
