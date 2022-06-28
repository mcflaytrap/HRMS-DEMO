package kodlamaio.demo.business.abstracts;

import kodlamaio.demo.entities.concretes.JobPosition;

import java.util.List;

public interface JobPositionsService {
    List<JobPosition> getAll();
}
