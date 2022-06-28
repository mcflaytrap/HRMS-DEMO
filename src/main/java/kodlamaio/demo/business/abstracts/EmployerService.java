package kodlamaio.demo.business.abstracts;

import kodlamaio.demo.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    List<Employer> getAll();
}
