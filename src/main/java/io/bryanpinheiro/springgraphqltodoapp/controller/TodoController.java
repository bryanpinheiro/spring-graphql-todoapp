package io.bryanpinheiro.springgraphqltodoapp.controller;

import io.bryanpinheiro.springgraphqltodoapp.entity.Todo;
import io.bryanpinheiro.springgraphqltodoapp.models.TodoCreateInput;
import io.bryanpinheiro.springgraphqltodoapp.models.TodoUpdateInput;
import io.bryanpinheiro.springgraphqltodoapp.repository.TodoRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class TodoController {
    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @QueryMapping
    public Iterable<Todo> todos() {
        return this.todoRepository.findAll();
    }

    @QueryMapping
    public Todo todo(@Argument Long id) {
        return this.todoRepository.findById(id).orElseThrow();
    }

    @MutationMapping
    public Todo createTodo(@Argument(name = "input") TodoCreateInput todoCreateInput) {
        return this.todoRepository.save(todoCreateInput.getTodoEntity());
    }

    @MutationMapping
    public Todo updateTodo(@Argument(name = "input") TodoUpdateInput todoUpdateInput) {
        Todo oldTodo = this.todoRepository.findById(todoUpdateInput.getId()).orElseThrow();
        oldTodo.setCompleted(todoUpdateInput.getCompleted());
        return this.todoRepository.save(oldTodo);
    }

    @MutationMapping
    public Todo deleteTodo(@Argument Long id) {
        this.todoRepository.deleteById(id);
        return null;
    }
}
