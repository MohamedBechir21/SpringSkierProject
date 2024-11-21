    package tn.esprit.mohamed_bechir_4se4.repositories;
    import org.springframework.data.repository.CrudRepository;
    import tn.esprit.mohamed_bechir_4se4.entities.Skier;
    import tn.esprit.mohamed_bechir_4se4.entities.Subscription;

    public interface ISkierRepository extends CrudRepository <Skier, Long> {
        Skier findBySubscription(Subscription subscription);

    }
