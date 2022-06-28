package kodlamaio.demo.business.abstracts;

import kodlamaio.demo.entities.concretes.SystemEmployee;

import java.util.List;

public interface SystemEmployeeService {
    List<SystemEmployee> getAll();
}
