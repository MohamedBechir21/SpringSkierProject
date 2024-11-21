package tn.esprit.mohamed_bechir_4se4.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.mohamed_bechir_4se4.entities.Subscription;
import tn.esprit.mohamed_bechir_4se4.enums.TypeSubscription;

import java.util.List;

public interface ISubscriptionRepository extends CrudRepository <Subscription, Long> {
    List<Subscription> findByTypeSub(TypeSubscription typeSubscription);

}
