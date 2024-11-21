package tn.esprit.mohamed_bechir_4se4.repositories;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.mohamed_bechir_4se4.entities.Course;
import tn.esprit.mohamed_bechir_4se4.enums.Support;

import java.util.List;


public interface ICourseRepository extends CrudRepository<Course, Long> {
    List<Course> findBySupport(Support support);

}
