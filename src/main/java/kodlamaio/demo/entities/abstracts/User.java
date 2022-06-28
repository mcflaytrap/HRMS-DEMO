package kodlamaio.demo.entities.abstracts;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="Users")
@Entity

public abstract  class User {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

}
