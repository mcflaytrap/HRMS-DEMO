package kodlamaio.demo.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="JobPositions")
public class JobPositions {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="job_title")
    private String jobTitle;


}
