package com.example.ToDoApp.Model;
import lombok.*;

@Data
@AllArgsConstructor

public class Todo {

    private String id;
    //@JsonProperty("todoname")
    private String todoName;
    private boolean todoStatus;
}
