package kodlamaio.demo.entities.concretes;

import kodlamaio.demo.entities.abstracts.User;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="SystemEmployees")
public class SystemEmployee extends User {


    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;
}
