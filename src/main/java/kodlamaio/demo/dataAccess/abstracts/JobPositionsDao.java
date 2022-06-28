package kodlamaio.demo.dataAccess.abstracts;

import kodlamaio.demo.entities.concretes.JobPositions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionsDao extends JpaRepository<JobPositions, Integer> {
}
