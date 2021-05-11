package kz.aitu.chat1906.controller;

import kz.aitu.chat1906.model.User;
import kz.aitu.chat1906.repository.UserRepository;
import kz.aitu.chat1906.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {
@Autowired
    private final UserRepository userRepository;
private  final UserService userService;

    @GetMapping({"","/"})
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @PostMapping({"/create"})
    public  ResponseEntity<?> add(@RequestBody User user){
        User savedUser = userService.add(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping({"/update/{id}"})
    public ResponseEntity<?> update(@RequestBody User user, @PathVariable long id){
        Optional<User> userOptional = userRepository.findById(id);
        if (!userOptional.isPresent()) return ResponseEntity.notFound().build();
        user.setId(id);
        userService.update(user);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping({"/delete"})
    public void delete(User user) {
        userService.delete(user);
    }


}
