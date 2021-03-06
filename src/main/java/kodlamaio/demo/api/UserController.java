package kodlamaio.demo.api;

import kodlamaio.demo.business.abstracts.UserService;
import kodlamaio.demo.entities.abstracts.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/getall")
    List<User> getALl(){

        return userService.getAll();
    }
}
