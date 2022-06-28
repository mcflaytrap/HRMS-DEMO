package kodlamaio.demo.dataAccess.abstracts;

import kodlamaio.demo.entities.abstracts.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
