package tn.esprit.mohamed_bechir_4se4.Services;

import tn.esprit.mohamed_bechir_4se4.entities.Piste;

import java.util.List;

public interface IPisteServices {
     Piste addPiste(Piste piste);
     Piste retrievePiste(Long numPiste);
     List <Piste> retrieveAllPistes();
     void deletePiste(Long numPiste);
     void updatePiste(Piste piste);


}
