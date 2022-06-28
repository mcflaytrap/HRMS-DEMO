package kodlamaio.demo.dataAccess.abstracts;

import kodlamaio.demo.entities.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionsDao extends JpaRepository<JobPosition, Integer> {
}
