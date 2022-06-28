package kodlamaio.demo.business.concretes;

import kodlamaio.demo.business.abstracts.UserService;
import kodlamaio.demo.dataAccess.abstracts.UserDao;
import kodlamaio.demo.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserManager implements UserService {
    private UserDao userDao;
    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
