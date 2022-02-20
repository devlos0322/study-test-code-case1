package self.devlos.studytestcodecase1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import self.devlos.studytestcodecase1.model.TodoEntity;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Long> {

}
