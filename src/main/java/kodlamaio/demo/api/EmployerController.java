package kodlamaio.demo.api;

import kodlamaio.demo.business.abstracts.EmployerService;
import kodlamaio.demo.entities.concretes.Employer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employers")
public class EmployerController {
    private EmployerService employerService;

    public EmployerController(EmployerService employerService) {
        this.employerService = employerService;
    }
    @GetMapping("/getall")
   public List<Employer> getAll(){
    return employerService.getAll();
    }

}
