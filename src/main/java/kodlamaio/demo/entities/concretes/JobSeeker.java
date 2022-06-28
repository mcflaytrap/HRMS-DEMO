package kodlamaio.demo.entities.concretes;

import kodlamaio.demo.entities.abstracts.User;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="JobSeekers")

public class JobSeeker extends User {


    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="national_id")
    private String nationalID;

    @Column(name="birth_date")
    private String birthDate;


}
