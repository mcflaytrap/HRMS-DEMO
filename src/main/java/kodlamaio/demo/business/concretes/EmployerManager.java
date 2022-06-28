package kodlamaio.demo.business.concretes;

import kodlamaio.demo.business.abstracts.EmployerService;
import kodlamaio.demo.dataAccess.abstracts.EmployerDao;
import kodlamaio.demo.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployerManager implements EmployerService {
    private EmployerDao employerDao;
   @Autowired
    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }

    @Override
    public List<Employer> getAll() {
        return null;
    }
}
