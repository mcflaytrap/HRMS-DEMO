package kodlamaio.demo.api;

import kodlamaio.demo.business.abstracts.JobPositionsService;
import kodlamaio.demo.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobposition")
public class JobPositionController {
    private JobPositionsService jobPositionsService;
    @Autowired
    public JobPositionController(JobPositionsService jobPositionsService) {
        this.jobPositionsService = jobPositionsService;
    }
    @GetMapping("/getall")
    public List<JobPosition> getAll(){
        return jobPositionsService.getAll();
    }
}
