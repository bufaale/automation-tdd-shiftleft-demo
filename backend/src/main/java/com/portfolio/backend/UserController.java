package main.java.com.portfolio.backend;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    static class UserRequest {
        public String name;
        public String email;
    }

    static class UserResponse {
        public String id;

        public UserResponse(String id) {
            this.id = id;
        }
    }

    @PostMapping
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest user) {
        String id = UUID.randomUUID().toString();
        return new ResponseEntity<>(new UserResponse(id), HttpStatus.CREATED);
    }
}
