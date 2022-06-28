package kodlamaio.demo.business.abstracts;

import kodlamaio.demo.entities.concretes.JobPositions;

import java.util.List;

public interface JobPositionsService {
    List<JobPositions> getAll();
}
