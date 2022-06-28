package kodlamaio.demo.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Employer")
public class Employer extends User {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="company_name")
    private String companyName;

    @Column(name="telephone_number")
    private String telephoneNumber;

    @Column(name="website_name")
    private String websiteName;



}
