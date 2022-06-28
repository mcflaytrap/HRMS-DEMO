package kodlamaio.demo.business.concretes;

import kodlamaio.demo.business.abstracts.JobPositionsService;
import kodlamaio.demo.dataAccess.abstracts.JobPositionsDao;
import kodlamaio.demo.entities.concretes.JobPositions;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class JobPositionsManager implements JobPositionsService {
   private JobPositionsDao jobPositionsDao;
    @Autowired
    public JobPositionsManager(JobPositionsDao jobPositionsDao) {
        this.jobPositionsDao = jobPositionsDao;
    }

    @Override
    public List<JobPositions> getAll() {
        return null;
    }
}
