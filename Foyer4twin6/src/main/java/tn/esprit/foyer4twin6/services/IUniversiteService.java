package tn.esprit.foyer4twin6.services;

import tn.esprit.foyer4twin6.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    public Universite addUniversite(Universite universite);
    public List<Universite> listUniversites();
    public Universite getUniversiteById(Long idUniversite);
    public  Universite updateUniversite(Universite universite);
    void deleteUniversite(Long idUniversite);
}
