package io.bryanpinheiro.springgraphqltodoapp.models;

import io.bryanpinheiro.springgraphqltodoapp.entity.Todo;

public class TodoUpdateInput {
    public long id;
    public Boolean completed;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
