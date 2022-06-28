package kodlamaio.demo.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="JobSeeker")

public class JobSeeker extends User {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id ;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="national_id")
    private String nationalID;

    @Column(name="birth_date")
    private String birthDate;


}
