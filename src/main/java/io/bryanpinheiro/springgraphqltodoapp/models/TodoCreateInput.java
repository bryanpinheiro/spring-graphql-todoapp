package io.bryanpinheiro.springgraphqltodoapp.models;

import io.bryanpinheiro.springgraphqltodoapp.entity.Todo;

public class TodoCreateInput {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Todo getTodoEntity() {
        Todo todo = new Todo();
        todo.setTitle(this.title);
        return todo;
    }
}
