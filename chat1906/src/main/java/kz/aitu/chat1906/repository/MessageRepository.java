package kz.aitu.chat1906.repository;

import kz.aitu.chat1906.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MessageRepository extends JpaRepository <Message, Long> {
    List<Message> findAllByChatId(Long chatId);
    @Query(value = "SELECT * FROM message m WHERE m.chat_id = ?1 ORDER BY m.id DESC LIMIT 10", nativeQuery=true)
    List<Message> getTenMessagesByChatId(Long chatId);

    @Query(value = "SELECT * FROM message m WHERE m.user_id = ?1 ORDER BY m.id DESC LIMIT 10", nativeQuery=true)
    List<Message> getTenMessageByUserId(Long userId);



}
