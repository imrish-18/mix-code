package com.rishabh.userService.Model;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users") // MongoDB Collection
public class User {
    @Id
    private String id;

    private String username;
    private String password;
    private String email;
}

