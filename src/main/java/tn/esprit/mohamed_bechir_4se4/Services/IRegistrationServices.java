package tn.esprit.mohamed_bechir_4se4.Services;

import tn.esprit.mohamed_bechir_4se4.entities.Course;
import tn.esprit.mohamed_bechir_4se4.entities.Registration;
import tn.esprit.mohamed_bechir_4se4.entities.Skier;
import tn.esprit.mohamed_bechir_4se4.entities.Subscription;

import java.util.List;

public interface IRegistrationServices {
    Registration addRegistration(Registration registration);
    Registration retrieveRegistration(Long numRegistration);
    List<Registration> retrieveAllRegistrations();
    void deleteRegistration(Long numRegistration);
    void updateRegistration(Registration registration);
    Registration addAndAssignToSkier (Registration registration, Long numSkier);
    Registration assignToCourse (Long numRegistration, Long numCourse);

}
