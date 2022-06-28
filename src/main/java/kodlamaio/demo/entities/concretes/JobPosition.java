package kodlamaio.demo.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="JobPosition")
public class JobPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="job_title")
    private String jobTitle;


}
