package tn.esprit.foyer4twin6.services;

import tn.esprit.foyer4twin6.entities.Chambre;

import java.util.List;

public interface IChambreService {

    public Chambre addChambre(Chambre chambre);
    public List<Chambre> listChambres();
    public Chambre  getChambreById(Long idChambre);
    public Chambre  updateChambre(Chambre chambre);
     void   deleteChambre(Long idChambre );



}
