package kodlamaio.demo.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="User")
@Entity

public class User {

    @Id
    @Column(name="id")
    @GeneratedValue
    private int id;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

}
