package CRUD.CRUD.Test.repositories;

import CRUD.CRUD.Test.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface I_StudentRepository extends JpaRepository<Student, Long> {
}