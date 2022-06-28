package kodlamaio.demo.entities.concretes;

import kodlamaio.demo.entities.abstracts.User;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Employers")
public class Employer extends User {

    @Column(name="company_name")
    private String companyName;

    @Column(name="telephone_number")
    private String telephoneNumber;

    @Column(name="website_name")
    private String websiteName;



}
