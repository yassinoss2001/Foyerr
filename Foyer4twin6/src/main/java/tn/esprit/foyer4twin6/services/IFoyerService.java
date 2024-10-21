package tn.esprit.foyer4twin6.services;

import tn.esprit.foyer4twin6.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    public  Foyer addFoyer(Foyer foyer);
    public  List<Foyer> listFoyers();
    public  Foyer getFoyerById(Long idFoyer);
    public  Foyer updateFoyer(Foyer foyer);
     void deleteFoyer(Long idFoyer);
}
