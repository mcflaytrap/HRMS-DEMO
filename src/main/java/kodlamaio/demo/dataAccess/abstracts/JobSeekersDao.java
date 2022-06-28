package kodlamaio.demo.dataAccess.abstracts;

import kodlamaio.demo.entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekersDao extends JpaRepository<JobSeeker,Integer> {
}
