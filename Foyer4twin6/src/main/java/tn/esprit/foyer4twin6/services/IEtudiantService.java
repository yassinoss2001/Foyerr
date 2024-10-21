package tn.esprit.foyer4twin6.services;

import tn.esprit.foyer4twin6.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    public Etudiant addEtudiant(Etudiant etudiant);  // Create
    public List<Etudiant> listEtudiants();           // Read
    public Etudiant getEtudiantById(Long idEtudiant);  // Read by ID
    public Etudiant updateEtudiant(Etudiant etudiant); // Update
    void deleteEtudiant(Long idEtudiant);       // Delete
}
