package io.bryanpinheiro.springgraphqltodoapp.repository;

import io.bryanpinheiro.springgraphqltodoapp.entity.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
