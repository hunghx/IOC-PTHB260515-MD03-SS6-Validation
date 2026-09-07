package ra.edu.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.edu.api.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student , Long> {
    boolean existsByPhone(String phone);
}
