package kodlamaio.demo.business.abstracts;

import kodlamaio.demo.entities.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerService {
    List<JobSeeker> getAll();
}
