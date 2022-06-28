package kodlamaio.demo.dataAccess.abstracts;

import kodlamaio.demo.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
