package tn.esprit.mohamed_bechir_4se4.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.mohamed_bechir_4se4.enums.TypeSubscription;

import java.io.Serializable;
import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Subscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long numSub;
     LocalDate startDate;
     LocalDate endDate;
     float price;
    @Enumerated(EnumType.STRING)
     TypeSubscription typeSub;


}
