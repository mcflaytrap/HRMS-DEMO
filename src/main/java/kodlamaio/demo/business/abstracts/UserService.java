package kodlamaio.demo.business.abstracts;

import kodlamaio.demo.entities.concretes.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
}
