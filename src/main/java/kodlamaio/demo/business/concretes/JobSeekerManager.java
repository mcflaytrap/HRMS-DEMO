package kodlamaio.demo.business.concretes;

import kodlamaio.demo.business.abstracts.JobSeekerService;
import kodlamaio.demo.dataAccess.abstracts.JobSeekersDao;
import kodlamaio.demo.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobSeekerManager implements JobSeekerService {

    private JobSeekersDao jobSeekersDao;
    @Autowired
    public JobSeekerManager(JobSeekersDao jobSeekersDao) {
        this.jobSeekersDao = jobSeekersDao;
    }

    @Override
    public List<JobSeeker> getAll() {
        return null;
    }
}
