package PP_3_1_1.spring_boot.repository;

import PP_3_1_1.spring_boot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {

}
