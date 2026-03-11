package com.gochat.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Document(collection = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private String id;

    @Indexed(unique = true)
    @Field(name = "username")
    private String username;

    @Indexed(unique = true)
    @Field(name = "email")
    private String email;

    @Field(name = "password")
    private String password;

    @Field(name = "profile_picture")
    private String profilePicture;

    @Field(name = "status")
    private UserStatus status;

    @Field(name = "last_seen")
    private LocalDateTime lastSeen;

    @CreatedDate
    @Field(name = "created_at")
    private LocalDateTime createdAt;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.status = UserStatus.OFFLINE;
        this.lastSeen = LocalDateTime.now();
    }
}
