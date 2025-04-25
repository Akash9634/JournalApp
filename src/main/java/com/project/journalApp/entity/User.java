package com.project.journalApp.entity;

import lombok.Data;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Document (collection = "users")
@Data  // @Data is equivalent to @Getter @Setter @NoArgsConstructor @AllArgsConstructor etc....
public class User {

    @Id
    private ObjectId id;

    @Indexed(unique = true)
    @NonNull
    private String userName;
    @NonNull
    private String password;

    @DBRef //It creates a reference by storing just the ID of the referenced document
    private List<JournalEntry> journalEntries = new ArrayList<>();
    private List<String> roles;


}
