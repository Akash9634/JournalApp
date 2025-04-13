package com.project.journalApp.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Data  // @Data is equivalent to @Getter @Setter @NoArgsConstructor @AllArgsConstructor etc....
@NoArgsConstructor
public class JournalEntry {

    @Id
    private ObjectId id;
    @NonNull
    private String title;

    private String content;

    private LocalDateTime date;


}
