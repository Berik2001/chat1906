package kz.aitu.chat1906.repository;

import kz.aitu.chat1906.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
//    List<User> findById();
//    List<User> findAllById();
}
