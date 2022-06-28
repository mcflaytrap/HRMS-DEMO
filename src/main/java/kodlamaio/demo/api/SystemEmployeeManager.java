package kodlamaio.demo.api;

import kodlamaio.demo.business.abstracts.SystemEmployeeService;
import kodlamaio.demo.entities.concretes.SystemEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/systememployees")
public class SystemEmployeeManager {

    private SystemEmployeeService systemEmployeeService;
    @Autowired
    public SystemEmployeeManager(SystemEmployeeService systemEmployeeService) {
        this.systemEmployeeService = systemEmployeeService;
    }

    @GetMapping("/getaLl")
    List<SystemEmployee> getAll(){
        return systemEmployeeService.getAll();
    }
}
