package kodlamaio.demo.business.concretes;

import kodlamaio.demo.business.abstracts.SystemEmployeeService;
import kodlamaio.demo.dataAccess.abstracts.SystemEmployeeDao;
import kodlamaio.demo.entities.concretes.SystemEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SystemEmployeeManager implements SystemEmployeeService {

    private SystemEmployeeDao systemEmployeeDao;
    @Autowired
    public SystemEmployeeManager(SystemEmployeeDao systemEmployeeDao) {
        this.systemEmployeeDao = systemEmployeeDao;
    }

    @Override
    public List<SystemEmployee> getAll() {
        return null;
    }
}
