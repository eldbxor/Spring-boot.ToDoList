package com.jclee.todolist.ToDoItem;

import java.util.List;

public class ToDoItemAdapter {

    public static ToDoItemResponse toToDoItemResponse(final ToDoItem toDoItem, final List<String> errors) {
        return ToDoItemResponse.builder().toDoItem(toDoItem).errors(errors).build();
    }

    public static ToDoItem toToDoItem(final ToDoItemRequest toDoItemRequest) {
        if(toDoItemRequest == null) {
            return null;
        }
        return ToDoItem.builder()
                .title(toDoItemRequest.getTitle())
                .done(toDoItemRequest.isDone())
                .build();
    }
}
