package kodlamaio.demo.api;

import kodlamaio.demo.business.abstracts.JobSeekerService;
import kodlamaio.demo.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekerController {

    private JobSeekerService jobSeekerService;
    @Autowired
    public JobSeekerController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }
    @GetMapping("/getaLl")
    public List<JobSeeker> getAll(){
        return jobSeekerService.getAll();
    }
}
