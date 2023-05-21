package banasiewicz.pawel.demo.rest;

import banasiewicz.pawel.demo.entitiy.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> theStudents;

    // define @PostConstruct to load the student data ... only once!
    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();

        theStudents.add(new Student("Poornina", "Patel"));
        theStudents.add(new Student("Mario", "Rossi"));
        theStudents.add(new Student("Mary", "Smith"));
    }

    //defne endpoint for "/student" - return a list of student
    @GetMapping("/students")
    public List<Student> getStudents() {
        return theStudents;
    }


    //defne endpoint for "/student{StudentId}" - return a student at index
    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId) {

        // just index into the list

        // check the studentId against list size
        if ((studentId >= theStudents.size() || studentId < 0)) {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }

        return theStudents.get(studentId);
    }
}
