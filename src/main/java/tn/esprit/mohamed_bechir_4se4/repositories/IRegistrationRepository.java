package tn.esprit.mohamed_bechir_4se4.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.mohamed_bechir_4se4.entities.Registration;

public interface IRegistrationRepository extends CrudRepository<Registration, Long> {
}
